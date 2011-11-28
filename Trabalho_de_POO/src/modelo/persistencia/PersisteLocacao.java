package modelo.persistencia;

import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

public class PersisteLocacao extends DaoBase{
    PersisteTipoLocacao persistenciaTipoLocacao = new PersisteTipoLocacao();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    
    /** Calcula o valor da locação de acordo com o tipo de locação. Se for por diárias, irá fazer 
     * Diferença de dias * taxa. 
     * 
     * Caso contrário, irá fazer (Quantidade de km * preço por km) + taxa;
     * 
     * No final é somado no cadastro do veículo o valor da locação
     * @param Locacao locacao
     */
    
    public Locacao calcularValorLocacaoDiaria(Locacao locacao){
        Veiculos veiculo = new Veiculos();
        double valor = 0;
        
        locacao.setTipoLocacao(persistenciaTipoLocacao.retornarTipoLocacao(locacao.getTipoLocacao()));
        if(locacao.getTipo().equals("QUILOMETRAGEM LIVRE")){
            valor = diferencaDeDias(locacao.getDataSaida().getTime(),
                    new Date().getTime()) * locacao.getTipoLocacao().getTaxaDiarias();
            
        }else{
            valor = (locacao.getQuilometragemDeSaida() - locacao.getQuilometragemDeEntrada()) * 
                    locacao.getTipoLocacao().getPrecoPorQuilometro() + locacao.getTipoLocacao().getTaxaPorKm();
        }
        
        locacao.setValor(valor);
        veiculo.setId(locacao.getVeiculo().getId());
        
        
        //Atualizando os veículos
        veiculo = persisteVeiculo.retornarVeiculoBD(veiculo);
        veiculo.setValorTotalLocacoes(veiculo.getValorTotalLocacoes()+valor);
        persisteVeiculo.atualizarVeiculoBD(veiculo);
        
        return locacao;
    }
    
    
    /** Calcula a diferença de dias entre duas datas. Caso essa diferença seja 0, então o retorno será 1.
     * 
     * Fazendo assim, o valor da locação por diárias nunca será 0.
     * 
     * @return Long diferencaDeDias
     */
    public long diferencaDeDias(long dataDeSaida, long dataDeChegada){
        //total de milissegundos em 1 dia
        long dia = 1000 * 60 * 60 * 24;
        
        long resultado = (dataDeChegada - dataDeSaida)/dia;
        
        //caso devolva no mesmo dia, será cobrado 1 diaria
        if(resultado == 0){
            resultado = 1;
        }
        return resultado;
    }
    
    
    /**
     * salvar a locação no banco de dados.
     */
    public void salvarBD(Locacao locacao){
        abrirDB();
        em.persist(locacao);
        em.getTransaction().commit();
        fecharDB();
    }
    
    /** Retorna a locação de acordo com sua id. Caso não seja encontrado, então retornará uma locação nula.
     * @return Locacao locacao
     */
    public Locacao retornarLocacao(Locacao locacao){
        abrirDB();
        
        try{
            locacao = (Locacao)em.find(Locacao.class, locacao.getId());
            fecharDB();
            return locacao;
        }catch(NoResultException ex){
            locacao = null;
            fecharDB();
            return locacao;
        }
    }
    
    /** É feito o cálculo da locação e depois é atualizado os dados da mesma no banco de dados.
     * 
     */
    public void fecharLocacaoBD(Locacao locacao){
        calcularValorLocacaoDiaria(locacao);
        locacao.setLocacaoAberta(false);
        
        
        abrirDB();
        em.merge(locacao);
        em.getTransaction().commit();
        fecharDB();
    }
    
    /** 
     * 
     */
    public TipoLocacao retornarTipoLocacao(Veiculos veiculo){
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        TipoLocacao tipoLocacao = new TipoLocacao();
        
        abrirDB();
        tipoVeiculo = em.find(TipoVeiculo.class, veiculo.getTipoVeiculo().getId());
        fecharDB();
        
        tipoLocacao.setTipoVeiculo(tipoVeiculo);
        
        persistenciaTipoLocacao.retornarTipoLocacaoPorVeiculo(tipoLocacao);
        
        return tipoLocacao;
        
    }
    
    /** retorna uma lista com todas locações que estão em aberto de um determinado cliente.
     * @return List lista
     */
    public List retornarLocacoesEmAbertoPorCliente(Clientes cliente){
        List<Locacao> lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao locacao WHERE locacao.cliente.id = :id "
                + "AND locacao.locacaoAberta = :aberta");
        query.setParameter("id", cliente.getCodigo());
        query.setParameter("aberta", true);
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
        
    }
    
    /** Retorna todas as locações finaliza num determinado tempo. 
     * @param Date dataInicial, Date dataFinal
     */
    public List retornarLocacoesFinalizadasDB(Date dataInicial, Date dataFinal){
        List lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao l WHERE l.dataDevolucao BETWEEN :dataIncial AND :dataFinal "
                + "AND l.locacaoAberta = :aberta");
        
        query.setParameter("dataIncial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        query.setParameter("aberta", false);
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    /** Retorna todas as locações finalizads do banco de dados.
     * @return List lista
     */
    public List retornarLocacoesFinalizadasDB(){
        List lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao l WHERE l.locacaoAberta = :aberta");
        
        query.setParameter("aberta", false);
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    /** Retorna as locações abertas num determinado período de tempo.
     * 
     */
    public List retornarLocacoesAbertasDB(Date dataInicial, Date dataFinal){
        List lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao l WHERE l.dataDevolucao BETWEEN :dataIncial AND :dataFinal "
                + "AND l.locacaoAberta = :aberta");
        
        query.setParameter("dataIncial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        query.setParameter("aberta", true);
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    /** Retorna todas as locações abertas do banco de dados
     * 
     */
    public List retornarLocacoesAbertasDB(){
        List lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao l WHERE l.locacaoAberta = :aberta");
        
        query.setParameter("aberta", true);
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    /**
     * Verifica se motorista já esta em alguma locaçao aberta
     */
    public boolean verificarMotoristaLocacaoAberta(Motorista motorista){
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao l WHERE l.locacaoAberta = :aberta "
                + "AND l.motorista.codigo = :id");
        
        query.setParameter("aberta", true);
        query.setParameter("id", motorista.getCodigo());
        
        try{
            List lista = query.getResultList();
            fecharDB();
            return true;
            
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }    
    }
    
}
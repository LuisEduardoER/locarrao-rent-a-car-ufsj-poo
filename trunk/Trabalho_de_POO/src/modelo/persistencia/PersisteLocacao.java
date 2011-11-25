package modelo.persistencia;

import java.io.File;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

public class PersisteLocacao extends DaoBase{
    public static File arquivo;
    public static List<Locacao> listaLocacao;
    PersisteTipoLocacao persistenciaTipoLocacao = new PersisteTipoLocacao();
    PersisteVeiculos persisteVeiculo = new PersisteVeiculos();
    
    
    
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
    //calcula o valor, caso seja por quilometro
    public double calculaValorLocacao(long valorDeSaida, long valorDeChegada, 
            TipoLocacao tipoLocacao, Locacao locacao){
        
        double valor = 0;
        double taxa = persistenciaTipoLocacao.retornarTaxa(tipoLocacao, locacao);
        double precoPorKm = persistenciaTipoLocacao.retornarPrecoPorKm(tipoLocacao);
        
        valor = ((valorDeChegada - valorDeSaida) * precoPorKm) + taxa;
        return valor;
    }
    
    //calcula o valor, caso seja por quilometragem livre
    public double calculaValorLocacao(Date dataDeSaida, Date dataDeChegada, 
            TipoLocacao tipoLocacao, Locacao locacao){
        
        double valor = 0;
        long diferenca = 0;
        double taxa = persistenciaTipoLocacao.retornarTaxa(tipoLocacao, locacao);
        
        diferenca = diferencaDeDias(dataDeSaida.getTime(), dataDeChegada.getTime());
        valor = diferenca * taxa;
        return valor;
    }
    
    
    
    //calcula o valor, caso seja por quilometragem livre
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
    
    
    /*
     * Código referente à interface gráfica
     */
    public void salvarBD(Locacao locacao){
        abrirDB();
        em.persist(locacao);
        em.getTransaction().commit();
        fecharDB();
    }
    
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
    
    public void fecharLocacaoBD(Locacao locacao){
        calcularValorLocacaoDiaria(locacao);
        
        abrirDB();
        em.merge(locacao);
        em.getTransaction().commit();
        fecharDB();
    }
    
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
    
    public List retornarLocacoesEmAbertoPorCliente(Clientes cliente){
        List<Locacao> lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Locacao locacao WHERE locacao.cliente.id = :id");
        query.setParameter("id", cliente.getCodigo());
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
        
    }
    
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
}
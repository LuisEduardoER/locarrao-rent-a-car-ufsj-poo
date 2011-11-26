package modelo.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;


public class PersisteTipoLocacao extends DaoBase{    
    
    /**
     * retorna o tipo de veiculo de acordo com seu nome.
     * @param tipoVeiculo
     * @return 
     */
    public TipoVeiculo retornarTipoVeiculoBD(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoVeiculo tipoVeiculo WHERE tipoVeiculo.tipo = :tipo");
        query.setParameter("tipo", tipoVeiculo.getTipo());
        
        fecharDB();
        try{
            tipoVeiculo = (TipoVeiculo) query.getSingleResult();
            return tipoVeiculo;
        }catch(NoResultException ex){
            return tipoVeiculo;
        }
        
    }
    
    /**
     * Retornar o tipo de locação de acordo com a id do veículo
     * @param tipoLocacao
     * @return 
     */
    public TipoLocacao retornarTipoLocacaoPorVeiculo(TipoLocacao tipoLocacao){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoLocacao tipoLocacao WHERE tipoLocacao.tipoVeiculo.id = :id");
        query.setParameter("id", tipoLocacao.getTipoVeiculo().getId());
        
        try{
            tipoLocacao = (TipoLocacao)query.getSingleResult();
            fecharDB();
        
            return tipoLocacao;
        }catch(NoResultException ex){
            fecharDB();
            return tipoLocacao;
        }
    }
    
    /**
     * retorna o tipo de locação de acordo com sua id
     * @param tipoLocacao
     * @return 
     */
    
    public TipoLocacao retornarTipoLocacao(TipoLocacao tipoLocacao){
        abrirDB();
        
        try{
            tipoLocacao = (TipoLocacao) em.find(TipoLocacao.class, tipoLocacao.getId());
            fecharDB();
            return tipoLocacao;
            
        }catch(NoResultException ex){
            tipoLocacao = null;
            fecharDB();
            return tipoLocacao;
        }
    }
    
    /**
     * salva o tipo de locação no banco de dados
     * @param tipoLocacao 
     */
    public void salvarBD(TipoLocacao tipoLocacao){
        abrirDB();
        
        em.persist(tipoLocacao);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    
    /**
     * Atualiza os valores do tipo de locação no banco de dados
     * @param tipoLocacao 
     */
    public void atualizarBD(TipoLocacao tipoLocacao) {
        abrirDB();
        
        em.merge(tipoLocacao);
        em.getTransaction().commit();
        fecharDB();
        
    }
    
    /**
     * Verifica se ja existe o cadastro dos valores das taxas de locação para um determinado veículo.
     * @param tipoVeiculo
     * @return 
     */
    public boolean verificarSeExisteCadastro(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoLocacao tipoLocacao WHERE tipoLocacao.tipoVeiculo.id = :id");
        query.setParameter("id", tipoVeiculo.getId());
        
        try{
            query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
        
    }
    
}

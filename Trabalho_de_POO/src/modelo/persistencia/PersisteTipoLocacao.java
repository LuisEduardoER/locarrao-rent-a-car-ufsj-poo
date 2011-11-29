package modelo.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;


public class PersisteTipoLocacao extends DaoBase{    
    
    
    
    /**
     * Retornar o tipo de locação de acordo com a id do veículo
     * @param tipoLocacao
     * @return 
     */
    public TipoLocacao retornarTipoLocacaoPorTipoVeiculo(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        TipoLocacao tipo = new TipoLocacao();
        Query query = em.createQuery("FROM TipoLocacao tipoLocacao WHERE tipoLocacao.tipoVeiculo.id = :id");
        query.setParameter("id", tipoVeiculo.getId());
        
        try{
            tipo = (TipoLocacao)query.getSingleResult();
            fecharDB();
        
            return tipo;
        }catch(NoResultException ex){
            tipo = null;
            fecharDB();
            return tipo;
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

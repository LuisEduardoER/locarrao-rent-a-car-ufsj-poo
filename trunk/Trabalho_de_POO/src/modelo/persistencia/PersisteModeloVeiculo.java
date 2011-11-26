package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.ModeloVeiculo;

public class PersisteModeloVeiculo extends DaoBase{
    
    /**
     * Retorna o modelo do veículo, de acordo com sua id
     * @param modelo
     * @return ModeloVeiculo modelo
     */
    public ModeloVeiculo retornarModeloVeiculo(ModeloVeiculo modelo){
        abrirDB();
        
        try{
            modelo = (ModeloVeiculo) em.find(ModeloVeiculo.class, modelo.getId());
            fecharDB();
            return modelo;
        }catch(NoResultException ex){
            fecharDB();
            modelo = null;
            return modelo;
        }
    }
    
    /**
     * Verifica se o modelo já está cadastrado no banco de dados.
     * @param modelo
     * @return boolean 
     */
    public boolean verificarModeloJaCadastrado(ModeloVeiculo modelo){
        abrirDB();
        ModeloVeiculo m = new ModeloVeiculo();
        
        Query query = em.createQuery("FROM ModeloVeiculo m WHERE m.modelo = :modelo");
        query.setParameter("modelo", modelo.getModelo());
        
        try{
            m = (ModeloVeiculo)query.getSingleResult();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    /**
     * Salva o modelo no banco de dados.
     * @param modelo 
     */
    public void salvarBD(ModeloVeiculo modelo){
        abrirDB();
        
        em.persist(modelo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    /**
     * Retorna todos os modelos contidos no banco de dados.
     * @return 
     */
    public List retornarTodosModelosBD(){
        abrirDB();
        List lista = null;
        Query query = em.createQuery("FROM ModeloVeiculo");
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
     * retorno o modelo de acordo com seu nome
     * @param modelo
     * @return ModeloVeiculo modelo
     */
    public ModeloVeiculo retornarModeloVeiculoComNome(ModeloVeiculo modelo){
        abrirDB();
        
        Query query = em.createQuery("FROM ModeloVeiculo m WHERE m.modelo = :modelo");
        query.setParameter("modelo", modelo.getModelo());
        
        try{
            modelo = (ModeloVeiculo)query.getSingleResult();
            fecharDB();
            return modelo;
        }catch(NoResultException ex){
            fecharDB();
            return modelo;
        }
    }
}

package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.ModeloVeiculo;

public class PersisteModeloVeiculo extends DaoBase{
    
    
    public ModeloVeiculo retornarModeloVeiculo(ModeloVeiculo modelo){
        abrirDB();
        
        try{
            modelo = (ModeloVeiculo) em.find(ModeloVeiculo.class, modelo.getId());
            fecharDB();
            return modelo;
        }catch(NoResultException ex){
            fecharDB();
            return modelo;
        }
    }
    
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
    
    public void salvarBD(ModeloVeiculo modelo){
        abrirDB();
        
        em.persist(modelo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
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

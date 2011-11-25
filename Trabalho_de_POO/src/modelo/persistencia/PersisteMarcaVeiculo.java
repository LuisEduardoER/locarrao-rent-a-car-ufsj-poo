package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.MarcaVeiculo;

public class PersisteMarcaVeiculo extends DaoBase{
    
    public void salvarBD(MarcaVeiculo marca){
        abrirDB();
        
        em.persist(marca);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public boolean verificarMarcaJaCadastrado(MarcaVeiculo marca){
        abrirDB();
        MarcaVeiculo m = new MarcaVeiculo();
        
        Query query = em.createQuery("FROM ModeloVeiculo m WHERE m.modelo = :marca");
        query.setParameter("marca", marca.getMarca());
        
        try{
            m = (MarcaVeiculo)query.getSingleResult();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    public MarcaVeiculo retornarMarcaVeiculo(MarcaVeiculo marca){
        abrirDB();
        
        try{
            marca = (MarcaVeiculo) em.find(MarcaVeiculo.class, marca.getId());
            fecharDB();
            return marca;
        }catch(NoResultException ex){
            fecharDB();
            return marca;
        }
    }
    public List retornarTodosModelosBD(){
        abrirDB();
        List lista = null;
        Query query = em.createQuery("FROM MarcaVeiculo");
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

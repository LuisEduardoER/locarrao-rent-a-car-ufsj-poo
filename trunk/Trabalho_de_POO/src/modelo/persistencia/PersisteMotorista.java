package modelo.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Motorista;

public class PersisteMotorista extends DaoBase{
    
    
    public boolean pesquisarMotoristaBD(Motorista motorista){
        abrirDB();
        Query query = em.createQuery("FROM Mostorista motorista WHERE motorista.cnh = :cnh");
        query.setParameter("cnh", motorista.getCnh());
        
        try{
            motorista = (Motorista)query.getSingleResult();
            return true;
        }catch(NoResultException ex){
            return false;
        }
    }
    
    public boolean verificarMotoristaJaCadastrado(Motorista motorista){
        Motorista m = new Motorista();
        abrirDB();
        
        Query query = em.createQuery("FROM Motorista motorista WHERE motorista.cpf = :cpf");
        query.setParameter("cpf", motorista.getCpf());
        
        try{
            m = (Motorista)query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
        
    }
    
    public void salvarBD(Motorista motorista){
        abrirDB();
        em.persist(motorista);
        em.getTransaction().commit();
        
        fecharDB();
    }
}
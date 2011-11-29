package modelo.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Motorista;

public class PersisteMotorista extends DaoBase{
    
    /**
     * Retorna o motorista pela sua id
     */
    public Motorista retornarMotoristaBD(Motorista motorista){
        abrirDB();
        
        try{
            motorista = em.find(Motorista.class, motorista.getCodigo());
            fecharDB();
            return motorista;
        }catch(NoResultException ex){
            motorista = null;
            fecharDB();
            return motorista;
        }
    }
    
    /**
     * Pesquisa o motorista de acordo com sua CNH.
     * @param motorista
     * @return 
     */
    public Motorista pesquisarMotoristaPelaCnh (Motorista motorista){
        abrirDB();
        Query query = em.createQuery("FROM Motorista motorista WHERE motorista.cnh = :cnh");
        query.setParameter("cnh", motorista.getCnh());
        
        try{
            motorista = (Motorista)query.getSingleResult();
            fecharDB();
            return motorista;
        }catch(NoResultException ex){
            fecharDB();
            motorista = null;
            return motorista;
        }
    }
    
    /**
     * Verifica se o motorista já está cadastrado, para evitar que tenha dois motorista iguais no banco de dados.
     * @param motorista
     * @return 
     */
    public boolean verificarMotoristaJaCadastrado(Motorista motorista){
        Motorista m = new Motorista();
        abrirDB();
        
        Query query = em.createQuery("FROM Motorista motorista WHERE motorista.cnh = :cnh");
        query.setParameter("cnh", motorista.getCnh());
        
        try{
            m = (Motorista)query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
        
    }
    
    public Motorista retornarMotoristaPeloCpf(String cpf){
        Motorista motorista = new Motorista();
        abrirDB();
        
        Query query = em.createQuery("FROM Motorista motorista WHERE motorista.cpf = :cpf");
        query.setParameter("cpf", cpf);
        
        try{
            motorista = (Motorista)query.getSingleResult();
            fecharDB();
            return motorista;
        }catch(NoResultException ex){
            motorista = null;
            fecharDB();
            return motorista;
        }
        
    }
    
    /**
     * Salva o motorista no banco de dados
     * @param motorista 
     */
    public void salvarBD(Motorista motorista){
        abrirDB();
        em.persist(motorista);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    
}
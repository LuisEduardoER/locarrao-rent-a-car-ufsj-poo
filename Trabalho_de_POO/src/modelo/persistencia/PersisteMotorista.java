package modelo.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Motorista;

public class PersisteMotorista extends DaoBase{
    
    /**
     * Pesquisa o motorista de acordo com sua CNH.
     * @param motorista
     * @return 
     */
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
    
    /**
     * Verifica se o motorista já está cadastrado, para evitar que tenha dois motorista iguais no banco de dados.
     * @param motorista
     * @return 
     */
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
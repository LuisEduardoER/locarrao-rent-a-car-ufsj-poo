package modelo.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoBase {
    private static final String PERSISTENCE_UNIT_NAME = "LocarraoJPA";
    
    public EntityManagerFactory emf = null;
    public EntityManager em = null;
    
    public void abrirDB(){
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public void fecharDB(){
        emf.close();
        em.close();
        
    }
}

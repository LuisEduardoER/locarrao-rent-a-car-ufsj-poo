package modelo.persistencia;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoBase {
    private static final String PERSISTENCE_UNIT_NAME = "LocarraoJPA";
    
    private EntityManagerFactory emf = null;
    
    public DaoBase(){
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    
}

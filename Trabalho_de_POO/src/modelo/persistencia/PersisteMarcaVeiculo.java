package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.MarcaVeiculo;

public class PersisteMarcaVeiculo extends DaoBase{
    
    /**
     * Salva a marca no banco de dados
     * @param marca 
     */
    public void salvarBD(MarcaVeiculo marca){
        abrirDB();
        
        em.persist(marca);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    /**
     * Verifica se a marca ja está cadastrada, de acordo com seu nome.
     * @param marca
     * @return Boolean
     */
    public boolean verificarMarcaJaCadastrada(MarcaVeiculo marca){
        abrirDB();
        
        Query query = em.createQuery("FROM MarcaVeiculo m WHERE m.marca = :marca");
        query.setParameter("marca", marca.getMarca());
        
        try{
            marca = (MarcaVeiculo)query.getSingleResult();
            System.out.println("retorno true " + "id: " + marca.getId());
            return true;
            
        }catch(NoResultException ex){
            fecharDB();
            System.out.println("retorno false");
            return false;
        }
    }
    
    public MarcaVeiculo retornarMarcaPeloNome(MarcaVeiculo marca){
        abrirDB();
        
        Query query = em.createQuery("FROM MarcaVeiculo m WHERE m.marca = :marca");
        query.setParameter("marca", marca.getMarca());
        
        try{
            marca = (MarcaVeiculo)query.getSingleResult();
            System.out.println("retorno true " + "id: " + marca.getId());
            return marca;
            
        }catch(NoResultException ex){
            fecharDB();
            System.out.println("retorno false");
            return marca;
        }
    }
    
    /**
     * Retorna a marca do veículo.
     * @param marca
     * @return marca
     */
    public MarcaVeiculo retornarMarcaVeiculo(MarcaVeiculo marca){
        abrirDB();
        
        try{
            marca = (MarcaVeiculo) em.find(MarcaVeiculo.class, marca.getId());
            fecharDB();
            return marca;
        }catch(NoResultException ex){
            marca = null;
            fecharDB();
            return marca;
        }
    }
    
    /**
     * Retorna todas as marcas contidas no banco de dados.
     * @return List lista
     */
    public List retornarTodasMarcasBD(){
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

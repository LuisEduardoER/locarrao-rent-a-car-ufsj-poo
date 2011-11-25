package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

public class PersisteTipoVeiculo extends DaoBase{
    
    public List retornarListaTipos(){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoVeiculo");
        List lista = null;
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        tipoVeiculo.setTipo("Padrão");
        try{
            lista = query.getResultList();
        }catch(NoResultException ex){
            lista.add(0, tipoVeiculo);
        }
        
        return lista;
        
    }
    
    public TipoVeiculo retornarTipoVeiculo(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        try{
            tipoVeiculo = (TipoVeiculo)em.find(TipoVeiculo.class, tipoVeiculo.getId());
            fecharDB();
            return tipoVeiculo;
        }catch(NoResultException ex){
            fecharDB();
            return tipoVeiculo;
        }
    }
    public boolean verificarTipoJaCadastrado(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoVeiculo tipo WHERE tipo.tipo = :tipo");
        query.setParameter("tipo", tipoVeiculo.getTipo());
        
        try{
            tipoVeiculo = (TipoVeiculo) query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    public void salvarBD(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        em.persist(tipoVeiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public List retornarVeiculosDisponiveisPorTipo(List<Veiculos> lista,TipoVeiculo tipoVeiculo){
        for(Veiculos item:lista){
            if(item.getTipoVeiculo().getId() != tipoVeiculo.getId()){
                lista.remove(item);
            }
        }
        
        return lista;
    }
}


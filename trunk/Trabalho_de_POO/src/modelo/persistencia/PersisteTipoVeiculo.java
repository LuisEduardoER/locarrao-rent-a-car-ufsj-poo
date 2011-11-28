package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

public class PersisteTipoVeiculo extends DaoBase{
    
    /**
     * Retorna todas os tipos de veículos cadastrados no banco de dados.
     * @return 
     */
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
    
    /**
     * retorna o tipo de veiculo de acordo com seu nome.
     * @param tipoVeiculo
     * @return 
     */
    public TipoVeiculo retornarTipoVeiculoPeloTipo(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoVeiculo tipoVeiculo WHERE tipoVeiculo.tipo = :tipo");
        query.setParameter("tipo", tipoVeiculo.getTipo());
        
        
        try{
            tipoVeiculo = (TipoVeiculo) query.getSingleResult();
            fecharDB();
            return tipoVeiculo;
            
        }catch(NoResultException ex){
            tipoVeiculo = null;
            fecharDB();
            return tipoVeiculo;
        }
        
    }
    
    /**
     * retorna um tipo de veículo de acordo com sua id.
     * @param tipoVeiculo
     * @return 
     */
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
    
    /**
     * Verifica se o tipo de veículo já está cadastrado no banco de dados, de acordo com seu nome.
     * @param tipoVeiculo
     * @return 
     */
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
    
    public TipoVeiculo retornarTipoPeloNome(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        Query query = em.createQuery("FROM TipoVeiculo tipo WHERE tipo.tipo = :tipo");
        query.setParameter("tipo", tipoVeiculo.getTipo());
        
        try{
            tipoVeiculo = (TipoVeiculo) query.getSingleResult();
            fecharDB();
            return tipoVeiculo;
        }catch(NoResultException ex){
            fecharDB();
            return tipoVeiculo;
        }
    }
    /**
     * Salva o tipo de veículo no banco de dados.
     * @param tipoVeiculo 
     */
    public void salvarBD(TipoVeiculo tipoVeiculo){
        abrirDB();
        
        em.persist(tipoVeiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    /**
     * Retorna todos os veiculos de um determinado tipo que estão disponíveis
     * @param lista
     * @param tipoVeiculo
     * @return 
     */
    public List retornarVeiculosDisponiveisPorTipo(List<Veiculos> lista,TipoVeiculo tipoVeiculo){
        for(Veiculos item:lista){
            if(item.getTipoVeiculo().getId() != tipoVeiculo.getId()){
                lista.remove(item);
            }
        }
        
        return lista;
    }
}


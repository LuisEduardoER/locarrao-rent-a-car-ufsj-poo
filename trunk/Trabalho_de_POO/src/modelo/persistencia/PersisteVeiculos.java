package modelo.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Locacao;
import modelo.dominio.Veiculos;

public class PersisteVeiculos extends DaoBase{
    
    PersisteLocacao persistenciaLocacao = new PersisteLocacao();
    
    
    public boolean pesquisarVeiculoBD(Veiculos veiculo){
        abrirDB();
        Query query = em.createQuery("FROM Veiculos veiculo WHERE veiculo.placa = :placa");
        query.setParameter("placa", veiculo.getPlaca());
        
        try{
            veiculo = (Veiculos)query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
    public Veiculos retornarVeiculoBD(Veiculos veiculo){
        abrirDB();
        
        try{
            veiculo = (Veiculos) em.find(Veiculos.class, veiculo.getId());
            fecharDB();
            return veiculo;
        }catch(NoResultException ex){
            veiculo = null;
            fecharDB();
            return veiculo;
        }
    }
    
    
    
    public void salvarBD(Veiculos veiculo){
        abrirDB();
        
        em.persist(veiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public void atualizarVeiculoBD(Veiculos veiculo){
        abrirDB();
        
        em.merge(veiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    public List retornarVeiculosMaisLocados(){
        List lista = null;
        abrirDB();
        
        //ordena em ordem descrescente pelo total de locações
        Query query = em.createQuery("FROM Veiculos v ORDER BY v.totalLocacoes DESC");
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    public List retornarVeiculosMaisRentaveis(){
        List lista = null;
        abrirDB();
        
        //ordena em ordem descrescente pelo total de locações
        Query query = em.createQuery("FROM Veiculos v ORDER BY v.valorTotalLocacoes DESC");
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
    }
    
    public List veiculosDisponiveisBD(){
        Locacao locacao = new Locacao();
        
        abrirDB();
        
        List<Veiculos> listaTodosVeiculos = null;
        List<Veiculos> listaVeiculosDiponiveis = null;
        
        Query query = em.createQuery("FROM Veiculos");
        
        try{
            listaTodosVeiculos = query.getResultList();
        }catch(NoResultException ex){
            return listaVeiculosDiponiveis; 
        }
        
        for(Veiculos item: listaTodosVeiculos){
            query = em.createQuery("FROM Locacao l WHERE l.veiculo.id = :id");
            query.setParameter("id", item.getId());
            
            try{
                locacao = (Locacao) query.getSingleResult();
            }catch(NoResultException ex){
                listaVeiculosDiponiveis.add(item);
            }
        }
        
        return listaVeiculosDiponiveis;
        
    }
    
}
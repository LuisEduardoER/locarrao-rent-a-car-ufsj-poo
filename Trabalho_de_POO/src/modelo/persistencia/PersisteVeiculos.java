package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Locacao;
import modelo.dominio.Veiculos;

public class PersisteVeiculos extends DaoBase{
    
    /**
     * Retorna o veiculo de acordo com a id.
     * @param veiculo
     * @return 
     */
    public Veiculos retornarVeiculoBD(Veiculos veiculo){
        abrirDB();
        
        try{
            veiculo = em.find(Veiculos.class, veiculo.getId());
            fecharDB();
            return veiculo;
        }catch(NoResultException ex){
            fecharDB();
            return veiculo;
        }
    }
    
    /**
     * Verifica se um veiculo com uma determinada placa está cadastrada no banco de dados.
     * @param veiculo
     * @return 
     */
    public Veiculos pesquisarVeiculoPelaPlacaBD(Veiculos veiculo){
        abrirDB();
        Query query = em.createQuery("FROM Veiculos veiculo WHERE veiculo.placa = :placa");
        query.setParameter("placa", veiculo.getPlaca());
        System.out.println("placa que veio: " + veiculo.getPlaca());
        try{
            veiculo = (Veiculos)query.getSingleResult();
            fecharDB();
            return veiculo;
        }catch(NoResultException ex){
            veiculo = null;
            fecharDB();
            return veiculo;
        }
    }
    
    /**
     * salva o veículo no banco de dados
     * @param veiculo 
     */
    public void salvarBD(Veiculos veiculo){
        abrirDB();
        
        em.persist(veiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    /**
     * Atualiza o veiculo no banco de dados
     * @param veiculo 
     */
    public void atualizarVeiculoBD(Veiculos veiculo){
        abrirDB();
        
        em.merge(veiculo);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
    /**
     * Faz uma busca de todos os veículos no banco de dados e ordena de forma decrescente pelo total de locações 
     * @return 
     */
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
    
    /**
     * Faz uma busca de todos os veículos no banco de dados e ordena de forma decrescente pelo valor das locações 
     * @return 
     */
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
    
    /**
     * Retorna uma lista com todos os veículos que estão disponíveis
     * @return 
     */
    public List veiculosDisponiveisBD(){
        Locacao locacao = new Locacao();
        
        abrirDB();
        
        List<Veiculos> listaTodosVeiculos = null;
        List<Veiculos> listaVeiculosDiponiveis = new ArrayList<Veiculos>();
        
        Query query = em.createQuery("FROM Veiculos");
        
        try{
            listaTodosVeiculos = query.getResultList();
        }catch(NoResultException ex){
            return listaVeiculosDiponiveis; 
        }
        
        for(Veiculos item: listaTodosVeiculos){
            query = em.createQuery("FROM Locacao l WHERE l.veiculo.id = :id AND l.locacaoAberta = :aberta");
            query.setParameter("id", item.getId());
            query.setParameter("aberta", true);
            
            try{
                locacao = (Locacao) query.getSingleResult();
            }catch(NoResultException ex){
                listaVeiculosDiponiveis.add(item);
            }
        }
        
        return listaVeiculosDiponiveis;
        
    }
    
}
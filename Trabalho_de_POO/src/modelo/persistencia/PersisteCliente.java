package modelo.persistencia;

import java.io.File;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Clientes;

public class PersisteCliente extends DaoBase{
    public static File arquivo;
    public static List<Clientes> listaClientes;
    
    /** Pesquisa o cliente através da sua id. Caso não seja encontrado, irá retornar um cliente com valor nulo.
     * 
     * @return Cliente - cliente
     */
    public Clientes retornarClienteBD(Clientes cliente){
        abrirDB();
        
        try{
            cliente = em.find(Clientes.class, cliente.getCodigo());
            fecharDB();
            return cliente;
        }catch(NoResultException ex){
            fecharDB();
            cliente = null;
            return cliente;
        }
    }
    
    /** Pesquisa o cliente pelo nome. Se não for encontrado, retornar uma lista nula.
     * @param Cliente cliente
     * @return List
     * 
     */
    public List pesquisarClientePorNome(Clientes cliente){
        List lista = null;
        abrirDB();
        
        Query query = em.createQuery("FROM Clientes c WHERE c.nome LIKE :nome");
        query.setParameter("nome", cliente.getNome());
        
        try{
            lista = query.getResultList();
            fecharDB();
            return lista;
        }catch(NoResultException ex){
            fecharDB();
            return lista;
        }
        
    }
        
    /** Verifica se o cliente ja está cadastrado no sistema, através do seu CPF.
     * @return boolean
     */
    public boolean verificarClienteJaCadastrado(Clientes cliente){
        Clientes c = new Clientes();
        abrirDB();
        
        Query query = em.createQuery("FROM Clientes cliente WHERE cliente.cpf = :cpf");
        query.setParameter("cpf", cliente.getCpf());
        
        try{
            c = (Clientes)query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
        
    }
    
    /** Salva o cliente no banco de dados.
     * 
     */
    public void salvarBD(Clientes cliente){
        abrirDB();
        
        em.persist(cliente);
        em.getTransaction().commit();
        
        fecharDB();
    }
    
}


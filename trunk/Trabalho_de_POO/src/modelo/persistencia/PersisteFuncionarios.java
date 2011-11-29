/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.File;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Funcionarios;

public class PersisteFuncionarios extends DaoBase{
    public static File arquivo;
    public static List<Funcionarios> listaFuncionarios;
    /*
     * Codigos referentes à interface gráfica. Utilizando o Hibernate
     */
    
    public boolean verificarLogin(Funcionarios funcionario){
        abrirDB();
        Query query = em.createQuery("FROM Funcionarios f WHERE f.usuario = :usuario and f.senha = :senha");
        query.setParameter("usuario", funcionario.getUsuario());
        query.setParameter("senha", funcionario.getSenha());
        
        try{
            funcionario = (Funcionarios)query.getSingleResult();
            return true;
        }catch(EntityNotFoundException ex){
            return false;
        }catch(NoResultException ex){
            return false;
        }
        
        
    }
    
    /**
     * retorna os dados do funcionário através do seu usuário
     * @param funcionario
     * @return 
     */
    public Funcionarios retornarFuncionarioPeloUsuario(Funcionarios funcionario){
        abrirDB();
        
        Query query = em.createQuery("FROM Funcionarios funcionario WHERE funcionario.usuario = :usuario");
        query.setParameter("usuario", funcionario.getUsuario());
        
        try{
            funcionario = (Funcionarios)query.getSingleResult();
            fecharDB();
            return funcionario;
        }catch(NoResultException ex){
            funcionario = null;
            fecharDB();
            return funcionario;
        }
        
    }
    
    /**
     * Verifica se o funcionario ja esta cadastrado no sistema
     * @param funcionario
     * @return 
     */
    public boolean verificarFuncionarioJaCadastrado(Funcionarios funcionario){
        Funcionarios f = new Funcionarios();
        abrirDB();
        
        Query query = em.createQuery("FROM Funcionarios funcionario WHERE funcionario.cpf = :cpf");
        query.setParameter("cpf", funcionario.getCpf());
        
        try{
            f = (Funcionarios)query.getSingleResult();
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
        
    }
    
    public void salvarBD(Funcionarios funcionario){
        abrirDB();
        em.persist(funcionario);
        em.getTransaction().commit();
        
        fecharDB();
    }
}
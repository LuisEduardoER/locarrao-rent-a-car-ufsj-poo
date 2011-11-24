/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import locarrao.visao.VisaoFuncionarios;

/**
 *
 * @author PATY
 */
public class PersisteFuncionarios extends DaoBase{
    public static File arquivo;
    public static List<Funcionarios> listaFuncionarios;
    
    VisaoFuncionarios visaoFuncionarios = new VisaoFuncionarios();
   
    public PersisteFuncionarios(){
        arquivo = new File("src/arquivos/Funcionarios.txt");
        listaFuncionarios = new ArrayList<Funcionarios> ();
        retornarTodosFuncionarios();
    }
    public static void retornarTodosFuncionarios(){
        if(arquivo.exists()){
            FileReader reader = null;
            try{
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                
                //percorre o arquivo
                String linha = null;
                int contador = 0;
                Funcionarios funcionarios = new Funcionarios();
                Endereco endereco = new Endereco();
                
                try{
                    while((linha = leitor.readLine()) !=null){
                       if (contador==0){
                            funcionarios.setCodigo(Integer.parseInt(linha));
                            contador++;
                        }
                       else if(contador==1){
                            funcionarios.setNome(linha);
                            contador++;
                        }
                        else if (contador==2){
                            funcionarios.setCpf(linha);
                            contador++;
                        }
                        else if (contador==3){
                            funcionarios.setTefefone(linha);
                            contador++;
                        }
                        else if (contador==4){
                            funcionarios.setCargo(linha);
                            contador++;
                        }
                        else if (contador==5){
                            funcionarios.setUsuario(linha);
                            contador++;
                        }
                        else if (contador==6){
                            funcionarios.setSenha(linha);
                            contador++;
                        }
                        else if (contador==7){
                         endereco.setRua(linha);
                         contador++;
                        }
                        else if (contador==8) {
                          endereco.setNumero(Integer.valueOf(linha));
                          contador++;
                        }
                        else if (contador==9){
                            endereco.setComplemento(linha);
                            contador++;
                        }
                        else if (contador==10){
                            endereco.setBairro(linha);
                            contador++;
                        }
                        else if (contador==11){
                            endereco.setCidade(linha);
                            contador++;
                        }
                        else if (contador==12){
                            endereco.setUf(linha);
                            contador++;
                        }
                        else if (contador==13){
                            endereco.setCep(linha);
                            funcionarios.setEndereco(endereco);
                            listaFuncionarios.add(funcionarios);
                            contador=0;
                            funcionarios = new Funcionarios();
                            endereco = new Endereco();
                        }
                    }
                    reader.close();
                    leitor.close();
                }catch (IOException ex) {
                    System.out.println("Erro na leitura/escrita do arquivo");
                    System.out.println(ex.getMessage());
                }
            }catch (FileNotFoundException ex) {
                System.out.println("Arquivo não encontrado");
            }
            
        }
        else{
            System.out.println("Arquivo não encontrado");
        }
    }
  
    public boolean salvar(Funcionarios funcionarios) throws FileNotFoundException, IOException{
  
        FileWriter writer = new FileWriter(arquivo);
        PrintWriter cadastro = new PrintWriter(writer);
        
        listaFuncionarios.add(funcionarios);
        
            for(Funcionarios cadastroFuncionarios: listaFuncionarios){
                cadastro.println(cadastroFuncionarios.getCodigo());
                cadastro.println(cadastroFuncionarios.getNome());
                cadastro.println(cadastroFuncionarios.getCpf());
                cadastro.println(cadastroFuncionarios.getTefefone());
                cadastro.println(cadastroFuncionarios.getCargo());
                cadastro.println(cadastroFuncionarios.getUsuario());
                cadastro.println(cadastroFuncionarios.getSenha());
                cadastro.println(cadastroFuncionarios.getEndereco().getRua());
                cadastro.println(cadastroFuncionarios.getEndereco().getNumero());
                cadastro.println(cadastroFuncionarios.getEndereco().getComplemento());
                cadastro.println(cadastroFuncionarios.getEndereco().getBairro());
                cadastro.println(cadastroFuncionarios.getEndereco().getCidade());
                cadastro.println(cadastroFuncionarios.getEndereco().getUf());
                cadastro.println(cadastroFuncionarios.getEndereco().getCep());
            } 
            writer.close();
            cadastro.close();
            
            return true;
            
        }
 
    public boolean alteraFuncionarios(Funcionarios funcionarios) throws FileNotFoundException, IOException{
        
        boolean existe = pesquisaFuncionarios(funcionarios);
        boolean retorno = false;
        if (existe){
            for(Funcionarios modificaFuncionarios: listaFuncionarios){
                if(funcionarios.getCodigo() == modificaFuncionarios.getCodigo()){
                    modificaFuncionarios=funcionarios;
                    retorno = true;
                }
            }
        } 
        else {
            System.out.println("Erro! Esse funcionario nao esta cadastrado");
            retorno = false;
        }
        return retorno;
    }
    public boolean pesquisaFuncionarios(Funcionarios funcionarios) throws FileNotFoundException, IOException{
        
        boolean encontrou = false;
        for(Funcionarios achaFuncionarios: listaFuncionarios){
            if (achaFuncionarios.getCpf().equals(funcionarios.getCpf())){
                return encontrou=true;
            }
        }
        return encontrou;
    }
    public boolean pesquisaFuncionarios(int codigo){
        boolean encontrou = false;
        for(Funcionarios funcionario : listaFuncionarios){
            if(funcionario.getCodigo()==codigo){
                encontrou = true;
            }
            
        }
        return encontrou;
    }
    public boolean retornarFuncionario(Funcionarios funcionarios){
        boolean achou = true;
        for(Funcionarios item : listaFuncionarios){
            if(item.getCodigo()== funcionarios.getCodigo()){
                achou=true;
                funcionarios.setCargo(item.getCargo());
                funcionarios.setNome(item.getNome());
                funcionarios.setCpf(item.getCpf());
                funcionarios.setTefefone(item.getTefefone());
                funcionarios.setEndereco(item.getEndereco());
            }
            
        }
        return achou;
    }
    public boolean retornarClienteComCpf(Funcionarios funcionarios){
        boolean achou = false;
        for(Funcionarios item : listaFuncionarios){
            if(item.getCpf().equals(funcionarios.getCpf())){
                achou = true;
                funcionarios.setNome(item.getNome());
                funcionarios.setTefefone(item.getTefefone());
                funcionarios.setEndereco(item.getEndereco());
            }
        }
        
        return achou;
    }
    public void mostrarFuncionariosComNome(String nome){
        List<Funcionarios> lista = new ArrayList<Funcionarios>();
         visaoFuncionarios = new VisaoFuncionarios();
         
         for(Funcionarios item: listaFuncionarios){
             if(item.getNome().equals(nome)){
                 lista.add(item);
             }
         }
         if(lista.isEmpty()){
            System.out.println("Nenhum " + nome + "cadastrado");
        }else{
            System.out.println("------------- Funcionário -------------");
            System.out.println();
            for(Funcionarios item: lista){
                visaoFuncionarios.imprimeFuncionarios(item);
                System.out.println();
            }
        }   
    }
    
    /*
     * Codigos referentes à interface gráfica. Utilizando o Hibernate
     */
    
    public boolean verificarLogin(Funcionarios funcionario){
        abrirDB();
        Funcionarios f = new Funcionarios();
        Query query = em.createQuery("FROM Funcionarios f WHERE f.usuario = :usuario and f.senha = :senha");
        query.setParameter("usuario", funcionario.getUsuario());
        query.setParameter("senha", funcionario.getSenha());
        
        try{
            f = (Funcionarios)query.getSingleResult();
            return true;
        }catch(EntityNotFoundException ex){
            return false;
        }catch(NoResultException ex){
            return false;
        }
        
        
    }
    
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
        em.persist(em);
        em.getTransaction().commit();
        
        fecharDB();
    }
}
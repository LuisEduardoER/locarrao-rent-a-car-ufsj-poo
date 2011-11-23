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
import javax.persistence.NoResultException;
import javax.persistence.Query;
import locarrao.visao.VisaoClientes;
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;
import modelo.dominio.Veiculos;

/**
 *
 * @author PATY
 */
public class PersisteCliente extends DaoBase{
    public static File arquivo;
    public static List<Clientes> listaClientes;
    
    VisaoClientes visaoCliente = new VisaoClientes();
    
    public PersisteCliente() {
        arquivo = new File("src/arquivos/Clientes.txt");
        listaClientes = new ArrayList<Clientes>();
        retornarTodosClientes();
    }
    
    public static void retornarTodosClientes () {
        
        //verificando existencia do arquivo...
        if(arquivo.exists()){
            FileReader reader = null;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                
                //percorre o arquivo...
                String linha = null;
                int contador = 0;
                Clientes clientes = new Clientes();
                Endereco endereco = new Endereco();
    
                try {
                    while((linha = leitor.readLine()) != null){
                        
                        if (contador == 0){
                            //transformando string em inteiro...
                            clientes.setCodigo(Integer.parseInt(linha));
                            contador++;
                        }
                        else if(contador == 1){
                            clientes.setNome(linha);
                            contador++;
                        }
                        else if (contador == 2){
                            clientes.setCpf(linha);
                            contador++;
                        }
                        else if (contador == 3){
                            clientes.setTefefone(linha);
                            contador++;
                        }
                        else if (contador == 4){
                            endereco.setRua(linha);
                            contador++;
                        }
                        else if (contador == 5) {
                            endereco.setNumero(Integer.valueOf(linha));
                            contador++;
                        }
                        else if (contador == 6){
                            endereco.setComplemento(linha);
                            contador++;
                        }
                        else if (contador == 7){
                            endereco.setBairro(linha);
                            contador++;
                        }
                        else if (contador == 8){
                            endereco.setCidade(linha);
                            contador++;
                        }
                        else if (contador == 9){
                            endereco.setUf(linha);
                            contador++;
                        }
                        else if (contador == 10){
                            endereco.setCep(linha);
                            clientes.setEndereco(endereco);
                            listaClientes.add(clientes);
                            contador = 0;
                            clientes = new Clientes();
                            endereco = new Endereco();
                        }
                    }
                    
                    reader.close();
                    leitor.close();
                } catch (IOException ex) {
                    System.out.println("Erro na leitura/escrita do arquivo");
                    System.out.println(ex.getMessage());
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Arquivo não encontrado");
            }
        }
        else {
            System.out.println("Arquivo não encontrado");
        }
    }
    
    public boolean salvar(Clientes clientes) throws FileNotFoundException, IOException {
        FileWriter writer = new FileWriter(arquivo);
        PrintWriter cadastro = new PrintWriter(writer);
        
        listaClientes.add(clientes);
       
        for(Clientes pessoas: listaClientes){
            cadastro.println(pessoas.getCodigo());
            cadastro.println(pessoas.getNome());
            cadastro.println(pessoas.getCpf());
            cadastro.println(pessoas.getTefefone());
            cadastro.println(pessoas.getEndereco().getRua());
            cadastro.println(pessoas.getEndereco().getNumero());
            cadastro.println(pessoas.getEndereco().getComplemento());
            cadastro.println(pessoas.getEndereco().getBairro());
            cadastro.println(pessoas.getEndereco().getCidade());
            cadastro.println(pessoas.getEndereco().getUf());
            cadastro.println(pessoas.getEndereco().getCep());
        }
       
        writer.close();
        cadastro.close();
       
        return true;
       
           
    }
   
    public boolean alterarCliente(Clientes clientes) throws FileNotFoundException, IOException{
       
        boolean existe = pesquisarCliente(clientes);
        boolean retorno = false;
        if (existe){
            for(Clientes pessoas: listaClientes){
                if(clientes.getCodigo() == pessoas.getCodigo()){
                    pessoas = clientes;
                    retorno = true;
                }
            }
        }
        else {
            System.out.println("Erro! Cliente não existe");
            retorno = false;
        }
        return retorno;
    }
    public boolean pesquisarCliente(Clientes cliente) throws FileNotFoundException, IOException{
        boolean encontrou = false;
        for(Clientes pessoa: listaClientes){
            if(pessoa.getCpf().equals(cliente.getCpf())){
                encontrou = true;
            }
        }
        return encontrou;
    }
    
    public boolean pesquisarCliente(int codigo) throws FileNotFoundException, IOException{
        boolean encontrou = false;
        for(Clientes pessoa: listaClientes){
            if(pessoa.getCodigo() == codigo){
                encontrou = true;
            }
        }
        return encontrou;
    }
    
    public boolean retornarCliente(Clientes cliente){
        boolean achou = false;
        for(Clientes item : listaClientes){
            if(item.getCodigo() == cliente.getCodigo()){
                achou = true;
                cliente.setNome(item.getNome());
                cliente.setCpf(item.getCpf());
                cliente.setTefefone(item.getTefefone());
                cliente.setEndereco(item.getEndereco());
            }
        }
        
        return achou;
    }
    
    public boolean retornarClienteComCpf(Clientes cliente){
        boolean achou = false;
        for(Clientes item : listaClientes){
            if(item.getCpf().equals(cliente.getCpf())){
                achou = true;
                cliente.setNome(item.getNome());
                cliente.setTefefone(item.getTefefone());
                cliente.setEndereco(item.getEndereco());
            }
        }
        
        return achou;
    }
    
    
    /*
     * Como pode ocorrer de ter mais de um cliente com o mesmo nome, é criado uma lista
     * que irá conter todos os clientes com o nome desejado
     */
    public void mostrarClientesComNome(String nome){
        List<Clientes> lista = new ArrayList<Clientes>();
        visaoCliente = new VisaoClientes();
        
        for(Clientes item: listaClientes){
            if(item.getNome().equals(nome)){
                lista.add(item);
            }
        }
        
        if(lista.isEmpty()){
            System.out.println("Nenhum " + nome + "cadastrado");
        }else{
            System.out.println("------------- Cliente -------------");
            System.out.println();
            for(Clientes item: lista){
                visaoCliente.imprimeCliente(item);
                System.out.println();
            }
        }    
        
        
    }
    
    /*
     * intergace grafica
     */
    public boolean pesquisarClienteBD(Clientes cliente){
        abrirDB();
        
        try{
            cliente = em.find(Clientes.class, cliente.getCodigo());
            fecharDB();
            return true;
        }catch(NoResultException ex){
            fecharDB();
            return false;
        }
    }
    
}


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
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;

/**
 *
 * @author PATY
 */
public class PersistenciaCliente {
    public static File arquivo;
    public static List<Clientes> listaClientes; 
    
    public PersistenciaCliente() {
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
                try {
                    
                    Clientes clientes = new Clientes();
                    Endereco endereco = new Endereco();
                
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

        boolean encontrou = pesquisarCliente(clientes);

        if(!encontrou){
            listaClientes.add(clientes);
        }
       
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
                    pessoas=clientes;
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
            if (pessoa.getCodigo() == cliente.getCodigo()){
                encontrou = true;
            }
        }
        return encontrou;
    }
   
}


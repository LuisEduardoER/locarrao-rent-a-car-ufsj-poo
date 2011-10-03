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
    File arquivo = new File("src/arquivos/Clientes.txt");
    public List<Clientes> retornaTodosClientes () throws FileNotFoundException, IOException {
        
        //criando a lista...
        List<Clientes> listaClientes = new ArrayList<Clientes> ();
        
        //verificando existencia do arquivo...
        if(arquivo.exists()){
            
            //variáveis para leitura do arquivo...
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            
            Clientes clientes = new Clientes();
            Endereco endereco = new Endereco();
            
            //percorre o arquivo...
            String linha = null;
            
            int contador=0;
            
            while(leitor.ready()){
                if (contador==0){
                    linha=leitor.readLine();
                    
                    //transformando string em inteiro...
                    clientes.setCodigo(Integer.valueOf(linha));
                    contador++;
                } 
                else if(contador==1){
                    linha=leitor.readLine();
                    clientes.setNome(linha);
                    contador++;
                }
                else if (contador==2){
                    linha=leitor.readLine();
                    clientes.setCpf(linha);
                    contador++;
                }
                else if (contador==3){
                    linha=leitor.readLine();
                    clientes.setTefefone(linha);
                    contador++;
                }
                else if (contador==4){
                    linha=leitor.readLine();
                    endereco.setRua(linha);
                    contador++;
                }
                else if (contador==5) {
                    linha=leitor.readLine();
                    endereco.setNumero(Integer.valueOf(linha));
                    contador++;
                }
                else if (contador==6){
                    linha=leitor.readLine();
                    endereco.setComplemento(linha);
                    contador++;
                }
                else if (contador==7){
                    linha=leitor.readLine();
                    endereco.setBairro(linha);
                    contador++;
                }
                else if (contador==8){
                    linha=leitor.readLine();
                    endereco.setCidade(linha);
                    contador++;
                }
                else if (contador==9){
                    linha=leitor.readLine();
                    endereco.setUf(linha);
                    contador++;
                }
                else if (contador==10){
                    linha=leitor.readLine();
                    endereco.setCep(linha);
                    clientes.setEndereco(endereco);
                    listaClientes.add(clientes);
                    contador=0;
                }
                reader.close();
                leitor.close();
            }    
        }
        else {
            System.out.println("Arquivo não encontrado");
        }
        return listaClientes;    
   }
    public boolean salvar(Clientes clientes) throws FileNotFoundException, IOException{
        List<Clientes> listaClientes = new ArrayList<Clientes> ();
        listaClientes=retornaTodosClientes();
        FileWriter writer = new FileWriter(arquivo);
        PrintWriter cadastro = new PrintWriter(writer);
        boolean encontrou = pesquisaCliente(clientes);
        if(!encontrou){
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
            return false;
        }
        else {
            return false;
        }
        
    }
    
    public boolean alteraCliente(Clientes clientes) throws FileNotFoundException, IOException{
        List<Clientes> listaClientes = new ArrayList<Clientes> ();
        listaClientes=retornaTodosClientes();
        boolean existe = pesquisaCliente(clientes);
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
    public boolean pesquisaCliente(Clientes cliente) throws FileNotFoundException, IOException{
        List<Clientes> listaClientes = new ArrayList<Clientes> ();
        listaClientes=retornaTodosClientes();
        boolean encontrou = false;
        for(Clientes pessoas: listaClientes){
            if (cliente.getCodigo() == pessoas.getCodigo()){
                return encontrou=true;
            }
        }
        return encontrou;
    }
    
}

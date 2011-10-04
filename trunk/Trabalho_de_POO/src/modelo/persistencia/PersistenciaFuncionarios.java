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
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;

/**
 *
 * @author PATY
 */
public class PersistenciaFuncionarios {
    File arquivo = new File("src/arquivos/Funcionarios.txt");
    public List<Funcionarios> retornaTodosFuncionarios () throws FileNotFoundException, IOException {
        
        //criando lista de funcionarios
        List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios> ();
        
        if(arquivo.exists()){
            
            //lendo o arquivo...
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            
            Funcionarios funcionarios = new Funcionarios();
            Endereco endereco = new Endereco();
            
            //percorrendo o arquivo
            String linha = null;
            int contador=0;
            while(leitor.ready()){
                if (contador==0){
                    linha=leitor.readLine();
                    
                    //transformando string em inteiro...
                    funcionarios.setCodigo(Integer.valueOf(linha));
                    contador++;
                } 
                else if(contador==1){
                    linha=leitor.readLine();
                    funcionarios.setNome(linha);
                    contador++;
                }
                else if (contador==2){
                    linha=leitor.readLine();
                    funcionarios.setCpf(linha);
                    contador++;
                }
                else if (contador==3){
                    linha=leitor.readLine();
                    funcionarios.setTefefone(linha);
                    contador++;
                }
                else if (contador==4){
                    linha=leitor.readLine();
                    funcionarios.setCargo(linha);
                    contador++;
                }
                else if (contador==5){
                    linha=leitor.readLine();
                    funcionarios.setUsuario(linha);
                    contador++;
                }
                else if (contador==6){
                    linha=leitor.readLine();
                    funcionarios.setSenha(linha);
                    contador++;
                }
                else if (contador==7){
                    linha=leitor.readLine();
                    endereco.setRua(linha);
                    contador++;
                }
                else if (contador==8) {
                    linha=leitor.readLine();
                    endereco.setNumero(Integer.valueOf(linha));
                    contador++;
                }
                else if (contador==9){
                    linha=leitor.readLine();
                    endereco.setComplemento(linha);
                    contador++;
                }
                else if (contador==10){
                    linha=leitor.readLine();
                    endereco.setBairro(linha);
                    contador++;
                }
                else if (contador==11){
                    linha=leitor.readLine();
                    endereco.setCidade(linha);
                    contador++;
                }
                else if (contador==12){
                    linha=leitor.readLine();
                    endereco.setUf(linha);
                    contador++;
                }
                else if (contador==13){
                    linha=leitor.readLine();
                    endereco.setCep(linha);
                    funcionarios.setEndereco(endereco);
                    listaFuncionarios.add(funcionarios);
                    contador=0;
                }
                reader.close();
                leitor.close();
            }    
        }
        else {
            System.out.println("Arquivo não encontrado");
        }
        return listaFuncionarios;    
   }
    public boolean salvar(Funcionarios funcionarios) throws FileNotFoundException, IOException{
        
        List<Funcionarios> listaClientes = new ArrayList<Funcionarios> ();
        listaClientes=retornaTodosFuncionarios();
        
        FileWriter writer = new FileWriter(arquivo);
        PrintWriter cadastro = new PrintWriter(writer);
        
        boolean encontrou = pesquisaFuncionarios(funcionarios);
        if(!encontrou){
            for(Funcionarios cadastroFuncionarios: listaClientes){
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
            return false;
        }
        else {
            return false;
        }
        
    }
    
    public boolean alteraFuncionarios(Funcionarios funcionarios) throws FileNotFoundException, IOException{
        
        List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios> ();
        listaFuncionarios=retornaTodosFuncionarios();
        
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
        
        List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios> ();
        listaFuncionarios=retornaTodosFuncionarios();
        
        boolean encontrou = false;
        for(Funcionarios achaFuncionarios: listaFuncionarios){
            if (achaFuncionarios.getCodigo() == achaFuncionarios.getCodigo()){
                return encontrou=true;
            }
        }
        return encontrou;
    }
    
}
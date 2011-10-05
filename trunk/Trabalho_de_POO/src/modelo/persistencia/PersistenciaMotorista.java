/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

/**
 *
 * @author thais
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.Motorista;
import modelo.dominio.Endereco;

public class PersistenciaMotorista{
    File arquivo = new File("src/arquivos/Motorista.txt");
    
    public List<Motorista> retornaMotorista() throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        //verifica se o arquivo existe
        if(arquivo.exists()){
           // variaveis para leitura de arquivos
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            //objeto
            Motorista motorista = new Motorista();
            Endereco endereco=new Endereco();
            String linha = null;
            int contador = 0;
            /* leitura do arquivo 
             * linha 0 = cnh
             * linha 1 = endereco
             * sera a ordem para escrita e leitura no arquivo
             */
            while(leitor.ready()){
                if(contador==0){
                    linha=leitor.readLine();
                    motorista.setCnh(Long.valueOf(linha));
                    contador ++;
                }else if(contador ==1){
                    linha=leitor.readLine();
                    endereco.setRua(linha);
                    contador ++;
                }else if(contador == 2){
                    linha=leitor.readLine();
                    endereco.setNumero(Integer.valueOf(linha));
                    contador ++;
                }else if(contador == 3){
                    linha=leitor.readLine();
                    endereco.setComplemento(linha);
                    contador ++;
                }else if(contador == 4){
                    linha=leitor.readLine();
                    endereco.setBairro(linha);
                    contador ++;
                }else if(contador == 5){
                    linha=leitor.readLine();
                    endereco.setCidade(linha);
                    contador ++;
                }else if(contador == 6){
                    linha=leitor.readLine();
                    endereco.setUf(linha);
                    contador ++;
                }else if(contador == 7){
                    linha=leitor.readLine();
                    endereco.setCep(linha);
                    motorista.setEndereco(endereco);
                    listaMotorista.add(motorista);
                    contador=0;
            }
            }
            
        }else{
            System.out.println("Erro: Arquivo de Motoristas não encontrado");
        }
        return listaMotorista;
    }
    public boolean pesquisaMotorista(Motorista motorista)throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista=retornaMotorista();
        boolean encontrou = false;
        for(Motorista motoristas:listaMotorista){
            if(motorista.getCnh() == motoristas.getCnh()){
                return encontrou = true;
            }
        }
        return encontrou;
        
    }
    public boolean salvar(Motorista motorista)throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista=retornaMotorista();
        FileWriter writer = new FileWriter(arquivo,true);
        PrintWriter cadastro = new PrintWriter(writer);
        boolean existe= pesquisaMotorista(motorista);
        if(!existe){
            for(Motorista motoristas: listaMotorista){
                cadastro.println(motoristas.getCnh());
                cadastro.println(motoristas.getEndereco().getRua());
                cadastro.println(motoristas.getEndereco().getNumero());
                cadastro.println(motoristas.getEndereco().getComplemento());
                cadastro.println(motoristas.getEndereco().getBairro());
                cadastro.println(motoristas.getEndereco().getCidade());
                cadastro.println(motoristas.getEndereco().getUf());
                cadastro.println(motoristas.getEndereco().getCep());
            }
            return true;
        }else{
            return false;
        }
    }
    public boolean alteraMotorista(Motorista motorista) throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista= retornaMotorista();
        boolean existe = pesquisaMotorista(motorista);
        boolean retorno = false;
        if(existe){
            for(Motorista motoristas:listaMotorista){
                if(motorista.getCnh() == motoristas.getCnh()){
                    motoristas.setEndereco(motorista.getEndereco());
                    retorno = true;
                }
            }
        }else {
            System.out.println("Erro: motorista nao existe");
            retorno = false;
        }
        return retorno;
    }
}
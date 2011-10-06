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
    
    public List<Motorista> retornaMotorista(){
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        
        //verifica se o arquivo existe
        if(arquivo.exists()){
           // variaveis para leitura de arquivos
            FileReader reader;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                String linha = null;
                int contador = 0;
                
                try {
                    /* leitura do arquivo 
                     * linha 0 = cnh
                     * linha 1 = endereco
                     * sera a ordem para escrita e leitura no arquivo
                     */
                    while((linha=leitor.readLine()) != null){
                        //objeto
                        Motorista motorista = new Motorista();
                        Endereco endereco=new Endereco();

                        if(contador == 0){
                            motorista.setCodigo(Integer.parseInt(linha));
                            contador++;      
                        }
                        else if(contador == 1){
                            motorista.setCnh(linha);
                            contador++;
                            
                        }else if(contador == 2){
                            endereco.setRua(linha);
                            contador ++;
                            
                        }else if(contador == 3){
                            endereco.setNumero(Integer.valueOf(linha));
                            contador++;
                            
                        }else if(contador == 4){
                            endereco.setComplemento(linha);
                            contador++;
                            
                        }else if(contador == 5){
                            endereco.setBairro(linha);
                            contador++;
                            
                        }else if(contador == 6){
                            endereco.setCidade(linha);
                            contador++;
                            
                        }else if(contador == 7){
                            endereco.setUf(linha);
                            contador++;
                            
                        }else if(contador == 8){
                            endereco.setCep(linha);
                            motorista.setEndereco(endereco);
                            listaMotorista.add(motorista);
                            contador = 0;
                        }   
                    }
                    
                    reader.close();
                    leitor.close();
                } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo");
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Arquivo nao encontrado");
            }
            
        }else{
            System.out.println("Erro: Arquivo de Motoristas não encontrado");
        }
        return listaMotorista;
    }
    public boolean pesquisaMotorista(Motorista motorista)throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista = retornaMotorista();
        boolean encontrou = false;
        for(Motorista item:listaMotorista){
            if(item.getCnh().equals(motorista.getCnh())){
                return encontrou = true;
            }
        }
        return encontrou;
        
    }
     public Motorista pesquisaMotorista2(Motorista motorista)throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista = retornaMotorista();
        boolean encontrou = false;
        for(Motorista item:listaMotorista){
            if(item.getCnh().equals(motorista.getCnh())){
                return item;
            }
        }
        return null;
        
    }
    public boolean salvar(List<Motorista> listaMotorista,Motorista motorista)throws FileNotFoundException, IOException{
        if(arquivo.exists()){
            FileWriter writer = new FileWriter(arquivo);
            PrintWriter cadastro = new PrintWriter(writer);

            listaMotorista.add(motorista);
            System.out.println(motorista.getCnh());
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
            System.out.println("Arquivo não existe");
            return false;
        }
        
    }
    public boolean alteraMotorista(Motorista motorista) throws FileNotFoundException, IOException{
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        listaMotorista= retornaMotorista();
        boolean existe = pesquisaMotorista(motorista);
        boolean retorno = false;
        if(existe){
            for(Motorista pessoa:listaMotorista){
                if(pessoa.getCnh().equals(motorista.getCnh())){
                    pessoa.setEndereco(motorista.getEndereco());
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
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
    public static File arquivo;
    public static List<Motorista> listaMotorista;
    
    public PersistenciaMotorista() {
        arquivo = new File("src/arquivos/Motorista.txt");
        listaMotorista = new ArrayList<Motorista>();
        retornarMotorista();
        
    }
    
    public static void retornarMotorista () {
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
                    while((linha = leitor.readLine()) != null){
                        //objeto
                        System.out.println("linha: " + linha);
                        Motorista motorista = new Motorista();
                        Endereco endereco = new Endereco();

                        if(contador == 0){
                            motorista.setCnh(linha);
                            System.out.println("motorista: " + motorista.getCnh());
                            contador++;
                        }
                        else if(contador == 1){
                            motorista.setCodigo(Integer.parseInt(linha));
                            contador++;
                        }
                        else if(contador == 2){
                            motorista.setNome(linha);
                            contador++;
                        }
                        else if(contador == 3){
                            motorista.setCpf(linha);
                            contador++;
                        }
                        else if(contador == 4){
                            motorista.setTefefone(linha);
                            contador++;
                        }
                        else if(contador == 5){
                            endereco.setRua(linha);
                            contador ++;
                        }
                        else if(contador == 6){
                            endereco.setNumero(Integer.parseInt(linha));
                            contador++;
                        }
                        else if(contador == 7){
                            endereco.setComplemento(linha);
                            contador++;
                        }
                        else if(contador == 8){
                            endereco.setBairro(linha);
                            contador++;
                        }
                        else if(contador == 9){
                            endereco.setCidade(linha);
                            contador++;
                        }
                        else if(contador == 10){
                            endereco.setUf(linha);
                            contador++;
                        }
                        else if(contador == 11){
                            endereco.setCep(linha);
                            motorista.setEndereco(endereco);
                            listaMotorista.add(motorista);
                            contador = 0;
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
    
    public boolean pesquisarMotorista(Motorista motorista)throws FileNotFoundException, IOException{
        
        boolean encontrou = false;
        System.out.println(listaMotorista.size());
        
        if(!listaMotorista.isEmpty()){
            for(Motorista item:listaMotorista){
                if(item.getCnh().equals(motorista.getCnh())){
                    return encontrou = true;
                }
            }
        }
        return encontrou;
        
    }
    
    public boolean salvar(Motorista motorista) {
        boolean retorno = false;
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo);
                PrintWriter cadastro = new PrintWriter(writer);
                
                listaMotorista.add(motorista);
                for(Motorista motoristas: listaMotorista){
                    cadastro.println(motoristas.getCnh());
                    cadastro.println(motorista.getCodigo());
                    cadastro.println(motorista.getNome());
                    cadastro.println(motorista.getCpf());
                    cadastro.println(motorista.getTefefone());
                    cadastro.println(motoristas.getEndereco().getRua());
                    cadastro.println(motoristas.getEndereco().getNumero());
                    cadastro.println(motoristas.getEndereco().getComplemento());
                    cadastro.println(motoristas.getEndereco().getBairro());
                    cadastro.println(motoristas.getEndereco().getCidade());
                    cadastro.println(motoristas.getEndereco().getUf());
                    cadastro.println(motoristas.getEndereco().getCep());
                }
                
                writer.close();
                cadastro.close();
                retorno =  true;
                
            } catch (IOException ex) {
                System.out.println("Erro na escrita/leitura do arquivo");
            } 
        }else{
            System.out.println("Arquivo não existe");
            retorno = false;
        }
        
        return retorno;
        
    }
    public boolean alterarMotorista(Motorista motorista) throws FileNotFoundException, IOException{
        boolean existe = pesquisarMotorista(motorista);
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
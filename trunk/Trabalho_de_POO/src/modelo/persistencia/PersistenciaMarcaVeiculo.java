package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.MarcaVeiculo;

public class PersistenciaMarcaVeiculo {
    public static File arquivo;
    public static List<MarcaVeiculo> listaMarcaVeiculo;
    
    public PersistenciaMarcaVeiculo(){
        arquivo = new File("src/arquivos/MarcaVeiculo.txt");
        listaMarcaVeiculo = new ArrayList<MarcaVeiculo>();
        retornarTodasMarcas();
    }
    
    public static void retornarTodasMarcas(){
        
        if(arquivo.exists()){
            FileReader reader = null;
            try{
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
           
                String linha = null;
                try{
                    while((linha = leitor.readLine()) != null){
                        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
                        marcaVeiculo.setMarca(linha);
                        listaMarcaVeiculo.add(marcaVeiculo);
                    }

                    reader.close();
                    leitor.close();
                } catch (IOException ex){
                    System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
                }
                
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
            }
            
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + " não foi encontrado");
        }
        
        
    }
    
    public boolean salvar(MarcaVeiculo marcaVeiculo) {
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo);
                PrintWriter dados = new PrintWriter(writer);
                
                //busca todos os tipos existentes
                
                boolean achou = false;
                for(MarcaVeiculo marca : listaMarcaVeiculo){
                    if(marca.getMarca().equals(marcaVeiculo.getMarca())){
                        achou = true;
                    }
                }
                if(achou == false){
                    dados.println(marcaVeiculo.getMarca());
                }
                writer.close();
                dados.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
                return false;
            }
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + " não foi encontrado");
            return false;
        }

    }
}

package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.ModeloVeiculo;

public class PersistenciaModeloVeiculo {
    File arquivo = new File("src/arquivos/ModeloVeiculo.txt");
    
    public List<ModeloVeiculo> retornaTodasMarcas(){
        List<ModeloVeiculo> listaMarcaVeiculo = new ArrayList<ModeloVeiculo>();
        
        if(arquivo.exists()){
            FileReader reader = null;
            try{
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
           
                String linha = null;
                try{
                    while((linha = leitor.readLine()) != null){
                        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
                        modeloVeiculo.setModelo(linha);
                        listaMarcaVeiculo.add(modeloVeiculo);
                    }

                    reader.close();
                    leitor.close();
                } catch (IOException ex){
                    System.out.println("Erro na leitura ou escrita do arquivo");
                }
                
            } catch (IOException ex) {
                System.out.println("Erro na leitura/escrita do arquivo");
            }
            
        }
        else{
            System.out.println("Arquivo não encontrado");
        }
        return listaMarcaVeiculo;
        
    }
    
    public boolean salvar(List<ModeloVeiculo> listaModeloVeiculo, ModeloVeiculo modeloVeiculo) {
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo,true);
                PrintWriter dados = new PrintWriter(writer);
                
                //busca todos os tipos existentes
                
                boolean achou = false;
                for(ModeloVeiculo modelo : listaModeloVeiculo){
                    if(modelo.getModelo().equals(modeloVeiculo.getModelo())){
                        achou = true;
                    }
                }
                if(achou == false){
                    dados.println(modeloVeiculo.getModelo());
                }
                writer.close();
                dados.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Erro na escrita/leitura do arquivo");
                return false;
            }
        }
        else{
            System.out.println("Arquvo não encontrado");
            return false;
        }

    }
}

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
    File arquivo = new File("src/arquivos/MarcaVeiculo.txt");
    
    public List<MarcaVeiculo> retornaTodasMarcas(){
        List<MarcaVeiculo> listaMarcaVeiculo = new ArrayList<MarcaVeiculo>();
        
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
    
    public boolean salvar(List<MarcaVeiculo> listaMarcaVeiculo, MarcaVeiculo marcaVeiculo) {
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

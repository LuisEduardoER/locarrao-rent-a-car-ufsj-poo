package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.TipoVeiculo;

public class PersistenciaTipoVeiculo {
    
    public List<TipoVeiculo> retornarTodosTipoVeiculo() throws FileNotFoundException, IOException {
        List<TipoVeiculo> listaTipoVeiculos = new ArrayList<TipoVeiculo>();
        
        File arquivo = new File("src/arquivos/TipoVeiculo.txt");
        if(arquivo.exists()){
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            TipoVeiculo tipoVeiculo = new TipoVeiculo();
            String linha = null;
            
            while(leitor.ready()){
                linha = leitor.readLine();
                tipoVeiculo.setTipo(linha);
                listaTipoVeiculos.add(tipoVeiculo);
            }
            
        }
        return listaTipoVeiculos;
    }
    
    public TipoVeiculo retornaTipoVeiculo(int indice) throws FileNotFoundException, IOException {
        return retornarTodosTipoVeiculo().get(indice);
    }
    
}
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
import modelo.dominio.TipoLocacao;

public class PersistenciaTipoLocacao {
    File arquivo = new File("src/arquivos/TipoLocacao.txt");
        
    public List<TipoLocacao> retornaTodosTipoLocacao() throws FileNotFoundException, IOException{
        List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
        if(arquivo.exists()){
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            TipoLocacao tipoVeiculo = new TipoLocacao();
            String linha = null;
            
            int contador = 0;
            while(leitor.ready()){
                if (contador == 0){
                    linha = leitor.readLine();
                    tipoVeiculo.setNomeTipo(linha);
                    contador ++;
                }
                else if (contador == 1){
                    linha = leitor.readLine();
                    tipoVeiculo.setTaxa(Double.valueOf(linha.trim()).doubleValue());
                    contador++;
                }
                else{
                    linha = leitor.readLine();
                    tipoVeiculo.setPrecoPorQuilometro(Double.valueOf(linha.trim()).doubleValue());
                    listaTipoLocacao.add(tipoVeiculo);
                    contador = 0;
                    
                    
                }
                
            }
            
        }
        
        return listaTipoLocacao;
    }
    
    //salvar
    public boolean salvar(TipoLocacao tipoLocacao) throws IOException {
        if(this.arquivo.exists()){
            List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
            
            listaTipoLocacao = retornaTodosTipoLocacao();
            listaTipoLocacao.add(tipoLocacao);
            
            int contador = 0;
            for(TipoLocacao tipo: listaTipoLocacao){
                if(contador == 3){
                    contador = 0;
                    dados.println();
                }
                else{
                    dados.println(tipo.getNomeTipo());
                    dados.println(tipo.getTaxa());
                    dados.println(tipo.getPrecoPorQuilometro());
                    dados.println(tipo.getTipoVeiculo().getTipo());
                }
            }
            return true;
        }
        else{
            return false;
        }

    }

}

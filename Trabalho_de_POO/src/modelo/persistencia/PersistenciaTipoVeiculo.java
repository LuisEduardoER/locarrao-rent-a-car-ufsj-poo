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
import modelo.dominio.TipoVeiculo;

public class PersistenciaTipoVeiculo {
    File arquivo = new File("src/arquivos/TipoVeiculo.txt");
    
    public List<TipoVeiculo> retornaTodosTipoVeiculo() throws FileNotFoundException, IOException {
        List<TipoVeiculo> listaTipoVeiculos = new ArrayList<TipoVeiculo>();
        
        if(arquivo.exists()){
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            String linha = null;
            
            while(leitor.ready()){
                TipoVeiculo tipoVeiculo = new TipoVeiculo();
                linha = leitor.readLine();
                tipoVeiculo.setTipo(linha);
                listaTipoVeiculos.add(tipoVeiculo);
            }
            reader.close();
            leitor.close();
        }
        else{
            System.out.println("Arquivo não encontrada");
        }
        return listaTipoVeiculos;
    }
    
    public boolean salvar(TipoVeiculo tipoVeiculo) throws IOException {
        if(this.arquivo.exists()){
            List<TipoVeiculo> listaTipoVeiculo = new ArrayList<TipoVeiculo>();
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
            
            //busca todos os tipos existentes
            listaTipoVeiculo = retornaTodosTipoVeiculo();
            
            /* Salva tipoVeiculo no arquivo
             * 
             * Caso já tenha sido feito o cadastro do tipo de veiculo
             * não será feito nada no arquivo
             * 
             * Caso contrario será adicionado na lista.
             */
            
            boolean achou = false;
            for(TipoVeiculo tipo : listaTipoVeiculo){
                if(tipo.getTipo().equals(tipoVeiculo.getTipo())){
                    
                    tipo = tipoVeiculo;
                    achou = true;
                }
            }
            
            if(!achou){
                listaTipoVeiculo.add(tipoVeiculo);
            }
            
            for(TipoVeiculo tipo: listaTipoVeiculo){
                dados.println(tipo.getTipo());
            }
            
            writer.close();
            dados.close();
            return true;
        }
        else{
            System.out.println("Arquvo não encontrado");
            return false;
        }

    }
    /* O tipo de veículo desejado virá a partir da escolha através de um menu.
     * Então o número que o usuário passar, virá como indice para este método.
     * 
     * é .get(indice - 1), porque a lista começa do 0 e os indice para escolha
     * começa do 1.
     * 
     */
    public TipoVeiculo retornaTipoVeiculo(int indice) throws FileNotFoundException, IOException {
        return retornaTodosTipoVeiculo().get(indice - 1);
    }
    
}
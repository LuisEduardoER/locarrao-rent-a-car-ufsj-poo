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
   
   
    public List<TipoVeiculo> retornaTodosTipoVeiculo() {
        List<TipoVeiculo> listaTipoVeiculos = new ArrayList<TipoVeiculo>();
       
        if(arquivo.exists()){
            FileReader reader = null;
            try{
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
           
                String linha = null;
                try{
                    while((linha = leitor.readLine()) != null){
                        TipoVeiculo tipoVeiculo = new TipoVeiculo();
                        tipoVeiculo.setTipo(linha);
                        listaTipoVeiculos.add(tipoVeiculo);
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
        return listaTipoVeiculos;
    }
   
    public boolean salvar(List<TipoVeiculo> listaTipoVeiculo, TipoVeiculo tipoVeiculo) {
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo,true);
                PrintWriter dados = new PrintWriter(writer);
                //busca todos os tipos existentes
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
                        achou = true;
                    }
                }
                if(achou == false){
                    dados.println(tipoVeiculo.getTipo());
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


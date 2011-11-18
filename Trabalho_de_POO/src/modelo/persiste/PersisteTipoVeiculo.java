package modelo.persiste;

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

public class PersisteTipoVeiculo {
    public static File arquivo;
    public static List<TipoVeiculo> listaTipoVeiculos;
                        
    
    public PersisteTipoVeiculo(){
        arquivo = new File("src/arquivos/TipoVeiculo.txt");
        listaTipoVeiculos = new ArrayList<TipoVeiculo>();
        retornarTodosTipoVeiculo();
        
        /*
         * Caso não tenha algum tipo de veiculo cadastrado, então o tipo Padrão
         * sera cadastrado automaticamente.
         */
        if(listaTipoVeiculos.isEmpty()){
            TipoVeiculo tipo = new TipoVeiculo();
            tipo.setTipo("Padrao");
            salvar(tipo);
        }
    }
    
    public static void retornarTodosTipoVeiculo() {
        
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
                    System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
                }
                
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
            }
            
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + "não foi encontrado");
        }
        
    }
   
    public static boolean salvar(TipoVeiculo tipoVeiculo) {
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
                for(TipoVeiculo tipo : listaTipoVeiculos){
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
                System.out.println("Erro na leitura ou escrita do arquivo " +
                            arquivo.getName());
                return false;
            }
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + "não foi encontrado");
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
        return listaTipoVeiculos.get(indice - 1);
    }
   
}


package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;

//deu erro no commit

public class PersistenciaTipoLocacao {    
    public static File arquivo;
    public static List<TipoLocacao> listaTipoLocacao;
    
    //construtor que vai fazer com que a lista seja lida somente uma vez.
    public PersistenciaTipoLocacao() {
        arquivo = new File("src/arquivos/TipoLocacao.txt");
        listaTipoLocacao = new ArrayList<TipoLocacao>();
        retornarTodosTipoLocacao();
        
    }
    
        
    public static void retornarTodosTipoLocacao() {
        
        //Verifico se o arquivo existe, se existir faz as ações
        if(arquivo.exists()){
            FileReader reader = null;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                /* Leitura do arquivo
                 * linha 0 = taxa
                 * linha 1 = preço por km
                 * linha 2 = Tipo do Veiculo
                 * Essa será a ordem da escrita no arquivo
                 */
                String linha = null;
                int contador = 0;
                TipoLocacao tipoLocacao = new TipoLocacao();
                TipoVeiculo tipoVeiculo = new TipoVeiculo();

                while((linha = leitor.readLine()) != null) {
                    //objetos
                    
                    if (contador == 0) {
                        tipoLocacao.setTaxa(Double.parseDouble(linha));
                        contador++;
                    }
                    else if (contador == 1) {
                        tipoLocacao.setPrecoPorQuilometro(Double.parseDouble(linha));
                        contador++ ;
                    }
                    else if (contador == 2) {
                        tipoVeiculo.setTipo(linha);
                        tipoLocacao.setTipoVeiculo(tipoVeiculo);
                        listaTipoLocacao.add(tipoLocacao);
                        tipoLocacao = new TipoLocacao();
                        tipoVeiculo = new TipoVeiculo();
                        contador = 0;
                    }
                }
                reader.close();
                leitor.close();
            } catch (IOException ex) {
                System.out.println("Erro na leitura ou escrita do arquivo " + arquivo.getName());
            } 
        }
        else{
            System.out.println("Arquivo " + arquivo.getName() + "não existe");
        }
    }
    
    //salvar
    public boolean salvar(TipoLocacao tipoLocacao) throws IOException {
        if(arquivo.exists()){
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
            
            /* Salva tipoLocacao no arquivo
             * 
             * Caso já tenha sido feito o cadastro do tipo de locação para um
             * determinado tipo de veiculo, será feita uma alteração no cadastro
             * 
             * Caso contrario será adicionado na lista.
             */
            
            alterarCadastroTipoLocacao(tipoLocacao);
            
            for(TipoLocacao tipo: listaTipoLocacao){
                dados.println(tipo.getTaxa());
                dados.println(tipo.getPrecoPorQuilometro());
                dados.println(tipo.getTipoVeiculo().getTipo());
            }
            
            writer.close();
            dados.close();
            return true;
        }
        else{
            System.out.println("No método salvar o arquivo " + arquivo.getName() + 
                    "não foi encontrado");
            return false;
        }

    }
    
    
    /* Verifica se ja foi cadastrado o custo da locação para um determinado tipo
     * de veiculo.
     * Caso tenha sido cadastrado, então sera feita uma escolha de qual tipo de
     * locação a ser alterada, caso contrário sera obrigatorio o cadastro para
     * os dois tipos de locação
     */
    
    public void alterarCadastroTipoLocacao(TipoLocacao tipoLocacao){
        boolean achou = false;
        
        if(!listaTipoLocacao.isEmpty()){
            TipoVeiculo tipoVeiculo = new TipoVeiculo();
            tipoVeiculo.setTipo(tipoLocacao.getTipoVeiculo().getTipo());

            for(TipoLocacao tipo : listaTipoLocacao){
                if(tipo.getTipoVeiculo().getTipo().equals(tipoVeiculo.getTipo())){
                    tipo.setTaxa(tipoLocacao.getTaxa());
                    tipo.setPrecoPorQuilometro(tipoLocacao.getPrecoPorQuilometro());
                    achou = true;
                }

            }
            if(achou == false){
                listaTipoLocacao.add(tipoLocacao);
            }
        }
        else{
            listaTipoLocacao.add(tipoLocacao);
        }

    }
}

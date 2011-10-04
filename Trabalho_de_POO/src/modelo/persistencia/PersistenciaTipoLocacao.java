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
import modelo.dominio.TipoVeiculo;

public class PersistenciaTipoLocacao {
    File arquivo = new File("src/arquivos/TipoLocacao.txt");
        
    public List<TipoLocacao> retornaTodosTipoLocacao() throws FileNotFoundException, IOException{
        List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
        
        //Verifico se o arquivo existe, se existir faz as ações
        if(arquivo.exists()){
            //variaveis para leitura do arquivo
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            
            /* Leitura do arquivo
             * linha 0 = Tipo do Veiculo
             * linha 1 = taxa
             * linha 2 = preço por km
             * Essa será a ordem da escrita no arquivo
             */
            String linha = "";
            int contador = 0;
            
            while((linha = leitor.readLine()) != null) {
                //objetos
                System.out.println(linha);
                TipoLocacao tipoLocacao = new TipoLocacao();
                TipoVeiculo tipoVeiculo = new TipoVeiculo();
            
                if (contador == 0) {
                    tipoVeiculo.setTipo(linha);
                    tipoLocacao.setTipoVeiculo(tipoVeiculo);
                    contador++;
                }
                else if (contador == 1) {
                    tipoLocacao.setTaxa(Double.parseDouble(linha));
                    contador++ ;
                }
                else if (contador == 2) {
                    tipoLocacao.setPrecoPorQuilometro(Double.parseDouble(linha));
                    listaTipoLocacao.add(tipoLocacao);
                    contador = 0;
                }
                
            }
            
            reader.close();
            leitor.close();
            
        }
        else{
            System.out.println("Arquivo não existe");
        }
        
        return listaTipoLocacao;
    }
    
    //salvar
    public boolean salvar(TipoLocacao tipoLocacao) throws IOException {
        if(this.arquivo.exists()){
            List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo,true); 
            PrintWriter dados = new PrintWriter(writer);
            
            //busca todos os tipos existentes
            listaTipoLocacao = retornaTodosTipoLocacao();
            
            /* Salva tipoLocacao no arquivo
             * 
             * Caso já tenha sido feito o cadastro do tipo de locação para um
             * determinado tipo de veiculo, será feita uma alteração no cadastro
             * 
             * Caso contrario será adicionado na lista.
             */
            boolean achou = false;
            for(TipoLocacao tipo : listaTipoLocacao){
                achou = alteraCadastroTipoLocacao(listaTipoLocacao, tipoLocacao);
            }
            if(achou == false){
                listaTipoLocacao.add(tipoLocacao);
            }
            
            for(TipoLocacao tipo: listaTipoLocacao){
                dados.println(tipo.getTipoVeiculo().getTipo());
                dados.println(tipo.getTaxa());
                dados.println(tipo.getPrecoPorQuilometro());
                
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
    
    
    /* Verifica se ja foi cadastrado o custo da locação para um determinado tipo
     * de veiculo.
     * Caso tenha sido cadastrado, então sera feita uma escolha de qual tipo de
     * locação a ser alterada, caso contrário sera obrigatorio o cadastro para
     * os dois tipos de locação
     */
    
    public boolean alteraCadastroTipoLocacao(List<TipoLocacao> listaTipoLocacao,TipoLocacao tipoLocacao){
        boolean achou = false;
        for(TipoLocacao tipo : listaTipoLocacao){
            if(tipo.getTipoVeiculo().getTipo().contains(tipoLocacao.getTipoVeiculo().getTipo())) {tipo.setPrecoPorQuilometro(tipoLocacao.getPrecoPorQuilometro());
                tipo.setTaxa(tipoLocacao.getTaxa());
                achou = true;
            }
        }

        return achou;
    }

}

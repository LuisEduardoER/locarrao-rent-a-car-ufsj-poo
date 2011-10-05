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
    File arquivo = new File("src/arquivos/TipoLocacao.txt");
        
    public List<TipoLocacao> retornaTodosTipoLocacao() {
        List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
        
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
                while((linha = leitor.readLine()) != null) {
                    //objetos
                    TipoLocacao tipoLocacao = new TipoLocacao();
                    TipoVeiculo tipoVeiculo = new TipoVeiculo();

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
                        contador = 0;
                    }
                }
                reader.close();
                leitor.close();
            } catch (IOException ex) {
                System.out.println("Erro na leitura/escrita do arquivo");
            } 
        }
        else{
            System.out.println("Arquivo não existe");
        }
        return listaTipoLocacao;
    }
    
    //salvar
    public boolean salvar(List<TipoLocacao> listaTipoLocacao,TipoLocacao tipoLocacao) throws IOException {
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
            
            alteraCadastroTipoLocacao(listaTipoLocacao, tipoLocacao);
            
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
    
    public void alteraCadastroTipoLocacao(List<TipoLocacao> listaTipoLocacao,TipoLocacao tipoLocacao){
        boolean achou = false;

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

}

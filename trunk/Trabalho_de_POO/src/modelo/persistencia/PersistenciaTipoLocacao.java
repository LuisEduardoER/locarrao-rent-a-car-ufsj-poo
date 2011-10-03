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
import java.util.logging.Level;
import java.util.logging.Logger;
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
            
            //objetos
            TipoLocacao tipoLocacao = new TipoLocacao();
            TipoVeiculo tipoVeiculo = new TipoVeiculo();
            
            String linha = null;
            
            /* Leitura do arquivo
             * linha 0 = nome do tipo
             * linha 1 = taxa
             * linha 3 = preço por km
             * linha 4 = nome do tipo de veiculo
             * 
             * Essa será a ordem da escrita no arquivo
             */
            int contador = 0;
            while(leitor.ready()) {
                if (contador == 0) {
                    linha = leitor.readLine();
                    tipoLocacao.setNomeTipo(linha);
                    contador ++;
                }
                else if (contador == 1) {
                    linha = leitor.readLine();
                    tipoLocacao.setTaxa(Double.valueOf(linha.trim()).doubleValue());
                    contador++;
                }
                else if (contador == 2) {
                    linha = leitor.readLine();
                    tipoLocacao.setPrecoPorQuilometro(Double.valueOf(linha.trim()).doubleValue());
                    contador++;
                }
                else {
                    linha = leitor.readLine();
                    tipoVeiculo.setTipo(linha);
                    tipoLocacao.setTipoVeiculo(tipoVeiculo);
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
            FileWriter writer = new FileWriter(arquivo); 
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
                if(tipoLocacao.getTipoVeiculo().getTipo().
                        equals(tipo.getTipoVeiculo().getTipo())){
                    
                    tipo = tipoLocacao;
                    achou = true;
                }
            }
            
            if(!achou){
                listaTipoLocacao.add(tipoLocacao);
            }
            
            for(TipoLocacao tipo: listaTipoLocacao){
                dados.println(tipo.getNomeTipo());
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
    
    public boolean verificaCadastroTipoLocacao(TipoVeiculo tipoVeiculo){
        List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
        try {
            listaTipoLocacao = retornaTodosTipoLocacao();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersistenciaTipoLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaTipoLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

}

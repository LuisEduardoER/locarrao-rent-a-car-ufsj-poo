/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.Locacao;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;

/**
 *
 * @author User
 */
public class PersistenciaLocacao {
    static File arquivo = new File("src/arquivos/Locacao.txt");
    
    public List<Locacao> retornaTodasLocacoes () throws FileNotFoundException, IOException {
        
        //criando a lista...
        List<Locacao> listaLocacao = new ArrayList<Locacao> ();
        
        //verificando existencia do arquivo...
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
                    Locacao locacao = new Locacao();
                    TipoLocacao tipoLocacao = new TipoLocacao();
                    TipoVeiculo tipoVeiculo = new TipoVeiculo();

                    if (contador == 0) {
                        locacao.setQuilometragemDeSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 1) {
                        locacao.setQuilometragemDeEntrada(Long.parseLong(linha));
                        contador++ ;
                    }
                    else if (contador == 2) {
                        locacao.setTipo(linha);
                        contador++;
                        
                    }
                    else if (contador == 3){
                        locacao.setValor(Double.parseDouble(linha));
                        contador++;
                    }
                    else if (contador == 4){
                        locacao.setDataSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 5){
                        locacao.setDataDevolucao(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 6){
                        locacao.setPrevisao(Integer.parseInt(linha));
                        contador++;
                    }
                    else if (contador == 7 ){
                        locacao.setLocacaoAberta(Boolean.parseBoolean(linha));
                        contador++;
                    }
                    else if (contador == 8){
                        tipoVeiculo.setTipo(linha);
                        tipoLocacao.setTipoVeiculo(tipoVeiculo);
                        locacao.setTipoLocacao(tipoLocacao);
                        listaLocacao.add(locacao);
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
        return listaLocacao;
    }
    
}
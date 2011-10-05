/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

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
                    Motorista motorista = new Motorista();
                    Veiculos veiculo = new Veiculos();
                    Clientes cliente = new Clientes();
                    
                    if (contador == 0){
                        locacao.setCodigo(Integer.parseInt(linha));
                        contador++;
                    }
                    else if (contador == 1) {
                        locacao.setQuilometragemDeSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 2) {
                        locacao.setQuilometragemDeEntrada(Long.parseLong(linha));
                        contador++ ;
                    }
                    else if (contador == 3) {
                        locacao.setTipo(linha);
                        contador++;
                        
                    }
                    else if (contador == 4){
                        locacao.setValor(Double.parseDouble(linha));
                        contador++;
                    }
                    else if (contador == 5){
                        locacao.setDataSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 6){
                        locacao.setDataDevolucao(Long.parseLong(linha));
                        contador++;
                    }
                    else if (contador == 7){
                        locacao.setPrevisao(Integer.parseInt(linha));
                        contador++;
                    }
                    else if (contador == 8 ){
                        locacao.setLocacaoAberta(Boolean.parseBoolean(linha));
                        contador++;
                    }
                    else if (contador == 9){
                        tipoVeiculo.setTipo(linha);
                        tipoLocacao.setTipoVeiculo(tipoVeiculo);
                        locacao.setTipoLocacao(tipoLocacao);
                        contador++;
                    }
                    else if (contador == 10){
                        cliente.setCodigo(Integer.parseInt(linha));
                        locacao.setCliente(cliente);
                        contador++;
                    }
                    else if (contador == 11){
                        motorista.setCodigo(Integer.parseInt(linha));
                        locacao.setMotorista(motorista);
                        contador++;
                    }
                    else if (contador == 12){
                        veiculo.setPlaca(linha);
                        locacao.setVeiculo(veiculo);
                        listaLocacao.add(locacao);
                        contador=0;
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
    
   /* public void alteraCadastroLocacao(List<Locacao> listaLocacao,Locacao locacao){
        boolean achou = false;

        for(Locacao elemento : listaLocacao){
            if(locacao.getCodigo()==elemento.getCodigo()){
                achou = true;
                
            }

        }
        if(achou == false){
            listaTipoLocacao.add(tipoLocacao);
        }
     
     * 
     */
    
    public boolean salvar(List<Locacao> listaLocacao,Locacao locacao) throws IOException {
        if(arquivo.exists()){
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
                        
            listaLocacao.add(locacao);
            
            for(Locacao tipo: listaLocacao){
                dados.println(tipo.getCodigo());
                dados.println(tipo.getQuilometragemDeSaida());
                dados.println(tipo.getQuilometragemDeEntrada());
                dados.println(tipo.getTipo());
                dados.println(tipo.getValor());
                dados.println(tipo.getDataSaida());
                dados.println(tipo.getDataDevolucao());
                dados.println(tipo.getPrevisao());
                dados.println(tipo.isLocacaoAberta());
                dados.println(tipo.getTipoLocacao().getTipoVeiculo().getTipo());
                dados.println(tipo.getCliente().getCodigo());
                dados.println(tipo.getMotorista().getCodigo());
                dados.println(tipo.getVeiculo().getPlaca());
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
    
    
      
     
}
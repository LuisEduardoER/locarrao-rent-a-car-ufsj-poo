/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
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
    public static File arquivo;
    public static List<Locacao> listaLocacao;
    
    
    public PersistenciaLocacao() {
        arquivo = new File("src/arquivos/Locacao.txt");
        listaLocacao = new ArrayList<Locacao>();
        retornarTodasLocacoes();
    }
    
    public static void  retornarTodasLocacoes() {
        
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
                
                Locacao locacao = new Locacao();                
                TipoLocacao tipoLocacao = new TipoLocacao();
                TipoVeiculo tipoVeiculo = new TipoVeiculo();
                Motorista motorista = new Motorista();
                Veiculos veiculo = new Veiculos();
                Clientes cliente = new Clientes();
                    
                while((linha = leitor.readLine()) != null) {
                    
                    if(contador == 0){
                        cliente.setCodigo(Integer.parseInt(linha));
                        locacao.setCliente(cliente);
                        contador++;
                    }
                    else if(contador == 1){
                        motorista.setCnh(linha);
                        locacao.setMotorista(motorista);
                        contador++;
                    }
                    else if(contador == 2){
                        veiculo.setPlaca(linha);
                        locacao.setVeiculo(veiculo);
                        contador++;
                    }
                    else if(contador == 3){
                        tipoVeiculo.setTipo(linha);
                        tipoLocacao.setTipoVeiculo(tipoVeiculo);
                        locacao.setTipoLocacao(tipoLocacao);
                        contador++;
                    }
                    else if(contador == 4){
                        locacao.setTipo(linha);
                        contador++;
                    }
                    else if(contador == 5){
                        locacao.setQuilometragemDeSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 6){
                        locacao.setQuilometragemDeEntrada(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 7){
                        locacao.setDataSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 8){
                        locacao.setDataDevolucao(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 9){
                        locacao.setPrevisao(Integer.parseInt(linha));
                        contador++;
                    }
                    else if(contador == 10){
                        locacao.setLocacaoAberta(Boolean.parseBoolean(linha));
                        contador++;
                    }
                    else if(contador == 11){
                        locacao.setValor(Double.parseDouble(linha));
                        listaLocacao.add(locacao);
                        
                        locacao = new Locacao();                
                        tipoLocacao = new TipoLocacao();
                        tipoVeiculo = new TipoVeiculo();
                        motorista = new Motorista();
                        veiculo = new Veiculos();
                        cliente = new Clientes();
                        
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
    
    public boolean salvar(Locacao locacao) throws IOException {
        if(arquivo.exists()){
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
                        
            listaLocacao.add(locacao);
            
            for(Locacao tipo: listaLocacao){
                dados.println(tipo.getCliente().getCodigo());
                dados.println(tipo.getMotorista().getCnh());
                dados.println(tipo.getVeiculo().getPlaca());
                dados.println(tipo.getTipoLocacao().getTipoVeiculo().getTipo());
                dados.println(tipo.getTipo());
                dados.println(tipo.getQuilometragemDeSaida());
                dados.println(tipo.getQuilometragemDeEntrada());
                dados.println(tipo.getDataSaida().getTime());
                dados.println(tipo.getDataDevolucao().getTime());
                dados.println(tipo.getPrevisao());
                dados.println(tipo.isLocacaoAberta());
                dados.println(tipo.getValor());
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
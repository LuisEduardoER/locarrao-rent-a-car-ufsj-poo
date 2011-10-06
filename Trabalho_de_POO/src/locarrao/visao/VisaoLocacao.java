/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersistenciaCliente;
import modelo.persistencia.PersistenciaLocacao;
import modelo.persistencia.PersistenciaMotorista;

/**
 *
 * @author Magelinha
 */
public class VisaoLocacao {
    public void cadastraLocacao(){
        try {
            Locacao locacao = new Locacao();
            TipoLocacao tipoLocacao = new TipoLocacao();
            List<Locacao> listaLocacao = new ArrayList<Locacao>();
            
           
            // digitar os dados
            Scanner entrada = new Scanner(System.in);
            
            //Tipo
            VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();        
            visaoTipoLocacao.pesquisaTipoVeiculo(tipoLocacao);
            
            /* ------------ Cliente ------------ */
            Clientes cliente = new Clientes();
            System.out.println("Codigo do cliente:");
            cliente.setCodigo(entrada.nextInt());
            
            List<Clientes> listaClientes = new ArrayList<Clientes>();
            PersistenciaCliente persistenciaCliente = new PersistenciaCliente();
            listaClientes = persistenciaCliente.retornaTodosClientes();
            try {
                boolean encontrou = persistenciaCliente.
                        pesquisaCliente(listaClientes, cliente);
                
                if(encontrou){
                    locacao.setCliente(cliente);
                }
                else{
                    System.out.println("Cliente nao encontrado.");
                    return;
                }
                
            } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo nao encontrado.");
            } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo.");
            }
            
             /* ------------------------ Fim Cliente ------------------------*/
            
            
            /* -----------------------   Motorista ------------------------ 
             * Se o motorista for o proprio cliente, então apenas sera inserida
             * a sua cnh no arquivo.
             * 
             * Caso contrario sera necessario digitar a cnh do motorista, caso ela não
             * exista, então sai do programa atraves do comando return.
             */
            Motorista motorista = new Motorista();
            do{
                System.out.println("Motorista");
                System.out.println();
                System.out.println("Voce é o motorista? (s/n)");
                
                if(entrada.nextLine().equals("s") || entrada.nextLine().equals("S")){
                    motorista.setCnh(entrada.nextLine());
                }
                else if (entrada.nextLine().equals("n") || entrada.nextLine().equals("N")){
                    motorista.setCnh(entrada.nextLine());
                    
                    List<Motorista> listaMotorista = new ArrayList<Motorista>();
                    PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
                    listaMotorista = persistenciaMotorista.retornaMotorista();
                    boolean encontrou;
                    
                    try {
                        encontrou = persistenciaMotorista.pesquisaMotorista(motorista);
                        if(encontrou){
                            locacao.setMotorista(motorista);
                        }
                        else{
                            System.out.println("Motorista nao encontrado");
                            return;
                        }
                        
                    } catch (FileNotFoundException ex) {
                            System.out.println("Arquivo nao encontrado.");
                    } catch (IOException ex) {
                            System.out.println("Erro na escrita ou leitura do arquivo.");
                    }
                    
                }
                else{
                    System.out.println("Opcao invalida");
                }
            
            }while(!entrada.nextLine().equals("s") || !entrada.nextLine().equals("n")
                    || !entrada.nextLine().equals("S") || !entrada.nextLine().equals("N"));
            
            locacao.setMotorista(motorista);
            
             /* -------------------------------Fim Motorista ------------------*/
            
            //Dados Tipo da Locacao
            VisaoTipoLocacao visao = new VisaoTipoLocacao();
            locacao.setTipo(visao.retornaTipoDeLocacao());
            
            //Dados da Previsao
            System.out.println("Digite a previsao de dias:");
            locacao.setPrevisao(entrada.nextInt());
            
            //Dados da quilometragem
            System.out.println("Digite a quilometragem de saida:");
            locacao.setQuilometragemDeSaida(entrada.nextLong());
            locacao.setQuilometragemDeEntrada(0); // Não é conhecida a quilometragem de chegada
            
            //Dados da data da locaçao
            locacao.setDataSaida(new GregorianCalendar().getTimeInMillis());
            locacao.setDataDevolucao(0); //Não é conhecida a data de devoluçao
            
            //valor da locacao
            locacao.setValor(0); // Valor será calculado depois da finalizaçao
            
            //Inicio a locacao com false. No fechamento será passado pra true
            locacao.setLocacaoAberta(false);
            
            //Dados do veiculo
            Veiculos veiculo = new Veiculos();
            veiculo.setPlaca(entrada.nextLine());
            VisaoVeiculos visaoVeiculo = new VisaoVeiculos();
            boolean encontrouVeiculo = visaoVeiculo.pesquisaVeiculo(veiculo);
            if(encontrouVeiculo){
                locacao.setVeiculo(veiculo);
            }
            else{
                System.out.println("Veiculo nao encontrado.");
                return;
            }
     
            PersistenciaLocacao persistenciaLocacao = new PersistenciaLocacao();
            persistenciaLocacao.salvar(listaLocacao, locacao);
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo.");
        }
    }
    
    public void alteraLocacao(){
        
    }
    
    public void pesquisaLocacao(){
        
    }
    
    public void excluiLocacao(){
        
    }
    
    public void locacoesEmAberto(){
        
    }
    
    public void locacoesFinalizadas(){
        
    }
    
    public void veiculosDisponiveis(){
        
    }
    
    public void veiculosMaisProcurados(){
        
    }
    
    public void veiculosMaisRentaveis(){
        
    }
    
    public void disponibilidadePorTipo(){
        
    }
}

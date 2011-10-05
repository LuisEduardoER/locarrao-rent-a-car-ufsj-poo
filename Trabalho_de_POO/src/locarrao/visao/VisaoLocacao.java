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
            
           
            /* digitar os dados */
            Scanner entrada = new Scanner(System.in);
            
            //Tipo
            VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();        
            visaoTipoLocacao.pesquisaTipoVeiculo(tipoLocacao);
            
            //Dados cliente
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
                    System.exit(0);
                }
                
            } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo nao encontrado.");
            } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo.");
            }
            
            //Dados Motorista
            Motorista motorista = new Motorista();
            System.out.println("Digite o codigo do motorista:");
            motorista.setCodigo(entrada.nextInt());
            List<Motorista> listaMotorista = new ArrayList<Motorista>();
            PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
            listaMotorista = persistenciaMotorista.retornaMotorista();
            boolean encontrou;
            try {
                encontrou = persistenciaMotorista.pesquisaMotorista(motorista);
                if(encontrou){
                    locacao.setMotorista(motorista);
                }
            } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo nao encontrado.");
            } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo.");
            }
            
            //Dados Tipo da Locacao
            tipoLocacao = new TipoLocacao();
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
            locacao.setValor(0); // Valor será calculado depois da finalizaçao
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

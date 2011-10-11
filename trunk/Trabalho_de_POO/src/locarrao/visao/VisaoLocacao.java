package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersistenciaCliente;
import modelo.persistencia.PersistenciaLocacao;
import modelo.persistencia.PersistenciaMotorista;
import modelo.persistencia.PersistenciaVeiculos;

public class VisaoLocacao {
    PersistenciaCliente persistenciaCliente = new PersistenciaCliente();
    Clientes cliente = new Clientes();
    VisaoClientes visaoClientes = new VisaoClientes();
    
    PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
    VisaoMotorista visaoMotorista = new VisaoMotorista();
    
    PersistenciaVeiculos persistenciaVeiculos = new PersistenciaVeiculos();
    Veiculos veiculo = new Veiculos();
    VisaoVeiculos visaoVeiculo = new VisaoVeiculos();
    
    PersistenciaLocacao persistenciaLocacao = new PersistenciaLocacao();
            
    
    public void cadastraLocacao(){
        try {
            Locacao locacao = new Locacao();
            TipoLocacao tipoLocacao = new TipoLocacao();
            
            // digitar os dados
            Scanner entrada = new Scanner(System.in);
            
            //Tipo
            VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();        
            visaoTipoLocacao.pesquisaTipoVeiculo(tipoLocacao);
            
            /* ------------ Cliente ------------ */
            /*
             * Caso o cliente não existir, será dada a opção de cadastrar
             * ou não. 
             * 
             * Caso a opção escolhida seja sim, então será chamado a visaoClientes
             * Caso não, encerra a locação
             */
            
            System.out.println("Codigo do cliente:");
            int codigo = entrada.nextInt();
            cliente.setCodigo(codigo);
            
            
            try {
                boolean encontrou = persistenciaCliente.pesquisarCliente(cliente);
                
                if(encontrou){
                    locacao.setCliente(cliente);
                }
                else{
                    do{
                    
                        System.out.println("Cliente nao encontrado. "
                                + "Deseja cadastrar esse cliente?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Nao");
                        
                        switch(entrada.nextInt()){
                            case 1:
                                visaoClientes.cadastrarClientes();
                                cliente.setCodigo(PersistenciaCliente.listaClientes.size());
                                locacao.setCliente(cliente);
                                break;
                                
                            case 2:
                                return;
                                
                                
                            default:
                                System.out.println("Opcao inválida");
                        }
                    } while(entrada.nextInt() != 1 && entrada.nextInt() != 2);
                    
                }
                
            } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo nao encontrado.");
            } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo.");
            }
            
             /* ------------------------ Fim Cliente ------------------------*/
            
            
            /* -----------------------   Motorista ------------------------ 
             * Se o motorista for o proprio cliente, então apenas sera inserida
             * a sua cnh no arquivo e ele será salvo como um novo motorista
             * 
             * Caso contrario sera necessario digitar a cnh do motorista, caso ela não
             * exista, será dada a opção de cadastrar. Se não for cadastrado, então
             * sairá do cadastro de locação
             */
            Motorista motorista = new Motorista();
            int opcao = 0;
            do{
                System.out.println("Motorista");
                System.out.println();
                System.out.println("Cliente é o motorista?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                
                opcao = entrada.nextInt();
                entrada.nextLine();
                switch(opcao){
                    case 1:
                        
                        System.out.println("Digite a cnh");
                        motorista.setCnh(entrada.nextLine());
                        motorista.setCodigo(PersistenciaMotorista.listaMotorista.size() + 1);
                        motorista.setCpf(cliente.getCpf());
                        motorista.setEndereco(cliente.getEndereco());
                        motorista.setNome(cliente.getNome());
                        motorista.setTefefone(cliente.getTefefone());
                        
                        boolean salvaMotorista = persistenciaMotorista.salvar(motorista);
                        if(salvaMotorista){
                            locacao.setMotorista(motorista);
                        }
                        else{
                            System.out.println("erro ao salvar novo motorista");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Digite a cnh");
                        motorista.setCnh(entrada.nextLine());

                        boolean encontrou;
                        try {
                            encontrou = persistenciaMotorista.pesquisarMotorista(motorista);
                            if(encontrou){
                                locacao.setMotorista(motorista);
                                break;
                            }
                            else{
                                do{
                                    System.out.println("Motorista nao encontrado."
                                        + " Deseja cadastrar?");
                                    System.out.println("1 - Sim");
                                    System.out.println("2 - Nao");
                                    
                                    switch(entrada.nextInt()){
                                        case 1:
                                            visaoMotorista.cadastrarMotorista();
                                            locacao.setMotorista(VisaoMotorista.motorista);
                                            break;
                                        
                                        case 2:
                                            return;
                                            
                                        default:
                                            System.out.println("Opcao inválida");
                                    }
                                
                                }while(entrada.nextInt() != 1 && entrada.nextInt() != 2);
                            }

                        } catch (FileNotFoundException ex) {
                                System.out.println("Arquivo nao encontrado.");
                        } catch (IOException ex) {
                                System.out.println("Erro na escrita ou leitura do arquivo.");
                        }
                        
                        break;
                    
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
                
            }while((opcao != 1) && (opcao != 2));
            
             /* ------------------ Fim Motorista ------------------ */
            
            /* ------------------ Veiculo ------------------ */
            System.out.println("Placa do veiculo");
            veiculo.setPlaca(entrada.nextLine());
            boolean buscaVeiculo = persistenciaVeiculos.pesquisarVeiculo(veiculo);
            if(buscaVeiculo){
                persistenciaVeiculos.retornarVeiculo(veiculo);
                locacao.setVeiculo(veiculo);
            }
            else{
                do{
                    System.out.println("Veiculo não encontrado. "
                        + "Deseja cadastra-lo?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Nao");
                    
                    switch(entrada.nextInt()){
                        case 1:
                            visaoVeiculo.cadastraVeiculos();
                            locacao.setVeiculo(VisaoVeiculos.veiculos);
                            break;
                       
                        case 2:
                            return;
                            
                        default:
                            System.out.println("Opcao invalida");
                            
                    }
                    
                }while(entrada.nextInt() != 1 && entrada.nextInt() != 2);
                
            }
            /* ------------------ Fim Veiculo ------------------ */
            
            //Dados Tipo da Locacao
            VisaoTipoLocacao visao = new VisaoTipoLocacao();
            locacao.setTipo(visao.retornaTipoDeLocacao());
            
            //Dados da Previsao
            System.out.println("Digite a previsao de dias:");
            locacao.setPrevisao(entrada.nextInt());
            
            //Dados da quilometragem
            System.out.println("Digite a quilometragem de saida:");
            locacao.setQuilometragemDeSaida(entrada.nextLong());
            entrada.nextLine();
            locacao.setQuilometragemDeEntrada(0); // Não é conhecida a quilometragem de chegada
            
            //Dados da data da locaçao
            locacao.setDataSaida(new GregorianCalendar().getTimeInMillis());
            locacao.setDataDevolucao(0); //Não é conhecida a data de devoluçao
            
            //valor da locacao
            locacao.setValor(0); // Valor será calculado depois da finalizaçao
            
            //Inicio a locacao com false. No fechamento será passado pra true
            locacao.setLocacaoAberta(false);
            
            
            /* Salvar a locacao */
            boolean operacao = persistenciaLocacao.salvar(locacao);
            
            if(operacao){
                System.out.println("salvo com sucesso");
            }
            else{
                System.out.println("erro ao salvar a locacao");
            }
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo.");
        }
    }
    
    public void alterarLocacao(){
        
    }
    
    public void pesquisarLocacao(){
        
    }
    
    public void excluirLocacao(){
        
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

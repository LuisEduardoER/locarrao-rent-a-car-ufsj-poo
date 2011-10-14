package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;
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
    Motorista motorista = new Motorista();
    
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
            
            /* ------------ Cliente ------------ */
            /*
             * Caso o cliente não existir, será dada a opção de cadastrar
             * ou não. 
             * 
             * Caso a opção escolhida seja sim, então será chamado a visaoClientes
             * Caso não, encerra a locação
             */
            
            System.out.println("Codigo do cliente:");
            cliente.setCodigo(Integer.parseInt(entrada.nextLine()));
            
            
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
                        
                        switch(Integer.parseInt(entrada.nextLine())){
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
                    } while(Integer.parseInt(entrada.nextLine()) != 1 && 
                            Integer.parseInt(entrada.nextLine()) != 2);
                    
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
            boolean encontrou;
            int opcao = 0;
            do{
                System.out.println("Motorista");
                System.out.println();
                System.out.println("Cliente é o motorista?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                
                opcao = Integer.parseInt(entrada.nextLine());
                switch(opcao){
                    case 1:
                        
                        System.out.println("Digite a cnh");
                        motorista.setCnh(entrada.nextLine());
                        encontrou = persistenciaMotorista.pesquisarMotorista(motorista);
                        
                        if (!encontrou){
                            persistenciaCliente.retornarCliente(cliente);
                            motorista.setCodigo(PersistenciaMotorista.listaMotorista.size() + 1);
                            motorista.setNome(cliente.getNome());
                            motorista.setCpf(cliente.getCpf());
                            motorista.setTefefone(cliente.getTefefone());
                            motorista.setEndereco(cliente.getEndereco());
                            
                            boolean salvaMotorista = persistenciaMotorista.salvar(motorista);
                            if(salvaMotorista){
                                locacao.setMotorista(motorista);
                            }
                            else{
                                System.out.println("erro ao salvar novo motorista");
                            }
                        }
                        else{
                            locacao.setMotorista(motorista);
                        }
                        
                        break;
                    
                    case 2:
                        System.out.println("Digite a cnh");
                        motorista.setCnh(entrada.nextLine());

                        
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
                                    
                                    switch(Integer.parseInt(entrada.nextLine())){
                                        case 1:
                                            visaoMotorista.cadastrarMotorista();
                                            locacao.setMotorista(VisaoMotorista.motorista);
                                            break;
                                        
                                        case 2:
                                            return;
                                            
                                        default:
                                            System.out.println("Opcao inválida");
                                    }
                                
                                }while(Integer.parseInt(entrada.nextLine()) != 1 
                                        && Integer.parseInt(entrada.nextLine()) != 2);
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
                tipoLocacao.setTipoVeiculo(veiculo.getTipoVeiculo());
                locacao.setVeiculo(veiculo);
                locacao.setTipoLocacao(tipoLocacao);
            }
            else{
                do{
                    System.out.println("Veiculo não encontrado. "
                        + "Deseja cadastra-lo?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Nao");
                    
                    switch(Integer.parseInt(entrada.nextLine())){
                        case 1:
                            visaoVeiculo.cadastraVeiculos();
                            locacao.setVeiculo(VisaoVeiculos.veiculos);
                            break;
                       
                        case 2:
                            return;
                            
                        default:
                            System.out.println("Opcao invalida");
                            
                    }
                    
                }while(Integer.parseInt(entrada.nextLine()) != 1 && 
                        Integer.parseInt(entrada.nextLine()) != 2);
                
            }
            /* ------------------ Fim Veiculo ------------------ */
            
            //Dados Tipo da Locacao
            VisaoTipoLocacao visao = new VisaoTipoLocacao();
            locacao.setTipo(visao.retornaTipoDeLocacao());
            
            //Dados da Previsao
            System.out.println("Digite a previsao de dias:");
            locacao.setPrevisao(Integer.parseInt(entrada.nextLine()));
            
            //Dados da quilometragem
            System.out.println("Digite a quilometragem de saida:");
            locacao.setQuilometragemDeSaida(Long.parseLong(entrada.nextLine()));
            
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
    
    public void fecharLocacao(){
        Scanner entrada = new Scanner(System.in);
        List<Locacao> listaLocacaoCliente = new ArrayList<Locacao>();
        cliente = new Clientes();
        motorista = new Motorista();
        
        
        System.out.println("Codigo do Cliente");
        cliente.setCodigo(Integer.parseInt(entrada.nextLine()));
        
        //busco todas as locações do cliente
        boolean achou = false;
        for(Locacao item: PersistenciaLocacao.listaLocacao){
            if((item.getCliente().getCodigo() == cliente.getCodigo()) &&
                    item.isLocacaoAberta()){
                
                achou = true;
                listaLocacaoCliente.add(item);
            }
        }
        
        if(!achou){
            System.out.println("Não existe locações com o cliente desejado");
        }
        else{
            
            System.out.println("Selecione a locacao que deseja fechar");
            for(int i=0; i< listaLocacaoCliente.size();i++){
                System.out.println(i+1 + ": ");
                listaLocacaoCliente.get(i).toString();
                System.out.println();
            }
            
            int resposta = 0;
            
            do{
                resposta = Integer.parseInt(entrada.nextLine());
                if(resposta < 1 || resposta > listaLocacaoCliente.size()){
                    System.out.println("Opcao Invalida");
                }
                else{
                    System.out.println("Quilometragem de chegada");
                    motorista.setCnh(listaLocacaoCliente.get(resposta-1).
                            getMotorista().getCnh());
                    
                    long kmDeChegada = Long.parseLong(entrada.nextLine());
                    persistenciaLocacao.fechaLocacao(cliente,motorista, kmDeChegada);
                }
            }while((resposta < 1) || resposta > listaLocacaoCliente.size());
            
            
        }
        
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

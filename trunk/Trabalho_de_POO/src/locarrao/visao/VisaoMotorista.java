/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;


import modelo.dominio.Motorista;
import modelo.dominio.Endereco;
import modelo.persistencia.PersistenciaMotorista;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Validacao;
import modelo.persistencia.PersistenciaCliente;


public class VisaoMotorista {
    PersistenciaMotorista persistenciaMotorista;
    PersistenciaCliente persistenciaCliente;
    Clientes cliente;
    
    public static Motorista motorista;
    
    VisaoEndereco visaoEndereco;
    
    public void cadastrarMotorista(){
        motorista = new Motorista();
        Endereco endereco = new Endereco();
        visaoEndereco = new VisaoEndereco();
        persistenciaMotorista = new PersistenciaMotorista();
        
        Validacao valida = new Validacao();
        Scanner cadastro = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Digite a CNH");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                          motorista.setCnh(" - ");
                    }else{
                        if(valida.validaCnh(dado)){
                            motorista.setCnh(dado);
                        }else{
                            System.out.println("Cnh invalida");
                            return;
                        }
                    }
        }while(dado.isEmpty());
        
        boolean existe = false;
        try{
            existe = persistenciaMotorista.pesquisarMotorista(motorista);
            if(!existe){
                
                do{
                    System.out.println("Digite o CPF");
                    dado = cadastro.nextLine();

                    if(dado.isEmpty()){
                        System.out.println("Digitação do CPF é obrigatoria");
                    }else{
                        if(!valida.validarCPF(dado)){
                            System.out.println("CPF Invalido");
                            cadastro.nextLine();
                            return;
                        }
                        else{
                            motorista.setCpf(dado);
                        }
                    }
                }while(dado.isEmpty());
                
                
                /*
                 * Ao digitar o CPF, será feito uma busca na lista de clientes
                 * Caso o CPF seja de um cliente cadastrado, os dados do cliente
                 * será passado para o motorista (nome,telefone e endereço.
                 * 
                 * Caso o contrario, será feita a digitação normalmente
                 */
                persistenciaCliente = new PersistenciaCliente();
                cliente = new Clientes();
                cliente.setCpf(dado);
                persistenciaCliente.retornarCliente(cliente);
                boolean pesquisaCliente = persistenciaCliente.retornarClienteComCpf(cliente);
                
                if(pesquisaCliente){
                    motorista.setNome(cliente.getNome());
                    motorista.setTefefone(cliente.getTefefone());
                    motorista.setEndereco(cliente.getEndereco());
                }else{
                    do{
                        System.out.println("Digite o nome");
                        dado = cadastro.nextLine();
                        if(dado.isEmpty()){
                            System.out.println("Digitaçao do nome é obrigatorio");
                        }else{
                            motorista.setNome(dado);
                        }
                        
                    }while(dado.isEmpty());
                    
                    System.out.println("Digite o telefone com DDD ex: 31xxxxxxxx");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                          motorista.setTefefone(" - ");
                    }else{
                        if(valida.validaTelefone(dado)){
                            motorista.setTefefone(dado);
                        }else{
                            System.out.println("Telefone invalido");
                            return;
                        }
                    }
                    endereco = visaoEndereco.cadastrarEndereco();

                    if(endereco == null){
                        System.out.println("CEP inválido");
                        return;
                    }else{
                        motorista.setEndereco(endereco);
                    }

                    motorista.setEndereco(endereco);
                    
                }
                
                //código será auto incremento
                motorista.setCodigo(PersistenciaMotorista.listaMotorista.size() + 1);
                
                boolean salvar = persistenciaMotorista.salvar(motorista);
                if (salvar){
                    System.out.println("Motorista salvo com sucesso!");
                    cadastro.nextLine();
                }else {
                    System.out.println("ERRO AO SALVAR!");
                    cadastro.nextLine();
                }
                
            }else {
                System.out.println("Motorista ja cadastrado");
                cadastro.nextLine();
            }
            
        }catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
    }
   
    public void alterarMotorista(){
        
    }
    
    public void pesquisarMotorista(){
        /*
        Motorista motorista = new Motorista();
        Endereco endereco = new Endereco();
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        Scanner pesquisa = new Scanner(System.in);
        PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
        listaMotorista = persistenciaMotorista.retornarMotorista();
        System.out.println("Digite a cnh do motorista a ser pesquisado");
        String cnh=pesquisa.nextLine();
        motorista.setCnh(cnh);
        try{
            motorista=persistenciaMotorista.pesquisaMotorista2(motorista);
            if(motorista!=null){
                System.out.println("Motorista encontrado:");
                exibirMotorista(motorista);
            }else{
                System.out.println("Motorista nao encontrado");
            }
            
        }catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
         * 
         */
    }
    public void exibirMotorista(Motorista motorista){
            System.out.println("Carteira: " + motorista.getCnh());
            System.out.println("Endereco:");
            System.out.println("-----------------------------------------------------");
            System.out.println("Rua "+motorista.getEndereco().getRua()+" numero "+motorista.getEndereco().getNumero() );
            System.out.println("Complemento: "+motorista.getEndereco().getComplemento());
            System.out.println("Bairro "+motorista.getEndereco().getBairro()+" Cidade: " +motorista.getEndereco().getCidade());
            System.out.println("UF: "+motorista.getEndereco().getUf());
            System.out.println("Cep: "+motorista.getEndereco().getCep());
            System.out.println("------------------------------------------------------");
    }
    public void excluirMotorista(){
        
    }
    
}

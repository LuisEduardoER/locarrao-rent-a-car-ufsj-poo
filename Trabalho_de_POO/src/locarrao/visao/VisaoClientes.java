/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;
import modelo.persistencia.PersisteCliente;
import modelo.dominio.Valida;
/**
 *
 * @author PATY
 */
public class VisaoClientes {
    PersisteCliente persistenciaCliente;
    public static Clientes clientes;
    VisaoEndereco visaoEndereco;
    
    public VisaoClientes() {
        clientes = new Clientes();
    }
        
    /*
     * A string dado será responsavel por fazer a validação de campos obrigatórios
     */
    public void cadastrarClientes(){
        persistenciaCliente = new PersisteCliente();
        clientes = new Clientes();
        Endereco endereco = new Endereco();
        visaoEndereco = new VisaoEndereco();
        
        
        //aparece na tela...
        Scanner cadastro = new Scanner(System.in);
        
        String dado = null;
        
        do{
            System.out.println("Digite o CPF");
            dado = cadastro.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("É obrigatoria a digitação do CPF");
            }
        }while(dado.isEmpty());
        
        Valida valida = new Valida();
        if(!valida.validaCPF(dado)){
            System.out.println("CPF invalido");
            return;
        }
        else{
            clientes.setCpf(dado);
            try{
                if(persistenciaCliente.pesquisarCliente(clientes)){
                    System.out.println("Cliente ja cadastrado");
                    cadastro.nextLine();
                    return;
                }
                else{
                    //Codigo será com auto incremento
                    clientes.setCodigo(PersisteCliente.listaClientes.size()+1);
        
                    do{
                        System.out.println("Digite o nome"); 
                        dado = cadastro.nextLine();
                        if(dado.isEmpty()){
                            System.out.println("Nome é um campo obrigatorio");
                        }
                        else{
                            clientes.setNome(dado);
                        }
                    }while(dado.isEmpty());
                    
                    System.out.println("Digite o telefone com DDD ex: 31xxxxxxxx");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                          clientes.setTefefone(" - ");
                    }else{
                        if(valida.validaTelefone(dado)){
                            clientes.setTefefone(dado);
                        }else{
                            System.out.println("Telefone invalido");
                            cadastro.nextLine();
                            return;
                        }
                    }
                    
                    /*
                     * Para melhorar a visualização do código, foi criada a classe
                     * VisaoEndereco, que é responsável por cadastrar o endereço.
                     * Caso o CEP foi invalido, o método cadastrarEndereco retorna
                     * null e com isso é encerrado o cadastro.
                     */
                    endereco = visaoEndereco.cadastrarEndereco();
                    if(endereco == null){
                        System.out.println("CEP Invalido");
                        cadastro.nextLine();
                        return;
                    }else{
                        clientes.setEndereco(endereco);
                    }
                    clientes.setCodigo(PersisteCliente.listaClientes.size() + 1);
                    boolean operacao = persistenciaCliente.salvar(clientes);
                    if (operacao) {
                      System.out.println("Salvo com sucesso");
                    }
                    else {
                       System.out.println("Erro!");
                    }
                }
                
            }catch(IOException ex){
                System.out.println("Erro na escrita ou leitura do arquivo");
            }
            
        }
        
        
    }
    
    public void alterarCliente(){
        
    }
    
    public void pesquisarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
    public void buscaPorNome(){
        Scanner entrada = new Scanner(System.in);
        persistenciaCliente = new PersisteCliente();
        String dado = "";
        do{
            System.out.println("Digite o nome");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("A digitação do nome é obrigatoria");
            }else{
                persistenciaCliente.mostrarClientesComNome(dado);
                entrada.nextLine();
            }
        }while(dado.isEmpty());
        
        
        
    }
    
    public void imprimeCliente(Clientes cliente){
        System.out.println("Codigo: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTefefone());
        
        System.out.println("---------------- Endereco ----------------");
        System.out.println("Rua: " + cliente.getEndereco().getRua());
        System.out.println("Numero: " + cliente.getEndereco().getNumero());
        System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
        System.out.println("Bairro: " + cliente.getEndereco().getBairro());
        System.out.println("Cidade: " + cliente.getEndereco().getCidade());
        System.out.println("CEP: " + cliente.getEndereco().getCep());
        System.out.println("UF: " + cliente.getEndereco().getUf());
    }
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Endereco;
import modelo.persistencia.PersistenciaCliente;

/**
 *
 * @author PATY
 */
public class VisaoClientes {
    PersistenciaCliente persistenciaCliente = new PersistenciaCliente();
    
    public void cadastrarClientes(){
        Clientes clientes = new Clientes();
        Endereco endereco = new Endereco();
        
        //aparece na tela...
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Digite o codigo");
        clientes.setCodigo(cadastro.nextInt());
        cadastro.nextLine();
        
        boolean existe = false;
        try {
            existe = persistenciaCliente.pesquisarCliente(clientes);
            if (!existe){
                    System.out.println("Digite o nome");
                    clientes.setNome(cadastro.nextLine());
                    
                    System.out.println("Digite o cpf");
                    clientes.setCpf(cadastro.nextLine());
                    
                    System.out.println("Digite o telefone");
                    clientes.setTefefone(cadastro.nextLine());
                    
                    System.out.println("Digite o rua");
                    endereco.setRua(cadastro.nextLine());
                    
                    System.out.println("Digite o numero");
                    endereco.setNumero(cadastro.nextInt());
                    cadastro.nextLine();
                    
                    System.out.println("Digite o complemento");
                    endereco.setComplemento(cadastro.nextLine());
                    
                    System.out.println("Digite o bairro");
                    endereco.setBairro(cadastro.nextLine());
                    
                    System.out.println("Digite a Cidade");
                    endereco.setCidade(cadastro.nextLine());
                    
                    System.out.println("Digite uf");
                    endereco.setUf(cadastro.nextLine());
                    
                    System.out.println("Digite cep");
                    endereco.setCep(cadastro.nextLine());
                    clientes.setEndereco(endereco);
                    
                    boolean operacao = persistenciaCliente.salvar(clientes);
                    if (operacao) {
                        System.out.println("Salvo com sucesso");
                    }
                    else {
                        System.out.println("Erro!");
                    }
            }else{
                System.out.println("Cliente ja esta cadastrado no sistema");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
    }
    
    public void alterarCliente(){
        
    }
    
    public void pesquisarCliente(){
        
    }
    
    public void excluirCliente(){
        
    }
    
    public void buscaPorNome(){
        
    }
}


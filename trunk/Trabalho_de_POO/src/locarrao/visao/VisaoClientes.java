/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
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
    public static Clientes clientes = new Clientes();
        
    public void cadastrarClientes(){
        Endereco endereco = new Endereco();
        
        //aparece na tela...
        Scanner cadastro = new Scanner(System.in);
        
        //Codigo será com auto incremento
        clientes.setCodigo(PersistenciaCliente.listaClientes.size()+1);
        
        try {
            
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


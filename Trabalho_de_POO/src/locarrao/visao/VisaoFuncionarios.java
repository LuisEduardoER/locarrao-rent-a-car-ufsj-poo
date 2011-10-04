/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import modelo.persistencia.PersistenciaFuncionarios;

/**
 *
 * @author PATY
 */
public class VisaoFuncionarios {
    public void cadastraFuncionarios(){
        Funcionarios funcionarios = new Funcionarios();
        Endereco endereco = new Endereco();
       
        Scanner cadastro = new Scanner(System.in);
        PersistenciaFuncionarios persistenciaFuncionarios = new PersistenciaFuncionarios();
        System.out.println("Digite o codigo");
        funcionarios.setCodigo(cadastro.nextInt());
        boolean existe = false;
        try {
            existe = persistenciaFuncionarios.pesquisaFuncionarios(funcionarios);
            if (existe){
                    System.out.println("Digite o nome");
                    funcionarios.setNome(cadastro.nextLine());
                    System.out.println("Digite o cpf");
                    funcionarios.setCpf(cadastro.nextLine());
                    System.out.println("Digite o telefone");
                    funcionarios.setTefefone(cadastro.nextLine());
                    System.out.println("Digite o cargo");
                    funcionarios.setTefefone(cadastro.nextLine());
                    System.out.println("Digite o usuario");
                    funcionarios.setTefefone(cadastro.nextLine());
                    System.out.println("Digite a senha");
                    funcionarios.setTefefone(cadastro.nextLine());
                    System.out.println("Digite o rua");
                    endereco.setRua(cadastro.nextLine());
                    System.out.println("Digite o numero");
                    endereco.setNumero(cadastro.nextInt());
                    System.out.println("Digite o complemento");
                    endereco.setComplemento(cadastro.nextLine());
                    System.out.println("Digite o bairro");
                    endereco.setBairro(cadastro.nextLine());
                    System.out.println("Digite a Cidade");
                    endereco.setCidade(cadastro.nextLine());
                    System.out.println("Digite uf");
                    endereco.setUf(cadastro.next());
                    System.out.println("Digite cep");
                    endereco.setCep(cadastro.nextLine());
                    funcionarios.setEndereco(endereco);
                    
                    boolean operacao = persistenciaFuncionarios.salvar(funcionarios);
                    if (operacao) {
                        System.out.println("Salvo com sucesso");
                    }
                    else {
                        System.out.println("Erro!");
                    }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
    }
}


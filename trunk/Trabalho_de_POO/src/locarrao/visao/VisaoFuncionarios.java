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
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import modelo.persistencia.PersistenciaFuncionarios;
import modelo.dominio.Validacao;
/**
 *
 * @author PATY
 */
public class VisaoFuncionarios {
    public void cadastraFuncionarios() throws FileNotFoundException, IOException{
        Funcionarios funcionarios = new Funcionarios();
        Endereco endereco = new Endereco();
        List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();
        Validacao valida = new Validacao();
        Scanner cadastro = new Scanner(System.in);
        PersistenciaFuncionarios persistenciaFuncionarios = new PersistenciaFuncionarios();
        listaFuncionarios = persistenciaFuncionarios.retornaTodosFuncionarios();
        
        System.out.println("Digite o codigo");
        funcionarios.setCodigo(cadastro.nextInt());
        boolean existe = false;
        try {
            existe = persistenciaFuncionarios.pesquisaFuncionarios(listaFuncionarios, funcionarios);
            
            if (existe){
                    System.out.println("Digite o nome");
                    funcionarios.setNome(cadastro.nextLine());
                    System.out.println("Digite o cpf");
                    String retorno = cadastro.nextLine();
                    if(valida.validarCPF(retorno)){
                         System.out.println("CPF VALIDO");
                        funcionarios.setCpf(retorno);
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
                        retorno = cadastro.nextLine();
                        if(valida.validarCEP(retorno)){
                            System.out.println("CEP valido");
                            endereco.setCep(retorno);
                            funcionarios.setEndereco(endereco);
                    
                            boolean operacao = persistenciaFuncionarios.salvar(listaFuncionarios, funcionarios);
                            if (operacao) {
                                 System.out.println("Salvo com sucesso");
                            }
                            else {
                                System.out.println("Erro!");
                            }
                        }else{
                             System.out.println("Erro:CEP invalido");
                             System.out.println("Tente novamente");
                        }
                    }else{
                        System.out.println("CPF INVÁLIDO!");
                        System.out.println("Tente novamente");
                    }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
    }
}


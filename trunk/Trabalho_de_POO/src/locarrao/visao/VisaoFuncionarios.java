/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;


import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.Endereco;
import modelo.dominio.Funcionarios;
import modelo.persiste.PersisteFuncionarios;
import modelo.dominio.Valida;
/**
 *
 * @author PATY
 */
public class VisaoFuncionarios {
    PersisteFuncionarios persistenciaFuncionarios;
    public static Funcionarios funcionarios;
    VisaoEndereco visaoEndereco;
    public VisaoFuncionarios(){
        funcionarios = new Funcionarios();
    }
    public void cadastraFuncionarios() {
        persistenciaFuncionarios = new PersisteFuncionarios();
        funcionarios=new Funcionarios();
        Endereco endereco = new Endereco();
        visaoEndereco = new VisaoEndereco();
        
        //aparece na tela
        Scanner cadastro =new Scanner(System.in);
        String dado =null;
        do{
            System.out.println("Digite o cpf");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                System.out.println("É obrigatoria a digitação do CPF");
            }
        }while(dado.isEmpty());
        
        Valida valida = new Valida();
        if(!valida.validaCPF(dado)){
            System.out.println("CPF invalido");
            return;
        }else{
            funcionarios.setCpf(dado);
            try{
                if(persistenciaFuncionarios.pesquisaFuncionarios(funcionarios)){
                    System.out.println("Funcionario ja cadastrado");
                    cadastro.nextLine();
                    return;
                }else{
                    //codigo com auto incremento
                    funcionarios.setCodigo(PersisteFuncionarios.listaFuncionarios.size()+1);
                    do{
                        System.out.println("Digite o nome"); 
                        dado = cadastro.nextLine();
                        if(dado.isEmpty()){
                            System.out.println("Nome é um campo obrigatório");
                        }else{
                            funcionarios.setNome(dado);
                        }
                    }while(dado.isEmpty());
                    
                    System.out.println("Digite o telefone com DDD ex: 31xxxxxxxx");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                          funcionarios.setTefefone(" - ");
                    }else{
                        if(valida.validaTelefone(dado)){
                            funcionarios.setTefefone(dado);
                        }else{
                            System.out.println("Telefone invalido");
                            return;
                        }
                    }
                    do{
                        System.out.println("Digite o cargo");
                        dado= cadastro.nextLine();
                        if(dado.isEmpty()){
                            System.out.println("Cargo é obrigatório");
                        }else{
                            funcionarios.setCargo(dado);
                        }
                        
                    }while(dado.isEmpty());
                    System.out.println("Digite o usuário");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                        funcionarios.setTefefone(" - ");
                    }else{
                        funcionarios.setTefefone(dado);
                    }
                    System.out.println("Digite a senha");
                    dado = cadastro.nextLine();
                    if(dado.isEmpty()){
                        funcionarios.setTefefone(" - ");
                    }else{
                        funcionarios.setTefefone(dado);
                    }
                    //cadsatro de endereco do funcionario
                    endereco = visaoEndereco.cadastrarEndereco();
                    if(endereco == null){
                        System.out.println("CEP Invalido");
                        cadastro.nextLine();
                        return;
                    }else{
                        funcionarios.setEndereco(endereco);
                    }
                    funcionarios.setCodigo(PersisteFuncionarios.listaFuncionarios.size()+1);
                    boolean operacao = persistenciaFuncionarios.salvar(funcionarios);
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
     public void imprimeFuncionarios(Funcionarios funcionario){
        System.out.println("Codigo: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Telefone: " + funcionario.getTefefone());
        System.out.println("Cargo: " + funcionario.getCargo());
        
        System.out.println("---------------- Endereco ----------------");
        System.out.println("Rua: " + funcionario.getEndereco().getRua());
        System.out.println("Numero: " + funcionario.getEndereco().getNumero());
        System.out.println("Complemento: " + funcionario.getEndereco().getComplemento());
        System.out.println("Bairro: " + funcionario.getEndereco().getBairro());
        System.out.println("Cidade: " + funcionario.getEndereco().getCidade());
        System.out.println("CEP: " + funcionario.getEndereco().getCep());
        System.out.println("UF: " + funcionario.getEndereco().getUf());
     }   
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import modelo.dominio.Clientes;
import modelo.dominio.Motorista;
import modelo.dominio.Endereco;
import modelo.persistencia.PersistenciaMotorista;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VisaoMotorista {
    public void cadastraMotorista(){
        Motorista motorista = new Motorista();
        Endereco endereco = new Endereco();
        List<Motorista> listaMotorista = new ArrayList<Motorista>();
        
        Scanner cadastro = new Scanner(System.in);
        
        PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
        listaMotorista = persistenciaMotorista.retornaMotorista();
        System.out.println("Digite a carteira nacional de habilitação");
        String cnh= cadastro.nextLine();
        motorista.setCnh(cnh);
        boolean existe = false;
        try{
            existe = persistenciaMotorista.pesquisaMotorista(motorista);
            if(!existe){
                    System.out.println("Digite o nome");
                    motorista.setNome(cadastro.nextLine());
                    
                    System.out.println("Digite o cpf");
                    motorista.setCpf(cadastro.nextLine());
                    
                    System.out.println("Digite o telefone");
                    motorista.setTefefone(cadastro.nextLine());
                    
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
                    motorista.setEndereco(endereco);
                    boolean salvar = persistenciaMotorista.salvar(motorista);
                    if (salvar){
                        System.out.println("Motorista salvo com sucesso!");
                    }else {
                        System.out.println("ERRO!");
                    }
            }else {
                System.out.println("Motorista ja cadastrado");
            }
            
        }catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
    }
   
    public void alteraMotorista(){
        
    }
    
    public void pesquisaMotorista(){
        
    }
    
    public void excluiMotorista(){
        
    }
    
}

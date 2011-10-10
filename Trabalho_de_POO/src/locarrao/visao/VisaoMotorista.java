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


public class VisaoMotorista {
    PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
    
    public void cadastrarMotorista(){
        Motorista motorista = new Motorista();
        Endereco endereco = new Endereco();
        
        Scanner cadastro = new Scanner(System.in);
        
        System.out.println("Digite a carteira nacional de habilitação");
        String cnh = cadastro.nextLine();
        motorista.setCnh(cnh);
        boolean existe = false;
        try{
            existe = persistenciaMotorista.pesquisarMotorista(motorista);
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

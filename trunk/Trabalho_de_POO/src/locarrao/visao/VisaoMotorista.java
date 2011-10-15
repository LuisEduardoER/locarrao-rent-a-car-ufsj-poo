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
import modelo.dominio.Validacao;


public class VisaoMotorista {
    PersistenciaMotorista persistenciaMotorista = new PersistenciaMotorista();
    public static Motorista motorista;
    
    VisaoEndereco visaoEndereco;
    
    public VisaoMotorista() {
        motorista = new Motorista();
    }
    
    public void cadastrarMotorista(){
        motorista = new Motorista();
        Endereco endereco = new Endereco();
        visaoEndereco = new VisaoEndereco();
        
        Validacao valida = new Validacao();
        Scanner cadastro = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Digite o numero da CNH");
            dado = cadastro.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da CNH é obrigatorio");
            }else{
                motorista.setCnh(cadastro.nextLine());
            }
        }while(dado.isEmpty());
        
        boolean existe = false;
        try{
            existe = persistenciaMotorista.pesquisarMotorista(motorista);
            if(!existe){
                
                //código será auto incremento
                motorista.setCodigo(PersistenciaMotorista.listaMotorista.size() + 1);
                
                System.out.println("Digite o CPF");
                dado = cadastro.nextLine();
                
                if(dado.isEmpty()){
                    motorista.setCpf(" - ");
                }else{
                    if(!valida.validarCPF(dado)){
                        System.out.println("CPF Invalido");
                        return;
                    }
                    else{
                        motorista.setCpf(dado);
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

                boolean salvar = persistenciaMotorista.salvar(motorista);
                if (salvar){
                    System.out.println("Motorista salvo com sucesso!");
                }else {
                    System.out.println("ERRO AO SALVAR!");
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

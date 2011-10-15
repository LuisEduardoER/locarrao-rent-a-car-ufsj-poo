package locarrao.visao;

import java.util.Scanner;
import modelo.dominio.Endereco;
import modelo.dominio.Validacao;

public class VisaoEndereco {
    Endereco endereco;
    
    public VisaoEndereco(){
        endereco = new Endereco();
    }
    
    public Endereco cadastrarEndereco(){
        Scanner cadastro = new Scanner(System.in);
        String dado = null;
        
        Validacao valida = new Validacao();
        /*
         * Caso o usuario não digitar a rua, todos os outros campos
         * referentes ao endereço ficarão vazios
         */
        System.out.println("Digite o rua");
        dado = cadastro.nextLine();
        if(dado.isEmpty()){
            endereco.setRua(" - ");
            endereco.setNumero(0);
            endereco.setComplemento(" - ");
            endereco.setBairro(" - ");
            endereco.setCidade(" - ");
            endereco.setCep(" - ");
            endereco.setUf(" - ");
        }else{
            endereco.setRua(dado);
            System.out.println("Digite o numero");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setNumero(0);
            }else{
                endereco.setNumero(Integer.parseInt(dado));
            }

            System.out.println("Digite o complemento");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setComplemento(" - ");
            }else{
                endereco.setComplemento(dado);
            }

            System.out.println("Digite o bairro");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setBairro(" - ");
            }else{
                endereco.setBairro(dado);
            }

            System.out.println("Digite a Cidade");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setCidade(" - ");
            }else{
                endereco.setCidade(dado);
            }

            System.out.println("UF");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setUf(" - ");
            }else{
                endereco.setUf(dado);
            }

            System.out.println("Digite cep");
            dado = cadastro.nextLine();
            if(dado.isEmpty()){
                endereco.setCep(" - ");
            }else{
                if(!valida.validarCEP(dado)){
                    System.out.println("CEP invalido");
                    return null;
                }
                else{
                    endereco.setCep(dado);
                }
            }

        }
        return endereco;
    }
}

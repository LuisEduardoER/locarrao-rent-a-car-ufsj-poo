
package locarrao.visao;

import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args){
        menu();
    }
    static void menu(){
        Scanner entrada = new Scanner (System.in);
        int opcao=1;
        do{  
                    System.out.println("1 - Cadastro de veiculos..\n" +  
                    "2 - Cadastro de clientes.\n" +  
                    "3 - Cadastro de motoristas.\n" +  
                    "4 - Cadastro de funcionarios.\n" +  
                    "5 - Cadastro de locacoes.\n" +  
                    "6 - Cadastro do tipo de locacao.\n" +  
                    "7 - Sair.");  
                    opcao = entrada.nextInt();
            switch(opcao){
                case 1:  
                    VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
                    visaoTipoVeiculo.cadastraTipoVeiculo();
                    break;  
                case 2:  
                      
                    break;  
                case 3:  
                      
                    break;  
                case 4:  
                    
                    break;  
                case 5:  
                    
                    break;  
                case 6:  
                    VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();
                    visaoTipoLocacao.cadastraTipoLocacao();
                    break;  
                case 7:  
                    
                    System.out.println("Fim da execucao!");
                    System.exit(1);
                    break;  
                default:  
                    System.out.println("A opcao digitada e invalida");
                    System.out.println("Escolha uma opcao valida para continuar."); 
            }
        }while (opcao !=7);
    }
}

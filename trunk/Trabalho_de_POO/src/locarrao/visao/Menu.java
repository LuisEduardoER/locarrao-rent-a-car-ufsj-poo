
package locarrao.visao;


public class Menu {
    
    public static void main(String[] args){
        menu();
    }
    static void menu(){
        int opcao;
        do{
            opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("" +  
                    "1 - Cadastro de veiculos..\n" +  
                    "2 - Cadastro de clientes.\n" +  
                    "3 - Cadastro de motoristas.\n" +  
                    "4 - Cadastro de funcionarios.\n" +  
                    "5 - Cadastro de locacoes.\n" +  
                    "6 - Cadastro do tipo de locacao.\n" +  
                    "7 - Sair."));  
            switch(opcao){
                case 1:  
                     
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
                    
                    break;  
                case 7:  
                    
                    System.out.println("Fim da execucao!");  
                    break;  
                default:  
                    System.out.println("A opcao digitada e invalida");
                    System.out.println("Escolha uma opcao valida para continuar."); 
            }
        }while (opcao !=7);
    }
}

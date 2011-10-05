
package locarrao.visao;

import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args){
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner (System.in);
        int menu = 0;
        int opcao = 0;
        do{
            System.out.println("Locarrão Rent a Car ");
            System.out.println();
            
            System.out.println("1 - Cadastro");
            System.out.println("2 - Relatorios");
            System.out.println("3 - Locaçao");
            System.out.println("4 - Sair");
            
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: 
                    do{
                        switch(menuCadastro()){
                            case 1:
                                VisaoClientes visaoClientes = new VisaoClientes();
                                do{
                                    switch(menuCadastroCliente()){
                                        case 1:
                                            visaoClientes.cadastraClientes();
                                            break;
                                            
                                        case 2:
                                            visaoClientes.alteraCliente();
                                            break;
                                        
                                        case 3:
                                            visaoClientes.pesquisaCliente();
                                            break;
                                        
                                        case 4:
                                            visaoClientes.excluiCliente();
                                            break;
                                        
                                        default:
                                            System.out.println("Opcao Invalida!");
                                    }
                                }while(menuCadastroCliente() != 5);
                                break;
                                
                            case 2:
                                VisaoVeiculos visaoVeiculos = new VisaoVeiculos();
                                do{
                                    
                                    switch(menuCadastroVeiculo()){
                                        case 1:
                                            visaoVeiculos.cadastraVeiculos();
                                            break;
                                            
                                        case 2:
                                            visaoVeiculos.alteraVeiculos();
                                            break;
                                        
                                        case 3:
                                            visaoVeiculos.pesquisaVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoVeiculos.excluiVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                    }
                                }while(menuCadastroVeiculo() != 5);
                                break;
                                
                            case 3:
                                VisaoMotorista visaoMotorista = new VisaoMotorista();
                                do{
                                    
                                    switch(menuCadastroVeiculo()){
                                        case 1:
                                            visaoMotorista.cadastraMotorista();
                                            break;
                                            
                                        case 2:
                                            visaoMotorista.alteraMotorista();
                                            break;
                                        
                                        case 3:
                                            visaoMotorista.pesquisaMotorista();
                                            break;
                                        
                                        case 4:
                                            visaoMotorista.excluiMotorista();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                    }
                                }while(menuCadastroMotorista() != 5);
                                break;
                                
                            case 4:
                                VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
                                do{
                                    
                                    switch(menuCadastroTipoVeiculo()){
                                        case 1:
                                            visaoTipoVeiculo.cadastraTipoVeiculo();
                                            break;
                                            
                                        case 2:
                                            visaoTipoVeiculo.alteraTipoVeiculo();
                                            break;
                                        
                                        case 3:
                                            visaoTipoVeiculo.pesquisaTipoVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoTipoVeiculo.excluiTipoVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                    }
                                }while(menuCadastroMotorista() != 5);
                                break;
                                
                            case 5:
                                VisaoMarcaVeiculo visaoMarcaVeiculo = new VisaoMarcaVeiculo();
                                do{
                                    switch(menuCadastroMarcaVeiculo()){
                                        case 1:
                                            visaoMarcaVeiculo.cadastraMarcaVeiculo();
                                            break;
                                            
                                        case 2:
                                            visaoMarcaVeiculo.alteraMarcaVeiculo();
                                            break;
                                        
                                        case 3:
                                            visaoMarcaVeiculo.pesquisaMarcaVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoMarcaVeiculo.excluiMarcaVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                    }
                                }while(menuCadastroMarcaVeiculo() != 5);
                                break;
                                
                            case 6:
                                VisaoModeloVeiculo visaoModeloVeiculo = new VisaoModeloVeiculo();
                                do{
                                    switch(menuCadastroMarcaVeiculo()){
                                        case 1:
                                            visaoModeloVeiculo.cadastraModeloVeiculo();
                                            break;
                                            
                                        case 2:
                                            visaoModeloVeiculo.alteraModeloVeiculo();
                                            break;
                                        
                                        case 3:
                                            visaoModeloVeiculo.pesquisaModeloVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoModeloVeiculo.excluiModeloVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                    }
                                }while(menuCadastroModeloVeiculo() != 5);
                                break;
                             
                            default:
                                System.out.println("Opçao Inválida");
                        }
                    }while(menuCadastro()!= 7);
                    break;
                    
                case 2:
                    
            }
            
            /*switch(opcao){
                case 1:  
                    VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
                    visaoTipoVeiculo.cadastraTipoVeiculo();
                    break;  
                case 2:  
                    VisaoClientes visaoClientes = new VisaoClientes();
                    visaoClientes.cadastraClientes();
                    break;  
                case 3:  
                      
                    break;  
                case 4:  
                    VisaoFuncionarios visaoFuncionarios = new VisaoFuncionarios();
                    visaoFuncionarios.cadastraFuncionarios();
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
             * 
             */
        }while (opcao !=7);
             
    }
    /* --------------------- métodos para o menu de cadastro --------------------- */
    public static int menuCadastro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------- Cadastro -----------------");
        System.out.println();
        
        System.out.println("1 - Clientes");
        System.out.println("2 - Veiculo");
        System.out.println("3 - Motorista");
        System.out.println("4 - Tipo de Veiculo");
        System.out.println("5 - Marca de Veiculo");
        System.out.println("6 - Modelo de Veiculo");
        System.out.println("7 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroCliente(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Clientes -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Clientes -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroMotorista(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Motoristas -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroTipoVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Tipos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroMarcaVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Tipos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public static int menuCadastroModeloVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Tipos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    /* --------------------- fim dos métodos para o menu de cadastro --------------------- */
    
    
    /* --------------------- métodos para o menu de Relatorios --------------------- */
    
    public static int menuRelatorios(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Relatorios -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    /* --------------------- fim métodos para o menu de cadastro --------------------- */
}

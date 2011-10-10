
package locarrao.visao;

import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args){
        Menu entrada = new Menu();
        entrada.menu();
        System.exit(0);
    }
    
    public void menu(){
        Scanner entrada = new Scanner (System.in);
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
                                            break;
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
                                            visaoVeiculos.alterarVeiculos();
                                            break;
                                        
                                        case 3:
                                            visaoVeiculos.pesquisarVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoVeiculos.excluirVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                            break;
                                    }
                                }while(menuCadastroVeiculo() != 5);
                                break;
                                
                            case 3:
                                VisaoMotorista visaoMotorista = new VisaoMotorista();
                                do{
                                    
                                    switch(menuCadastroMotorista()){
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
                                            break;
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
                                            break;
                                    }
                                }while(menuCadastroTipoVeiculo() != 5);
                                break;
                                
                            case 5:
                                VisaoMarcaVeiculo visaoMarcaVeiculo = new VisaoMarcaVeiculo();
                                do{
                                    switch(menuCadastroMarcaVeiculo()){
                                        case 1:
                                            visaoMarcaVeiculo.cadastrarMarcaVeiculo();
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
                                            break;
                                    }
                                }while(menuCadastroMarcaVeiculo() != 5);
                                break;
                                
                            case 6:
                                VisaoModeloVeiculo visaoModeloVeiculo = new VisaoModeloVeiculo();
                                do{
                                    switch(menuCadastroModeloVeiculo()){
                                        case 1:
                                            visaoModeloVeiculo.cadastrarModeloVeiculo();
                                            break;
                                            
                                        case 2:
                                            visaoModeloVeiculo.alterarModeloVeiculo();
                                            break;
                                        
                                        case 3:
                                            visaoModeloVeiculo.pesquisarModeloVeiculo();
                                            break;
                                        
                                        case 4:
                                            visaoModeloVeiculo.excluirModeloVeiculo();
                                            break;
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                            break;
                                    }
                                }while(menuCadastroModeloVeiculo() != 5);
                                break;
                                
                            case 7:
                                VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();
                                do{
                                    switch(menuCadastroTipoLocacao()){
                                        case 1:
                                            visaoTipoLocacao.cadastraTipoLocacao();
                                            break;
                                            
                                        case 2:
                                            visaoTipoLocacao.alteraTipoLocacao();
                                            break;
                                        
                                        
                                        default:
                                            System.out.println("Opçao inválida");
                                            break;
                                    }
                                }while(menuCadastroTipoLocacao() != 3);
                                break;    
                             
                            default:
                                System.out.println("Opçao Inválida");
                                break;
                        }
                    }while(menuCadastro()!= 7);
                    break;
                    
                case 2:
                    VisaoLocacao visaoLocacao = new VisaoLocacao();
                    do{
                        switch(menuRelatorios()){
                            case 1:
                                visaoLocacao.locacoesEmAberto();
                                break;
                            
                            case 2:
                                visaoLocacao.locacoesFinalizadas();
                                break;
                                
                            case 3:
                                visaoLocacao.veiculosDisponiveis();
                                break;
                                
                            case 4:
                                visaoLocacao.veiculosMaisProcurados();
                                break;
                               
                            case 5:
                                visaoLocacao.veiculosMaisRentaveis();
                                break;
                                
                            case 6:
                                VisaoClientes visaoClientes = new VisaoClientes();
                                visaoClientes.buscaPorNome();
                                break;
                             
                            case 7:
                                visaoLocacao.disponibilidadePorTipo();
                                break;
                               
                            default:
                                System.out.println("Opçao Invalida");
                                break;
                        }
                    }while(menuRelatorios()!= 8);
                    break;
                    
                case 3:
                    visaoLocacao = new VisaoLocacao();
                    do{
                        switch(menuLocacao()){
                            case 1:
                                visaoLocacao.cadastraLocacao();
                                break;
                                
                            case 2:
                                visaoLocacao.alteraLocacao();
                                break;
                                
                            case 3:
                                visaoLocacao.pesquisaLocacao();
                                break;
                                
                            case 4:
                                visaoLocacao.excluiLocacao();
                                break;
                                
                            default:
                                System.out.println("Opçao inválida");
                                break;
                        }
                    }while(menuLocacao() != 5);
                    break;
                    
                default:
                    System.out.println("Opçao invalida");
                    break;
            }
            
        }while (opcao !=4);
             
    }
    /* --------------------- métodos para o menu de cadastro --------------------- */
    public int menuCadastro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------- Cadastro -----------------");
        System.out.println();
        
        System.out.println("1 - Clientes");
        System.out.println("2 - Veiculo");
        System.out.println("3 - Motorista");
        System.out.println("4 - Tipo de Veiculo");
        System.out.println("5 - Marca de Veiculo");
        System.out.println("6 - Modelo de Veiculo");
        System.out.println("7 - Tipo de Locaçao");
        System.out.println("8 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public int menuCadastroCliente(){
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
    
    public int menuCadastroVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public int menuCadastroMotorista(){
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
    
    public int menuCadastroTipoVeiculo(){
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
    
    public int menuCadastroMarcaVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Marcas de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public int menuCadastroModeloVeiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Modelos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    
    public int menuCadastroTipoLocacao(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Cadastro de Tipos de Locaçao -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Voltar ao menu anterior");
        
        return entrada.nextInt();
    }
    /* --------------------- fim dos métodos para o menu de cadastro --------------------- */
    
    
    /* --------------------- métodos para o menu de Relatorios --------------------- */
    
    public int menuRelatorios(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Relatorios -----------------");
        System.out.println();
        
        System.out.println("1 - Locacoes em aberto");
        System.out.println("2 - Locacoes finalizadas");
        System.out.println("3 - Veiculos disponiveis");
        System.out.println("4 - Veiculos mais procurados");
        System.out.println("5 - Veiculos mais rentaveis");
        System.out.println("6 - Busca de clientes pelo nome");
        System.out.println("7 - Disponibilidade por Tipo de Veiculo");
        System.out.println("8 - Voltar ao menu anterior");
        
        
        return entrada.nextInt();
    }
    
    /* --------------------- fim métodos para o menu de cadastro --------------------- */
    
    /* --------------------- métodos para o menu de Locação --------------------- */
    
    public int menuLocacao(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------- Locação -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        
        return entrada.nextInt();
    }
    
    /* --------------------- fim métodos para o menu de Locação --------------------- */
}

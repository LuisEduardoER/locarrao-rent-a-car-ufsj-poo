
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
            
            opcao = Integer.parseInt(entrada.nextLine());
            switch(opcao){
                case 1: 
                    int opcaoCadastro = 0;
                    do{
                        opcaoCadastro = menuCadastro(entrada);
                        switch(opcaoCadastro){
                            case 1:
                                VisaoClientes visaoClientes = new VisaoClientes();
                                visaoClientes.cadastrarClientes();
                                break;
                                
                            case 2:
                                VisaoVeiculos visaoVeiculos = new VisaoVeiculos();
                                visaoVeiculos.cadastraVeiculos();
                                break;
                                
                            case 3:
                                VisaoMotorista visaoMotorista = new VisaoMotorista();
                                visaoMotorista.cadastrarMotorista();
                                break;
                                
                            case 4:
                                VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
                                visaoTipoVeiculo.cadastraTipoVeiculo();
                                break;
                                
                            case 5:
                                VisaoMarcaVeiculo visaoMarcaVeiculo = new VisaoMarcaVeiculo();
                                visaoMarcaVeiculo.cadastrarMarcaVeiculo();
                                break;
                                
                            case 6:
                                VisaoModeloVeiculo visaoModeloVeiculo = new VisaoModeloVeiculo();
                                visaoModeloVeiculo.cadastrarModeloVeiculo();
                                break;
                                
                            case 7:
                                VisaoTipoLocacao visaoTipoLocacao = new VisaoTipoLocacao();
                                visaoTipoLocacao.cadastraTipoLocacao();
                                break;    
                             
                            default:
                                if(opcaoCadastro == 8) continue;
                                else System.out.println("Opcao Invalida!");
                        }
                    }while(opcaoCadastro != 8);
                    break;
                    
                case 2:
                    VisaoLocacao visaoLocacao = new VisaoLocacao();
                    VisaoVeiculos visaoVeiculos = new VisaoVeiculos();
                    VisaoClientes visaoClientes = new VisaoClientes();  
                    int opcaoRelatorios = 0;
                    do{
                        opcaoRelatorios = menuRelatorios(entrada);
                        switch(opcaoRelatorios){
                            case 1:
                                visaoLocacao.locacoesEmAberto();
                                break;
                            
                            case 2:
                                visaoLocacao.locacoesFinalizadas();
                                break;
                                
                            case 3:
                                visaoVeiculos.veiculosDisponiveis();
                                break;
                                
                            case 4:
                                visaoVeiculos.veiculosMaisProcurados();
                                break;
                               
                            case 5:
                                visaoVeiculos.veiculosMaisRentaveis();
                                break;
                                
                            case 6:
                                visaoClientes.buscaPorNome();
                                break;
                             
                            case 7:
                                visaoVeiculos.disponibilidadePorTipo();
                                break;
                               
                            default:
                                if(opcaoRelatorios == 8) continue;
                                else System.out.println("Opcao Invalida!");
                                            
                        }
                    }while(opcaoRelatorios != 8);
                    break;
                    
                case 3:
                    visaoLocacao = new VisaoLocacao();
                    int opcaoLocacao = 0;
                    do{
                        opcaoLocacao = menuLocacao(entrada);
                        switch(opcaoLocacao){
                            case 1:
                                visaoLocacao.cadastraLocacao();
                                break;
                                
                            case 2:
                                visaoLocacao.fecharLocacao();
                                break;
                                
                            default:
                                if(opcaoLocacao == 3) continue;
                                else System.out.println("Opcao Invalida!");
                                            
                        }
                    }while(opcaoLocacao != 3);
                    break;
                    
                default:
                    if(opcao == 4) continue;
                    else System.out.println("Opcao Invalida!");     
            }
            
        }while (opcao !=4);
             
    }
    /* --------------------- métodos para o menu de cadastro --------------------- */
    public int menuCadastro(Scanner entrada){
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
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroCliente(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Clientes -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroVeiculo(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroMotorista(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Motoristas -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroTipoVeiculo(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Tipos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroMarcaVeiculo(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Marcas de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroModeloVeiculo(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Modelos de Veiculos -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public int menuCadastroTipoLocacao(Scanner entrada){
        
        System.out.println("----------------- Cadastro de Tipos de Locaçao -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Alterar");
        System.out.println("3 - Voltar ao menu anterior");
        
        return Integer.parseInt(entrada.nextLine());
    }
    /* --------------------- fim dos métodos para o menu de cadastro --------------------- */
    
    
    /* --------------------- métodos para o menu de Relatorios --------------------- */
    
    public int menuRelatorios(Scanner entrada){
        
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
        
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    /* --------------------- fim métodos para o menu de cadastro --------------------- */
    
    /* --------------------- métodos para o menu de Locação --------------------- */
    
    public int menuLocacao(Scanner entrada){
        
        System.out.println("----------------- Locação -----------------");
        System.out.println();
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Fechar");
        System.out.println("3 - Voltar ao menu anterior");
        
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    /* --------------------- fim métodos para o menu de Locação --------------------- */
}

package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.dominio.TipoLocacao;
import modelo.persiste.PersisteTipoLocacao;
import modelo.persiste.PersisteTipoVeiculo;

public class VisaoTipoLocacao {
    PersisteTipoLocacao persistenciaTipoLocacao;
    
    
    public void cadastraTipoLocacao() {
        persistenciaTipoLocacao = new PersisteTipoLocacao();
    
        TipoLocacao tipoLocacao = new TipoLocacao();
        
        /* digitar os dados */
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        //Tipo
        pesquisaTipoVeiculo(tipoLocacao);
        
        //outros dados
        do{
            System.out.println("Taxa - Diárias");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da taxa base é obrigatoria");
            }else{
                try{
                    tipoLocacao.setTaxaDiarias(Double.parseDouble(dado));
                }catch(InputMismatchException ex){
                    System.out.println("O campo taxa dever ser numérico");
                    entrada.nextLine();
                    continue;
                }
            }
        }while(dado.isEmpty());
        
        do{
            System.out.println("Taxa - Por Km");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da taxa base é obrigatoria");
            }else{
                try{
                    tipoLocacao.setTaxaPorKm(Double.parseDouble(dado));
                }catch(InputMismatchException ex){
                    System.out.println("O campo taxa dever ser numérico");
                    entrada.nextLine();
                    continue;
                }
            }
        }while(dado.isEmpty());
        
        do{
            System.out.println("Preço por Quilometro");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação do preço por quilometro é obrigatorio");
            }else{
                tipoLocacao.setPrecoPorQuilometro(Double.parseDouble(dado));
            }
        }while(dado.isEmpty());
        
        /* ------- Fim ------- */
        
        /* Salvar no arquivo */
        
        try {
            boolean operacao = persistenciaTipoLocacao.salvar(tipoLocacao);
            
            if(operacao){
                System.out.println("Lista salva com sucesso");
            }
            else{
                System.out.println("Erro ao salvar a lista");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo " + 
                    PersisteTipoLocacao.arquivo.getName() +
                    " não foi encontrado");
            
        } catch (IOException ex) {
            System.out.println("Erro na escrita/leitura do arquivo "+
                    PersisteTipoLocacao.arquivo.getName());
        }
        
    }
    
    
    public void pesquisaTipoVeiculo(TipoLocacao tipoLocacao){
        VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
        PersisteTipoVeiculo buscaTipoVeiculo = new PersisteTipoVeiculo();
        
        try {
            int itemMenu = visaoTipoVeiculo.menuTipoVeiculo();
            tipoLocacao.setTipoVeiculo(buscaTipoVeiculo.retornaTipoVeiculo(itemMenu));
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: não achou o arquivo!");
        } catch (IOException ex) {
            System.out.println("Erro: na escrita/leitura do arquivo!");
        }
    }
    
    public String retornaTipoDeLocacao(){
        Scanner entrada = new Scanner(System.in);
        String retorno = "";
        
        int opcao = 0;
        do{
            System.out.println("Escolha o tipo de Locacao");
            System.out.println();
        
            System.out.println("1 - Por Quilometro");
            System.out.println("2 - Quilometragem livre");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao){
                case 1:
                    retorno = "Por Quilometro";
                    break;
                
                case 2:
                    retorno = "Quilometragem livre";
                    break;
                    
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while(opcao != 1 && opcao != 2);
        
        return retorno;
        
    }
    
    public void alteraTipoLocacao(){
        
    }
    
}

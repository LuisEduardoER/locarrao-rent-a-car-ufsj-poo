package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.TipoLocacao;
import modelo.persistencia.PersistenciaTipoLocacao;
import modelo.persistencia.PersistenciaTipoVeiculo;

public class VisaoTipoLocacao {
    public void cadastraTipoLocacao() {
        TipoLocacao tipoLocacao = new TipoLocacao();
        List<TipoLocacao> listaTipoLocacao = new ArrayList<TipoLocacao>();
        
        /* digitar os dados */
        Scanner entrada = new Scanner(System.in);
        
        //Tipo
        pesquisaTipoVeiculo(tipoLocacao);
        
        //outros dados
        System.out.println("Taxa base");
        tipoLocacao.setTaxa(entrada.nextDouble());
        
        System.out.println("Preço por Quilometro");
        tipoLocacao.setPrecoPorQuilometro(entrada.nextDouble());
        
        /* ------- Fim ------- */
        
        /* Salvar no arquivo */
        PersistenciaTipoLocacao persistenciaTipoLocacao = new PersistenciaTipoLocacao();
        listaTipoLocacao = persistenciaTipoLocacao.retornaTodosTipoLocacao();
        
        try {
            boolean operacao = persistenciaTipoLocacao.salvar(listaTipoLocacao,tipoLocacao);
            
            if(operacao){
                System.out.println("Lista salva com sucesso");
            }
            else{
                System.out.println("Erro ao salvar a lista");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na escrita/leitura do arquivo");;
        }
        
    }
    
    
    public void pesquisaTipoVeiculo(TipoLocacao tipoLocacao){
        VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
        PersistenciaTipoVeiculo buscaTipoVeiculo = new PersistenciaTipoVeiculo();
        
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
        
        do{
            System.out.println("Escolha o tipo de Locacao");
            System.out.println();
        
            System.out.println("1 - Por Quilometro");
            System.out.println("2 - Quilometragem livre");
            
            switch(entrada.nextInt()){
                case 1:
                    retorno = "Por Quilometro";
                    break;
                
                case 2:
                    retorno = "Quilometragem livre";
                    break;
                    
                default:
                    System.out.println("Opcao invalida");
                   
            }
        }while(entrada.nextInt() != 1 && entrada.nextInt() != 2);
        
        
        return retorno;
        
    }
    
}

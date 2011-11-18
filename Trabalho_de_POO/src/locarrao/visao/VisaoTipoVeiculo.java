package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.TipoVeiculo;
import modelo.persiste.PersisteTipoVeiculo;

public class VisaoTipoVeiculo {
    PersisteTipoVeiculo persistenciaTipoVeiculo;
    public void cadastraTipoVeiculo() {
        persistenciaTipoVeiculo = new PersisteTipoVeiculo();
    
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Nome para o tipo");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação do tipo de veiculo é obrigatoria");
            }else{
                tipoVeiculo.setTipo(dado);
            }
        }while(dado.isEmpty());
        
        /* Salvar no arquivo */
        
        boolean operacao = PersisteTipoVeiculo.salvar(tipoVeiculo);

        if(operacao){
            System.out.println("Lista salva com sucesso");
            entrada.nextLine();
        }
        else{
            System.out.println("Erro na gravação do arquivo " + 
                    PersisteTipoVeiculo.arquivo.getName());
        }
        
        
    }
    
    public void alteraTipoVeiculo(){
        
    }
    
    public void pesquisaTipoVeiculo(){
        
    }
    
    public void excluiTipoVeiculo(){
        
    }
    
    //Cria o menu a partir de uma lista de Veiculos
    public int menuTipoVeiculo() throws FileNotFoundException, IOException{
        persistenciaTipoVeiculo = new PersisteTipoVeiculo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione o tipo de veiculo");
        int contador = 1;
        if(PersisteTipoVeiculo.listaTipoVeiculos.size() == 1){
            System.out.println();
            return 1;
        }else{
            for(TipoVeiculo tipoVeiculo:PersisteTipoVeiculo.listaTipoVeiculos){
            
                System.out.println(contador + " - " + tipoVeiculo.getTipo());
                contador++;
            }

            
            contador = Integer.parseInt(entrada.nextLine());
            System.out.println();
            return contador;
        }
        
    }
}

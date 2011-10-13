package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.TipoVeiculo;
import modelo.persistencia.PersistenciaTipoVeiculo;

public class VisaoTipoVeiculo {
    PersistenciaTipoVeiculo persistenciaTipoVeiculo = new PersistenciaTipoVeiculo();
    
    public void cadastraTipoVeiculo() {
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome para o tipo");
        tipoVeiculo.setTipo(entrada.nextLine());
        
        /* Salvar no arquivo */
        
        boolean operacao = persistenciaTipoVeiculo.salvar(tipoVeiculo);

        if(operacao){
            System.out.println("Lista salva com sucesso");
        }
        else{
            System.out.println("Erro na gravação do arquivo " + 
                    PersistenciaTipoVeiculo.arquivo.getName());
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
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione o tipo de veiculo");
        int contador = 1;
        for(TipoVeiculo tipoVeiculo:PersistenciaTipoVeiculo.listaTipoVeiculos){
            
            System.out.println(contador + " - " + tipoVeiculo.getTipo());
            contador++;
        }
        
        contador = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        return contador;
    }
}

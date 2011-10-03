package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.TipoVeiculo;
import modelo.persistencia.PersistenciaTipoVeiculo;

public class VisaoTipoVeiculo {
    
    public void cadastraTipoVeiculo(){
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome para o tipo");
        tipoVeiculo.setTipo(entrada.nextLine());
        
        /* Salvar no arquivo */
        PersistenciaTipoVeiculo persistenciaTipoVeiculo = new PersistenciaTipoVeiculo();
        try {
            boolean operacao = persistenciaTipoVeiculo.salvar(tipoVeiculo);
            
            if(operacao){
                System.out.println("Lista salva com sucesso");
            }
            else{
                System.out.println("Erro na gravação do arquivo");
            }
        } catch (IOException ex) {
            System.out.println("Erro na leitura/escrita do arquivo");
        }
        
        
    }
    
    //Cria o menu a partir de uma lista de Veiculos
    public int menuTipoVeiculo() throws FileNotFoundException, IOException{
        List<TipoVeiculo> listaTipoVeiculo = new ArrayList<TipoVeiculo>();
        
        PersistenciaTipoVeiculo persistenciaTipoVeiculo = new PersistenciaTipoVeiculo();
        listaTipoVeiculo = persistenciaTipoVeiculo.retornaTodosTipoVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione o tipo de veiculo");
        int contador = 1;
        for(TipoVeiculo tipoVeiculo:listaTipoVeiculo){
            System.out.println(contador + " - " + tipoVeiculo.getTipo());
            contador++;
        }
        
        contador = entrada.nextInt();
        
        System.out.println();
        return contador;
    }
}

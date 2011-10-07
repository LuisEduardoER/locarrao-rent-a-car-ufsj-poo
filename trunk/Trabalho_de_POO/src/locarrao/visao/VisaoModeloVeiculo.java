/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.ModeloVeiculo;
import modelo.persistencia.PersistenciaModeloVeiculo;

public class VisaoModeloVeiculo {
    public void cadastraModeloVeiculo(){
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        List<ModeloVeiculo> listaModeloVeiculo = new ArrayList<ModeloVeiculo>();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a modelo do veiculo");
        modeloVeiculo.setModelo(entrada.nextLine());
        
        PersistenciaModeloVeiculo persistencia = new PersistenciaModeloVeiculo();
        listaModeloVeiculo = persistencia.retornaTodosModelos();
        
        boolean operacao = persistencia.salvar(listaModeloVeiculo, modeloVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
        } else{
            System.out.println("Erro!");
        }
    }
    
    public void alteraModeloVeiculo(){
        
    }
    
    public void pesquisaModeloVeiculo(){
        
    }
    
    public void excluiModeloVeiculo(){
        
    }
}

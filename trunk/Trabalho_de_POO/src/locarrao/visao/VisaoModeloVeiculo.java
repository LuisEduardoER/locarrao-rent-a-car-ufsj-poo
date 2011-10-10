/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.Scanner;
import modelo.dominio.ModeloVeiculo;
import modelo.persistencia.PersistenciaModeloVeiculo;

public class VisaoModeloVeiculo {
    PersistenciaModeloVeiculo persistenciaModeloVeiculo = new PersistenciaModeloVeiculo();
    
    public void cadastrarModeloVeiculo() {
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a modelo do veiculo");
        modeloVeiculo.setModelo(entrada.nextLine());
        
        boolean operacao = persistenciaModeloVeiculo.salvar(modeloVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
        } else{
            System.out.println("Erro!");
        }
    }
    
    public void alterarModeloVeiculo(){
        
    }
    
    public void pesquisarModeloVeiculo(){
        
    }
    
    public void excluirModeloVeiculo(){
        
    }
}

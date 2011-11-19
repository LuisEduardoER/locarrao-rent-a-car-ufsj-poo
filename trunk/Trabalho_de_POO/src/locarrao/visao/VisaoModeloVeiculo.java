/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.Scanner;
import modelo.dominio.ModeloVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;

public class VisaoModeloVeiculo {
    PersisteModeloVeiculo persistenciaModeloVeiculo = new PersisteModeloVeiculo();
    
    public void cadastrarModeloVeiculo() {
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        
        do{
            System.out.println("Digite a modelo do veiculo");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação do modelo é obrigatorio");
            }else{
                modeloVeiculo.setModelo(dado);
            }
                
        }while(dado.isEmpty());
        
        boolean operacao = persistenciaModeloVeiculo.salvar(modeloVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
            entrada.nextLine();
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

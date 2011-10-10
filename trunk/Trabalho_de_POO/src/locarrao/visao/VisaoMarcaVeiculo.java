/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.Scanner;
import modelo.dominio.MarcaVeiculo;
import modelo.persistencia.PersistenciaMarcaVeiculo;

public class VisaoMarcaVeiculo {
    PersistenciaMarcaVeiculo persistenciaMarcaVeiculo = new PersistenciaMarcaVeiculo();
    
    public void cadastrarMarcaVeiculo() {
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a marca do veiculo");
        marcaVeiculo.setMarca(entrada.nextLine());
        
        boolean operacao = persistenciaMarcaVeiculo.salvar(marcaVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
        } else{
            System.out.println("Erro!");
        }
        
    }
    
    public void alterarMarcaVeiculo(){
        
    }
    
    public void pesquisarMarcaVeiculo(){
        
    }
    
    public void excluirMarcaVeiculo(){
        
    }
}

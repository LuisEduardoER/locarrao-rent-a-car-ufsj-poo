/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.Scanner;
import modelo.dominio.MarcaVeiculo;
import modelo.persiste.PersisteMarcaVeiculo;

public class VisaoMarcaVeiculo {
    PersisteMarcaVeiculo persistenciaMarcaVeiculo = new PersisteMarcaVeiculo();
    
    public void cadastrarMarcaVeiculo() {
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Digite a marca do veiculo");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da marca do veiculo é obrigatorio");
            }else{
                marcaVeiculo.setMarca(dado);
            }
        }while(dado.isEmpty());
        
        boolean operacao = persistenciaMarcaVeiculo.salvar(marcaVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
            entrada.nextLine();
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

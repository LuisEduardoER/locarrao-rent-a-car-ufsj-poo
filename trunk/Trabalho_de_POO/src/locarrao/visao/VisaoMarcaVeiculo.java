/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.MarcaVeiculo;
import modelo.persistencia.PersistenciaMarcaVeiculo;

public class VisaoMarcaVeiculo {
    public void cadastraMarcaVeiculo(){
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        List<MarcaVeiculo> listaMarcaVeiculo = new ArrayList<MarcaVeiculo>();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a marca do veiculo");
        marcaVeiculo.setMarca(entrada.nextLine());
        
        PersistenciaMarcaVeiculo persistencia = new PersistenciaMarcaVeiculo();
        listaMarcaVeiculo = persistencia.retornaTodasMarcas();
        
        boolean operacao = persistencia.salvar(listaMarcaVeiculo, marcaVeiculo);

        if(operacao){
            System.out.println("Salvo com sucesso");
        } else{
            System.out.println("Erro!");
        }
        
    }
    
    public void alteraMarcaVeiculo(){
        
    }
    
    public void pesquisaMarcaVeiculo(){
        
    }
    
    public void excluiMarcaVeiculo(){
        
    }
}

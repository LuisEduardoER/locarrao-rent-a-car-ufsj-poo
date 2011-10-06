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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersistenciaVeiculos;

/**
 *
 * @author PATY
 */
public class VisaoVeiculos {
    public void cadastraVeiculos() {
        Veiculos veiculos = new Veiculos();
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos>();
        
        Scanner cadastro = new Scanner(System.in);
        PersistenciaVeiculos persistenciaVeiculos = new PersistenciaVeiculos();
        listaVeiculos = persistenciaVeiculos.retornaTodosVeiculos();
        
        System.out.println("Digite a placa do veiculo");
        veiculos.setPlaca(cadastro.nextLine());
        boolean existe = false;
        try {
            existe = persistenciaVeiculos.pesquisaVeiculo(listaVeiculos, veiculos);
            if (existe){
                    System.out.println("Cor do veiculo");
                    veiculos.setCor(cadastro.nextLine());
                    System.out.println("Ano do veiculo");
                    veiculos.setAno(cadastro.nextInt());
                    cadastro.nextLine();
                    System.out.println("Opcionais");
                    veiculos.setOpcionais(cadastro.nextLine());
                    System.out.println("Observacao");
                    veiculos.setObservacao(cadastro.nextLine());
                    System.out.println("Tipo de veiculo");
                    tipoVeiculo.setTipo(cadastro.nextLine());
                    System.out.println("Marca do veiculo");
                    marcaVeiculo.setMarca(cadastro.nextLine());
                    System.out.println("MOdelo do veiculo");
                    modeloVeiculo.setModelo(cadastro.nextLine());
                    veiculos.setTipoVeiculo(tipoVeiculo);
                    veiculos.setMarcaVeiculo(marcaVeiculo);
                    veiculos.setModeloVeiculo(modeloVeiculo);
                    
                    boolean operacao = persistenciaVeiculos.salvar(listaVeiculos, veiculos);
                    if (operacao) {
                        System.out.println("Cadastro salvo com sucesso");
                    }
                    else {
                        System.out.println("Erro!");
                    }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro! Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo");
        }
        
    }
    
    public void alteraVeiculos(){
        
    }
    
    public boolean pesquisaVeiculo(List<Veiculos> listaVeiculos,Veiculos veiculos){
        List<Veiculos> listaVeiculo = new ArrayList<Veiculos>();
        boolean encontrou = false;
        PersistenciaVeiculos persistenciaVeiculo = new PersistenciaVeiculos();
        try {
            listaVeiculo = persistenciaVeiculo.retornaTodosVeiculos();
            
            encontrou = persistenciaVeiculo.pesquisaVeiculo(listaVeiculos, veiculos);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VisaoVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VisaoVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return encontrou;
        
        
    }
    
    public void pesquisaVeiculo(){
        
    }
    
    public void excluiVeiculo(){
        
    }
}


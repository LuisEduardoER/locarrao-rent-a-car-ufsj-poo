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
import modelo.persistencia.PersistenciaMarcaVeiculo;
import modelo.persistencia.PersistenciaModeloVeiculo;
import modelo.persistencia.PersistenciaTipoLocacao;
import modelo.persistencia.PersistenciaTipoVeiculo;
import modelo.persistencia.PersistenciaVeiculos;

/**
 *
 * @author PATY
 */
public class VisaoVeiculos {
    public void cadastraVeiculos() {
        //objetos
        Veiculos veiculos = new Veiculos();
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        
        //listas
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos>();
        List<MarcaVeiculo> listaMarca = new ArrayList<MarcaVeiculo>();
        List<ModeloVeiculo> listaModelo = new ArrayList<ModeloVeiculo>();
        List<TipoVeiculo> listaTipoVeiculo = new ArrayList<TipoVeiculo>();
        
        Scanner cadastro = new Scanner(System.in);
        
        //preenchendo as listas
        PersistenciaVeiculos persistenciaVeiculos = new PersistenciaVeiculos();
        listaVeiculos = persistenciaVeiculos.retornaTodosVeiculos();
        
        PersistenciaMarcaVeiculo  persistenciaMarca = new PersistenciaMarcaVeiculo();
        listaMarca = persistenciaMarca.retornaTodasMarcas();
        
        PersistenciaModeloVeiculo persistenciaModelo = new PersistenciaModeloVeiculo();
        listaModelo = persistenciaModelo.retornaTodosModelos();
        
        PersistenciaTipoVeiculo persistenciaTipoVeiculo = new PersistenciaTipoVeiculo();
        listaTipoVeiculo = persistenciaTipoVeiculo.retornaTodosTipoVeiculo();
        
        VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
            
        
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
                    
                    //Seleciona o tipo de Veiculo
                    System.out.println("Tipo de veiculo");
                    int resposta = visaoTipoVeiculo.menuTipoVeiculo();
                    tipoVeiculo.setTipo(listaTipoVeiculo.get(resposta - 1).getTipo());
                    veiculos.setTipoVeiculo(tipoVeiculo);
                    
                    System.out.println("Marca do veiculo");
                    marcaVeiculo.setMarca(cadastro.nextLine());
                    boolean salvaMarca = persistenciaMarca.salvar(listaMarca, marcaVeiculo);
                    if(salvaMarca){
                        veiculos.setMarcaVeiculo(marcaVeiculo);
                    }
                    else{
                        System.out.println("Erro na hora de salvar a marca");
                        return;
                    }
                    
                    
                    System.out.println("Modelo do veiculo");
                    modeloVeiculo.setModelo(cadastro.nextLine());
                    boolean salvaModelo = persistenciaModelo.salvar(listaModelo, modeloVeiculo);
                    if(salvaModelo){
                        veiculos.setModeloVeiculo(modeloVeiculo);
                    }
                    else{
                        System.out.println("Erro na hora de salvar o modelo");
                        return;
                    }
                    
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


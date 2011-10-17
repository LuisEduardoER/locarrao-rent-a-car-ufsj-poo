/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoLocacao;
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
    PersistenciaVeiculos persistenciaVeiculos = new PersistenciaVeiculos();
    PersistenciaMarcaVeiculo persistenciaMarcaVeiculo = new PersistenciaMarcaVeiculo();
    PersistenciaModeloVeiculo persistenciaModeloVeiculo = new PersistenciaModeloVeiculo();
    PersistenciaTipoVeiculo persistenciaTipoVeiculo = new PersistenciaTipoVeiculo();
    VisaoTipoVeiculo visaoTipoVeiculo = new VisaoTipoVeiculo();
    TipoLocacao tipoLocacao = new TipoLocacao();
    TipoVeiculo tipoVeiculo = new TipoVeiculo();
    MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
    ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
                
    public static Veiculos veiculos;
    public VisaoVeiculos() {
        veiculos = new Veiculos();
    }
    
    public void cadastraVeiculos() {
        veiculos = new Veiculos();
        tipoVeiculo = new TipoVeiculo();
        marcaVeiculo = new MarcaVeiculo();
        modeloVeiculo = new ModeloVeiculo();
        
        Scanner cadastro = new Scanner(System.in);
        
        visaoTipoVeiculo = new VisaoTipoVeiculo();
        
        System.out.println("Digite a placa do veiculo");
        veiculos.setPlaca(cadastro.nextLine());
        
        System.out.println("Cor do veiculo");
        veiculos.setCor(cadastro.nextLine());

        System.out.println("Ano do veiculo");
        veiculos.setAno(Integer.parseInt(cadastro.nextLine()));
        
        System.out.println("Opcionais");
        veiculos.setOpcionais(cadastro.nextLine());

        System.out.println("Observacao");
        veiculos.setObservacao(cadastro.nextLine());

        //Seleciona o tipo de Veiculo
        System.out.println("Tipo de veiculo");
        int resposta;

        try {
            resposta = visaoTipoVeiculo.menuTipoVeiculo();
            tipoVeiculo.setTipo(persistenciaTipoVeiculo.
                    retornaTipoVeiculo(resposta).getTipo());
            
            veiculos.setTipoVeiculo(tipoVeiculo);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo  TipoVeiculo.txt não encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na escrita ou leitra do arquivo "
                    + "TipoVeiculo.txt");
        }

        System.out.println("Marca do veiculo");
        marcaVeiculo.setMarca(cadastro.nextLine());
        boolean salvaMarca = persistenciaMarcaVeiculo.salvar(marcaVeiculo);
        if(salvaMarca){
            veiculos.setMarcaVeiculo(marcaVeiculo);
        }
        else{
            System.out.println("Erro na hora de salvar a marca");
            return;
        }


        System.out.println("Modelo do veiculo");
        modeloVeiculo.setModelo(cadastro.nextLine());
        boolean salvaModelo = persistenciaModeloVeiculo.salvar(modeloVeiculo);
        if(salvaModelo){
            veiculos.setModeloVeiculo(modeloVeiculo);
        }
        else{
            System.out.println("Erro na hora de salvar o modelo");
            return;
        }

        boolean operacao = persistenciaVeiculos.salvar(veiculos);
        if (operacao) {
            System.out.println("Cadastro salvo com sucesso");
        }
        else {
            System.out.println("Erro!");
        }
        
    }
    
    public void alterarVeiculos(){
        
    }
    
    public boolean pesquisarVeiculo(Veiculos veiculos){
        boolean encontrou = false;
        try {
            
            encontrou = persistenciaVeiculos.pesquisarVeiculo(veiculos);
            
        } catch (FileNotFoundException ex) {
            System.out.println("arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("erro na escrita ou leitura do arquivo");
        }
        
        return encontrou;
        
        
    }
    
    public void pesquisarVeiculo(){
        
    }
    
    public void excluirVeiculo(){
        
    }
    
    public void veiculosDisponiveis(){
        persistenciaVeiculos.verificarveiculosDisponiveis();
    }
    
    public void veiculosMaisProcurados(){
        persistenciaVeiculos.mostrarVeiculosMaisProcurados();
    }
    
    public void veiculosMaisRentaveis(){
        persistenciaVeiculos.mostrarVeiculosMaisRentaveis();
    }
    
    
    public void disponibilidadePorTipo(){
        try {
            int tipo = visaoTipoVeiculo.menuTipoVeiculo();
            tipoVeiculo = PersistenciaTipoVeiculo.listaTipoVeiculos.get(tipo);
            System.out.println("Veiculos Disponiveis");
            persistenciaVeiculos.mostrarVeiculosDisponiveis(tipoVeiculo);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException ex) {
            System.out.println("erro na escrita ou leitura do arquivo");
        }
    }
    
    public void imprimirVeiculo(Veiculos veiculo){
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Opcionais: " + veiculo.getOpcionais());
        System.out.println("Obeservacao: " + veiculo.getObservacao());
        System.out.println("Tipo: " + veiculo.getTipoVeiculo().getTipo());
        System.out.println("Marca: " + veiculo.getMarcaVeiculo());
        System.out.println("Modelo: " + veiculo.getModeloVeiculo());
    }
}


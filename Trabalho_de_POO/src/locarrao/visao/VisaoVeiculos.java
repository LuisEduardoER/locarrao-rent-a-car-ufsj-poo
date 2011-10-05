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
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersistenciaVeiculos;

/**
 *
 * @author PATY
 */
public class VisaoVeiculos {
    public void cadastraVeiculos(){
        Veiculos veiculos = new Veiculos();
        TipoVeiculo tipoVeiculo = new TipoVeiculo();
        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
        
        Scanner cadastro = new Scanner(System.in);
        PersistenciaVeiculos persistenciaVeiculos = new PersistenciaVeiculos();
        System.out.println("Digite a placa do veiculo");
        veiculos.setPlaca(cadastro.nextLine());
        boolean existe = false;
        try {
            existe = persistenciaVeiculos.pesquisaVeiculo(veiculos);
            if (existe){
                    System.out.println("Cor do veiculo");
                    veiculos.setCor(cadastro.nextLine());
                    System.out.println("Ano do veiculo");
                    veiculos.setAno(cadastro.nextInt());
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
                    
                    boolean operacao = persistenciaVeiculos.salvar(veiculos);
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
}


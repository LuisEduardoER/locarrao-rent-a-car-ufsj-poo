/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;
import modelo.persistencia.PersisteMarcaVeiculo;
import modelo.persistencia.PersisteModeloVeiculo;
import modelo.persistencia.PersisteTipoVeiculo;
import modelo.persistencia.PersisteVeiculos;

/**
 *
 * @author PATY
 */
public class VisaoVeiculos {
    PersisteVeiculos persistenciaVeiculos;
    PersisteMarcaVeiculo persistenciaMarcaVeiculo;
    PersisteModeloVeiculo persistenciaModeloVeiculo;
    PersisteTipoVeiculo persistenciaTipoVeiculo;
    VisaoTipoVeiculo visaoTipoVeiculo;
    TipoLocacao tipoLocacao;
    TipoVeiculo tipoVeiculo;
    MarcaVeiculo marcaVeiculo;
    ModeloVeiculo modeloVeiculo;
                
    public static Veiculos veiculos;
    public VisaoVeiculos() {
        veiculos = new Veiculos();
    }
    
    public void cadastraVeiculos() {
        persistenciaTipoVeiculo = new PersisteTipoVeiculo();
        persistenciaMarcaVeiculo = new PersisteMarcaVeiculo();
        persistenciaModeloVeiculo = new PersisteModeloVeiculo();
        persistenciaVeiculos = new PersisteVeiculos();
        
        veiculos = new Veiculos();
        tipoVeiculo = new TipoVeiculo();
        marcaVeiculo = new MarcaVeiculo();
        modeloVeiculo = new ModeloVeiculo();
        
        visaoTipoVeiculo = new VisaoTipoVeiculo();
        
        
        Scanner cadastro = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Digite a placa do veiculo");
            dado = cadastro.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da placa é obrigatoria");
            }else{
                veiculos.setPlaca(dado);
            }
        }while(dado.isEmpty());
        
        try {
            if(persistenciaVeiculos.pesquisarVeiculo(veiculos)){
                System.out.println("Veiculo ja cadastrado");
                cadastro.nextLine();
            }else{
                
                System.out.println("Cor do veiculo");
                dado = cadastro.nextLine();
                if(dado.isEmpty()){
                    veiculos.setCor(" - ");
                }else{
                    veiculos.setCor(dado);
                }


                System.out.println("Ano do veiculo");
                dado = cadastro.nextLine();
                if(dado.isEmpty()){
                    veiculos.setAno(0);
                }else{
                    try{
                        veiculos.setAno(Integer.parseInt(dado));
                    }catch(InputMismatchException ex){
                        System.out.println("No campo Ano é numérico e inteiro");
                    }
                }

                System.out.println("Opcionais");
                List<String> aux = new ArrayList<String>();
                dado = cadastro.nextLine();
                if(dado.isEmpty()){
                    aux.add(" - ");
                    veiculos.setOpcionais(aux);
                }else{
                    aux.add(dado);
                    veiculos.setOpcionais(aux);
                }

                System.out.println("Observacao");
                dado = cadastro.nextLine();
                if(dado.isEmpty()){
                    veiculos.setObservacao(" - ");
                }else{
                    veiculos.setObservacao(dado);
                }

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

                do{
                    System.out.println("Marca do veiculo");
                    dado = cadastro.nextLine();

                    if(dado.isEmpty()){
                        System.out.println("Digitação da marca do veiculo é obrigatoria");
                    }else{
                        marcaVeiculo.setMarca(dado);
                        veiculos.setMarcaVeiculo(marcaVeiculo);

                        //salva a marca no arquivo MarcaVeiculo.txt
                        boolean salvaMarca = persistenciaMarcaVeiculo.salvar(marcaVeiculo);
                        if(salvaMarca){
                            veiculos.setMarcaVeiculo(marcaVeiculo);
                        }
                        else{
                            System.out.println("Erro na hora de salvar a marca");
                            cadastro.nextLine();
                            return;
                        }
                    }
                }while(dado.isEmpty());

                do{
                    System.out.println("Modelo do veiculo");
                    dado = cadastro.nextLine();

                    if(dado.isEmpty()){
                        System.out.println("Digitação do modelo do Veiculo é obrigatoria");
                    }else{
                        modeloVeiculo.setModelo(dado);
                        veiculos.setModeloVeiculo(modeloVeiculo);

                        //Salva o modelo no arquivo ModeloVeiculo.txt
                        boolean salvaModelo = persistenciaModeloVeiculo.salvar(modeloVeiculo);
                        if(salvaModelo){
                            veiculos.setModeloVeiculo(modeloVeiculo);
                        }
                        else{
                            System.out.println("Erro na hora de salvar o modelo");
                            cadastro.nextLine();
                            return;
                        }
                    }
                }while(dado.isEmpty());

                boolean operacao = persistenciaVeiculos.salvar(veiculos);
                if (operacao) {
                    System.out.println("Cadastro salvo com sucesso");
                    cadastro.nextLine();
                }
                else {
                    System.out.println("Erro!");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException ex) {
            System.out.println("Erro na escrita ou leitura do arquivo");
        }
        
        
    }
    
    public void alterarVeiculos(){
        
    }
    
    public boolean pesquisarVeiculo(Veiculos veiculos){
        persistenciaVeiculos = new PersisteVeiculos();
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
        Scanner entrada = new Scanner(System.in);
        persistenciaVeiculos = new PersisteVeiculos();
        persistenciaVeiculos.verificarveiculosDisponiveis();
        entrada.nextLine();
        
    }
    
    public void veiculosMaisProcurados(){
        Scanner entrada = new Scanner(System.in);
        persistenciaVeiculos = new PersisteVeiculos();
        persistenciaVeiculos.mostrarVeiculosMaisProcurados();
        entrada.nextLine();
        
    }
    
    public void veiculosMaisRentaveis(){
        Scanner entrada = new Scanner(System.in);
        persistenciaVeiculos = new PersisteVeiculos();
        persistenciaVeiculos.mostrarVeiculosMaisRentaveis();
        entrada.nextLine();
        
    }
    
    
    public void disponibilidadePorTipo(){
        Scanner entrada = new Scanner(System.in);
        visaoTipoVeiculo = new VisaoTipoVeiculo();
        tipoVeiculo = new TipoVeiculo();
        persistenciaVeiculos = new PersisteVeiculos();
        
        try {
            int tipo = visaoTipoVeiculo.menuTipoVeiculo();
            tipoVeiculo = PersisteTipoVeiculo.listaTipoVeiculos.get(tipo - 1);
            System.out.println("Veiculos Disponiveis");
            persistenciaVeiculos.mostrarVeiculosDisponiveis(tipoVeiculo);
            entrada.nextLine();
            
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
        System.out.println("Marca: " + veiculo.getMarcaVeiculo().getMarca());
        System.out.println("Modelo: " + veiculo.getModeloVeiculo().getModelo());
    }
}


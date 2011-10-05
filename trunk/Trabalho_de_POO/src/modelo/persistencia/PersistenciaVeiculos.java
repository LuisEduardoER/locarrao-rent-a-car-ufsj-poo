/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

/**
 *
 * @author PATY
 */
public class PersistenciaVeiculos {
    File arquivo = new File("src/arquivos/Veiculos.txt");
    public List<Veiculos> retornaTodosVeiculos () throws FileNotFoundException, IOException {
        
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos> ();
        
        if(arquivo.exists()){
            
            FileReader reader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(reader);
            
            Veiculos veiculos = new Veiculos();
            TipoVeiculo tipoVeiculo = new TipoVeiculo();
            MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
            ModeloVeiculo modeloVeiculo = new ModeloVeiculo();
           
            String linha = null;
            
            int contador=0;
            
            while(leitor.ready()){
                if (contador==0){
                    linha=leitor.readLine();
                    
                    veiculos.setPlaca(linha);
                    contador++;
                } 
                else if(contador==1){
                    linha=leitor.readLine();
                    veiculos.setCor(linha);
                    contador++;
                }
                else if (contador==2){
                    linha=leitor.readLine();
                    veiculos.setAno(Integer.valueOf(linha));
                    contador++;
                }
                else if (contador==3){
                    linha=leitor.readLine();
                    veiculos.setOpcionais(linha);
                    contador++;
                }
                else if (contador==4){
                    linha=leitor.readLine();
                    veiculos.setObservacao(linha);
                    contador++;
                }
                else if (contador==5) {
                    linha=leitor.readLine();
                    tipoVeiculo.setTipo(linha);
                    contador++;
                }
                else if (contador==6){
                    linha=leitor.readLine();
                    marcaVeiculo.setMarca(linha);
                    contador++;
                }
                else if (contador==7){
                    linha=leitor.readLine();
                    modeloVeiculo.setModelo(linha);
                    veiculos.setTipoVeiculo(tipoVeiculo);
                    veiculos.setMarcaVeiculo(marcaVeiculo);
                    veiculos.setModeloVeiculo(modeloVeiculo);
                    listaVeiculos.add(veiculos);
                    contador=0;
                }
                
                reader.close();
                leitor.close();
            }    
        }
        else {
            System.out.println("Arquivo não encontrado");
        }
        return listaVeiculos;    
   }
    public boolean salvar(Veiculos veiculos) throws FileNotFoundException, IOException{
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos> ();
        listaVeiculos=retornaTodosVeiculos();
        FileWriter writer = new FileWriter(arquivo);
        PrintWriter cadastro = new PrintWriter(writer);
        boolean encontrou = pesquisaVeiculo(veiculos);
        if(!encontrou){
            for(Veiculos automoveis: listaVeiculos){
                cadastro.println(automoveis.getPlaca());
                cadastro.println(automoveis.getCor());
                cadastro.println(automoveis.getAno());
                cadastro.println(automoveis.getOpcionais());
                cadastro.println(automoveis.getObservacao());
                cadastro.println(automoveis.getTipoVeiculo().getTipo());
                cadastro.println(automoveis.getMarcaVeiculo().getMarca());
                cadastro.println(automoveis.getModeloVeiculo().getModelo());
            } 
            return false;
        }
        else {
            return false;
        }
        
    }
    
    public boolean alteraVeiculo(Veiculos veiculos) throws FileNotFoundException, IOException{
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos> ();
        listaVeiculos=retornaTodosVeiculos();
        boolean existe = pesquisaVeiculo(veiculos);
        boolean retorno = false;
        if (existe){
            for(Veiculos automoveis: listaVeiculos){
                if(veiculos.getPlaca() == automoveis.getPlaca()){
                    automoveis=veiculos;
                    retorno = true;
                }
            }
        } 
        else {
            System.out.println("Erro! Veiculo não cadastrado");
            retorno = false;
        }
        return retorno;
    }
    public boolean pesquisaVeiculo(Veiculos veiculo) throws FileNotFoundException, IOException{
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos> ();
        listaVeiculos=retornaTodosVeiculos();
        boolean encontrou = false;
        for(Veiculos automoveis: listaVeiculos){
            if (veiculo.getPlaca() == veiculo.getPlaca()){
                return encontrou=true;
            }
        }
        return encontrou;
    }
    
}


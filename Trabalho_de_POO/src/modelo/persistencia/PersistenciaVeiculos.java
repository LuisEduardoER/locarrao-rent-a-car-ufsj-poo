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

public class PersistenciaVeiculos {
    File arquivo = new File("src/arquivos/Veiculos.txt");
    
    public List<Veiculos> retornaTodosVeiculos () {
        
        List<Veiculos> listaVeiculos = new ArrayList<Veiculos> ();
        if(arquivo.exists()){
            FileReader reader = null;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                
                String linha = null;
                
                int contador = 0;
                try{
                    while((linha = leitor.readLine()) != null){
                        Veiculos veiculos = new Veiculos();
                        TipoVeiculo tipoVeiculo = new TipoVeiculo();
                        MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
                        ModeloVeiculo modeloVeiculo = new ModeloVeiculo();

                        if (contador == 0){
                            veiculos.setPlaca(linha);
                            contador++;
                        } 
                        else if(contador == 1){
                            veiculos.setCor(linha);
                            contador++;
                        }
                        else if (contador == 2){
                            veiculos.setAno(Integer.valueOf(linha));
                            contador++;
                        }
                        else if (contador == 3){
                            veiculos.setOpcionais(linha);
                            contador++;
                        }
                        else if (contador == 4){
                            veiculos.setObservacao(linha);
                            contador++;
                        }
                        else if (contador == 5){
                            tipoVeiculo.setTipo(linha);
                            veiculos.setTipoVeiculo(tipoVeiculo);
                            contador++;
                        }
                        else if (contador == 6){
                            marcaVeiculo.setMarca(linha);
                            veiculos.setMarcaVeiculo(marcaVeiculo);
                            contador++;
                        }
                        else if (contador == 7){
                            modeloVeiculo.setModelo(linha);
                            veiculos.setModeloVeiculo(modeloVeiculo);
                            listaVeiculos.add(veiculos);
                            contador = 0;
                        }
                    }
                    
                    reader.close();
                    leitor.close();
                } catch(IOException ex){
                    System.out.println("Erro na escrita ou leitura do arquivo " +
                            arquivo.getName());
                }
                    
            } catch (IOException ex) {
                System.out.println(" Erro na escrita ou leitura do arquivo " + 
                        arquivo.getName());
            }
        }
        else {
            System.out.println("Arquivo " + arquivo.getName()+ " nao encontrado");
        }
        return listaVeiculos;    
   }
    public boolean salvar(List<Veiculos> listaVeiculos,Veiculos veiculos) {
        boolean retorno = false;
        if(arquivo.exists()){
            FileWriter writer = null;
            try {
                writer = new FileWriter(arquivo);
                PrintWriter cadastro = new PrintWriter(writer);
                listaVeiculos.add(veiculos);
                
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
                retorno = true;
                
            } catch (IOException ex) {
                System.out.println("Erro na escrita ou leitura do arquivo do arquivo " +
                        arquivo.getName());
            } 
        } else{
            System.out.println("Arquivo " + arquivo.getName()+ " nao encontrado");
        }
        
        return retorno;
    }
    
    public boolean alteraVeiculo(List<Veiculos> listaVeiculos,Veiculos veiculos) throws FileNotFoundException, IOException{
        boolean existe = pesquisaVeiculo(listaVeiculos, veiculos);
        boolean retorno = false;
        if (existe){
            for(Veiculos automoveis: listaVeiculos){
                if(automoveis.getPlaca().equals(veiculos.getPlaca())){
                    automoveis = veiculos;
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
    
    public boolean pesquisaVeiculo(List<Veiculos> listaVeiculos,Veiculos veiculos) throws FileNotFoundException, IOException{
        
        boolean encontrou = false;
        if(!listaVeiculos.isEmpty()){
            for(Veiculos automoveis : listaVeiculos){
                if (automoveis.getPlaca().equals(veiculos.getPlaca())){
                    return encontrou = true;
                }
            }
        }
        
        return encontrou;
    }
    
}


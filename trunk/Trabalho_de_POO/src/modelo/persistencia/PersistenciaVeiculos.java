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
    public static File arquivo;
    public static List<Veiculos> listaVeiculos;
    
    public static Veiculos veiculos = new Veiculos();
    public static TipoVeiculo tipoVeiculo = new TipoVeiculo();
    public static MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
    public static ModeloVeiculo modeloVeiculo = new ModeloVeiculo();

    
    public PersistenciaVeiculos() {
        arquivo = new File("src/arquivos/Veiculos.txt");
        listaVeiculos = new ArrayList<Veiculos>();
        retornarTodosVeiculos();
    }
    
    public static void retornarTodosVeiculos () {
        
        if(arquivo.exists()){
            FileReader reader = null;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                
                String linha = null;
                
                int contador = 0;
                try{
                    while((linha = leitor.readLine()) != null){
                        
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
        
   }
    public boolean salvar(Veiculos veiculos) {
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
                
                writer.close();
                cadastro.close();
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
    
    public boolean alterarVeiculo(Veiculos veiculos) throws FileNotFoundException, IOException{
        boolean existe = pesquisarVeiculo(veiculos);
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
    
    public boolean pesquisarVeiculo(Veiculos veiculos) throws FileNotFoundException, IOException{
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


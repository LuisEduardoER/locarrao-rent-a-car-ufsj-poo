package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import locarrao.visao.VisaoVeiculos;
import modelo.dominio.Locacao;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

public class PersistenciaVeiculos {
    public static File arquivo;
    public static List<Veiculos> listaVeiculos;
    VisaoVeiculos visaoVeiculo = new VisaoVeiculos();
    
    PersistenciaLocacao persistenciaLocacao = new PersistenciaLocacao();
    
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
                Veiculos veiculos = new Veiculos();
                TipoVeiculo tipoVeiculo = new TipoVeiculo();
                MarcaVeiculo marcaVeiculo = new MarcaVeiculo();
                ModeloVeiculo modeloVeiculo = new ModeloVeiculo();

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
                            veiculos = new Veiculos();
                            tipoVeiculo = new TipoVeiculo();
                            marcaVeiculo = new MarcaVeiculo();
                            modeloVeiculo = new ModeloVeiculo();

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
    
    public void retornarVeiculo(Veiculos veiculo) {
        for(Veiculos automovel: listaVeiculos){
            if(automovel.getPlaca().equals(veiculo.getPlaca())){
                veiculo.setAno(automovel.getAno());
                veiculo.setCor(automovel.getCor());
                veiculo.setMarcaVeiculo(automovel.getMarcaVeiculo());
                veiculo.setModeloVeiculo(automovel.getModeloVeiculo());
                veiculo.setObservacao(automovel.getObservacao());
                veiculo.setOpcionais(automovel.getOpcionais());
                veiculo.setTipoVeiculo(automovel.getTipoVeiculo());
            }
        }
    }
    
    public void verificarveiculosDisponiveis(){
        visaoVeiculo = new VisaoVeiculos();
        List<Veiculos> lista = new ArrayList<Veiculos>();
        
        boolean alugado = false;
        for(Veiculos item: listaVeiculos){
            alugado = false;
            for(Locacao locacao: PersistenciaLocacao.listaLocacao){
                if(item.getPlaca().equals(locacao.getVeiculo().getPlaca()) && 
                        locacao.isLocacaoAberta()){
                    alugado = true;
                }
            }
            if(!alugado){
                    lista.add(item);
            }
        }
        
        if(lista.isEmpty()){
            System.out.println("Não há veiculo cadastrado disponivel");
        }else{
            System.out.println("-------------- Veiculos --------------");
            System.out.println();
            for(Veiculos item: lista){
                visaoVeiculo.imprimirVeiculo(item);
                System.out.println();
            }
        }
    }
    
    public void mostrarVeiculosMaisProcurados(){
        persistenciaLocacao = new PersistenciaLocacao();
        for(Veiculos item: listaVeiculos){
            item.setTotalLocacoes(persistenciaLocacao.retornarTotalLocacoes(item));
        }
        
        /*
         * Ordena a lista de veiculo pelo total de locações
         */
        Collections.sort(listaVeiculos, new Comparator(){
            
            /*
             * O método sort da classe Collections ordena uma lista. A forma de ordenar
             * a lista é feita através do método compare
             */
            @Override
            public int compare(Object veiculo1, Object veiculo2){
                Veiculos v1 = (Veiculos) veiculo1;
                Veiculos v2 = (Veiculos) veiculo2;
                
                if(v1.getTotalLocacoes() < v2.getTotalLocacoes()){
                    return -1;
                }
                else if(v1.getTotalLocacoes() > v2.getTotalLocacoes()){
                    return +1;
                }
                else{
                    return 0;
                }
            }
        });
        
        System.out.println("-------------- Veiculos --------------");
        System.out.println();
        
        //imprimo a lista ordenada
        for(Veiculos item: listaVeiculos){
            visaoVeiculo.imprimirVeiculo(item);
            System.out.println("Total de Locacoes: " + item.getTotalLocacoes());
            System.out.println();
        }
        
    }
    
    public void mostrarVeiculosMaisRentaveis(){
        persistenciaLocacao = new PersistenciaLocacao();
        for(Veiculos item: listaVeiculos){
            item.setValorTotalLocacoes(persistenciaLocacao.retornarTotalValor(item));
        }
        
        /*
         * Ordena a lista de veiculo pelo total de locações
         */
        Collections.sort(listaVeiculos, new Comparator(){
            
            /*
             * O método sort da classe Collections ordena uma lista. A forma de ordenar
             * a lista é feita através do método compare
             */
            @Override
            public int compare(Object veiculo1, Object veiculo2){
                Veiculos v1 = (Veiculos) veiculo1;
                Veiculos v2 = (Veiculos) veiculo2;
                
                if(v1.getValorTotalLocacoes() < v2.getValorTotalLocacoes()){
                    return -1;
                }
                else if(v1.getValorTotalLocacoes() > v2.getValorTotalLocacoes()){
                    return +1;
                }
                else{
                    return 0;
                }
            }
        });
        
        System.out.println("-------------- Veiculos --------------");
        System.out.println();
        
        //imprimo a lista ordenada
        for(Veiculos item: listaVeiculos){
            visaoVeiculo.imprimirVeiculo(item);
            System.out.println("Total de Locacoes: " + item.getValorTotalLocacoes());
            System.out.println();
        }
    }
    
    public void mostrarVeiculosDisponiveis(TipoVeiculo tipoVeiculo){
        List<Veiculos> listaVeiculosDoTipo = new ArrayList<Veiculos>();
        boolean achou = false;
        
        for(Veiculos item: listaVeiculos){
            achou = false;
            for(Locacao locacao: PersistenciaLocacao.listaLocacao){
                if(item.getPlaca().equals(locacao.getVeiculo().getPlaca()) &&
                        locacao.isLocacaoAberta() && 
                        locacao.getTipoLocacao().getTipoVeiculo().getTipo().
                        equals(tipoVeiculo.getTipo())){
                    achou = true;
                }
            }
            
            if(!achou){
                listaVeiculosDoTipo.add(item);
            }
        }
        
        System.out.println("-------------- Veiculos --------------");
        System.out.println();
        
        for(Veiculos item: listaVeiculosDoTipo){
            visaoVeiculo.imprimirVeiculo(item);
            System.out.println();
        }
    }
    
}


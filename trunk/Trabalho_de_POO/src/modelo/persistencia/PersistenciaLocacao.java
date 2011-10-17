/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import locarrao.visao.VisaoLocacao;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.TipoVeiculo;
import modelo.dominio.Veiculos;

/**
 *
 * @author User
 */
public class PersistenciaLocacao {
    public static File arquivo;
    public static List<Locacao> listaLocacao;
    PersistenciaTipoLocacao persistenciaTipoLocacao = new PersistenciaTipoLocacao();
    
    
    public PersistenciaLocacao() {
        arquivo = new File("src/arquivos/Locacao.txt");
        listaLocacao = new ArrayList<Locacao>();
        retornarTodasLocacoes();
    }
    
    public static void  retornarTodasLocacoes() {
        
        //verificando existencia do arquivo...
        if(arquivo.exists()){
            FileReader reader = null;
            try {
                reader = new FileReader(arquivo);
                BufferedReader leitor = new BufferedReader(reader);
                /* Leitura do arquivo
                 * linha 0 = taxa
                 * linha 1 = preço por km
                 * linha 2 = Tipo do Veiculo
                 * Essa será a ordem da escrita no arquivo
                 */
                String linha = null;
                int contador = 0;
                
                Locacao locacao = new Locacao();                
                TipoLocacao tipoLocacao = new TipoLocacao();
                TipoVeiculo tipoVeiculo = new TipoVeiculo();
                Motorista motorista = new Motorista();
                Veiculos veiculo = new Veiculos();
                Clientes cliente = new Clientes();
                    
                while((linha = leitor.readLine()) != null) {
                    
                    if(contador == 0){
                        cliente.setCodigo(Integer.parseInt(linha));
                        locacao.setCliente(cliente);
                        contador++;
                    }
                    else if(contador == 1){
                        motorista.setCnh(linha);
                        locacao.setMotorista(motorista);
                        contador++;
                    }
                    else if(contador == 2){
                        veiculo.setPlaca(linha);
                        locacao.setVeiculo(veiculo);
                        contador++;
                    }
                    else if(contador == 3){
                        tipoVeiculo.setTipo(linha);
                        tipoLocacao.setTipoVeiculo(tipoVeiculo);
                        locacao.setTipoLocacao(tipoLocacao);
                        contador++;
                    }
                    else if(contador == 4){
                        locacao.setTipo(linha);
                        contador++;
                    }
                    else if(contador == 5){
                        locacao.setQuilometragemDeSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 6){
                        locacao.setQuilometragemDeEntrada(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 7){
                        locacao.setDataSaida(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 8){
                        locacao.setDataDevolucao(Long.parseLong(linha));
                        contador++;
                    }
                    else if(contador == 9){
                        locacao.setPrevisao(Integer.parseInt(linha));
                        contador++;
                    }
                    else if(contador == 10){
                        locacao.setLocacaoAberta(Boolean.parseBoolean(linha));
                        contador++;
                    }
                    else if(contador == 11){
                        locacao.setValor(Double.parseDouble(linha));
                        listaLocacao.add(locacao);
                        
                        locacao = new Locacao();                
                        tipoLocacao = new TipoLocacao();
                        tipoVeiculo = new TipoVeiculo();
                        motorista = new Motorista();
                        veiculo = new Veiculos();
                        cliente = new Clientes();
                        
                        contador = 0;
                
                    }
                    
                    
                }
                reader.close();
                leitor.close();
            } catch (IOException ex) {
                System.out.println("Erro na leitura/escrita do arquivo");
            } 
        }
        else{
            System.out.println("Arquivo não existe");
        }
        
        
    }
    
    public boolean salvar(Locacao locacao) throws IOException {
        if(arquivo.exists()){
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
                        
            listaLocacao.add(locacao);
            
            for(Locacao tipo: listaLocacao){
                dados.println(tipo.getCliente().getCodigo());
                dados.println(tipo.getMotorista().getCnh());
                dados.println(tipo.getVeiculo().getPlaca());
                dados.println(tipo.getTipoLocacao().getTipoVeiculo().getTipo());
                dados.println(tipo.getTipo());
                dados.println(tipo.getQuilometragemDeSaida());
                dados.println(tipo.getQuilometragemDeEntrada());
                dados.println(tipo.getDataSaida().getTime());
                dados.println(tipo.getDataDevolucao().getTime());
                dados.println(tipo.getPrevisao());
                dados.println(tipo.isLocacaoAberta());
                dados.println(tipo.getValor());
            }
            
            writer.close();
            dados.close();
            return true;
        }
        else{
            System.out.println("Arquvo não encontrado");
            return false;
        }
    
    }
    
    public boolean salvar() throws IOException {
        if(arquivo.exists()){
            
            //Variáveis para escrita no arquivo
            FileWriter writer = new FileWriter(arquivo); 
            PrintWriter dados = new PrintWriter(writer);
            
            for(Locacao tipo: listaLocacao){
                dados.println(tipo.getCliente().getCodigo());
                dados.println(tipo.getMotorista().getCnh());
                dados.println(tipo.getVeiculo().getPlaca());
                dados.println(tipo.getTipoLocacao().getTipoVeiculo().getTipo());
                dados.println(tipo.getTipo());
                dados.println(tipo.getQuilometragemDeSaida());
                dados.println(tipo.getQuilometragemDeEntrada());
                dados.println(tipo.getDataSaida().getTime());
                dados.println(tipo.getDataDevolucao().getTime());
                dados.println(tipo.getPrevisao());
                dados.println(tipo.isLocacaoAberta());
                dados.println(tipo.getValor());
            }
            
            writer.close();
            dados.close();
            return true;
        }
        else{
            System.out.println("Arquvo não encontrado");
            return false;
        }
    
    }
    
    /*
     * No método fechaLocacao é passando o codigo do cliente
     * cnh do motorista e a quilometragem de chegada.
     * Então é feito uma busca na lista buscando as locações com o cliente e o
     * motorista desejado. Com isso é setado os valores para o fechamento da locação.
     * 
     */
    public void fechaLocacao(Clientes cliente, Motorista motorista, 
            long QuilometragemChegada, Locacao tipoDaLocacao){
        
        //busca na lista
        for(Locacao item: listaLocacao){
            if(item.getCliente().getCodigo() == cliente.getCodigo() &&
                    item.getMotorista().getCnh().equals(motorista.getCnh())){
                
                //Inserção dos valores
                item.setDataDevolucao(new GregorianCalendar().getTimeInMillis());
                item.setQuilometragemDeEntrada(QuilometragemChegada);
                
                /*calculo do valor da locação. Se foi escolhida a opção "Por Quilometro"
                 * então é calculado da seguinte forma: (diferença de km) * taxa
                 * Caso a opção seja "Quilometragem livre" é feito o calculo de diarias
                 * então o calculo fica da seguinte forma: (diarias) * taxa
                 */
                double valor = 0;
                if(item.getTipo().equals("Por Quilometro")){
                    valor = calculaValorLocacao(item.getQuilometragemDeSaida(), 
                            QuilometragemChegada, item.getTipoLocacao(),tipoDaLocacao);
                }
                else{
                    valor = calculaValorLocacao(item.getDataSaida(), 
                            item.getDataDevolucao(), 
                            item.getTipoLocacao(),
                            tipoDaLocacao);
                }
                item.setValor(valor);
                item.setLocacaoAberta(false);
            }
        }
        
        //Salvo a lista no arquivo com os novos valores
        try {
            if(this.salvar()){
                System.out.println("salvo com sucesso");
            }
            else{
                System.out.println("erro ao salvar a lista");
            }
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo " + arquivo.getName());
        }
    }
    
    //calcula o valor, caso seja por quilometro
    public double calculaValorLocacao(long valorDeSaida, long valorDeChegada, 
            TipoLocacao tipoLocacao, Locacao locacao){
        
        double valor = 0;
        double taxa = persistenciaTipoLocacao.retornarTaxa(tipoLocacao, locacao);
        double precoPorKm = persistenciaTipoLocacao.retornarPrecoPorKm(tipoLocacao);
        
        valor = ((valorDeChegada - valorDeSaida) * precoPorKm) + taxa;
        return valor;
    }
    
    //calcula o valor, caso seja por quilometragem livre
    public double calculaValorLocacao(Date dataDeSaida, Date dataDeChegada, 
            TipoLocacao tipoLocacao, Locacao locacao){
        
        double valor = 0;
        long diferenca = 0;
        double taxa = persistenciaTipoLocacao.retornarTaxa(tipoLocacao, locacao);
        
        diferenca = diferencaDeDias(dataDeSaida.getTime(), dataDeChegada.getTime());
        valor = diferenca * taxa;
        return valor;
    }
    
    
    
    //calcula o valor, caso seja por quilometragem livre
    public long diferencaDeDias(long dataDeSaida, long dataDeChegada){
        //total de milissegundos em 1 dia
        long dia = 1000 * 60 * 60 * 24;
        
        long resultado = (dataDeChegada - dataDeSaida)/dia;
        
        //caso devolva no mesmo dia, será cobrado 1 diaria
        if(resultado == 0){
            resultado = 1;
        }
        return resultado;
    }
    
    //verifica se o veiculo ja esta alugado
    public boolean verificarVeiculoLocado(Veiculos veiculo){
        boolean locado = false;
        
        for(Locacao item: listaLocacao){
            if(item.getVeiculo().getPlaca().equals(veiculo.getPlaca())){
                locado = true;
            }
        }
        return locado;
    }
    
    //verifica se motorista ja pertence a alguma locação em aberto
    public boolean verifcarMotoristaEmLocacao(Motorista motorista){
        boolean pertence = false;
        
        for(Locacao item: listaLocacao){
            if(item.getMotorista().getCnh().equals(motorista.getCnh())
                    && item.isLocacaoAberta()){
                pertence = true;
            }
        }
        return pertence;
    }
    
    public double retornarLocacoesEmAberto(Date periodoInicial,Date periodoFinal){
        List<Locacao> listaLocacoesAberto = new ArrayList<Locacao>();
        VisaoLocacao visaoLocacao = new VisaoLocacao();
        for(Locacao item: listaLocacao){
            if(item.getDataSaida().getTime()>= periodoInicial.getTime() &&
                    item.getDataSaida().getTime() <= periodoFinal.getTime() && 
                    item.isLocacaoAberta()){
                
                listaLocacoesAberto.add(item);
            }
        }
        
        /*
         * Considerando que todas as locações são por diárias.
         * Sera inserido o valor e depois a soma dos mesmos
         */
        double valor = 0;
        double total = 0;
        Locacao tipodaLocacao = new Locacao();
        tipodaLocacao.setTipo("Por Quilometro");
        for(Locacao item:listaLocacoesAberto){
            
            valor = calculaValorLocacao(item.getDataSaida(), new Date(),
                    item.getTipoLocacao(),tipodaLocacao);
            item.setValor(valor);
            visaoLocacao.imprimirLocacao(item);
            total+= item.getValor();
        }
        
        return total;
    }
    
    public double retornarLocacoesFinalizadas(Date periodoInicial,Date periodoFinal){
        List<Locacao> listaLocacoesAberto = new ArrayList<Locacao>();
        VisaoLocacao visaoLocacao = new VisaoLocacao();
        for(Locacao item: listaLocacao){
            if(item.getDataSaida().getTime()>= periodoInicial.getTime() &&
                    item.getDataSaida().getTime() <= periodoFinal.getTime() && 
                    !item.isLocacaoAberta()){
                
                listaLocacoesAberto.add(item);
            }
        }
        
        /*
         * Considerando que todas as locações são por diárias.
         * Sera inserido o valor e depois a soma dos mesmos
         */
        double total = 0;
        for(Locacao item:listaLocacoesAberto){
            visaoLocacao.imprimirLocacao(item);
            total+= item.getValor();
        }
        
        return total;
    }
    
    public int retornarTotalLocacoes(Veiculos veiculo){
        int total = 0;
        for(Locacao item: listaLocacao){
            if(item.getVeiculo().getPlaca().equals(veiculo.getPlaca())){
                total++;
            }
        }
        return total;
    }
    
    public int retornarTotalValor(Veiculos veiculo){
        int total = 0;
        for(Locacao item: listaLocacao){
            if(item.getVeiculo().getPlaca().equals(veiculo.getPlaca())){
                total+= item.getValor();
            }
        }
        return total;
    }
}
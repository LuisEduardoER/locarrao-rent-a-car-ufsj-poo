package locarrao.visao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.Veiculos;
import modelo.persiste.PersisteCliente;
import modelo.persiste.PersisteLocacao;
import modelo.persiste.PersisteMotorista;
import modelo.persiste.PersisteVeiculos;

public class VisaoLocacao {
    PersisteCliente persistenciaCliente;
    Clientes cliente;
    VisaoClientes visaoClientes;
    
    PersisteMotorista persistenciaMotorista = new PersisteMotorista();
    VisaoMotorista visaoMotorista = new VisaoMotorista();
    Motorista motorista = new Motorista();
    
    PersisteVeiculos persistenciaVeiculos = new PersisteVeiculos();
    Veiculos veiculo = new Veiculos();
    VisaoVeiculos visaoVeiculo = new VisaoVeiculos();
    
    PersisteLocacao persistenciaLocacao = new PersisteLocacao();
            
    
    public void cadastraLocacao(){
        try {
            persistenciaCliente = new PersisteCliente();
            cliente = new Clientes();
            visaoClientes = new VisaoClientes();
    
            Locacao locacao = new Locacao();
            TipoLocacao tipoLocacao = new TipoLocacao();
            
            // digitar os dados
            Scanner entrada = new Scanner(System.in);
            String dado = null;
            
            /* ------------ Cliente ------------ */
            /*
             * Caso o cliente não existir, será dada a opção de cadastrar
             * ou não. 
             * 
             * Caso a opção escolhida seja sim, então será chamado a visaoClientes
             * Caso não, encerra a locação
             */
            
            cliente = new Clientes();
            do{
                System.out.println("Codigo do cliente:");
                dado = entrada.nextLine();
                
                if(dado.isEmpty()){
                    System.out.println("Digitação do codigo é obrigatoria");
                }else{
                    try{
                        cliente.setCodigo(Integer.parseInt(dado));
                    }catch(InputMismatchException ex){
                        System.out.println("Deve ser digitado um numero");
                    }
                    
                }
                
            }while(dado.isEmpty());
            
            try {
                boolean encontrou = persistenciaCliente.pesquisarCliente(cliente.getCodigo());
                
                if(encontrou){
                    locacao.setCliente(cliente);
                }
                else{
                    do{
                    
                        System.out.println("Cliente nao encontrado. "
                                + "Deseja cadastrar esse cliente?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Nao");
                        
                        switch(Integer.parseInt(entrada.nextLine())){
                            case 1:
                                cliente.setCodigo(PersisteCliente.listaClientes.size());
                                visaoClientes.cadastrarClientes();
                                locacao.setCliente(cliente);
                                break;
                                
                            case 2:
                                System.out.println("Cadastro de locação sera encerrado");
                                entrada.nextLine();
                                return;
                                
                                
                            default:
                                System.out.println("Opcao inválida");
                        }
                    } while(Integer.parseInt(entrada.nextLine()) != 1 && 
                            Integer.parseInt(entrada.nextLine()) != 2);
                    
                }
                
            } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo nao encontrado.");
                    entrada.nextLine();
                    return;
            } catch (IOException ex) {
                    System.out.println("Erro na escrita ou leitura do arquivo.");
                    entrada.nextLine();
                    return;
            }
            
             /* ------------------------ Fim Cliente ------------------------*/
            
            
            /* -----------------------   Motorista ------------------------ 
             * Ao digitar a cnh é verificado na lista de locações se a mesma ja pertence
             * a alguma locação em aberto. Caso não pertença o processo segue normalmente.
             * Caso contrário, o processo de locação é encerrado
             * 
             * Se o motorista for o proprio cliente, então apenas sera inserida
             * a sua cnh no arquivo e ele será salvo como um novo motorista
             * 
             * Caso contrario sera necessario digitar a cnh do motorista, caso ela não
             * exista, será dada a opção de cadastrar. Se não for cadastrado, então
             * sairá do cadastro de locação
             */
            motorista = new Motorista();
            boolean encontrou;
            int opcao = 0;
            do{
                System.out.println("Motorista");
                System.out.println();
                System.out.println("Cliente é o motorista?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                
                opcao = Integer.parseInt(entrada.nextLine());
                switch(opcao){
                    case 1:
                        
                        do{
                            System.out.println("Digite a cnh");
                            dado = entrada.nextLine();
                            
                            if(dado.isEmpty()){
                                System.out.println("Digitação da CNH é obrigatoria");
                            }else{
                                motorista.setCnh(dado);
                            }
                        
                        }while(dado.isEmpty());
                        
                        if(!persistenciaLocacao.verifcarMotoristaEmLocacao(motorista)){
                            
                            encontrou = persistenciaMotorista.pesquisarMotorista(motorista);
                            if (!encontrou){
                                persistenciaCliente.retornarCliente(cliente);
                                motorista.setCodigo(PersisteMotorista.listaMotorista.size() + 1);
                                motorista.setNome(cliente.getNome());
                                motorista.setCpf(cliente.getCpf());
                                motorista.setTefefone(cliente.getTefefone());
                                motorista.setEndereco(cliente.getEndereco());

                                boolean salvaMotorista = persistenciaMotorista.salvar(motorista);
                                if(salvaMotorista){
                                    locacao.setMotorista(motorista);
                                }
                                else{
                                    System.out.println("erro ao salvar novo motorista");
                                    entrada.nextLine();
                                    return;
                                }
                            }
                            else{
                                locacao.setMotorista(motorista);
                            }
                        }
                        else{
                            System.out.println("Motorista ja pertence a alguma locação em aberto");
                            entrada.nextLine();
                            return;
                        }
                        
                        break;
                    
                    case 2:
                        do{
                            System.out.println("Digite a cnh");
                            dado = entrada.nextLine();
                            
                            if(dado.isEmpty()){
                                System.out.println("Digitação da CNH é obrigatoria");
                            }else{
                                motorista.setCnh(dado);
                            }
                        
                        }while(dado.isEmpty());
                        
                        
                        try {
                            encontrou = persistenciaMotorista.pesquisarMotorista(motorista);
                            if(encontrou){
                                locacao.setMotorista(motorista);
                                
                            }
                            else{
                                do{
                                    System.out.println("Motorista nao encontrado."
                                        + " Deseja cadastrar?");
                                    System.out.println("1 - Sim");
                                    System.out.println("2 - Nao");
                                    
                                    switch(Integer.parseInt(entrada.nextLine())){
                                        case 1:
                                            visaoMotorista.cadastrarMotorista();
                                            locacao.setMotorista(VisaoMotorista.motorista);
                                            break;
                                        
                                        case 2:
                                            System.out.println("Cadastro da locação sera "
                                                    + "encerrrada");
                                            entrada.nextLine();
                                            return;
                                            
                                        default:
                                            System.out.println("Opcao inválida");
                                    }
                                
                                }while(Integer.parseInt(entrada.nextLine()) != 1 
                                        && Integer.parseInt(entrada.nextLine()) != 2);
                            }

                        } catch (FileNotFoundException ex) {
                                System.out.println("Arquivo nao encontrado.");
                                entrada.nextLine();
                                return;
                        } catch (IOException ex) {
                                System.out.println("Erro na escrita ou leitura do arquivo.");
                                entrada.nextLine();
                                return;
                        }
                        
                        break;
                    
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
                
            }while((opcao != 1) && (opcao != 2));
            
             /* ------------------ Fim Motorista ------------------ */
            
            /* ------------------ Veiculo ------------------ */
            
            /*
             * Ao digitar a placa do veiculo é verificado se o veículo existe.
             * Caso ele exista, é feito uma busca nas locações para ver se ele 
             * ja está locado ou não. Se ele existir e não estiver locado, então
             * a operação de locação é feita normalmente
             */
            do{
                System.out.println("Placa do veiculo");
                dado = entrada.nextLine();
                
                if(dado.isEmpty()){
                    System.out.println("Digitação da placa é obrigatoria");
                }else{
                    veiculo.setPlaca(dado);
                }
            }while(dado.isEmpty());
            
            boolean buscaVeiculo = persistenciaVeiculos.pesquisarVeiculo(veiculo);
            if(buscaVeiculo){
                if(persistenciaLocacao.verificarVeiculoLocado(veiculo)){
                    System.out.println("Veiculo ja está alugado!");
                    entrada.nextLine();
                    return;
                }
                else{
                    persistenciaVeiculos.retornarVeiculo(veiculo);
                    tipoLocacao.setTipoVeiculo(veiculo.getTipoVeiculo());
                    locacao.setVeiculo(veiculo);
                    locacao.setTipoLocacao(tipoLocacao);
                }
            }
            else{
                do{
                    System.out.println("Veiculo não encontrado. "
                        + "Deseja cadastra-lo?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Nao");
                    
                    switch(Integer.parseInt(entrada.nextLine())){
                        case 1:
                            visaoVeiculo.cadastraVeiculos();
                            locacao.setVeiculo(VisaoVeiculos.veiculos);
                            break;
                       
                        case 2:
                            System.out.println("O cadastro da locação sera encerrado");
                            entrada.nextLine();
                            return;
                            
                        default:
                            System.out.println("Opcao invalida");
                            
                    }
                    
                }while(Integer.parseInt(entrada.nextLine()) != 1 && 
                        Integer.parseInt(entrada.nextLine()) != 2);
                
            }
            /* ------------------ Fim Veiculo ------------------ */
            
            //Dados Tipo da Locacao
            VisaoTipoLocacao visao = new VisaoTipoLocacao();
            locacao.setTipo(visao.retornaTipoDeLocacao());
            
            //Dados da Previsao
            System.out.println("Digite a previsao de dias:");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                locacao.setPrevisao(0);
            }else{
                try{
                    locacao.setPrevisao(Integer.parseInt(dado));
                }catch(InputMismatchException ex){
                    System.out.println("O campo previsao é do tipo numérico e inteiro");
                    entrada.nextLine();
                    return;
                }
            }
            
            //Dados da quilometragem
            do{
                System.out.println("Digite a quilometragem de saida:");
                dado = entrada.nextLine();
                
                if(dado.isEmpty()){
                    System.out.println("Digitação da quilometragem de saida"
                            + " é obrigatoria.");
                }else{
                    try{
                        locacao.setQuilometragemDeSaida(Long.parseLong(dado));
                    }catch(InputMismatchException ex){
                        System.out.println("O campo quilometragem de "
                                + "saída é do tipo numérico e inteiro");
                        entrada.nextLine();
                        return;
                    }
                }
            
            }while(dado.isEmpty());
            
            locacao.setQuilometragemDeEntrada(0); // Não é conhecida a quilometragem de chegada
            
            //Dados da data da locaçao
            locacao.setDataSaida(new GregorianCalendar().getTimeInMillis());
            locacao.setDataDevolucao(0); //Não é conhecida a data de devoluçao
            
            //valor da locacao
            locacao.setValor(0); // Valor será calculado depois da finalizaçao
            
            //Inicio a locacao com true. No fechamento será passado pra false
            locacao.setLocacaoAberta(true);
            
            
            /* Salvar a locacao */
            boolean operacao = persistenciaLocacao.salvar(locacao);
            
            if(operacao){
                System.out.println("salvo com sucesso");
            }
            else{
                System.out.println("erro ao salvar a locacao");
            }
        } catch (IOException ex) {
            System.out.println("Erro na leitura ou escrita do arquivo.");
        }
    }
    
    public void alterarLocacao(){
        
    }
    
    public void pesquisarLocacao(){
        
    }
    
    public void fecharLocacao(){
        persistenciaLocacao = new PersisteLocacao();
        Locacao locacao = new Locacao();
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        
        List<Locacao> listaLocacaoCliente = new ArrayList<Locacao>();
        
        cliente = new Clientes();
        motorista = new Motorista();
        
        
        do{
            System.out.println("Codigo do Cliente");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação do codigo do cliente é obrigatoria");
            }else{
                try{
                    cliente.setCodigo(Integer.parseInt(dado));
                }catch(InputMismatchException ex){
                    System.out.println("O campo codigo é numérico e inteiro");
                }
                
            }
        }while(dado.isEmpty());
        
        //busco todas as locações do cliente
        boolean achou = false;
        for(Locacao item: PersisteLocacao.listaLocacao){
            if((item.getCliente().getCodigo() == cliente.getCodigo()) &&
                    item.isLocacaoAberta()){
                
                achou = true;
                listaLocacaoCliente.add(item);
            }
        }
        
        if(!achou){
            System.out.println("Não existem locações com o cliente desejado");
            entrada.nextLine();
        }
        else{
            
            System.out.println("Selecione a locacao que deseja fechar");
            for(int i=0; i< listaLocacaoCliente.size();i++){
                System.out.println("--------------- " + (i+1) + " --------------- ");
                System.out.println("Codigo do Motorista : " + 
                        listaLocacaoCliente.get(i).getCliente().getCodigo());
                
                System.out.println("CNH do Motorista: " + 
                        listaLocacaoCliente.get(i).getMotorista().getCnh());
                
                System.out.println("Placa do Veiculo : " + 
                        listaLocacaoCliente.get(i).getVeiculo().getPlaca());
                
                System.out.println("Tipo do Veiculo : " + 
                        listaLocacaoCliente.get(i).getTipoLocacao().getTipoVeiculo().
                        getTipo());
                
                System.out.println("Tipo da Locacao : " 
                        + listaLocacaoCliente.get(i).getTipo());
                
                System.out.println("Km de Saida : " 
                        + listaLocacaoCliente.get(i).getQuilometragemDeSaida());
                
                System.out.println("Km de Chegada : - ");
                
                System.out.println("Data de Saida : " 
                        + listaLocacaoCliente.get(i).getDataSaida());
                
                System.out.println("Data de Chegada : - ");
                
                System.out.println("Previsao : " 
                        + listaLocacaoCliente.get(i).getPrevisao());
                
                System.out.println("Locaca aberta? Sim ");
                
                System.out.println("Valor : " 
                        + listaLocacaoCliente.get(i).getValor());
                
                System.out.println();
                System.out.println();
            }
            
            int resposta = 0;
            
            do{
                resposta = Integer.parseInt(entrada.nextLine());
                if(resposta < 1 || resposta > listaLocacaoCliente.size()){
                    System.out.println("Opcao Invalida");
                }
                else{
                    System.out.println("Quilometragem de chegada");
                    motorista.setCnh(listaLocacaoCliente.get(resposta-1).
                            getMotorista().getCnh());
                    locacao.setTipo(PersisteLocacao.listaLocacao.
                            get(resposta - 1).getTipo());
                    
                    long kmDeSaida = PersisteLocacao.listaLocacao.get(resposta-1).
                            getQuilometragemDeSaida();
                    
                    long kmDeChegada = 0;
                    
                    do{
                        System.out.println("Km de saida: " + kmDeSaida);
                        kmDeChegada = Long.parseLong(entrada.nextLine());
                        if((kmDeChegada - kmDeSaida) < 0){
                            System.out.println("Erro: Quilometragem de Chegada deve ser maior que "
                                    + "a quiometragem de saida");
                        }
                    }while((kmDeChegada - kmDeSaida) < 0);
                    persistenciaLocacao.fechaLocacao(cliente,motorista, kmDeChegada,locacao);
                }
            }while((resposta < 1) || resposta > listaLocacaoCliente.size());
            
        }
        
    }
    
    public void excluirLocacao(){
        
    }
    
    public void locacoesEmAberto(){
        DateFormat formatoData = DateFormat.getDateInstance();
        Date dataInicial = null,dataFinal = null;
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Data Inicial (dd/mm/aaaa)");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da Data inicial é obrigatoria");
            }else{
                try {
                    dataInicial = formatoData.parse(dado);
                } catch (ParseException ex) {
                    System.out.println("Errou ao converter a data");
                }
            }
        }while(dado.isEmpty());
        
        do{
            System.out.println("Data Final (dd/mm/aaaa)");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da Data final é obrigatoria");
            }else{
                try {
                    /*
                     * adiciono 1 dia na data final para a pesquisa pegar as locações
                     * com data de saida igual a data final digitada
                     */
                    long dia = 1000 * 60 * 60 * 24;
                    long dataTemp = formatoData.parse(dado).getTime() + dia;
                    dataFinal = new Date(dataTemp);
                } catch (ParseException ex) {
                    System.out.println("Errou ao converter a data");
                }
            }
        }while(dado.isEmpty());
        
        double total = persistenciaLocacao.retornarLocacoesEmAberto(dataInicial, dataFinal);
        
        System.out.println();
        System.out.println("Total previsto: " + total);
        
        entrada.nextLine();
        
    }
    
    public void locacoesFinalizadas(){
        DateFormat formatoData = DateFormat.getDateInstance();
        Date dataInicial = null,dataFinal = null;
        Scanner entrada = new Scanner(System.in);
        String dado = null;
        do{
            System.out.println("Data Inicial (dd/mm/aaaa)");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da Data inicial é obrigatoria");
            }else{
                try {
                    dataInicial = formatoData.parse(dado);
                } catch (ParseException ex) {
                    System.out.println("Errou ao converter a data");
                }
            }
        }while(dado.isEmpty());
        
        do{
            System.out.println("Data Final (dd/mm/aaaa)");
            dado = entrada.nextLine();
            
            if(dado.isEmpty()){
                System.out.println("Digitação da Data final é obrigatoria");
            }else{
                try {
                    /*
                     * adiciono 1 dia na data final para a pesquisa pegar as locações
                     * com data de saida igual a data final digitada
                     */
                    long dia = 1000 * 60 * 60 * 24;
                    long dataTemp = formatoData.parse(dado).getTime() + dia;
                    dataFinal = new Date(dataTemp);
                } catch (ParseException ex) {
                    System.out.println("Errou ao converter a data");
                }
            }
        }while(dado.isEmpty());
        
        double total = persistenciaLocacao.retornarLocacoesFinalizadas(dataInicial, dataFinal);
        
        System.out.println();
        System.out.println("Total: " + total);
        entrada.nextLine();
        
    }
    
    public void imprimirLocacao(Locacao locacao){
        System.out.println("Codigo do Cliente: " + locacao.getCliente().getCodigo());
        System.out.println("CNH do motorista: " + locacao.getMotorista().getCnh());
        System.out.println("Placa do veiculo: " + locacao.getVeiculo().getPlaca());
        System.out.println("Tipo do veiculo: " + locacao.getTipoLocacao().getTipoVeiculo().
                getTipo() );
        System.out.println("Tipo da locacao: " + locacao.getTipo());
        System.out.println("Km de saida: " +locacao.getQuilometragemDeSaida());
        System.out.println("Km de chegada: " + locacao.getQuilometragemDeEntrada());
        System.out.println("Data de saida: " + locacao.getDataSaida());
        System.out.println("Data de devolucao: " + locacao.getDataDevolucao());
        System.out.println("Previsao: " + locacao.getPrevisao());
        System.out.println("Locacao aberta? " + locacao.isLocacaoAberta());
        System.out.println("Valor: " + locacao.getValor());
    }
    
}

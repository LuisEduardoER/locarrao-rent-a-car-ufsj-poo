package modelo.dominio;

import java.util.Date;

public class Locacao {
 
    private long quilometragemDeSaida;

    private long quilometragemDeEntrada;

    private String tipo;

    private double valor;

    private Date dataSaida;

    private Date dataDevolucao;

    private int previsao;

    private boolean locacaoAberta;

    private TipoLocacao tipoLocacao;

    private Clientes cliente;

    private Motorista motorista;

    private Veiculos veiculo;

    
    public long getQuilometragemDeSaida() {
        return quilometragemDeSaida;
    }

    public void setQuilometragemDeSaida(long quilometragemDeSaida) {
        this.quilometragemDeSaida = quilometragemDeSaida;
    }

    public long getQuilometragemDeEntrada() {
        return quilometragemDeEntrada;
    }

    public void setQuilometragemDeEntrada(long quilometragemDeEntrada) {
        this.quilometragemDeEntrada = quilometragemDeEntrada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(long dataSaida) {
        Date data = new Date(dataSaida);
        this.dataSaida = data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(long dataDevolucao) {
        Date data = new Date(dataDevolucao);
        this.dataDevolucao = data;
    }

    public int getPrevisao() {
        return previsao;
    }

    public void setPrevisao(int previsao) {
        this.previsao = previsao;
    }

    public boolean isLocacaoAberta() {
        return locacaoAberta;
    }

    public void setLocacaoAberta(boolean locacaoAberta) {
        this.locacaoAberta = locacaoAberta;
    }

    public TipoLocacao getTipoLocacao() {
        return tipoLocacao;
    }

    public void setTipoLocacao(TipoLocacao tipoLocacao) {
        this.tipoLocacao = tipoLocacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

	 
}
 

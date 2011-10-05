package modelo.dominio;

import java.util.Calendar;
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

    /**
     * @return the quilometragemDeSaida
     */
    public long getQuilometragemDeSaida() {
        return quilometragemDeSaida;
    }

    /**
     * @param quilometragemDeSaida the quilometragemDeSaida to set
     */
    public void setQuilometragemDeSaida(long quilometragemDeSaida) {
        this.quilometragemDeSaida = quilometragemDeSaida;
    }

    /**
     * @return the quilometragemDeEntrada
     */
    public long getQuilometragemDeEntrada() {
        return quilometragemDeEntrada;
    }

    /**
     * @param quilometragemDeEntrada the quilometragemDeEntrada to set
     */
    public void setQuilometragemDeEntrada(long quilometragemDeEntrada) {
        this.quilometragemDeEntrada = quilometragemDeEntrada;
    }

    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(long dataSaida) {
        Date data = new Date(dataSaida);
        this.dataSaida = data;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(long dataDevolucao) {
        Date data = new Date(dataDevolucao);
        this.dataDevolucao = data;
    }

    /**
     * @return the previsao
     */
    public int getPrevisao() {
        return previsao;
    }

    /**
     * @param previsao the previsao to set
     */
    public void setPrevisao(int previsao) {
        this.previsao = previsao;
    }

    /**
     * @return the locacaoAberta
     */
    public boolean isLocacaoAberta() {
        return locacaoAberta;
    }

    /**
     * @param locacaoAberta the locacaoAberta to set
     */
    public void setLocacaoAberta(boolean locacaoAberta) {
        this.locacaoAberta = locacaoAberta;
    }

    /**
     * @return the tipoLocacao
     */
    public TipoLocacao getTipoLocacao() {
        return tipoLocacao;
    }

    /**
     * @param tipoLocacao the tipoLocacao to set
     */
    public void setTipoLocacao(TipoLocacao tipoLocacao) {
        this.tipoLocacao = tipoLocacao;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
	 
}
 

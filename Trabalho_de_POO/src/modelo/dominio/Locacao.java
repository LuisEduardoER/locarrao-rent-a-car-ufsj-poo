package modelo.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Locacao")
public class Locacao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo", nullable = false)
    private Long id;
    
    @Column(name = "KmSaida" )
    private long quilometragemDeSaida;
    
    @Column(name = "KmChegada")
    private long quilometragemDeEntrada;
    
    @Column(length=45)
    private String tipo;
    
    @Column(name = "Valor")
    private double valor;
    
    @Column(name = "DataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    
    @Column(name = "DataChegada")
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;

    @Column
    private int previsao;
    
    @Column
    private boolean locacaoAberta;

    @OneToOne
    @JoinColumn(name = "TipoLocacao")
    private TipoLocacao tipoLocacao;
    
    @OneToOne
    @JoinColumn(name = "IdCliente")
    private Clientes cliente;

    @OneToOne
    @JoinColumn(name = "IdMotorista")
    private Motorista motorista;

    @OneToOne
    @JoinColumn(name = "IdVeiculo")
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
    
    //implementação do toString() para imprimir as locacoes
    @Override
    public String toString(){
        return "Codigo do Cliente: " + this.getCliente().getCodigo() + "\n" +
                "CNH do Motorista : " + this.getMotorista().getCnh() + "\n" +
                "Placa do Veiculo : " + this.getVeiculo().getPlaca() + "\n" +
                "Tipo do Veiculo : " + this.getVeiculo().getTipoVeiculo().getTipo() + "\n" +
                "Tipo da Locacao : " + this.getTipo() + "\n" +
                "Km de Saida : " + this.getQuilometragemDeSaida() + "\n" +
                "Km de Saida : " + this.getQuilometragemDeEntrada() + "\n" +
                "Data de Saida : " + this.getDataSaida() + "\n" +
                "Data de Chegada : " + this.getDataSaida() + "\n" +
                "Previsa de dias : " + this.getPrevisao() + "\n" +
                "Valor da locacao: " + this.getDataSaida() + "\n";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	 
}
 

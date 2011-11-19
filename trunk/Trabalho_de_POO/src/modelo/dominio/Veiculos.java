package modelo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Veiculos")
public class Veiculos implements Serializable {
    @Id
    @Column
    private Long id;
    
    @Column(length=7)
    private String placa;
    
    @Column(length=20)
    private String cor;
    
    @Column
    private int ano;

    @Column(length=100)
    private String opcionais;
    
    @Column(length=100)
    private String observacao;
    
    @OneToOne
    @JoinColumn(name="idTipoVeiculo")
    private TipoVeiculo tipoVeiculo;
    
    @OneToOne
    @JoinColumn(name="idMarca")
    private MarcaVeiculo marcaVeiculo;

    @OneToOne
    @JoinColumn(name="idModelo")
    private ModeloVeiculo modeloVeiculo;
    
    
    private int totalLocacoes;
    
    private double valorTotalLocacoes;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public MarcaVeiculo getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(MarcaVeiculo marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getTotalLocacoes() {
        return totalLocacoes;
    }

    public void setTotalLocacoes(int totalLocacoes) {
        this.totalLocacoes = totalLocacoes;
    }

    public double getValorTotalLocacoes() {
        return valorTotalLocacoes;
    }

    public void setValorTotalLocacoes(double valorTotalLocacoes) {
        this.valorTotalLocacoes = valorTotalLocacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
package modelo.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Veiculos")
public class Veiculos implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_VEICULO",nullable=false)
    private Long id;
    
    @Column(length=7)
    private String placa;
    
    @Column(length=20)
    private String cor;
    
    @Column
    private int ano;

    @Column
    private List<String> opcionais;
    
    @Column(length=100)
    private String observacao;
    
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ID_TIPO_VEICULO")
    private TipoVeiculo tipoVeiculo;
    
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ID_MARCA")
    private MarcaVeiculo marcaVeiculo;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ID_MODELO")
    private ModeloVeiculo modeloVeiculo;
    
    @Column(name="TOTAL_LOCACOES")
    private int totalLocacoes;
    
    @Column(name="VALOR_TOTAL_LOCACOES")
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

    /**
     * @return the opcionais
     */
    public List<String> getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }
}
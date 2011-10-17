package modelo.dominio;

public class Veiculos {
 
    private String placa;

    private String cor;

    private int ano;

    private String opcionais;

    private String observacao;

    private TipoVeiculo tipoVeiculo;

    private MarcaVeiculo marcaVeiculo;

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
}
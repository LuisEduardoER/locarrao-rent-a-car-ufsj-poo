package modelo.dominio;

import java.util.ArrayList;

public class Veiculos {
 
        private String placa;
	 
	private String cor;
	 
	private int ano;
	 
	private String opcionais;
	 
	private String observacao;
	 
	private TipoVeiculo tipoVeiculo;

        private MarcaVeiculo marcaVeiculo;
        
        private ModeloVeiculo modeloVeiculo;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the opcionais
     */
    public String getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the tipoVeiculo
     */
    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the marcaVeiculo
     */
    public MarcaVeiculo getMarcaVeiculo() {
        return marcaVeiculo;
    }

    /**
     * @param marcaVeiculo the marcaVeiculo to set
     */
    public void setMarcaVeiculo(MarcaVeiculo marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    /**
     * @return the modeloVeiculo
     */
    public ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    /**
     * @param modeloVeiculo the modeloVeiculo to set
     */
    public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
}
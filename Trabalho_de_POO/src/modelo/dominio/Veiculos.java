package modelo.dominio;

import java.util.ArrayList;

public class Veiculos {
 
        private String placa;
	 
	private String cor;
	 
	private int ano;
	 
	private ArrayList opcionais;
	 
	private String observacao;
	 
	private TipoVeiculo[] tipoVeiculo;

        private MarcaVeiculo marcaVeiculo;
        
        private ModeloVeiculo modeloVeiculo;
    /**
     * @return the placa
     */
    protected String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    protected void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cor
     */
    protected String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    protected void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    protected int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    protected void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the opcionais
     */
    protected ArrayList getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    protected void setOpcionais(ArrayList opcionais) {
        this.opcionais = opcionais;
    }

    /**
     * @return the observacao
     */
    protected String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    protected void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the tipoVeiculo
     */
    protected TipoVeiculo[] getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    protected void setTipoVeiculo(TipoVeiculo[] tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the marcaVeiculo
     */
    protected MarcaVeiculo getMarcaVeiculo() {
        return marcaVeiculo;
    }

    /**
     * @param marcaVeiculo the marcaVeiculo to set
     */
    protected void setMarcaVeiculo(MarcaVeiculo marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    /**
     * @return the modeloVeiculo
     */
    protected ModeloVeiculo getModeloVeiculo() {
        return modeloVeiculo;
    }

    /**
     * @param modeloVeiculo the modeloVeiculo to set
     */
    protected void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
	 
}
 

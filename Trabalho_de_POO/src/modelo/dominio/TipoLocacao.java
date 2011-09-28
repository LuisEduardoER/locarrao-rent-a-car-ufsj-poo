package modelo.dominio;

public class TipoLocacao {
 
    private double taxa;

    private double precoPorQuilometro;

    private String nomeTipo;

    private TipoVeiculo tipoVeiculo;

    
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getPrecoPorQuilometro() {
        return precoPorQuilometro;
    }

    public void setPrecoPorQuilometro(double precoPorQuilometro) {
        this.precoPorQuilometro = precoPorQuilometro;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    	 
}
 

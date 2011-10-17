package modelo.dominio;

public class TipoLocacao {
 
    private double taxaDiarias;
    
    private double taxaPorKm;

    private double precoPorQuilometro;

    private TipoVeiculo tipoVeiculo;

    
    public double getPrecoPorQuilometro() {
        return precoPorQuilometro;
    }

    public void setPrecoPorQuilometro(double precoPorQuilometro) {
        this.precoPorQuilometro = precoPorQuilometro;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getTaxaDiarias() {
        return taxaDiarias;
    }

    public void setTaxaDiarias(double taxaDiarias) {
        this.taxaDiarias = taxaDiarias;
    }

    public double getTaxaPorKm() {
        return taxaPorKm;
    }

    public void setTaxaPorKm(double taxaPorKm) {
        this.taxaPorKm = taxaPorKm;
    }
    	 
}
 

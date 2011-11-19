package modelo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tipoLocacao")
public class TipoLocacao implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="idTipoLocacao", insertable=true, updatable=false)
    private Long id;
    
    @Column
    private double taxaDiarias;
    
    @Column
    private double taxaPorKm;

    @Column
    private double precoPorQuilometro;

    @OneToOne
    @JoinColumn(name="idTipoVeiculo")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    	 
}
 

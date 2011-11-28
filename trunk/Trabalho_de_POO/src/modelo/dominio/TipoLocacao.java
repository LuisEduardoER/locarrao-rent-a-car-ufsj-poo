package modelo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_LOCACAO")
public class TipoLocacao implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_TIPO_LOCACAO",nullable=false)
    private Long id;
    
    @Column(name = "TAXA_DIARIAS",nullable=false)
    private double taxaDiarias;
    
    @Column(name = "TAXA_POR_KM",nullable=false)
    private double taxaPorKm;

    @Column(name="PRECO_POR_KM",nullable=false)
    private double precoPorQuilometro;

    @OneToOne
    @JoinColumn(name="ID_TIPO_VEICULO",nullable=false)
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
 

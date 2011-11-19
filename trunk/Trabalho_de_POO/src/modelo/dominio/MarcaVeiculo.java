package modelo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MarcaVeiculo")
public class MarcaVeiculo implements Serializable {
    
    @Column
    private String marca;
    
    @Id
    @GeneratedValue
    @Column(name="idMarca", insertable=true, updatable=false)
    private Long id;

    public MarcaVeiculo(){
        this.marca = "";
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
	 
}
 

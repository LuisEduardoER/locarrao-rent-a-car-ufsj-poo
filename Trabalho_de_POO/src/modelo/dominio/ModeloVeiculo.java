package modelo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ModeloVeiculo")
public class ModeloVeiculo implements Serializable {
    
    @Column
    private String modelo;
    
    @Id
    @GeneratedValue
    @Column(name="idModelo", insertable=true,updatable=false)
    private Long id;
    
    
    public ModeloVeiculo(){
        this.modelo = "";
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

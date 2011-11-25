package modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="MOTORISTA")
@PrimaryKeyJoinColumn(name = "ID_MOTORISTA")
public class Motorista extends Pessoa {
    
    @Column(length=10, nullable=false)
    private String cnh;

    
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
   
}
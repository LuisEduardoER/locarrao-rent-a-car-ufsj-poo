package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
@PrimaryKeyJoinColumn(name="ID_CLIENTE")
public class Clientes extends Pessoa {
    
}
        
	  

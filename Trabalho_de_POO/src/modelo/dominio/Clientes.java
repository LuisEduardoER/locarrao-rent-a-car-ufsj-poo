package modelo.dominio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ID_CLIENTE")
public class Clientes extends Pessoa {
    
}
        
	  

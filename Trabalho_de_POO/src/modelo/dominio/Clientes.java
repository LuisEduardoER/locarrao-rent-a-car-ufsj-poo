package modelo.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Clientes")
public class Clientes extends Pessoa {
    
}
        
	  

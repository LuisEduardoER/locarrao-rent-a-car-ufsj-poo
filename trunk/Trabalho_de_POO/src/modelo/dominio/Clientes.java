package modelo.dominio;

/*import modelo.dominio.Endereco;
import modelo.dominio.Motorista;
import modelo.dominio.Pessoa;*/

public class Clientes extends Pessoa {
 
	private Endereco endereco;

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }
}
        
	  

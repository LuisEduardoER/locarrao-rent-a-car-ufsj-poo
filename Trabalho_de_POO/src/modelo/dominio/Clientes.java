package modelo.dominio;

/*import modelo.dominio.Endereco;
import modelo.dominio.Motorista;
import modelo.dominio.Pessoa;*/

public class Clientes extends Pessoa {
 
	private Endereco endereco;
	private Motorista motorista;
        public Clientes(Endereco endereco,Motorista motorista){
            this.endereco=endereco;
            this.motorista=motorista;
        }
        
	 
}
 

package modelo.dominio;

public class Funcionarios extends Pessoa {
 
	private String cargo;
	 
	private String usuario;
	 
	protected String senha;
        
        public Funcionarios (String cargo,String usuario,String senha){
            this.cargo=cargo;
            this.usuario=usuario;
            this.senha=senha;
        }
	 
}
 

package modelo.dominio;

public class Funcionarios extends Pessoa {
 
	private String cargo;
	 
	private String usuario;
	 
	private String senha;
        
        private Endereco endereco;

    /**
     * @return the cargo
     */
    protected String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the usuario
     */
    protected String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    protected void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * @return the endereco
     */
    protected Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @param senha the senha to set
     */
    protected void setSenha(String senha) {
        this.senha = senha;
    }
	 
}
 

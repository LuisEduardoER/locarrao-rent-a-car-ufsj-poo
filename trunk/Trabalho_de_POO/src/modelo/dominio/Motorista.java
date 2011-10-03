package modelo.dominio;

public class Motorista extends Pessoa {
 
	private long cnh;
        private Endereco endereco;

    /**
     * @return the cnh
     */
    protected long getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    protected void setCnh(long cnh) {
        this.cnh = cnh;
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
	 
}
 

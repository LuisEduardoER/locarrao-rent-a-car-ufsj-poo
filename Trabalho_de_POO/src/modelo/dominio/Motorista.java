package modelo.dominio;

public class Motorista extends Pessoa {
 
	private long cnh;
        private Endereco endereco;

    /**
     * @return the cnh
     */
    public long getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
 

package modelo.dominio;

public class Pessoa {
 
    private int codigo;

    private String nome;

    private String cpf;

    private String tefefone;
    
    private Endereco endereco;
    
    //construtor para iniciar as variaves
    public Pessoa(){
        this.codigo = 0;
        this.cpf = "";
        this.nome = "";
        this.tefefone = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTefefone() {
        return tefefone;
    }

    public void setTefefone(String tefefone) {
        this.tefefone = tefefone;
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
 

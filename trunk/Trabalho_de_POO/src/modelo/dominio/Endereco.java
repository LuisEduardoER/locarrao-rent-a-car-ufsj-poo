package modelo.dominio;

public class Endereco {
 
	private String rua;
        
	private int numero;
        
	private char complemento;
        
	private String bairro;
	 
	private String cidade;
	 
	private String uf;
	 
	private String cep;
        
        public Endereco(String rua,int numero,char complemento,String bairro,String cidade,String uf,String cep){
            this.rua=rua;
            this.numero=numero;
            this.complemento=complemento;
            this.bairro=bairro;
            this.cidade=cidade;
            this.uf=uf;
            this.cep=cep;
        }
	 
}
 

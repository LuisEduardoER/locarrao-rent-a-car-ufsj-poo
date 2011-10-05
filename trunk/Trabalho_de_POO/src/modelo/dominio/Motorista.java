package modelo.dominio;

public class Motorista extends Pessoa {
 
    private String cnh;

    public Motorista(){
        this.cnh = "";
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
   
}
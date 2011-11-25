package modelo.dominio;

public class MascaraDeEntrada {
    /*
     * Quando o tamanho da string for 3 e 7 vai inserir "."
     * Quando for 11 vai inserir "-"
     * Ficará desse jeito
     * 000.000.000-00
     */
    public String mascararCpf(String cpf){
        if(cpf.length() == 3 || cpf.length() == 7){
            cpf = cpf+".";
        }else if( cpf.length() == 11){
            cpf = cpf+"-";
        }
        
        return cpf;
    }
    /*
    
    public String mascararTelefone(String telefone){
        
    }
    
     * 
     */
}

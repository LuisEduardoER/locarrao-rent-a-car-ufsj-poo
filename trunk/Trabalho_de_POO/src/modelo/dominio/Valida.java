/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

/**
 *
 * @author Thais
 */
public class Valida {
    
    /**
     * Valida o CPF digitado
     * @param CPF
     * @return true - Valido
     */
    public  boolean validarCPF(String CPF) {
        if(CPF.length() !=  11){
            return false;
        }
        int digitoVerificador1 = 0;
        int digitoVerificador2 = 0;
        int resto = 0;

        StringBuilder resultado = new StringBuilder();

        //pega os digitos verificadores 
        String digitoVerificadorCPF = CPF.substring((CPF.length() - 2),CPF.length());

        //primeiro calculo dos dois digitos verificadoresa
        digitoVerificador1=0;
        digitoVerificador2=0;
        for(int i = 1; i < (CPF.length() - 1); i++) {
             digitoVerificador1 += (11 - i) * Integer.valueOf(CPF.substring((i - 1), i));
             digitoVerificador2 += (12 - i) * Integer.valueOf(CPF.substring((i - 1), i));
        }

         //acaba de calcular o primeiro digito verificador
         resto = digitoVerificador1 % 11;
         if (resto < 2) {
             digitoVerificador2 += 2;
             resultado.append(2);
         }else {
              digitoVerificador2 += 2 * (11 - resto);
              resultado.append((11 - resto));
         }

         //acaba de calcular o segundo digito verificador
         resto = digitoVerificador2 % 11;
         if (resto < 2) {
                resultado.append(0);
         }else {
              resultado.append((11 - resto));
         }

         return (resultado.toString().equals(digitoVerificadorCPF));

    }
    
    /**
     * Valida a CNH
     * @param cnh
     * @return true - Valida
     */
    public boolean validarCnh( String cnh){
         boolean resposta = true;
         if(cnh.length() == 10){
             for(int i=0; i< cnh.length(); i++){
                 if(Character.isLetter(cnh.charAt(i))){
                     resposta = false;
                     break;
                 }
             }
         }else{
             resposta = false;
         }
         return resposta;
    }
    
    /**
     * Valida o CEP
     * @param cep
     * @return 
     */
    public boolean validarCEP(String cep){
        boolean resposta = true;
        if(cep.length() == 8){
            for(int i=0; i< cep.length(); i++){
                if(Character.isLetter(cep.charAt(i))){
                    resposta = false;
                    break;
                }
            }
        }else{
             resposta = false;
        }
        return resposta;
        
    }
    
    /**
     * Valida o telefone
     * @param telefone
     * @return 
     */
    public boolean validarTelefone( String  telefone){      
        boolean resposta = true;
        if(telefone.length() == 10){
            for(int i=0; i< telefone.length(); i++){
                if(Character.isLetter(telefone.charAt(i))){
                    resposta = false;
                    break;
                }
            }
        }else{
            resposta = false;
        }
        return resposta;
    }
    
    /**
     * Valida a placa do veículo
     * @param placa
     * @return 
     */
    public boolean validarPlaca(String placa){
        if(placa.length() < 7){
            return false;
        }else{
            for(int i=0; i< placa.length(); i++){
                if(i < 3 && !Character.isLetter(placa.charAt(i))){
                    return false;
                }else if(i >= 3 && !Character.isDigit(placa.charAt(i))){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

/**
 *
 * @author USER
 */
public class Validacao {
    public static boolean validarCPF(final String CPF) {
        int acumulador1 = 0;
        int acumulador2 = 0;
        int resto = 0;

        StringBuffer resultado = new StringBuffer();

        String digitoVerificadorCPF = CPF.substring((CPF.length() - 2),CPF.length());

        for(int i = 1; i < (CPF.length() - 1); i++) {
             acumulador1 += (11 - i) * Integer.valueOf(CPF.substring((i - 1), i));
             acumulador2 += (12 - i) * Integer.valueOf(CPF.substring((i - 1), i));
        }

         resto = acumulador1 % 11;

         if (resto < 2) {
             acumulador2 += 2;
             resultado.append(2);
         }else {
              acumulador2 += 2 * (11 - resto);
              resultado.append((11 - resto));
         }

         resto = acumulador2 % 11;

         if (resto < 2) {
                resultado.append(0);
         }else {
              resultado.append((11 - resto));
         }

         return (resultado.toString().equals(digitoVerificadorCPF));

    }
}

package locarrao.visao;

import java.util.List;
import java.util.Scanner;
import modelo.dominio.TipoVeiculo;

public class VisaoTipoVeiculo {
    public int MenuTipoVeiculo(List<TipoVeiculo> listaTipoVeiculo){
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        for(TipoVeiculo tipoVeiculo:listaTipoVeiculo){
            System.out.println(contador + " - " + tipoVeiculo.getTipo());
            contador++;
        }
        System.out.println();
        
        contador = entrada.nextInt();
        
        System.out.println();
        return contador;
    }
}

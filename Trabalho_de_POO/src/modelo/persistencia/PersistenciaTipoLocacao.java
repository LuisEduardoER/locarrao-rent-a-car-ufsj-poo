package modelo.persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.dominio.TipoLocacao;

public class PersistenciaTipoLocacao {
    
    String caminho = "src/arquivos/TipoLocacao.txt";
    
    File arquivo = new File(caminho);
    
    //salvar
    public boolean salvar(TipoLocacao tipoLocacao) throws IOException {
        if(this.arquivo.exists()){
            FileWriter writer = new FileWriter(arquivo,true); 
            PrintWriter dados = new PrintWriter(writer);

            
            return true;
        }
        else{
            return false;
        }
        
        
            
        
    }
}

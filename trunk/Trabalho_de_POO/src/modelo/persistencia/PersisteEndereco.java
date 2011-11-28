package modelo.persistencia;

import javax.swing.JComboBox;
import modelo.dominio.Endereco;

public class PersisteEndereco extends DaoBase {
    /** Salva o endereço no banco de dados.
     * 
     */
    public void salvarBD(Endereco endereco){
        abrirDB();
        em.persist(endereco);
        em.getTransaction().commit();
        fecharDB();
    }
    
    /**
     * Preenche o combo box com os Estados do Brasil
     */
    public void preencherComboEstados(JComboBox combo){
        String[] estados = new String[]{
          "AC","AL","AP","AM","BA","CE","DF","ES","GO","MA",
          "MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN",
          "RS","RO","RR","SC","SP","SE","TO"
        };
        
        combo.removeAllItems();
        for(int i=0;i<estados.length;i++){
            combo.addItem(estados[i].toUpperCase());
        }
    }
    
}

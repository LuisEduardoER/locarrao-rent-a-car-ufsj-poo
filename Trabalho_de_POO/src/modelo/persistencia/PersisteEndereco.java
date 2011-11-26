package modelo.persistencia;

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
}

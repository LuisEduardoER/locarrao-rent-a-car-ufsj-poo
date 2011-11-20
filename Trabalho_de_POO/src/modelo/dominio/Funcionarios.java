package modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIOS")
@PrimaryKeyJoinColumn(name = "ID_FUNCIONARIO")
public class Funcionarios extends Pessoa {
    
    @Column(length=45)
    private String cargo;
    
    @Column(length=45)
    private String usuario;
    
    @Column(length=100)
    private String senha;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
} 
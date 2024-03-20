package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Login\"")
public class Login {
    @Id
    @Column(name = "login", nullable = false, length = 50)
    private String login;

    @Column(name = "senha", nullable = false, length = 20)
    private String senha;

    @OneToOne(mappedBy = "login")
    private GestorEntity gestor;

    @OneToOne(mappedBy = "login")
    private RecursosHumanosEntity recursosHumanos;

    @OneToOne(mappedBy = "login")
    private TripulanteEntity tripulante;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Object getUser() {
        if (gestor != null) return gestor;
        if (tripulante != null) return tripulante;
        if (recursosHumanos != null) return recursosHumanos;
        return null;
    }

    public void setUser(Object user) {
        if (user instanceof GestorEntity) this.gestor = (GestorEntity) user;
        if (user instanceof TripulanteEntity) this.tripulante = (TripulanteEntity) user;
        if (user instanceof RecursosHumanosEntity) this.recursosHumanos = (RecursosHumanosEntity) user;
    }
}
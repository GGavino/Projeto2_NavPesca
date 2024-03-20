package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Nacionalidade\"", schema = "public", catalog = "NavPesca")
public class NacionalidadeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_nacionalidade", nullable = false)
    private int idNacionalidade;
    @Basic
    @Column(name = "nacionalidade", nullable = false, length = 50)


    private String nacionalidade;

    @OneToMany(mappedBy = "nacionalidade")
    private Set<GestorEntity> gestors = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idNacionalidade")
    private Set<RecursosHumanosEntity> recursosHumanos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idNacionalidade")
    private Set<TripulanteEntity> tripulantes = new LinkedHashSet<>();

    public Set<TripulanteEntity> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Set<TripulanteEntity> tripulantes) {
        this.tripulantes = tripulantes;
    }

    public Set<RecursosHumanosEntity> getRecursosHumanos() {
        return recursosHumanos;
    }

    public void setRecursosHumanos(Set<RecursosHumanosEntity> recursosHumanos) {
        this.recursosHumanos = recursosHumanos;
    }

    public Set<GestorEntity> getGestors() {
        return gestors;
    }

    public void setGestors(Set<GestorEntity> gestors) {
        this.gestors = gestors;
    }

    public int getIdNacionalidade() {
        return idNacionalidade;
    }

    public void setIdNacionalidade(int idNacionalidade) {
        this.idNacionalidade = idNacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NacionalidadeEntity that = (NacionalidadeEntity) o;

        if (idNacionalidade != that.idNacionalidade) return false;
        if (nacionalidade != null ? !nacionalidade.equals(that.nacionalidade) : that.nacionalidade != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNacionalidade;
        result = 31 * result + (nacionalidade != null ? nacionalidade.hashCode() : 0);
        return result;
    }
}

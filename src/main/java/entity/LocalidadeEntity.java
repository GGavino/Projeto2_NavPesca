package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Localidade\"", schema = "public", catalog = "NavPesca")
public class LocalidadeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpostal", nullable = false, length = 8)
    private String codpostal;
    @Basic
    @Column(name = "localidade", nullable = false, length = 75)
    private String localidade;

    @OneToMany(mappedBy = "codpostal")
    private Set<ArmazemEntity> armazems = new LinkedHashSet<>();

    @OneToMany(mappedBy = "codpostal")
    private Set<GestorEntity> gestors = new LinkedHashSet<>();

    @OneToMany(mappedBy = "codpostal")
    private Set<RecursosHumanosEntity> recursosHumanos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "codpostal")
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

    public Set<ArmazemEntity> getArmazems() {
        return armazems;
    }

    public void setArmazems(Set<ArmazemEntity> armazems) {
        this.armazems = armazems;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalidadeEntity that = (LocalidadeEntity) o;

        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (localidade != null ? !localidade.equals(that.localidade) : that.localidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codpostal != null ? codpostal.hashCode() : 0;
        result = 31 * result + (localidade != null ? localidade.hashCode() : 0);
        return result;
    }
}

package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Especie\"", schema = "public", catalog = "NavPesca")
public class EspecieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_especie", nullable = false)
    private int idEspecie;
    @Basic
    @Column(name = "especie", nullable = false, length = 50)
    private String especie;

    @OneToMany(mappedBy = "especie")
    private Set<PescadoEntity> pescados = new LinkedHashSet<>();

    public Set<PescadoEntity> getPescados() {
        return pescados;
    }

    public void setPescados(Set<PescadoEntity> pescados) {
        this.pescados = pescados;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EspecieEntity that = (EspecieEntity) o;

        if (idEspecie != that.idEspecie) return false;
        if (especie != null ? !especie.equals(that.especie) : that.especie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEspecie;
        result = 31 * result + (especie != null ? especie.hashCode() : 0);
        return result;
    }
}

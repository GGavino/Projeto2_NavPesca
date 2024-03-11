package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Armazem\"", schema = "public", catalog = "NavPesca")
public class ArmazemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_armazem", nullable = false)
    private int idArmazem;
    @Basic
    @Column(name = "num_gestor", nullable = false)
    private int numGestor;
    @Basic
    @Column(name = "codpostal", nullable = false, length = 8)
    private String codpostal;

    public int getIdArmazem() {
        return idArmazem;
    }

    public void setIdArmazem(int idArmazem) {
        this.idArmazem = idArmazem;
    }

    public int getNumGestor() {
        return numGestor;
    }

    public void setNumGestor(int numGestor) {
        this.numGestor = numGestor;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArmazemEntity that = (ArmazemEntity) o;

        if (idArmazem != that.idArmazem) return false;
        if (numGestor != that.numGestor) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArmazem;
        result = 31 * result + numGestor;
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        return result;
    }
}

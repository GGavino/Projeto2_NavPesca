package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"TipoRecurso\"", schema = "public", catalog = "NavPesca")
public class TipoRecursoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipor", nullable = false)
    private int idTipor;
    @Basic
    @Column(name = "recurso", nullable = false, length = -1)
    private String recurso;
    @Basic
    @Column(name = "unidade", nullable = false, length = -1)
    private String unidade;

    @OneToMany(mappedBy = "tiporecurso")
    private Set<RecursoEntity> recursos = new LinkedHashSet<>();

    public Set<RecursoEntity> getRecursos() {
        return recursos;
    }

    public void setRecursos(Set<RecursoEntity> recursos) {
        this.recursos = recursos;
    }

    public int getIdTipor() {
        return idTipor;
    }

    public void setIdTipor(int idTipor) {
        this.idTipor = idTipor;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoRecursoEntity that = (TipoRecursoEntity) o;

        if (idTipor != that.idTipor) return false;
        if (recurso != null ? !recurso.equals(that.recurso) : that.recurso != null) return false;
        if (unidade != null ? !unidade.equals(that.unidade) : that.unidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipor;
        result = 31 * result + (recurso != null ? recurso.hashCode() : 0);
        result = 31 * result + (unidade != null ? unidade.hashCode() : 0);
        return result;
    }
}

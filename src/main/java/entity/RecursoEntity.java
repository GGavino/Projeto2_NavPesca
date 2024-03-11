package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Recurso\"", schema = "public", catalog = "NavPesca")
public class RecursoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_recurso", nullable = false)
    private int idRecurso;
    @Basic
    @Column(name = "id_armazem", nullable = false)
    private int idArmazem;
    @Basic
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    @Basic
    @Column(name = "tiporecurso", nullable = false)
    private int tiporecurso;

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public int getIdArmazem() {
        return idArmazem;
    }

    public void setIdArmazem(int idArmazem) {
        this.idArmazem = idArmazem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTiporecurso() {
        return tiporecurso;
    }

    public void setTiporecurso(int tiporecurso) {
        this.tiporecurso = tiporecurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecursoEntity that = (RecursoEntity) o;

        if (idRecurso != that.idRecurso) return false;
        if (idArmazem != that.idArmazem) return false;
        if (quantidade != that.quantidade) return false;
        if (tiporecurso != that.tiporecurso) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRecurso;
        result = 31 * result + idArmazem;
        result = 31 * result + quantidade;
        result = 31 * result + tiporecurso;
        return result;
    }
}

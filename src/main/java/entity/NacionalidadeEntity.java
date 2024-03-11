package entity;

import jakarta.persistence.*;

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

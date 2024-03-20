package entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Tamanho\"", schema = "public", catalog = "NavPesca")
public class TamanhoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tamanho", nullable = false)
    private int idTamanho;
    @Basic
    @Column(name = "tamanho", nullable = false, length = 50)
    private String tamanho;

    @OneToMany(mappedBy = "tamanho")
    private Set<BarcoEntity> barcos = new LinkedHashSet<>();

    public Set<BarcoEntity> getBarcos() {
        return barcos;
    }

    public void setBarcos(Set<BarcoEntity> barcos) {
        this.barcos = barcos;
    }

    public int getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(int idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TamanhoEntity that = (TamanhoEntity) o;

        if (idTamanho != that.idTamanho) return false;
        if (tamanho != null ? !tamanho.equals(that.tamanho) : that.tamanho != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTamanho;
        result = 31 * result + (tamanho != null ? tamanho.hashCode() : 0);
        return result;
    }
}

package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Barco\"", schema = "public", catalog = "NavPesca")
public class BarcoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_barco", nullable = false)
    private int idBarco;
    @Basic
    @Column(name = "tamanho", nullable = false)
    private int tamanho;
    @Basic
    @Column(name = "data_aquisicao", nullable = false)
    private Date dataAquisicao;

    @OneToMany(mappedBy = "idBarco")
    private Set<TripulanteEntity> tripulantes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idBarco")
    private Set<ViagemEntity> viagems = new LinkedHashSet<>();

    public Set<ViagemEntity> getViagems() {
        return viagems;
    }

    public void setViagems(Set<ViagemEntity> viagems) {
        this.viagems = viagems;
    }

    public Set<TripulanteEntity> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Set<TripulanteEntity> tripulantes) {
        this.tripulantes = tripulantes;
    }

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BarcoEntity that = (BarcoEntity) o;

        if (idBarco != that.idBarco) return false;
        if (tamanho != that.tamanho) return false;
        if (dataAquisicao != null ? !dataAquisicao.equals(that.dataAquisicao) : that.dataAquisicao != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBarco;
        result = 31 * result + tamanho;
        result = 31 * result + (dataAquisicao != null ? dataAquisicao.hashCode() : 0);
        return result;
    }
}

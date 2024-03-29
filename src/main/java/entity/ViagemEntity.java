package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Viagem\"", schema = "public", catalog = "NavPesca")
public class ViagemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_viagem", nullable = false)
    private int idViagem;
    @Basic
    @Column(name = "id_barco", nullable = false)
    private int idBarco;
    @Basic
    @Column(name = "data_ini", nullable = false)
    private Date dataIni;
    @Basic
    @Column(name = "duracao", nullable = false)
    private int duracao;

    @OneToMany(mappedBy = "idViagem")
    private Set<PescadoEntity> pescados = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "TripulanteViagem",
            joinColumns = @JoinColumn(name = "id_viagem"),
            inverseJoinColumns = @JoinColumn(name = "num_tripulante"))
    private Set<TripulanteEntity> tripulantes = new LinkedHashSet<>();

    public Set<TripulanteEntity> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Set<TripulanteEntity> tripulantes) {
        this.tripulantes = tripulantes;
    }

    public Set<PescadoEntity> getPescados() {
        return pescados;
    }

    public void setPescados(Set<PescadoEntity> pescados) {
        this.pescados = pescados;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViagemEntity that = (ViagemEntity) o;

        if (idViagem != that.idViagem) return false;
        if (idBarco != that.idBarco) return false;
        if (duracao != that.duracao) return false;
        if (dataIni != null ? !dataIni.equals(that.dataIni) : that.dataIni != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idViagem;
        result = 31 * result + idBarco;
        result = 31 * result + (dataIni != null ? dataIni.hashCode() : 0);
        result = 31 * result + duracao;
        return result;
    }
}

package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"TripulanteViagem\"", schema = "public", catalog = "NavPesca")
@IdClass(TripulanteViagemEntityPK.class)
public class TripulanteViagemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_viagem", nullable = false)
    private int idViagem;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_tripulante", nullable = false)
    private int numTripulante;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_viagem", nullable = false)
    private ViagemEntity idViagem1;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "num_tripulante", nullable = false)
    private TripulanteEntity numTripulante1;

    public TripulanteEntity getNumTripulante1() {
        return numTripulante1;
    }

    public void setNumTripulante1(TripulanteEntity numTripulante1) {
        this.numTripulante1 = numTripulante1;
    }

    public ViagemEntity getIdViagem1() {
        return idViagem1;
    }

    public void setIdViagem1(ViagemEntity idViagem1) {
        this.idViagem1 = idViagem1;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getNumTripulante() {
        return numTripulante;
    }

    public void setNumTripulante(int numTripulante) {
        this.numTripulante = numTripulante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripulanteViagemEntity that = (TripulanteViagemEntity) o;

        if (idViagem != that.idViagem) return false;
        if (numTripulante != that.numTripulante) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idViagem;
        result = 31 * result + numTripulante;
        return result;
    }
}

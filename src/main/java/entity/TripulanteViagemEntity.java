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

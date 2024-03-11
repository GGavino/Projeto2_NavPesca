package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class TripulanteViagemEntityPK implements Serializable {
    @Column(name = "id_viagem", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViagem;
    @Column(name = "num_tripulante", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        TripulanteViagemEntityPK that = (TripulanteViagemEntityPK) o;

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

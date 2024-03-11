package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Pescado\"", schema = "public", catalog = "NavPesca")
public class PescadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_pescado", nullable = false)
    private int idPescado;
    @Basic
    @Column(name = "id_viagem", nullable = false)
    private int idViagem;
    @Basic
    @Column(name = "especie", nullable = false)
    private int especie;
    @Basic
    @Column(name = "peso", nullable = false, precision = 0)
    private float peso;

    public int getIdPescado() {
        return idPescado;
    }

    public void setIdPescado(int idPescado) {
        this.idPescado = idPescado;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PescadoEntity that = (PescadoEntity) o;

        if (idPescado != that.idPescado) return false;
        if (idViagem != that.idViagem) return false;
        if (especie != that.especie) return false;
        if (Float.compare(peso, that.peso) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPescado;
        result = 31 * result + idViagem;
        result = 31 * result + especie;
        result = 31 * result + (peso != 0.0f ? Float.floatToIntBits(peso) : 0);
        return result;
    }
}

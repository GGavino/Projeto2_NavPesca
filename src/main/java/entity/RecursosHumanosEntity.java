package entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "\"RecursosHumanos\"", schema = "public", catalog = "NavPesca")
public class RecursosHumanosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_funcionario", nullable = false)
    private int numFuncionario;
    @Basic
    @Column(name = "nome", nullable = false, length = 75)
    private String nome;
    @Basic
    @Column(name = "email", nullable = false, length = 75)
    private String email;
    @Basic
    @Column(name = "codpostal", nullable = false, length = 8)
    private String codpostal;
    @Basic
    @Column(name = "data_contratacao", nullable = false)
    private Date dataContratacao;
    @Basic
    @Column(name = "data_nasc", nullable = false)
    private Date dataNasc;
    @Basic
    @Column(name = "id_nacionalidade", nullable = false)
    private int idNacionalidade;

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdNacionalidade() {
        return idNacionalidade;
    }

    public void setIdNacionalidade(int idNacionalidade) {
        this.idNacionalidade = idNacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecursosHumanosEntity that = (RecursosHumanosEntity) o;

        if (numFuncionario != that.numFuncionario) return false;
        if (idNacionalidade != that.idNacionalidade) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (dataContratacao != null ? !dataContratacao.equals(that.dataContratacao) : that.dataContratacao != null)
            return false;
        if (dataNasc != null ? !dataNasc.equals(that.dataNasc) : that.dataNasc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numFuncionario;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (dataContratacao != null ? dataContratacao.hashCode() : 0);
        result = 31 * result + (dataNasc != null ? dataNasc.hashCode() : 0);
        result = 31 * result + idNacionalidade;
        return result;
    }
}

package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"Gestor\"", schema = "public", catalog = "NavPesca")
public class GestorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_gestor", nullable = false)
    private int numGestor;
    @Basic
    @Column(name = "nome", nullable = false, length = 75)
    private String nome;
    @Basic
    @Column(name = "email", nullable = false, length = 75)
    private String email;

    @Basic
    @Column(name = "data_contratacao", nullable = false)
    private Date dataContratacao;
    @Basic
    @Column(name = "data_nasc", nullable = false)
    private Date dataNasc;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"id_nacionalidade\"", nullable = false)
    private NacionalidadeEntity nacionalidade;
    @Basic
    @Column(name = "codpostal", nullable = false, length = 8)
    private String codpostal;

    @OneToMany(mappedBy = "numGestor")
    private Set<ArmazemEntity> armazems = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "login", nullable = false)
    private Login login;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Set<ArmazemEntity> getArmazems() {
        return armazems;
    }

    public void setArmazems(Set<ArmazemEntity> armazems) {
        this.armazems = armazems;
    }

    public int getNumGestor() {
        return numGestor;
    }

    public void setNumGestor(int numGestor) {
        this.numGestor = numGestor;
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

    public NacionalidadeEntity getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeEntity nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GestorEntity that = (GestorEntity) o;

        if (numGestor != that.numGestor) return false;
        if (nacionalidade != that.nacionalidade) return false;
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
        int result = numGestor;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (dataContratacao != null ? dataContratacao.hashCode() : 0);
        result = 31 * result + (dataNasc != null ? dataNasc.hashCode() : 0);
        result = 31 * result + (nacionalidade != null ? nacionalidade.hashCode() : 0);
        return result;
    }
}

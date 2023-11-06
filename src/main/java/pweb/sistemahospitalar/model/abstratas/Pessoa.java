package pweb.sistemahospitalar.model.abstratas;

import jakarta.persistence.*;
import pweb.sistemahospitalar.model.geral.Endereco;
import pweb.sistemahospitalar.model.geral.StatusPessoa;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected UUID id;
    protected String nome;
    protected String email;
    protected String telefone;
    @OneToOne
    @JoinColumn(name = "status_id")
    protected StatusPessoa status;
    @OneToOne
    @JoinColumn(name = "endereco_id")
    protected Endereco endereco;

    public abstract UUID getId();
    public abstract void setNome(String nome);
    public abstract String getNome();
    public abstract void setEmail(String email);
    public abstract String getEmail();
    public abstract void setTelefone(String telefone);
    public abstract String getTelefone();
    public abstract Endereco getEndereco();
    public abstract void setEndereco(Endereco endereco);

    public abstract void setStatus(StatusPessoa status);
    public abstract StatusPessoa getStatus();
}

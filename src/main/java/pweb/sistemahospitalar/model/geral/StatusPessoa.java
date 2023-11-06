package pweb.sistemahospitalar.model.geral;

import jakarta.persistence.*;
import pweb.sistemahospitalar.model.abstratas.Pessoa;

import java.util.UUID;

@Entity
@Table(name = "STATUS_PESSOA")
public class StatusPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String descricao;

    @OneToOne(mappedBy = "status")
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

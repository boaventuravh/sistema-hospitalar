package pweb.sistemahospitalar.model.paciente;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import pweb.sistemahospitalar.model.abstratas.PessoaModel;
import pweb.sistemahospitalar.model.consulta.ConsultaModel;
import pweb.sistemahospitalar.model.geral.EnderecoModel;
import pweb.sistemahospitalar.model.geral.StatusPessoaModel;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "PACIENTE")
public class PacienteModel extends PessoaModel {

    @Column(unique = true)
    private String cpf;

    @JsonManagedReference(value = "paciente_id")
    @OneToMany(mappedBy = "paciente")
    private List<ConsultaModel> consultas;

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void setEndereco(EnderecoModel enderecoModel) {
        this.endereco = enderecoModel;
    }

    @Override
    public EnderecoModel getEndereco() {
        return this.endereco;
    }

    @Override
    public void setStatus(StatusPessoaModel status) {
        this.status = status;
    }

    @Override
    public StatusPessoaModel getStatus() {
        return this.status;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public List<ConsultaModel> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<ConsultaModel> consultaModels) {
        this.consultas = consultaModels;
    }
}

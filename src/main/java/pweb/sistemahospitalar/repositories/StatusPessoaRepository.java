package pweb.sistemahospitalar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pweb.sistemahospitalar.model.geral.StatusPessoaModel;

import java.util.UUID;

@Repository
public interface StatusPessoaRepository extends JpaRepository<StatusPessoaModel, UUID> {
}

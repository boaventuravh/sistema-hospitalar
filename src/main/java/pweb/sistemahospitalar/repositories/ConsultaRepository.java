package pweb.sistemahospitalar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pweb.sistemahospitalar.model.consulta.ConsultaModel;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaModel, UUID> {
}

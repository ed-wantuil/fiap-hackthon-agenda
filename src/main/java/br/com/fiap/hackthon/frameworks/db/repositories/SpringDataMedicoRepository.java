package br.com.fiap.hackthon.frameworks.db.repositories;

import java.util.Optional;
import java.util.UUID;

import br.com.fiap.hackthon.frameworks.db.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMedicoRepository extends JpaRepository<MedicoEntity, UUID> {

}

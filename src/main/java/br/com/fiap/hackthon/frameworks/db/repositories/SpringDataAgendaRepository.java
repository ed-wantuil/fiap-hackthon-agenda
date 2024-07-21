package br.com.fiap.hackthon.frameworks.db.repositories;

import java.util.UUID;

import br.com.fiap.hackthon.frameworks.db.entities.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataAgendaRepository extends JpaRepository<AgendaEntity, UUID> {
}

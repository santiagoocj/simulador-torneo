package edu.torneo.simuladortorneo.repository;

import edu.torneo.simuladortorneo.entity.PartidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidoRepository extends JpaRepository<PartidoEntity, Integer> {
}

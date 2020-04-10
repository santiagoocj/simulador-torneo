package edu.torneo.simuladortorneo.repository;

import edu.torneo.simuladortorneo.entity.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<EquipoEntity, Integer> {
}

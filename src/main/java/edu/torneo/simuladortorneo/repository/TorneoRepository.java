package edu.torneo.simuladortorneo.repository;

import edu.torneo.simuladortorneo.entity.TorneoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneoRepository extends JpaRepository<TorneoEntity, Integer> {
}

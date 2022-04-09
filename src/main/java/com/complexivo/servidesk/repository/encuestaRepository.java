package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complexivo.servidesk.models.encuesta;
import java.util.Optional;

@Repository
public interface encuestaRepository extends JpaRepository<encuesta, Long>{
	public Optional<encuesta> findByCodEncuesta(Long id);
}

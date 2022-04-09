package com.complexivo.servidesk.repository;

import java.util.Optional;

import com.complexivo.servidesk.models.prioridad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface prioridadRepository extends JpaRepository< prioridad, Long>{
	public Optional<prioridad> findByCodprioridad(Long id);

}
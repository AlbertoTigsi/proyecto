package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.severidad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface severidadRepository extends JpaRepository<severidad,Long> {

    severidad findByNivelSeveridad(String nivelSeveridad);
	
	severidad findByCodSeveridad(Long codSeveridad);
    
}

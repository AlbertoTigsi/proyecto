package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.criticidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface criticidadRepository extends JpaRepository<criticidad,Long> {

    criticidad findByCodCriticidad(Long codCriticidad);

    criticidad findByNivelCriticidad(String nivelCriticidad);
    
}

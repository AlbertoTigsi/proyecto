package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estadoRepository extends JpaRepository < estado, Long> {
 
    public estado findByNombreEstado(String nombreEstado);

    public estado findByCodEstado(Long codEstado);
}

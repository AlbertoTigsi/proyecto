package com.complexivo.servidesk.repository;

import java.util.Optional;

import com.complexivo.servidesk.models.solucion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface solucionRepository extends JpaRepository< solucion, Long>{
    public Optional<solucion> findByCodsolucion(Long id);

}
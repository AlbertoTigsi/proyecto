package com.complexivo.servidesk.repository;

import java.util.Optional;

import com.complexivo.servidesk.models.solucion;

import org.springframework.data.jpa.repository.JpaRepository;



public interface solucionRepository extends JpaRepository< solucion, Long>{
    public Optional<solucion> findByCodsolucion(Long id);

}
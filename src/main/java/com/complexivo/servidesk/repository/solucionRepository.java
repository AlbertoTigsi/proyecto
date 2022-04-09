package com.complexivo.servidesk.repository;

import java.util.Optional;

import com.complexivo.servidesk.models.solucion;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface solucionRepository extends JpaRepository< solucion, Long>{
    public Optional<solucion> findByCodSolucion(Long id);
    
	
    @Query(value = "SELECT * FROM solucion where codticket=?1 ", nativeQuery = true)
    List<solucion> solucionPorCodTicket(Long codticket);
}
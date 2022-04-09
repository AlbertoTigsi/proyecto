/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.detalleEncuesta;
import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author HP
 */
@Repository
public interface detalleEncuestaRepository extends JpaRepository<detalleEncuesta, Long>{
    public Optional<detalleEncuesta> findByCodDetalle(Long id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value ="Select * from detalle_encuesta where cod_encuesta =?1")
    List<detalleEncuesta> llamarPreguntas(Long cod_encuesta);

}

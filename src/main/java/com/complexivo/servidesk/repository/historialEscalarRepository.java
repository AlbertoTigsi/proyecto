/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.HistorialEscalar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */

@Repository
public interface historialEscalarRepository extends JpaRepository<HistorialEscalar, Long>{
    @Query(value = "SELECT * from historialescalar WHERE codticket =?1", nativeQuery = true)
    public Optional<HistorialEscalar> buscarByTicket(Long codticket);
}

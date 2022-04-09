/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.complexivo.servidesk.models.ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;

/**
 *
 * @author AlexanderGuzman
 */
@Repository
public interface ticketRepository extends JpaRepository<ticket, Long>{
    @Query(value = "SELECT * FROM ticket WHERE cod_tecnico=:codTecnico order by fecha_asignacion desc", nativeQuery = true)
    List<ticket> ticketecnico(Long codTecnico);
    @Query(value = "SELECT * FROM ticket WHERE cod_usuario=:codUsuario order by fecha_creacion desc", nativeQuery = true)
    List<ticket> ticketUsuario(Long codUsuario);
    @Query(value = "SELECT * FROM ticket  WHERE cod_estado =:codEstado order by fecha_creacion desc", nativeQuery = true)
    List<ticket> ticketbyEstado(int codEstado);
    @Query(value = "SELECT * FROM ticket order by fecha_creacion desc", nativeQuery = true)
    List<ticket> ticketCoordinador();

    public List<ticket> findByCodticket(Long id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket set cod_tecnico =?1 , cod_coordinador=?2 where codticket =?3 ")
    void asignarticketTecnico(Long cod_tecnico,Long cod_coordinador,Long codticket);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE ticket SET cod_estado =?1 where codticket =?2")
    void cambiarEstado(Long cod_estado , Long codticket);


    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket SET cod_severidad =?1 WHERE codticket =?2 ")
    void modificarTicketSeveridad(Long cod_severidad,Long codticket);

    @Query(value = "select t.*  from (ticket t join servicio using (cod_servicio)) join tipo using (cod_tipo) where nombre=?1 ", nativeQuery = true)
    List<ticket>buscarPorTipoServicio(String nombre);

    List<ticket> findByTicketEstado(boolean ticketEstado);

     @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket set  ticket_estado=?1  where codticket =?2 ")
    void modificarTicketEstado(boolean ticketEstado,Long codticket);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE ticket SET cod_tecnico = null WHERE codticket =?1")
    void reasignarticket(Long codticket);
    

    @Query(nativeQuery = true,value = "select * from ticket where fecha_creacion between :fechainicial and :fechafinal and cod_estado =:codestado")
    List<ticket> findTicketsbyFechaandEstado(Date fechainicial,Date fechafinal,int codestado);
    
    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE ticket SET confirmacion = true WHERE codticket =?1")
    void confirmar(Long codticket);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "UPDATE ticket set  sla=?1  where codticket =?2 ")
    void modificarSLA(Double sla,Long codticket);
}

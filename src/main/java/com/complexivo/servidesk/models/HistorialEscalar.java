/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "historialescalar")
public class HistorialEscalar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codhistorial;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaEscalar")
    @DateTimeFormat(pattern = "YYYY-MM-DDThh:mm:ssTZD")
    private Date fechaEscalar;
    
    @OneToOne
    @JoinColumn(name = "nivel1", updatable = false, nullable=false, referencedColumnName = "codTecnico" )
    private tecnico nivel1;
    @OneToOne
    @JoinColumn(name = "nivel2", updatable = false, nullable=false, referencedColumnName = "codTecnico" )
    private tecnico nivel2;
    @OneToOne
    @JoinColumn(name = "codticket", updatable = false, nullable = false, referencedColumnName = "codticket")
    private ticket ticket;

    public Long getCodhistorial() {
        return codhistorial;
    }

    public void setCodhistorial(Long codhistorial) {
        this.codhistorial = codhistorial;
    }

    public Date getFechaEscalar() {
        return fechaEscalar;
    }

    public void setFechaEscalar(Date fechaEscalar) {
        this.fechaEscalar = fechaEscalar;
    }

    public tecnico getNivel1() {
        return nivel1;
    }

    public void setNivel1(tecnico nivel1) {
        this.nivel1 = nivel1;
    }

    public tecnico getNivel2() {
        return nivel2;
    }

    public void setNivel2(tecnico nivel2) {
        this.nivel2 = nivel2;
    }

    public ticket getTicket() {
        return ticket;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }
    
    
}    
    
    


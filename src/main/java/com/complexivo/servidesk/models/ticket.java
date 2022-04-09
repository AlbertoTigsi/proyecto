/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne; 
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "ticket")
public class ticket {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codticket;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaAsignacion")
    @DateTimeFormat(pattern = "YYYY-MM-DDThh:mm:ssTZD")
    private Date fechaAsignacion;
    


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaCreacion")
    @DateTimeFormat(pattern = "YYYY-MM-DDThh:mm:ssTZD")
    private Date fechaCreacion;
    
    @Column(name = "ticketEstado",nullable = true)
    private boolean ticketEstado=true;
    private double sla;
    private String url;
    private String descripcionTicket;

    @OneToOne
    @JoinColumn(name = "codUsuario", updatable = false, nullable = false, referencedColumnName = "codUsuario")
    private usuario usuario;

    // @OneToOne
    // @JoinColumn(name = "email", updatable = false, nullable = false, referencedColumnName = "email")
    // private usuario usuario;

   @OneToOne
    @JoinColumn(name = "codCoordinador", updatable = false,  referencedColumnName = "codCoordinador")
    private coordinador coordinador;

    @ManyToOne
    @JoinColumn(name = "codViaComunicacion", updatable = true, nullable = false, referencedColumnName = "codViaComunicacion")
    private viaComunicacion viaComunicacion;

    @ManyToOne
    @JoinColumn(name = "codServicio", updatable = true, nullable = false, referencedColumnName = "codServicio")
    private servicio servicio;

    @OneToOne
    @JoinColumn(name = "codTecnico", updatable = false,  referencedColumnName = "codTecnico")
    private tecnico tecnico;

    @OneToOne
    @JoinColumn(name = "codEstado", updatable = true , referencedColumnName = "codEstado")
    private estado estado;
    @OneToOne
    @JoinColumn(name = "codSeveridad", updatable = true , referencedColumnName = "codSeveridad")
    private severidad severidad;
    
    @Column(name = "confirmacion", nullable = true)
    private boolean  confirmacion = false;
    
    public boolean isTicketEstado() {
        return ticketEstado;
    }

    public void setTicketEstado(boolean ticketEstado) {
        this.ticketEstado = ticketEstado;
    }
    public severidad getSeveridad() {
        return severidad;
    }

    public void setSeveridad(severidad severidad) {
        this.severidad = severidad;
    }
    public String getDescripcionTicket() {
        return descripcionTicket;
    }

    public void setDescripcionTicket(String descripcionTicket) {
        this.descripcionTicket = descripcionTicket;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public estado getEstado() {
        return estado;
    }


    public void setEstado(estado estado) {
        this.estado = estado;
    }


    public coordinador getCoordinador() {
        return coordinador;
    }


    public void setCoordinador(coordinador coordinador) {
        this.coordinador = coordinador;
    }


    
    public viaComunicacion getViaComunicacion() {
        return this.viaComunicacion;
    }

    public void setViaComunicacion(viaComunicacion viaComunicacion) {
        this.viaComunicacion = viaComunicacion;
    }

    public tecnico getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(tecnico tecnico) {
        this.tecnico = tecnico;
    }



    public usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }


    public servicio getServicio() {
        return this.servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    public Long getCodticket() {
        return codticket;
    }

    public void setCodticket(Long codticket) {
        this.codticket = codticket;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

   
    public double getSla() {
        return this.sla;
    }

    public void setSla(double sla) {
        this.sla = sla;
    }

    public boolean getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    

 
}

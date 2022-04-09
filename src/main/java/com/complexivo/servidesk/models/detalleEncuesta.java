/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name="detalleEncuesta")
public class detalleEncuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codDetalle;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "codEncuesta", nullable = false, updatable = false)
    private encuesta codEncuesta;
    @ManyToOne
    @JoinColumn(name = "codPreguntas", nullable = false, updatable = false)
    private preguntas codPreguntas;
    


    public detalleEncuesta() {
    }

    public Long getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(Long codDetalle) {
        this.codDetalle = codDetalle;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public encuesta getCodEncuesta() {
        return codEncuesta;
    }

    public void setCodEncuesta(encuesta codEncuesta) {
        this.codEncuesta = codEncuesta;
    }

    public preguntas getCodPreguntas() {
        return codPreguntas;
    }

    public void setCodPreguntas(preguntas codPreguntas) {
        this.codPreguntas = codPreguntas;
    }
    
    
    
    
}

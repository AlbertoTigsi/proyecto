package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "estado")
public class estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codEstado ;
    
    
    @Column(nullable = false,length = 50)
    private String nombreEstado;

    @Column(nullable = false,length = 100)
    private String descripcionestado;


    public String getDescripcionestado() {
        return this.descripcionestado;
    }

    public void setDescripcionestado(String descripcionestado) {
        this.descripcionestado = descripcionestado;
    }

    public estado(Long codEstado, String nombreEstado, String descripcionestado) {
        this.codEstado = codEstado;
        this.nombreEstado = nombreEstado;
        this.descripcionestado = descripcionestado;
    }
    


    public estado() {
    }

    public estado(Long codEstado, String nombreEstado) {
        this.codEstado = codEstado;
        this.nombreEstado = nombreEstado;
    }


    public Long getCodEstado() {
        return this.codEstado;
    }

    public void setCodEstado(Long codEstado) {
        this.codEstado = codEstado;
    }

    public String getNombreEstado() {
        return this.nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

}

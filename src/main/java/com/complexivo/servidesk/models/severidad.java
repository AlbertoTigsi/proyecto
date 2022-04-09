package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class severidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codSeveridad;

    @Column(nullable = false,length = 20)
    private String nivelSeveridad;

    @Column(nullable = false,length = 300)
    private String descripcionSeveridad;

    @Column(nullable = false)
    private int valorSeveridad;
   
    
    public severidad(Long codSeveridad, String nivelSeveridad, String descripcionSeveridad, int valorSeveridad) {
        this.codSeveridad = codSeveridad;
        this.nivelSeveridad = nivelSeveridad;
        this.descripcionSeveridad = descripcionSeveridad;
        this.valorSeveridad = valorSeveridad;
    }

    public severidad() {
    }

    public Long getCodSeveridad() {
        return codSeveridad;
    }

    public void setCodSeveridad(Long codSeveridad) {
        this.codSeveridad = codSeveridad;
    }

    public String getNivelSeveridad() {
        return nivelSeveridad;
    }

    public void setNivelSeveridad(String nivelSeveridad) {
        this.nivelSeveridad = nivelSeveridad;
    }

    public String getDescripcionSeveridad() {
        return descripcionSeveridad;
    }

    public void setDescripcionSeveridad(String descripcionSeveridad) {
        this.descripcionSeveridad = descripcionSeveridad;
    }

    public int getValorSeveridad() {
        return valorSeveridad;
    }

    public void setValorSeveridad(int valorSeveridad) {
        this.valorSeveridad = valorSeveridad;
    }
    

}

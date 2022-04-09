package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viaComunicacion")
public class viaComunicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codViaComunicacion;

    @Column(nullable = true,length = 40)
    private String nombre;
    

    public viaComunicacion() {
    }

    public viaComunicacion(Long codViaComunicacion, String nombre) {
        this.codViaComunicacion = codViaComunicacion;
        this.nombre = nombre;
    }

    public Long getCodViaComunicacion() {
        return this.codViaComunicacion;
    }

    public void setCodViaComunicacion(Long codViaComunicacion) {
        this.codViaComunicacion = codViaComunicacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

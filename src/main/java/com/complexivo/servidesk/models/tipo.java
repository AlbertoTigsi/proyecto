package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codTipo;
    @Column(nullable = false,length = 50,unique = true)
    private String nombre;
    @Column(nullable = false,length = 500)
    private String descripcion;

  

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCodTipo() {
        return this.codTipo;
    }

    public void setCodTipo(Long codTipo) {
        this.codTipo = codTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

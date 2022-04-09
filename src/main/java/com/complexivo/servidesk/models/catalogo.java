/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "catalogo")
public class catalogo {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCatalogo;
    @Column(length = 50,nullable = false,unique = true)
    private String categoria;
    @Column(length =300)
    private String descripcion;
    private boolean estado;
    //generar los getters y setters de la tabla que va unida
    
    public Long getCodCatalogo() {
        return codCatalogo;
    }

    public void setCodCatalogo(Long codCatalogo) {
        this.codCatalogo = codCatalogo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
    
}

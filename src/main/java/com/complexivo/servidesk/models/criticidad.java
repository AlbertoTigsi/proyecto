package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="criticidad")
public class criticidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCriticidad;
    @Column(nullable = false,length = 50,unique = true)
    private String nivelCriticidad;
    @Column(length = 200)
    private String descripcion;

    private double valor;


    public Long getCodCriticidad() {
        return codCriticidad;
    }

    public void setCodCriticidad(Long codCriticidad) {
        this.codCriticidad = codCriticidad;
    }

    public String getNivelCriticidad() {
        return nivelCriticidad;
    }

    public void setNivelCriticidad(String nivelCriticidad) {
        this.nivelCriticidad = nivelCriticidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}

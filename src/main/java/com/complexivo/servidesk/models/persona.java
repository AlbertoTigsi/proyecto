 package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class persona {

    @Id
    @Column(nullable = false,length = 10,unique = true)
    private String cedula;

    @Column(nullable = false,length = 40)
    private String nombres;
    
    private String telefono;
    private String direccion;  


    public persona(String cedula, String nombres, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public persona() {
    }


    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "usuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codUsuario;

    @Column(nullable = false,length = 50)
    private String email;

    @Column(nullable = false,length = 20)
    private String contrasena;

    @OneToOne
    @JoinColumn(name = "cedula", updatable = false, nullable = false, unique = true, referencedColumnName = "cedula")
    private persona persona;



    public usuario(Long codUsuario, String email, String contrasena, persona persona) {
        this.codUsuario = codUsuario;
        this.email = email;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    // public usuario(String email, String contrasena, persona persona) {
    //     this.email = email;
    //     this.contrasena = contrasena;
    //     this.persona = persona;
    // }


    public usuario() {
    }


    public Long getCodUsuario() {
        return this.codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public persona getPersona() {
        return this.persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }
    

}

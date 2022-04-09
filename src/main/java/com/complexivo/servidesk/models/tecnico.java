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
@Table(name = "tecnico")
public class tecnico {
    // public class usuario extends persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codTecnico;
    @Column(nullable = false, length = 50,unique = true)
    private String email;
    @Column(nullable = false, length = 20)
    private String contrasena;
    @Column(nullable = false)
    private int nivel;

    @OneToOne
    @JoinColumn(name = "cedula", updatable = false, nullable = false, referencedColumnName = "cedula")
    private persona persona;

    public tecnico(Long codTecnico, String email, String contrasena, int nivel,
            com.complexivo.servidesk.models.persona persona) {
        this.codTecnico = codTecnico;
        this.email = email;
        this.contrasena = contrasena;
        this.nivel = nivel;
        this.persona = persona;
    }

    public tecnico(Long codTecnico, String email, String contrasena, int nivel) {
        this.codTecnico = codTecnico;
        this.email = email;
        this.contrasena = contrasena;
        this.nivel = nivel;
    }

    public tecnico() {
    }

    public Long getCodTecnico() {
        return this.codTecnico;
    }

    public void setCodTecnico(Long codTecnico) {
        this.codTecnico = codTecnico;
    }

    public String getEmail() {
        return email;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}

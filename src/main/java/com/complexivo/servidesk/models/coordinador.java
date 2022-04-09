package com.complexivo.servidesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "coordinador")

public class coordinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCoordinador ;

    @Column(nullable = false, length = 50,unique = true)
    private String email ;

    @Column(nullable = false,length = 20)
    private String password ;

    @OneToOne
    @JoinColumn(name = "cedula", updatable = false, nullable = false, referencedColumnName = "cedula")
    private persona persona;

    

    public coordinador() {
    }


    public coordinador(Long codCoordinador, String email, String password, persona persona) {
        this.codCoordinador = codCoordinador;
        this.email = email;
        this.password = password;
        this.persona = persona;
    }
    public coordinador(Long codCoordinador, String email, String password) {
        this.codCoordinador = codCoordinador;
        this.email = email;
        this.password = password;
        
    }
   


    public Long getCodCoordinador() {
        return this.codCoordinador;
    }

    public void setCodCoordinador(Long codCoordinador) {
        this.codCoordinador = codCoordinador;
    }
    

    public persona getPersona() {
        return this.persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

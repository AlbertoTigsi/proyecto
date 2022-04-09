package com.complexivo.servidesk.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prioridad")
public class prioridad  {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Long codPrioridad;
     private  String nivelPrioridad;
     private  int tiempoRespuesta;

     
    public Long getCodPrioridad() {
        return codPrioridad;
    }

    public void setCodPrioridad(Long codPrioridad) {
        this.codPrioridad = codPrioridad;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    

}

package com.complexivo.servidesk.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solucion")
public class solucion {

     @Id
    private Long codSolucion;
    private Date fechafinalizacion;
     private String descripcion;
     private String encuesta;

     public  solucion(){

     }

    public solucion(Long codSolucion, Date fechafinalizacion, String descripcion, String encuesta) {
      this.codSolucion = codSolucion;
      this.fechafinalizacion = fechafinalizacion;
      this.descripcion = descripcion;
      this.encuesta = encuesta;
    }

    public Long getCodSolucion() {
      return codSolucion;
    }

    public void setCodSolucion(Long codSolucion) {
      this.codSolucion = codSolucion;
    }

    public Date getFechafinalizacion() {
      return fechafinalizacion;
    }

    public void setFechafinalizacion(Date fechafinalizacion) {
      this.fechafinalizacion = fechafinalizacion;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public String getEncuesta() {
      return encuesta;
    }

    public void setEncuesta(String encuesta) {
      this.encuesta = encuesta;
    }

 
    
    

    
}
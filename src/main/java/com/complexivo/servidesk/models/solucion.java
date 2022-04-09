package com.complexivo.servidesk.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="solucion")
public class solucion {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codSolucion;
    private Date fechafinalizacion;
     private String descripcion;
     
    @OneToOne
    @JoinColumn(name = "codticket", updatable = false,  referencedColumnName = "codticket")
    private ticket ticket;
     public  solucion(){

     }

      

    public solucion(Long codSolucion, Date fechafinalizacion, String descripcion) {
      this.codSolucion = codSolucion;
      this.fechafinalizacion = fechafinalizacion;
      this.descripcion = descripcion;
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

    public ticket getTicket() {
        return ticket;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }

    
}
package com.complexivo.servidesk.dto;

import java.io.Serializable;
import java.util.Date;


public class ReporteDto implements Serializable{

    private Long codTicket;
    private String usuario;
    private String categoria;
    private String servicio;
    private String tipo;
    private Double SLA;
    private String tecnico;
    private String estado;
    private Date fechaCreacion;
    private String descripcionTicket;
    private String viaComunicacion;
    

    public ReporteDto(Long codTicket, String usuario, String categoria, String servicio, String tipo, Double sLA,
            String tecnico, String estado, Date fechaCreacion, String descripcionTicket, String viaComunicacion) {
        this.codTicket = codTicket;
        this.usuario = usuario;
        this.categoria = categoria;
        this.servicio = servicio;
        this.tipo = tipo;
        SLA = sLA;
        this.tecnico = tecnico;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.descripcionTicket = descripcionTicket;
        this.viaComunicacion = viaComunicacion;
    }

    public ReporteDto() {
    }

    public Long getCodTicket() {
        return codTicket;
    }

    public void setCodTicket(Long codTicket) {
        this.codTicket = codTicket;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSLA() {
        return SLA;
    }

    public void setSLA(Double sLA) {
        SLA = sLA;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionTicket() {
        return descripcionTicket;
    }

    public void setDescripcionTicket(String descripcionTicket) {
        this.descripcionTicket = descripcionTicket;
    }

    public String getViaComunicacion() {
        return viaComunicacion;
    }

    public void setViaComunicacion(String viaComunicacion) {
        this.viaComunicacion = viaComunicacion;
    }
    
    
}

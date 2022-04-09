package com.complexivo.servidesk.models;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="encuesta")
public class encuesta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codEncuesta;
        
	@Column(name="valoracionEncuesta")
	private int valoracionEncuesta;
	
        @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEncuesta")
        private List<detalleEncuesta> detalleEncuestas;
        
	public encuesta() {	}
	
	public Long getCodEncuesta() {
		return codEncuesta;
	}
	public void setCodEncuesta(Long codEncuesta) {
		this.codEncuesta = codEncuesta;
	}
	public int getValoracionEncuesta() {
		return valoracionEncuesta;
	}
	public void setValorEncuesta(int valoracionEncuesta) {
		this.valoracionEncuesta = valoracionEncuesta;
	}
	
}

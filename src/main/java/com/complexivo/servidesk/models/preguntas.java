package com.complexivo.servidesk.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "preguntas")
public class preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codPregunta;
    @Column(name = "pregunta",nullable = false,length = 150,unique = true)
    private String pregunta;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPreguntas")
    private List<detalleEncuesta> detalleEncuestas;
    
    
    public preguntas(long codPregunta, String pregunta) {
        this.codPregunta = codPregunta;
        this.pregunta = pregunta;
    }
    
    public preguntas() {}

    public long getCodPregunta() {
	return codPregunta;
    }

    public void setCodPregunta(long codPregunta) {
	this.codPregunta = codPregunta;
    }

    public String getPregunta() {
	return pregunta;
    }

    public void setPregunta(String pregunta) {
	this.pregunta = pregunta;
    }
		
}

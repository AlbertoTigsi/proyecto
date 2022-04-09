package com.complexivo.servidesk.controllers;
import com.complexivo.servidesk.models.preguntas;
import com.complexivo.servidesk.service.preguntasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/preguntas")
public class preguntasController {
	@Autowired
	private preguntasService preguntService;
	
	@GetMapping("/listar")
	public List<preguntas>listar(){
		return this.preguntService.Listar();
	}
	
	@GetMapping("/buscar/{idPregunta}")
	public Optional<preguntas> Buscar(@PathVariable Long idPregunta) {
		return this.preguntService.Buscar(idPregunta);
	}
	
	@PostMapping("/guardar")
	public preguntas nuevo(@RequestBody preguntas pregunta) {
		return this.preguntService.Nuevo(pregunta);
	}
	
	@DeleteMapping("/delete/{idPregunta}")
	public void delete(@PathVariable Long idPregunta) {
		this.preguntService.Eliminar(idPregunta);
	}

	@PutMapping("/actualizar/{codPregunta}")
	public preguntas actualizar(@PathVariable Long codPregunta,@RequestBody preguntas pregunta){
		return preguntService.actualizar(codPregunta, pregunta);
	}
	
}
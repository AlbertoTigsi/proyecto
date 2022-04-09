package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.encuesta;
import com.complexivo.servidesk.service.encuestaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("encuesta")
public class encuestaController {
	@Autowired
	private encuestaService encuestService;
	
	@GetMapping("/listar")
	public List<encuesta>listar(){
		return this.encuestService.listar();
	}
	
	@GetMapping("/buscar/{idEncuesta}")
	public Optional<encuesta> Buscar(@PathVariable Long idEncuesta) {
		return this.encuestService.Buscar(idEncuesta);
	}
	
	@PostMapping("/guardar")
	public encuesta nuevo(@RequestBody encuesta encuesta) {
		return this.encuestService.nuevo(encuesta);
	}
	
	@DeleteMapping("/delete/{idEncuesta}")
	public void delete(@PathVariable Long idEncuesta) {
		this.encuestService.ELiminar(idEncuesta);
	}
	
}

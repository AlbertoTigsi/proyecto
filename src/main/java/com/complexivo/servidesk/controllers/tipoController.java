package com.complexivo.servidesk.controllers;

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

import com.complexivo.servidesk.models.tipo;
import com.complexivo.servidesk.service.tipoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipo")
public class tipoController {

    @Autowired
	private tipoService tipoService;
	
	@GetMapping("/listar")
	public List<tipo>listar(){
		return this.tipoService.listar();
	}
	
	@GetMapping("/buscar/{idtipo}")
	public Optional<tipo> Buscar(@PathVariable Long idtipo) {
		return this.tipoService.Buscar(idtipo);
	}
	
	@PostMapping("/guardar")
	public tipo nuevo(@RequestBody tipo tipo) {
		return this.tipoService.nuevo(tipo);
	}
	
	@DeleteMapping("/delete/{idtipo}")
	public void delete(@PathVariable Long idtipo) {
		this.tipoService.ELiminar(idtipo);
	}

    @PutMapping("/editar/{codTipo}")
    public tipo editarTipo(@PathVariable Long codTipo, @RequestBody tipo tipo) {
       return tipoService.editarTipo(codTipo, tipo);
    }

	@GetMapping("buscarpornombre/{nombre}")
	public tipo buscarPorNombre(@PathVariable String nombre){
		return tipoService.buscarPorNombre(nombre);
	}
   
	
}

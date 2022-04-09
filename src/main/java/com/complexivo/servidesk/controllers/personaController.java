package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.persona;
import com.complexivo.servidesk.service.personaService;

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


@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "*")
public class personaController {
    
    @Autowired
    private personaService service;
    
    @GetMapping("/listar")
    public List<persona> listar() {
        return this.service.listar();

    }
    
    @GetMapping("/buscar/{cedula}")
    public void buscarPersona(@PathVariable String cedula) {
         this.service.buscarPersona(cedula);
    }
    
    @PostMapping("/guardar")
    public persona crearPersona(@RequestBody persona persona ) {
        return this.service.crearPersona(persona);
    }

    @DeleteMapping("/eliminar/{cedula}")
    public void eliminarPersona(@PathVariable String cedula) {
        this.service.eliminarPersona(cedula);
    }

    @PutMapping("/editar/{cedula}")
    public persona editarPersona(@PathVariable String cedula, @RequestBody persona persona) {
       return this.service.editarPersona(cedula, persona);
    }
    @GetMapping("/obtener_tecnico_nivel/{nivel}")
    public List<persona>obtenerTecnicoPorNivel(@PathVariable int nivel){
        return this.service.getTecnicoPorNivel(nivel);
    }
}

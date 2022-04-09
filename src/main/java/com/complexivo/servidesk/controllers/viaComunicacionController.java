package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.viaComunicacion;
import com.complexivo.servidesk.service.viaComunicacionService;

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
@RequestMapping("viaComunicacion")
@CrossOrigin(origins = "*")
public class viaComunicacionController {

    @Autowired
    private viaComunicacionService service;
    
    @GetMapping("/listar")
    public List<viaComunicacion> listar() {
        return this.service.listar();
    }
    
    @GetMapping("/buscar/{codViaComunicacion}")
    public void buscarViaComunicacion(@PathVariable Long codViaComunicacion) {
         this.service.buscarViaComunicacion(codViaComunicacion);
    }
    
    @PostMapping("/guardar")
    public viaComunicacion crearViaComunicacion(@RequestBody viaComunicacion viaComunicacion) {
        return this.service.crearViaComunicacion(viaComunicacion);
    }

    @DeleteMapping("/eliminar/{codViaComunicacion}")
    public void eliminarViaComunicacion(@PathVariable Long codViaComunicacion) {
        this.service.eliminarViaComunicacion(codViaComunicacion);
    }

    @PutMapping("/editar/{codViaComunicacion}")
    public viaComunicacion editarViaComunicacion(@PathVariable Long codViaComunicacion, @RequestBody viaComunicacion viaComunicacion) {
       return this.service.editarViaComunicacion(codViaComunicacion, viaComunicacion);
    }
    
}

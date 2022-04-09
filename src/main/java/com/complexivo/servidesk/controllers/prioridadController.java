package com.complexivo.servidesk.controllers;

import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.models.prioridad;
import com.complexivo.servidesk.service.prioridadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prioridad")
@CrossOrigin(origins = "*")
public class prioridadController {

    @Autowired
     private prioridadService prioridadservice;
    
   
    @GetMapping("/listar")
    public List<prioridad> listar() {
        return  this.prioridadservice.listar();
    }



    @PostMapping("/guardar")
    public prioridad guardar(@RequestBody prioridad p) {
        return this.prioridadservice.nuevo(p);

        
    }
    @GetMapping("/buscar/{codprioridad}")
    public Optional<prioridad>Buscar(@PathVariable Long codprioridad) {
         return this.prioridadservice.Buscar(codprioridad);
    }
 

    
    @DeleteMapping("/{codprioridad}")
    public void eliminar(@PathVariable Long codprioridad) {
       this.prioridadservice.Eliminar(codprioridad);
    }

    @GetMapping("/buscar_id/{nivelPrioridad}")
    public Optional<prioridad> obtenerByNivelPrioridad(@PathVariable String nivelPrioridad){
        return this.prioridadservice.obtenerByNivelPrioridad(nivelPrioridad);
    }
    
   
}
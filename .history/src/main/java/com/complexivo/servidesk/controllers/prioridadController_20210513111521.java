package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.prioridad;
import com.complexivo.servidesk.repository.prioridadRepository;
import com.complexivo.servidesk.service.prioridadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prioridad")
public class prioridadController {

    @Autowired
     private prioridadService prioridadservice;
    
   
    @RequestMapping("/listar")
    public List<prioridad> listar() {
        return  this.prioridadservice.listar();
    }



    @RequestMapping("/guardar")
    public prioridad guardar(@RequestBody prioridad p) {
        return this.prioridadservice.save(p);

        
    }
    @GetMapping("/{codprioridad}")
    public void buscar(@PathVariable Long codPrioridad) {
        this.prioridadservice.findById(codPrioridad);
    }
 

    
    @DeleteMapping("/{codPrioridad}")
    public void eliminar(@PathVariable Long codPrioridad) {
        prioridadservice.deleteById(codPrioridad);
    }
    
   
}
package com.complexivo.servidesk.controllers;

import java.util.List;

import javax.validation.Valid;

import com.complexivo.servidesk.models.incidente;
import com.complexivo.servidesk.repository.incidenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping("incidente")
public class incidenteController {
   
    @Autowired
    private incidenteRepository incidenteRepository;

    @GetMapping("/listar")  
    public List<incidente> listar() {

        
        return this.incidenteRepository.findAll();

    }
    
    @PostMapping("/guardar")
    public incidente guardar( @Valid @RequestBody incidente incidente) {
        return this.incidenteRepository.save(incidente);
    }
    
    @DeleteMapping("/{codIncidente}")
    public void eliminar(@PathVariable Long codIncidente) {
        this.incidenteRepository.deleteById(codIncidente);
    }
}

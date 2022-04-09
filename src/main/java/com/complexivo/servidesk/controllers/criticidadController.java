package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.criticidad;
import com.complexivo.servidesk.service.criticidadService;

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
@RequestMapping("/criticidad")
@CrossOrigin(origins = "*")
public class criticidadController {
    @Autowired
    private criticidadService criticidadservice;

    @PostMapping("/guardar")
    public criticidad guardarCriticidad(@RequestBody criticidad criticidad){
        return criticidadservice.guardarCriticidad(criticidad);

    }

    @GetMapping("/listar")
    public List<criticidad> listarCriticidad(){
        return criticidadservice.listarCriticidad();
    }

    @GetMapping("/buscarpornivel/{nivelCriticidad}")
    public criticidad buscarPorNivel(@PathVariable String nivelCriticidad){
        return criticidadservice.buscarPorNivel(nivelCriticidad);
    }

    @GetMapping("/buscarporcodigo/{codCriticidad}")
    public criticidad buscarporCodigo(@PathVariable Long codCriticidad){
        return criticidadservice.buscarporCodCriticidad(codCriticidad);
    }

    @PutMapping("/actualizar/{codCriticidad}")
    public criticidad actualizarCriticidad(@RequestBody criticidad criticidad,@PathVariable Long codCriticidad){
        return criticidadservice.actualizaCriticidad(criticidad, codCriticidad);
    }

    @DeleteMapping("/eliminar/{codCriticidad}")
    public String eliminarCriticidad(@PathVariable Long codCriticidad){
        return criticidadservice.eliminarCriticidad(codCriticidad);
    }
    
    
}

package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.estado;
import com.complexivo.servidesk.service.estadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/estado")
public class estadoController {

    @Autowired
    private estadoService estadoService;

    @GetMapping("/listar-estados")
    public List<estado> listarEstados(){
        return this.estadoService.listarEstados();
    }
    
    @PostMapping("/guardar-estados")
    public estado crearEstado(@RequestBody estado estado) {
        return this.estadoService.crearEstado(estado);
    }
}

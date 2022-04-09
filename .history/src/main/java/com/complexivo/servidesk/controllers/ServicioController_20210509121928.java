/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.Servicio;
import com.complexivo.servidesk.repository.ServicioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jessica Alvarez
 */
@RestController
public class ServicioController {
    
    @Autowired
    private ServicioRepository serviciorepository;
    
    @GetMapping("/listaServicio")
    public List<Servicio>getAllCoordinador(){
        return serviciorepository.findAll();
    } 
    
}

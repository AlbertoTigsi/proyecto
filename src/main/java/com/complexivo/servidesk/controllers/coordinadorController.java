package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.coordinador;
import com.complexivo.servidesk.service.coordinadorService;

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
@CrossOrigin(origins = "*")
@RequestMapping("/coordinador")
public class coordinadorController {

    @Autowired
    private coordinadorService coordinadorservice ;

    @GetMapping("/listar-coordinador")
    public List<coordinador> listarCoordinador() {
        return this.coordinadorservice.listarCoordinadores();
    }

    @GetMapping("/buscar-coordinador/{codCoordinador}")
    public coordinador buscarporId(@PathVariable Long codCoordinador) {
        return this.coordinadorservice.buscarPorId(codCoordinador);
    }

    @PostMapping("/guardar-coordinador")
    public coordinador creaCoordinador(@RequestBody coordinador coordinador) {
        return this.coordinadorservice.crearCoordinador(coordinador);
    }

    @DeleteMapping("/eliminar-coordinador/{codCoordinador}")
    public void eliminarCoordinadorPorID(@PathVariable Long codCoordinador) {
        this.coordinadorservice.eliminarCoordinador(codCoordinador);
    }

    @PutMapping("/actualizar-coordinador/{codCoordinador}")
    public coordinador actualizarCoordinador(@RequestBody coordinador coordinador, @PathVariable Long codCoordinador) {
        return coordinadorservice.actualizarCoordinador(coordinador, codCoordinador);
    }
    @GetMapping("/login/{email}/{contrasena}")
    public coordinador login(@PathVariable String email,@PathVariable String contrasena){
        return this.coordinadorservice.loginCoordinador(email, contrasena);
    }
}

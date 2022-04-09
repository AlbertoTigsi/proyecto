package com.complexivo.servidesk.controllers;

import com.complexivo.servidesk.models.tecnico;
import com.complexivo.servidesk.service.tecnicoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tecnico")
public class tecnicoController {

    @Autowired
    private tecnicoService serv;

    @GetMapping("/listar")
    public List<tecnico> listar() {
        return this.serv.listar();

    }

    @PostMapping("/guardar")
    public tecnico guardar(@RequestBody tecnico codTecnico) {
        return this.serv.guardar(codTecnico);
    }

    @DeleteMapping("/{codTecnico}")
    public void eliminar(@PathVariable Long codTecnico) {
        this.serv.Eliminar(codTecnico);
    }

    @GetMapping("/listar-tecnicos-nivel/{nivel}")
    public List<tecnico> listarPorNivel(@PathVariable int nivel, @RequestParam(value = "page") int page,
            @RequestParam(value = "size") int size) {
        return serv.listarPorNivel(nivel, page, size);
    }

    @GetMapping("/listar-tecnicos-niveles/{nivel}")
    public List<tecnico> listarPorNiveles( @PathVariable int nivel){
                return serv.listarPorNiveles(nivel);
            }
            


    @GetMapping("/tecnico/{codTecnico}")
    private tecnico obtenerTecnico(@PathVariable Long codTecnico) {
        return serv.recuperarTecnico(codTecnico);
    }

    @PutMapping("/actualizartecnico/{codTecnico}")
    public tecnico actualizarTecnico(@RequestBody tecnico tecnico, @PathVariable Long codTecnico) {
        return serv.actualizarTecnico(tecnico, codTecnico);
    }

    @GetMapping("/buscarporemail/{email}")
    public tecnico buscarPorEmail(@PathVariable String email) {
        return serv.buscarPorEmail(email);
    }

    @GetMapping("/login/{email}/{contrasena}")
    public tecnico login(@PathVariable String email, @PathVariable String contrasena) {
        return serv.loginTecnico(email, contrasena);
    }

    @GetMapping("/buscar_por_cedula/{cedula}")
    public int buscarTecnicoPorCedula(@PathVariable String cedula) {
        return this.serv.obtenerTecnicoPorCedula(cedula);
    }

}
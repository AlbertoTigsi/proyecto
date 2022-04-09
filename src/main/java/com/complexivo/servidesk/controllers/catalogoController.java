/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.complexivo.servidesk.models.catalogo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.complexivo.servidesk.service.catalogoService;

/**
 *
 * @author AlexanderGuzman
 */
@RestController
@RequestMapping("/catalogo")
@CrossOrigin(origins = "*")
public class catalogoController {
    @Autowired
    catalogoService service;
    
    @GetMapping("/listar")
    @CrossOrigin
    public List<catalogo> listar() {
        return this.service.listar();

    }
    
    @PostMapping("/guardar")
    @CrossOrigin
    public catalogo guardar(@RequestBody catalogo e) {
        return this.service.guardar(e);
    }
    
    @DeleteMapping("/eliminar/{codCatalogo}")
    @CrossOrigin
    public void eliminar(@PathVariable Long codCatalogo) {
        this.service.eliminar(codCatalogo);
    }
    @PutMapping("/estado/{codCatalogo}")
    @CrossOrigin
    public catalogo editarEstado(@PathVariable Long codCatalogo, @RequestBody catalogo catalogo1) {
      
       return service.editarEstado(codCatalogo, catalogo1);
    }
    @PutMapping("/categoria/{codCatalogo}")
    @CrossOrigin
    public catalogo editarCategoria(@PathVariable Long codCatalogo, @RequestBody catalogo catalogo1) {
       return service.editarCategoria(codCatalogo, catalogo1);
    }
    //falta el metodo editar

    @GetMapping("/buscarporcategoria/{categoria}")
    public catalogo buscarPorNombre(@PathVariable String categoria){
        return service.buscarPorCategoria(categoria);
    }

    @PutMapping("/actualizarcatalogo/{codCatalogo}")
    public catalogo actualizarCatalogo(@PathVariable Long codCatalogo,@RequestBody catalogo catalogo){
        return service.actualizarCatalogo(codCatalogo, catalogo);
    }

    @GetMapping("/buscarporcodigo/{codCatalogo}")
    public catalogo buscarPorCodigo(@PathVariable Long codCatalogo){
        return service.buscarPorCodigo(codCatalogo);
    }
}

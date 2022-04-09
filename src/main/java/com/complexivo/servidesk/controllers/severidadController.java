package com.complexivo.servidesk.controllers;

import java.util.List;

import com.complexivo.servidesk.models.severidad;
import com.complexivo.servidesk.service.severidadService;

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
@RequestMapping("/severidad")
@CrossOrigin(origins = "*")
public class severidadController {

    @Autowired
    private severidadService severidadservice;

    @PostMapping("/agregar-severidad")
    public severidad agregarSeveridad(@RequestBody severidad severidad) {
        return severidadservice.agregarseveridad(severidad);

    }

    @GetMapping("/listar-severidades")
    public List<severidad> listarSeveridades() {
        return severidadservice.recuperarSeveridades();
    }

    @GetMapping("/recuperar-severidad/{codSeveridad}")
    public severidad recuperarSeveridad(@PathVariable Long codSeveridad) {
        return severidadservice.recuperarSeveridad(codSeveridad);
    }

    @PutMapping("/actualizar-severidad/{codSeveridad}")
    public severidad actualizarSeveridad(@RequestBody severidad severidad, @PathVariable Long codSeveridad) {
        return severidadservice.actualizarSeveridad(severidad, codSeveridad);
    }

    @DeleteMapping("/eliminar-severidad/{codSeveridad}")
    public String eliminarSeveridad(@PathVariable Long codSeveridad) {
        return severidadservice.eliminarSeveridad(codSeveridad);
    }
    @GetMapping("/recuperar-severidad-nivel/{nivelSeveridad}")
    public severidad recuperarSeveridadPorNivelSeveridad(@PathVariable String nivelSeveridad) {
        return this.severidadservice.findByNivelSeveridad(nivelSeveridad);
    }
}

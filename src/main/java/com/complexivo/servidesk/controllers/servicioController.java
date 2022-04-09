package com.complexivo.servidesk.controllers;
import com.complexivo.servidesk.models.servicio;
import com.complexivo.servidesk.service.servicioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping("/servicio")
public class servicioController {

    @Autowired
    private servicioService servicioservice;

    @GetMapping("/listar-servicio")
    public List<servicio> listarServicios() {
        return this.servicioservice.listarServicio();
    }

    @GetMapping("/buscar-servicio/{codServicio}")
    public servicio buscarporId(@PathVariable Long codServicio) {
        return this.servicioservice.buscarPorId(codServicio);
    }

    @GetMapping("/filtrar-servicio/{codTipo}/{codCatalogo}")
    @CrossOrigin
    public List<servicio> findServicioByTipo(@PathVariable Long codTipo, @PathVariable Long codCatalogo){
        return this.servicioservice.findServicioByTipoCatalogo(codTipo, codCatalogo);
    }

    @PostMapping("/guardar-servicio")
    public servicio crearServicio(@RequestBody servicio servicio) {
        return this.servicioservice.crearServicio(servicio);
    }

    @DeleteMapping("/eliminar-servicio/{codServicio}")
    public void eliminarServicioPorID(@PathVariable Long codServicio) {
        this.servicioservice.eliminarServicio(codServicio);
    }

    @PutMapping("/actualizar-servicio/{codServicio}")
    public servicio actualizarServicio(@RequestBody servicio servicio, @PathVariable Long codServicio) {
        return servicioservice.actualizarServicio(servicio, codServicio);
    }
    @Transactional
    @PutMapping("/actualizar-servicio/prioridad/{cod_prioridad}/{cod_servicio}")
    public void actualizarPrioridadServicio( @PathVariable Long cod_prioridad, @PathVariable Long cod_servicio) {
       this.servicioservice.editarIdPrioridad(cod_prioridad,cod_servicio);
    }

    @GetMapping("listaservicios/{codCatalogo}/{page}/{size}")
    public List<servicio> listaServiciosPorCatalogo(@PathVariable int codCatalogo,@PathVariable int page,@PathVariable int size){
        return servicioservice.listarServiciosPorCatalogo(codCatalogo, page, size);
    }

    @GetMapping("listaserviciosporcategoria/{codCatalogo}")
    public List<servicio> listaServiciosPorCategoria(@PathVariable int codCatalogo){
        return servicioservice.listarServicioPorCategoria(codCatalogo);
    }
}

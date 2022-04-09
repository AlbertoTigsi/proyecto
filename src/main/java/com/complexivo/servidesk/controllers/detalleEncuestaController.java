
package com.complexivo.servidesk.controllers;


import com.complexivo.servidesk.models.detalleEncuesta;
import com.complexivo.servidesk.service.detalleEncuestaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("detalleEncuesta")
public class detalleEncuestaController {
    @Autowired
    private detalleEncuestaService detallEncuestaService;

    @GetMapping("/listar")
    public List<detalleEncuesta> listar(){
        return this.detallEncuestaService.listar();
    }

    @GetMapping("/buscar/{idDetalleEn}")
    public Optional<detalleEncuesta> buscar(@PathVariable Long idDetalleEn){
        return this.detallEncuestaService.buscar(idDetalleEn);
    }

    @PostMapping("/guardar")
    public detalleEncuesta nuevo(@RequestBody detalleEncuesta detallEncuesta){
        return this.detallEncuestaService.nuevo(detallEncuesta);
    }

    @DeleteMapping("/delete/{idDetalleEn}")
    public void delete(@PathVariable Long idDetalleEn){
        this.detallEncuestaService.Eliminar(idDetalleEn);
    }
    
    @GetMapping("/preguntas/{cod_encuesta}")
    public List<detalleEncuesta> llamar(@PathVariable Long cod_encuesta){
      return this.detallEncuestaService.llamarP(cod_encuesta);
    }
}

package com.complexivo.servidesk.service;

import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.models.viaComunicacion;
import com.complexivo.servidesk.repository.viaComunicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class viaComunicacionService {
    
    @Autowired
    private viaComunicacionRepository rep;


    public List<viaComunicacion> listar() {
        return this.rep.findAll();
    }

    public viaComunicacion buscarViaComunicacion(Long codViaComunicacion) {
        return this.rep.findByCodViaComunicacion(codViaComunicacion);
    }

    public viaComunicacion crearViaComunicacion(viaComunicacion viaComunicacion ) {
        if(rep.findByCodViaComunicacion(viaComunicacion.getCodViaComunicacion())!= null){
            return new viaComunicacion();
        }
        return this.rep.save(viaComunicacion);
    }

    public void eliminarViaComunicacion(Long codViaComunicacion) {
        if(rep.findByCodViaComunicacion(codViaComunicacion)!= null){
            rep.deleteById(codViaComunicacion);
        }
    }
    
    public viaComunicacion editarViaComunicacion(Long codViaComunicacion, viaComunicacion viaComunicacion) {
        if (rep.findById(codViaComunicacion).isPresent()) {
            viaComunicacion viaComunicacionUpdate=rep.findById(codViaComunicacion).get();
            viaComunicacionUpdate = viaComunicacion;
            return rep.save(viaComunicacionUpdate);		
        }
       return viaComunicacion;
    }

}

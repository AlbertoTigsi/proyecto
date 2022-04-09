package com.complexivo.servidesk.service;

import java.util.List;

import com.complexivo.servidesk.models.criticidad;
import com.complexivo.servidesk.repository.criticidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class criticidadService {

    @Autowired
    private criticidadRepository criticidadrepository;

    public criticidad guardarCriticidad(criticidad criticidad){
        if(criticidadrepository.findByNivelCriticidad(criticidad.getNivelCriticidad())!=null){
            return new criticidad();
        }
        return criticidadrepository.save(criticidad);
    }

    public List<criticidad> listarCriticidad(){
        return criticidadrepository.findAll();
    }

    public criticidad buscarPorNivel(String nivelCriticidad){
        return criticidadrepository.findByNivelCriticidad(nivelCriticidad);
    }

    public criticidad buscarporCodCriticidad(Long codCriticidad){
        return  criticidadrepository.findByCodCriticidad(codCriticidad);
    }

    public criticidad actualizaCriticidad(criticidad criticidad,Long codCriticidad){
        if(criticidadrepository.findByCodCriticidad(codCriticidad)!=null){
            criticidad.setCodCriticidad(codCriticidad);
            return criticidadrepository.save(criticidad);
        }
        return null;
    }

    public String eliminarCriticidad(Long codCriticidad){
        if(criticidadrepository.findByCodCriticidad(codCriticidad)!=null){
            criticidadrepository.deleteById(codCriticidad);
            return "La criticidad con el codigo "+codCriticidad+" ha sido eliminada";
        }
        return "No se ha encontrado una criticidad con el codigo ingresado";
    }
    
}

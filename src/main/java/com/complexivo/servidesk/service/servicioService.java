/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.service;

import com.complexivo.servidesk.models.servicio;
import com.complexivo.servidesk.repository.servicioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jessica Alvarez
 */
@Service
public class servicioService {
    
    @Autowired
    public servicioRepository serviciorepository;
 
    public List<servicio> listarServicio(){
        return serviciorepository.findAll();
    }
    
    public servicio crearServicio(servicio servicio){
        if(serviciorepository.findByCodServicio(servicio.getCodServicio())!= null){
            return new servicio();
        }
        return serviciorepository.save(servicio);
    }
    
    public void eliminarServicio(Long codServicio){
        if(serviciorepository.findByCodServicio(codServicio)!= null){
            serviciorepository.deleteById(codServicio);
        }
        
    }
    
    public servicio buscarPorId(Long codServicio){
        return serviciorepository.findByCodServicio(codServicio);
    }
    
    public servicio actualizarServicio(servicio servicio, Long codServicio){
        if(serviciorepository.findByCodServicio(codServicio)!= null){
            servicio.setCodServicio(codServicio);
            return serviciorepository.save(servicio);
        }
       return null;
    }

    //lenin
    public void editarIdPrioridad( Long cod_prioridad , Long cod_servicio) {
        if (serviciorepository.findById(cod_servicio).isPresent()) {
            this.serviciorepository.updateServicePrioridad(cod_prioridad,cod_servicio);		
        }
  
    }

    public List<servicio> findServicioByTipoCatalogo(Long codTipo, Long codCatalogo){
        return this.serviciorepository.findServicioByTipoCatalogo(codTipo, codCatalogo);
    }

    public List<servicio> listarServiciosPorCatalogo(int codCatalogo,int page,int size){
        return serviciorepository.findservicosbyCatalogo(codCatalogo, PageRequest.of(page, size));
    }

    public List<servicio> listarServicioPorCategoria(int codCatalogo){
        return serviciorepository.findservicosbyCategoria(codCatalogo);
    }
}



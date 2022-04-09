package com.complexivo.servidesk.repository;

import com.complexivo.servidesk.models.viaComunicacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface viaComunicacionRepository extends JpaRepository <viaComunicacion, Long>{
    
    public viaComunicacion findByCodViaComunicacion(Long codViaComunicacion);

}

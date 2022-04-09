package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.complexivo.servidesk.models.persona;
import java.util.List;
@Repository
public interface personaRespository extends JpaRepository<persona, String> {

    public persona findByCedula(String Cedula);
    
    
    @Query(value = "Select persona.* from persona join tecnico using(cedula) where nivel=?1", nativeQuery = true)
    List<persona> listarTecnicosPorNivel(int nivel);
}

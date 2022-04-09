package com.complexivo.servidesk.repository;

import java.util.List;

import com.complexivo.servidesk.models.tecnico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tecnicoRepository extends JpaRepository<tecnico, Long> {

    tecnico findByCodTecnico(Long codTecnico);

    List<tecnico> findAllByNivel(int nivel, Pageable pageable);

    List<tecnico> findAllByNivel(int nivel);

    tecnico findByEmail(String email);

    tecnico findByEmailAndContrasena(String email,String contrasena);
  
    @Query(value = "select cod_Tecnico from tecnico where cedula=?1", nativeQuery = true)
    int buscarPorCedula(String cedula);


}



package com.complexivo.servidesk.repository;

import java.util.List;

import com.complexivo.servidesk.models.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository <usuario, Long>{

    public usuario findByCodUsuario(Long codUsuario);

    public usuario findByEmail(String email);
    
    usuario findByEmailAndContrasena(String email,String contrasena);
    
}

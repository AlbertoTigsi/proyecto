package com.complexivo.servidesk.service;
import java.util.List;
import java.util.Optional;

import com.complexivo.servidesk.models.usuario;
import com.complexivo.servidesk.repository.usuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class usuarioService{

    @Autowired
    private usuarioRepository rep;

    public List<usuario> listar() {
        return rep.findAll();
    }

    public Optional<usuario>  buscarUsuarioLista(Long codUsuario) {
        return this.rep.findById(codUsuario);
    }

    public usuario buscarEmail(String email) {
        return rep.findByEmail(email);
    }

    public usuario crearUsuario(usuario usuario ) {
        if(rep.findByCodUsuario(usuario.getCodUsuario())!= null 
        ||
        rep.findByEmail(usuario.getEmail())!= null){
            return new usuario();
        }
        return this.rep.save(usuario);
    }

    public void eliminarUsuario(Long codUsuario) {
        if(rep.findByCodUsuario(codUsuario)!= null){
            rep.deleteById(codUsuario);
        }
    }

    public usuario editarUsuario(Long codUsuario, usuario usuario) {
        if (rep.findById(codUsuario).isPresent()) {
            usuario personaUpdate=rep.findById(codUsuario).get();
            personaUpdate = usuario;
            return rep.save(personaUpdate);		
        }
       return usuario;
    }
    public usuario loginUsuario(String email,String contrasena){
        return this.rep.findByEmailAndContrasena(email, contrasena);
    }
}

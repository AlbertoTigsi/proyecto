package com.complexivo.servidesk.service;
import com.complexivo.servidesk.models.tecnico;
import com.complexivo.servidesk.repository.tecnicoRepository;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class tecnicoService {

    @Autowired
    private tecnicoRepository    repo;
    
    public List<tecnico> listar(){
        return this.repo.findAll();
    }
    public tecnico guardar(tecnico p){
        if(this.repo.findByEmail(p.getEmail())==null){
            return this.repo.save(p);
        }
        return null;
        
    }
    public void Eliminar(Long codTecnico){
        this.repo.deleteById(codTecnico);
    }

    public List<tecnico> listarPorNivel(int nivel,int page,int size){
        return repo.findAllByNivel(nivel,PageRequest.of(page, size));
    }

    public List<tecnico> listarPorNiveles(int nivel){
        return repo.findAllByNivel(nivel);
    }

    public tecnico recuperarTecnico(Long codTecnico){
        return repo.findByCodTecnico(codTecnico);
    }

    public tecnico actualizarTecnico(tecnico tecnico,Long codTecnico){
        if(repo.findByCodTecnico(codTecnico)!=null){
            tecnico.setCodTecnico(codTecnico);
            return repo.save(tecnico);
        }
        return null;
    }

    public tecnico buscarPorEmail(String email){
        return repo.findByEmail(email);
    }

    public tecnico loginTecnico(String email,String contrasena){
        return repo.findByEmailAndContrasena(email, contrasena);
    }
    public int obtenerTecnicoPorCedula(String cedula){
        return this.repo.buscarPorCedula(cedula);
    }
   

    
}

package com.complexivo.servidesk.service;
import com.complexivo.servidesk.dto.ReporteDto;
import com.complexivo.servidesk.models.ticket;
import com.complexivo.servidesk.repository.ticketRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reporteDtoService {
    

    @Autowired
    private ticketRepository repo;

    public List<ReporteDto> valoresPorFechayEstados(Date fechainicial,Date fechafinal,int codestado){
        List<ReporteDto> reporte = new ArrayList();
        List<ticket> listatickets= repo.findTicketsbyFechaandEstado(fechainicial, fechafinal, codestado);
       
        for(int i=0;i<listatickets.size();i++){
            ReporteDto reporteDto= new ReporteDto();
            reporteDto.setCodTicket(listatickets.get(i).getCodticket());
            reporteDto.setUsuario(listatickets.get(i).getUsuario().getPersona().getNombres());
            reporteDto.setCategoria(listatickets.get(i).getServicio().getCatalogo().getCategoria());
            reporteDto.setServicio(listatickets.get(i).getServicio().getDescripcion());
            reporteDto.setTipo(listatickets.get(i).getServicio().getTipo().getNombre());
            reporteDto.setSLA(listatickets.get(i).getSla());
            reporteDto.setTecnico(listatickets.get(i).getTecnico().getPersona().getNombres());
            reporteDto.setFechaCreacion(listatickets.get(i).getFechaCreacion());
            reporteDto.setEstado(listatickets.get(i).getEstado().getNombreEstado());
            reporteDto.setDescripcionTicket(listatickets.get(i).getDescripcionTicket());
            reporteDto.setViaComunicacion(listatickets.get(i).getViaComunicacion().getNombre());
            reporte.add(reporteDto);
        }
        return reporte;
    }
}

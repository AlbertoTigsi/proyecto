package com.complexivo.servidesk.controllers;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.complexivo.servidesk.dto.ReporteDto;
import com.complexivo.servidesk.service.reporteDtoService;
import com.complexivo.servidesk.tools.ExportCsv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reportes")
@CrossOrigin(origins = "*")
public class reportesDtoController {

    @Autowired
    private reporteDtoService service;

    @GetMapping("/listar")
    public List<ReporteDto> obtenerReportes(
        @RequestParam(name="fechainicial")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date fechainicial,
        @RequestParam(name="fechafinal")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date fechafinal,
        @RequestParam(name="codestado") int codestado){
            return service.valoresPorFechayEstados(fechainicial, fechafinal, codestado);
        }

        
    @GetMapping("/exportar-csv")
    public void exportCSV(
        @RequestParam(name="fechainicial")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date fechainicial,
        @RequestParam(name="fechafinal")@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date fechafinal,
        @RequestParam(name="codestado") int codestado,
        HttpServletResponse response) throws IOException{
        response.setContentType("text/csv");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String fechactual = dateFormatter.format(new Date());
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=reporte_servidesk_" + fechactual + ".csv";
        response.setHeader(headerKey, headerValue);
        ExportCsv exportar = new ExportCsv();
        exportar.exportData(response, service.valoresPorFechayEstados(fechainicial, fechafinal, codestado));

        }

}

package com.complexivo.servidesk.tools;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.complexivo.servidesk.dto.ReporteDto;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class ExportCsv {
    
    public void exportData(HttpServletResponse response,List<ReporteDto> listadatos) throws IOException{
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.EXCEL_PREFERENCE);

        String[] csvHeader ={"Ticket","Descripcion Ticket","Usuario","Fecha Creacion","Categoria","Servicio","Tipo","SLA","Via Comunicación","Tecnico","Estado"};
        String[] nameMapping={"codTicket","descripcionTicket","usuario","fechaCreacion","categoria","servicio","tipo","SLA","viaComunicacion","tecnico","estado"};
        csvWriter.writeHeader(csvHeader);
       for(int i=0;i<listadatos.size();i++){
           ReporteDto dato = listadatos.get(i);
           csvWriter.write(dato, nameMapping);
       }
       csvWriter.close();
    }
}

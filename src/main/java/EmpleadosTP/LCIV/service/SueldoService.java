package EmpleadosTP.LCIV.service;

import EmpleadosTP.LCIV.dtos.ReporteDTO;
import EmpleadosTP.LCIV.dtos.StatusCodeDTO;
import EmpleadosTP.LCIV.dtos.SueldoDTO;
import EmpleadosTP.LCIV.exceptions.NotFoundException;
import EmpleadosTP.LCIV.model.Sueldo;

import java.util.List;
import java.util.Map;

public interface SueldoService {

    List<Sueldo> getAll(Map<String,Long> params) throws Exception;

    ReporteDTO getReporte(Map<String,String> params, String mes, String anio) throws NotFoundException;

    StatusCodeDTO save(Sueldo sueldo) throws Exception;
}

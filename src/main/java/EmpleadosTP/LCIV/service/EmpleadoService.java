package EmpleadosTP.LCIV.service;

import EmpleadosTP.LCIV.dtos.*;
import EmpleadosTP.LCIV.model.Empleado;

import java.util.List;
import java.util.Map;

public interface EmpleadoService {
    StatusCodeDTO saveEmpleado(EmpleadoDTO empleadoDTO) throws Exception;

    List<Empleado> getAllEmpleados(Map<String,String> params) throws Exception;

}

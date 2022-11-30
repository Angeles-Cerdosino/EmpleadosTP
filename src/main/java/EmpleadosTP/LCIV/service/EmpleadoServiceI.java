package EmpleadosTP.LCIV.service;

import EmpleadosTP.LCIV.dtos.EmpleadoDTO;
import EmpleadosTP.LCIV.dtos.StatusCodeDTO;
import EmpleadosTP.LCIV.exceptions.LegajoNumberException;
import EmpleadosTP.LCIV.model.Empleado;
import EmpleadosTP.LCIV.repositories.EmpleadoRepository;
import EmpleadosTP.LCIV.util.Validator;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmpleadoServiceI implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceI(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getAllEmpleados(Map<String,String> params) throws Exception {
        Validator.validFilters(params);

        return empleadoRepository.findAll();
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public StatusCodeDTO saveEmpleado(EmpleadoDTO empleadoDTO) throws Exception {
        Empleado e = empleadoRepository.findByEmpleado(empleadoDTO.getLegajo());
            if (e != null) throw new LegajoNumberException("Empleado: " + empleadoDTO.getLegajo() + "already exists");
                {
                    Empleado em = new Empleado();
                    String eDTO = empleadoDTO.getLegajo();
                    em.setNombre(eDTO);
                    em.setApellido(eDTO);
                    em.setFechaNacimiento(eDTO);
                    em.setFechaIngreso(Integer.parseInt(eDTO));
                    em.setArea(eDTO);
                    em.setSueldoBruto(Integer.parseInt(eDTO));
                    empleadoRepository.save(em);
                }
            return new StatusCodeDTO(200, "Empleado saved successfully");

    }

}

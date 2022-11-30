package EmpleadosTP.LCIV.service;

import EmpleadosTP.LCIV.dtos.*;
import EmpleadosTP.LCIV.exceptions.*;
import EmpleadosTP.LCIV.model.*;
import EmpleadosTP.LCIV.repositories.*;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.*;

@Service
public class SueldoServiceI implements SueldoService {
    private final SueldoRepository sueldoRepository;
    private final EmpleadoRepository empleadoRepository;

    public SueldoServiceI(SueldoRepository sueldoRepository, EmpleadoRepository empleadoRepository) {
        this.sueldoRepository = sueldoRepository;
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Sueldo> getAll(Map<String,Long> params) {
        return sueldoRepository.findByLegajo(params.get("legajo"));
    }

    @Override
    public ReporteDTO getReporte(Map<String,String> params, String mes, String anio) throws NotFoundException {

        return (ReporteDTO) sueldoRepository.findByMes(params.get("mes"), params.get("anio"));
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public StatusCodeDTO save(Sueldo sueldo) {
            Empleado empleado = empleadoRepository.findByEmpleado(String.valueOf(sueldo.getIdLegajo()));
            List<Sueldo> lista = sueldoRepository.findByLegajo(sueldo.getIdReciboSueldo());
            if (lista != null) throw new SueldoException("Sueldo: " + sueldo.getIdReciboSueldo() + "already exists");
            {
                Sueldo s = new Sueldo();
                Long sDTO = s.getIdReciboSueldo();
                s.setIdReciboSueldo(sDTO);
                s.setAnio(s.getAnio());
                s.setMes(1);
                s.setSueldoBruto(1);
                s.setMontoAntiguedad(1);
                s.setJubilacion(1L);
                s.setObraSocial(1L);
                s.setFac(1L);
                s.setIdLegajo(empleado);
                sueldoRepository.save(s);

            }
            return new StatusCodeDTO(200, "Sueldo saved successfully");

    }

}

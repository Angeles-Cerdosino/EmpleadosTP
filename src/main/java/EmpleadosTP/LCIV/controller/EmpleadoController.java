package EmpleadosTP.LCIV.controller;

import EmpleadosTP.LCIV.dtos.EmpleadoDTO;
import EmpleadosTP.LCIV.dtos.StatusCodeDTO;
import EmpleadosTP.LCIV.dtos.SueldoDTO;
import EmpleadosTP.LCIV.model.Empleado;
import EmpleadosTP.LCIV.service.EmpleadoService;
import EmpleadosTP.LCIV.service.EmpleadoServiceI;
import EmpleadosTP.LCIV.service.SueldoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    public EmpleadoController(){}

    @GetMapping("/empleados")
    public ResponseEntity<?> getAllEmpleados(@RequestParam Map<String, String> params,
                                          @RequestParam(required = false) Long legajo) throws Exception{
        List<Empleado> er = new ArrayList<>();
        if(legajo != null){
            er = empleadoService.getAllEmpleados(params);
            return new ResponseEntity(er, HttpStatus.OK);
        } else {
            log.error("Error getting the Empleado: " + legajo);
            return new ResponseEntity(er, HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/empleados")
    public ResponseEntity<StatusCodeDTO> save(@Valid @RequestBody EmpleadoDTO empleado) throws Exception {
        return new ResponseEntity(empleadoService.saveEmpleado(empleado), HttpStatus.CREATED);
    }

}

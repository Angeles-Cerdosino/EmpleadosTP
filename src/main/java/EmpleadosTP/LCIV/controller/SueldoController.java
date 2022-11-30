package EmpleadosTP.LCIV.controller;

import EmpleadosTP.LCIV.dtos.*;
import EmpleadosTP.LCIV.model.*;
import EmpleadosTP.LCIV.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SueldoController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private SueldoService sueldoService;

    public SueldoController(SueldoService sueldoService) {
        this.sueldoService = sueldoService;
    }

    public SueldoController() {}

    @GetMapping("/sueldos")
    public ResponseEntity<?> getAll(@RequestParam Map<String, Long> params,
                                          @RequestParam(required = false) Long legajo) throws Exception{
        SueldoDTO sd = new SueldoDTO();
        if(legajo != null){
            sd = (SueldoDTO) sueldoService.getAll(params);
            return new ResponseEntity(sd, HttpStatus.OK);
        } else {
            log.error("Error getting Empleado: " + legajo);
            return new ResponseEntity(sd, HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/sueldos")
    public ResponseEntity<StatusCodeDTO> save(@Valid @RequestBody Sueldo sueldo) throws Exception {
        return new ResponseEntity(sueldoService.save(sueldo), HttpStatus.CREATED);
    }

    @GetMapping("/reportes")
    public ResponseEntity<ReporteDTO> getReporte(@RequestParam Map<String, String> params,
                                        @RequestParam(required = false) String mes, String anio) throws Exception{
        return new ResponseEntity(sueldoService.getReporte(params, mes, anio), HttpStatus.OK);
    }



}

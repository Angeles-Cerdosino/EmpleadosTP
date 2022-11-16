/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dtos.*;
import java.util.Map;
import javax.validation.Valid;

import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author acerdosi
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {
    
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    
    @GetMapping("/empleados")
    public ResponseEntity<?> getEmpleados(@RequestParam Map<String, String> params,
            @RequestParam(required = false) Integer legajo) throws Exception{
        EmpleadoDTO ER = new EmpleadoDTO();
        if(legajo != null){
            return new ResponseEntity(ER, HttpStatus.OK);
        } else {
            log.error("Error getting the Empleado: " + legajo);
            return new ResponseEntity(ER, HttpStatus.FORBIDDEN);
        }
    }
    
    @PostMapping("/empleados")
    public ResponseEntity<StatusCodeDTO> saveEmpleado(@Valid @RequestBody Empleado empleado) throws Exception {
        return new ResponseEntity(empleadoService.save(empleado), HttpStatus.CREATED);
    }

 
  
    
    
    
    
    
}

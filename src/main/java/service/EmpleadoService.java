
package service;

import dtos.*;
import exceptions.BadRequestException;
import exceptions.NotFoundException;
import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import repositories.*;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 *
 * @author acerdosi
 */
@Service
public abstract class EmpleadoService implements JpaRepository<Empleado, Integer> {
    @Autowired
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public ArrayList<Empleado> getAll(){
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

}

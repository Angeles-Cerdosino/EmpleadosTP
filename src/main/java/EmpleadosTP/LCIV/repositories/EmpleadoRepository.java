package EmpleadosTP.LCIV.repositories;

import EmpleadosTP.LCIV.model.Empleado;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {


    @Query("SELECT e.legajo, e.nombre, e.apellido, e.fechaNacimiento, e.fechaIngreso - :today as Antiguedad, e.area, e.sueldoBruto FROM Empleado e " +
            "WHERE e.legajo = :legajo " +
            "ORDER BY e.fechaIngreso")

    Empleado findByEmpleado(@Param("legajo") String legajo);

}

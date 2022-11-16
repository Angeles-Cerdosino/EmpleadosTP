
package repositories;

import java.util.List;
import model.Empleado;
import model.Sueldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

    Empleado findByLegajoNumber(String legajo);
}

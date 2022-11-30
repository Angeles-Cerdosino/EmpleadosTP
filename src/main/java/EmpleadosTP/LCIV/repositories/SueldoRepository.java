package EmpleadosTP.LCIV.repositories;

import EmpleadosTP.LCIV.dtos.ReporteDTO;
import EmpleadosTP.LCIV.dtos.SueldoDTO;
import EmpleadosTP.LCIV.model.Empleado;
import EmpleadosTP.LCIV.model.Sueldo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SueldoRepository extends JpaRepository<Sueldo, String> {
    @Query("SELECT s, SUM((s.sueldoBruto + s.montoAntiguedad) - s.jubilacion - s.obraSocial - s.fac) as sueldo_neto " +
            "FROM Sueldo s " +
            "JOIN Empleado e on e.legajo = s.idLegajo " +
            "WHERE s.idLegajo = :legajo " +
            "ORDER BY s.mes ASC ")
    List<Sueldo> findByLegajo(@Param("legajo") Long legajo);


    @Query("SELECT e.area, s.anio, s.mes, SUM((s.sueldoBruto + s.montoAntiguedad) - s.jubilacion - s.obraSocial - s.fac) as Sueldos_Netos " +
            "FROM Sueldo s " +
            "JOIN Empleado e on e.legajo = s.idLegajo " +
            "WHERE s.mes = :mes " +
            "AND s.anio = :anio " +
            "GROUP BY e.area, s.anio, s.mes " +
            "ORDER BY SUM(s.sueldoBruto + s.montoAntiguedad - s.jubilacion - s.obraSocial - s.fac) DESC ")
    List<ReporteDTO> findByMes(@Param("mes") String mes, @Param("anio") String anio);


}

package EmpleadosTP.LCIV.dtos;

import EmpleadosTP.LCIV.model.Empleado;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class SueldoDTO {
    @NotNull(message = "Id must not be null")
    @Pattern(regexp="^[0-2999,$]*$",message="Id must be only numbers")
    private Long id;

    @NotNull(message = "Anio must not be null")
    @Pattern(regexp="^[0-2999,$]*$",message="Anio must be only numbers")
    private int anio;

    @NotNull(message = "Mes must not be null")
    @Pattern(regexp="^[1-12,$]*$",message="Mes must be only from 1 to 12")
    private int mes;

    @NotNull(message = "Sueldo Bruto must not be null")
    @Pattern(regexp="^\\d+$",message="Sueldo Bruto must be numbers only")
    private int sueldoBruto;

    @NotNull(message = "Antiguedad must not be null")
    private int montoAntiguedad;

    @NotNull(message = "Jubilacion must not be null")
    private float jubilacion;

    @NotNull(message = "Obra Social must not be null")
    private float obraSocial;

    @NotNull(message = "Sueldo Bruto must not be null")
    private float fac;

    @NotNull(message = "Legajo Empleado must not be null")
    private List<EmpleadoDTO> idLegajoEmpleado;


    public SueldoDTO(Long id, int anio, int mes, int sueldoBruto, int montoAntiguedad, float jubilacion, float obraSocial, float fac, List<EmpleadoDTO> idLegajoEmpleado) {
        this.id = id;
        this.anio = anio;
        this.mes = mes;
        this.sueldoBruto = sueldoBruto;
        this.montoAntiguedad = montoAntiguedad;
        this.jubilacion = jubilacion;
        this.obraSocial = obraSocial;
        this.fac = fac;
        this.idLegajoEmpleado = idLegajoEmpleado;
    }

    public SueldoDTO(){}

    public Long getId() {
        return id;
    }

    public SueldoDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public int getAnio() {
        return anio;
    }

    public SueldoDTO setAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public int getMes() {
        return mes;
    }

    public SueldoDTO setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public SueldoDTO setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        return this;
    }

    public int getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public SueldoDTO setMontoAntiguedad(int montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
        return this;
    }

    public float getJubilacion() {
        return jubilacion;
    }

    public SueldoDTO setJubilacion(float jubilacion) {
        this.jubilacion = jubilacion;
        return this;
    }

    public float getObraSocial() {
        return obraSocial;
    }

    public SueldoDTO setObraSocial(float obraSocial) {
        this.obraSocial = obraSocial;
        return this;
    }

    public float getFac() {
        return fac;
    }

    public SueldoDTO setFac(float fac) {
        this.fac = fac;
        return this;
    }

    public List<EmpleadoDTO> getIdLegajoEmpleado() {
        return idLegajoEmpleado;
    }

    public SueldoDTO setIdLegajoEmpleado(List<EmpleadoDTO> idLegajoEmpleado) {
        this.idLegajoEmpleado = idLegajoEmpleado;
        return this;
    }
}

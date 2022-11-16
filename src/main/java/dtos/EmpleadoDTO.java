/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acerdosi
 */
public class EmpleadoDTO {
    @NotNull(message = "Legajo must not be null")
    private Long Legajo;

    @NotNull(message = "Nombre must not be null")
    @Pattern(regexp="^[A-Za-z1-9 A-Za-z1-9]{1,100}$",message="Nombre must have up to 100 characters")
    private String Nombre;

    @NotNull(message = "Apellido must not be null")
    @Pattern(regexp="^[A-Za-z1-9 A-Za-z1-9]{1,100}$",message="Nombre must have up to 100 characters")
    private String Apellido;

    @NotNull(message = "F_Nacimiento must not be null")
    private String F_Nacimiento;

    @NotNull(message = "F_Ingreso must not be null")
    private int F_Ingreso;

    @NotNull(message = "Area must not be null")
    private String Areas;

    @NotNull(message = "Sueldo_Bruto must not be null")
    private int Sueldo_Bruto;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(Long Legajo, String Nombre, String Apellido, String F_Nacimiento, int F_Ingreso, String Areas, int Sueldo_Bruto) {
        this.Legajo = Legajo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.F_Nacimiento = F_Nacimiento;
        this.F_Ingreso = F_Ingreso;
        this.Areas = Areas;
        this.Sueldo_Bruto = Sueldo_Bruto;
    }

    public Long getLegajo() {
        return Legajo;
    }

    public EmpleadoDTO setLegajo(Long legajo) {
        Legajo = legajo;
        return this;
    }

    public String getNombre() {
        return Nombre;
    }

    public EmpleadoDTO setNombre(String nombre) {
        Nombre = nombre;
        return this;
    }

    public String getApellido() {
        return Apellido;
    }

    public EmpleadoDTO setApellido(String apellido) {
        Apellido = apellido;
        return this;
    }

    public String getF_Nacimiento() {
        return F_Nacimiento;
    }

    public EmpleadoDTO setF_Nacimiento(String f_Nacimiento) {
        F_Nacimiento = f_Nacimiento;
        return this;
    }

    public int getF_Ingreso() {
        return F_Ingreso;
    }

    public EmpleadoDTO setF_Ingreso(int f_Ingreso) {
        F_Ingreso = f_Ingreso;
        return this;
    }

    public String getAreas() {
        return Areas;
    }

    public EmpleadoDTO setAreas(String areas) {
        Areas = areas;
        return this;
    }

    public int getSueldo_Bruto() {
        return Sueldo_Bruto;
    }

    public EmpleadoDTO setSueldo_Bruto(int sueldo_Bruto) {
        Sueldo_Bruto = sueldo_Bruto;
        return this;
    }
}

package EmpleadosTP.LCIV.dtos;

import javax.validation.constraints.*;

public class EmpleadoDTO {
    @NotNull(message = "Legajo must not be null")
    private String legajo;

    @NotNull(message = "Nombre must not be null")
    @Pattern(regexp="^[A-Za-z1-9 A-Za-z1-9]{1,100}$",message="Nombre must have up to 100 characters")
    private String nombre;

    @NotNull(message = "Apellido must not be null")
    @Pattern(regexp="^[A-Za-z1-9 A-Za-z1-9]{1,100}$",message="Nombre must have up to 100 characters")
    private String apellido;

    @NotNull(message = "F_Nacimiento must not be null")
    private String fecha_nacimiento;

    @NotNull(message = "F_Ingreso must not be null")
    private int fecha_ingreso;

    @NotNull(message = "Area must not be null")
    private String area;

    @NotNull(message = "Sueldo_Bruto must not be null")
    private int sueldo_bruto;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String legajo, String nombre, String apellido, String fecha_nacimiento, int fecha_ingreso, String area, int sueldo_bruto) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.area = area;
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getLegajo() {
        return legajo;
    }

    public EmpleadoDTO setLegajo(String legajo) {
        this.legajo = legajo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public EmpleadoDTO setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public EmpleadoDTO setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public EmpleadoDTO setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
        return this;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public EmpleadoDTO setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
        return this;
    }

    public String getArea() {
        return area;
    }

    public EmpleadoDTO setArea(String area) {
        this.area = area;
        return this;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public EmpleadoDTO setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
        return this;
    }
}

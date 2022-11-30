package EmpleadosTP.LCIV.model;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long legajo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "fecha_ingreso")
    private int fechaIngreso;

    @Column(nullable = false)
    private String area;

    @Column(name = "sueldo_bruto")
    private int sueldoBruto;

    @OneToMany(mappedBy = "idLegajo", cascade = CascadeType.PERSIST)
    private Set<Sueldo> sueldo;

    public Empleado(Long legajo, String nombre, String apellido, String fechaNacimiento, int fechaIngreso, String area, int sueldoBruto) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(){}

    public Long getLegajo() {
        return legajo;
    }

    public Empleado setLegajo(Long legajo) {
        this.legajo = legajo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Empleado setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Empleado setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public Empleado setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return this;
    }

    public String getArea() {
        return area;
    }

    public Empleado setArea(String area) {
        this.area = area;
        return this;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public Empleado setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        return this;
    }

    public Set<Sueldo> getSueldo() {
        return sueldo;
    }

    public Empleado setSueldo(Set<Sueldo> sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(this == o || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(legajo, empleado.legajo)
                && Objects.equals(nombre, empleado.nombre)
                && Objects.equals(apellido, empleado.apellido)
                && Objects.equals(fechaNacimiento, empleado.fechaNacimiento)
                && Objects.equals(fechaIngreso, empleado.fechaIngreso)
                && Objects.equals(area, empleado.area)
                && Objects.equals(sueldoBruto, empleado.sueldoBruto);
    }

    @Override
    public int hashCode(){
        return Objects.hash(legajo, nombre,apellido, fechaNacimiento, fechaIngreso, area, sueldoBruto);
    }

}

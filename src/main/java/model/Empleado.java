/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author acerdosi
 */
@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Legajo;
    
    @Column(nullable = false)
    private String Nombre;
    
    @Column(nullable = false)
    private String Apellido;
    
    @Column(nullable = false)
    private String F_Nacimiento;
    
    @Column(nullable = false)
    private int F_Ingreso;

    @Column(nullable = false)
    private String Areas;
    
    @Column(nullable = false)
    private int Sueldo_Bruto;

    public Long getLegajo() {
        return Legajo;
    }

    public Empleado setLegajo(Long legajo) {
        Legajo = legajo;
        return this;
    }

    public String getNombre() {
        return Nombre;
    }

    public Empleado setNombre(String nombre) {
        Nombre = nombre;
        return this;
    }

    public String getApellido() {
        return Apellido;
    }

    public Empleado setApellido(String apellido) {
        Apellido = apellido;
        return this;
    }

    public String getF_Nacimiento() {
        return F_Nacimiento;
    }

    public Empleado setF_Nacimiento(String f_Nacimiento) {
        F_Nacimiento = f_Nacimiento;
        return this;
    }

    public int getF_Ingreso() {
        return F_Ingreso;
    }

    public Empleado setF_Ingreso(int f_Ingreso) {
        F_Ingreso = f_Ingreso;
        return this;
    }

    public String getAreas() {
        return Areas;
    }

    public Empleado setAreas(String areas) {
        Areas = areas;
        return this;
    }

    public int getSueldo_Bruto() {
        return Sueldo_Bruto;
    }

    public Empleado setSueldo_Bruto(int sueldo_Bruto) {
        Sueldo_Bruto = sueldo_Bruto;
        return this;
    }

    public Empleado(Long legajo, String nombre, String apellido, String f_Nacimiento, int f_Ingreso, String areas, int sueldo_Bruto) {
        Legajo = legajo;
        Nombre = nombre;
        Apellido = apellido;
        F_Nacimiento = f_Nacimiento;
        F_Ingreso = f_Ingreso;
        Areas = areas;
        Sueldo_Bruto = sueldo_Bruto;
    }

    public Empleado(){}
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(this == o || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(Legajo, empleado.Legajo)
                && Objects.equals(Nombre, empleado.Nombre)
                && Objects.equals(Apellido, empleado.Apellido)
                && Objects.equals(F_Nacimiento, empleado.F_Nacimiento)
                && Objects.equals(F_Ingreso, empleado.F_Ingreso)
                && Objects.equals(Areas, empleado.Areas)
                && Objects.equals(Sueldo_Bruto, empleado.Sueldo_Bruto);
    }


    
    @Override
    public int hashCode(){
        return Objects.hash(Legajo, Nombre,Apellido, F_Nacimiento, F_Ingreso, Areas, Sueldo_Bruto);
    }
    
}

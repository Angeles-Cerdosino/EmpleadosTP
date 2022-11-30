package EmpleadosTP.LCIV.model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "sueldos_bruto")
public class Sueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Recibo_Sueldo")
    private Long idReciboSueldo;

    @Column(nullable = false)
    private int anio;

    @Column(nullable = false)
    private int mes;

    @Column(nullable = false)
    private int sueldoBruto;

    @Column(nullable = false)
    private int montoAntiguedad;

    @Column(nullable = false)
    private float jubilacion;

    @Column(nullable = false)
    private float obraSocial;

    @Column(nullable = false)
    private float fac;

    @ManyToOne
    @JoinColumn(name = "id_legajo", referencedColumnName = "legajo", updatable = false, insertable = false)
    @JsonBackReference
    private Empleado idLegajo;

    public Long getIdReciboSueldo() {
        return idReciboSueldo;
    }

    public Sueldo setIdReciboSueldo(Long idReciboSueldo) {
        this.idReciboSueldo = idReciboSueldo;
        return this;
    }

    public int getAnio() {
        return anio;
    }

    public Sueldo setAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public int getMes() {
        return mes;
    }

    public Sueldo setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public Sueldo setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        return this;
    }

    public int getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public Sueldo setMontoAntiguedad(int montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
        return this;
    }

    public float getJubilacion() {
        return jubilacion;
    }

    public Sueldo setJubilacion(float jubilacion) {
        this.jubilacion = jubilacion;
        return this;
    }

    public float getObraSocial() {
        return obraSocial;
    }

    public Sueldo setObraSocial(float obraSocial) {
        this.obraSocial = obraSocial;
        return this;
    }

    public float getFac() {
        return fac;
    }

    public Sueldo setFac(float fac) {
        this.fac = fac;
        return this;
    }

    public Empleado getIdLegajo() {
        return idLegajo;
    }

    public void setIdLegajo(Empleado idLegajo) {
        this.idLegajo = idLegajo;
    }

    public Sueldo(Long idReciboSueldo, int anio, int mes, int sueldoBruto, int montoAntiguedad, float jubilacion, float obraSocial, float fac, Empleado idLegajo) {
        this.idReciboSueldo = idReciboSueldo;
        this.anio = anio;
        this.mes = mes;
        this.sueldoBruto = sueldoBruto;
        this.montoAntiguedad = montoAntiguedad;
        this.jubilacion = jubilacion;
        this.obraSocial = obraSocial;
        this.fac = fac;
        this.idLegajo = idLegajo;
    }

    public Sueldo() {
    }

}

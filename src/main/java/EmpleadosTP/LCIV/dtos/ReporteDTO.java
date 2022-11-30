package EmpleadosTP.LCIV.dtos;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Validated
public class ReporteDTO {

    @NotNull(message = "Area must not be null")
    @Pattern(regexp = "^[A-Za-z1-9 A-Za-z1-9]{1,100}$", message = "Area must have up to 100 characters")
    private String area;

    @NotNull(message = "Anio must not be null")
    @Digits(integer = 4, fraction = 0, message = "Anio must have up to 4 numbers")
    private int anio;

    @NotNull(message = "Mes must not be null")
    @Digits(integer = 2, fraction = 0, message = "Anio must have up to 2 numbers")
    private int mes;

    @NotNull(message = "sueldo Bruto must not be null")
    @Digits(integer = 6, fraction = 0, message = "sueldo Bruto must have up to 6 numbers")
    private int sueldoBruto;

    @NotNull(message = "Antiguedad must not be null")
    @Digits(integer = 2, fraction = 0, message = "Antiguedad must have up to 2 numbers")
    private int montoAntiguedad;

    @NotNull(message = "Jubilacion must not be null")
    @DecimalMax("11.00")
    private float jubilacion;

    @NotNull(message = "Obra Social must not be null")
    @DecimalMax("3.00")
    private float obraSocial;

    @NotNull(message = "Fac must not be null")
    @DecimalMax("3.00")
    private float fac;

    public String getArea() {
        return area;
    }

    public ReporteDTO setArea(String area) {
        this.area = area;
        return this;
    }

    public int getAnio() {
        return anio;
    }

    public ReporteDTO setAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public int getMes() {
        return mes;
    }

    public ReporteDTO setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public ReporteDTO setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
        return this;
    }

    public int getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public ReporteDTO setMontoAntiguedad(int montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
        return this;
    }

    public float getJubilacion() {
        return jubilacion;
    }

    public ReporteDTO setJubilacion(float jubilacion) {
        this.jubilacion = jubilacion;
        return this;
    }

    public float getObraSocial() {
        return obraSocial;
    }

    public ReporteDTO setObraSocial(float obraSocial) {
        this.obraSocial = obraSocial;
        return this;
    }

    public float getFac() {
        return fac;
    }

    public ReporteDTO setFac(float fac) {
        this.fac = fac;
        return this;
    }

    public ReporteDTO() {
    }

    public ReporteDTO(String area, int anio, int mes, int sueldoBruto, int montoAntiguedad, float jubilacion, float obraSocial, float fac) {
        this.area = area;
        this.anio = anio;
        this.mes = mes;
        this.sueldoBruto = sueldoBruto;
        this.montoAntiguedad = montoAntiguedad;
        this.jubilacion = jubilacion;
        this.obraSocial = obraSocial;
        this.fac = fac;
    }


}

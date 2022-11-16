/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.*;

/**
 *
 * @author acerdosi
 */
@Entity
@Table(name = "sueldos_bruto")
public class Sueldo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bruto_id")
    private Long bruto_id;
    
    @Column(nullable = false)
    private float cantidad;

    public Long getBruto_id() {
        return bruto_id;
    }

    public void setBruto_id(Long bruto_id) {
        this.bruto_id = bruto_id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Sueldo(Long bruto_id, float cantidad) {
        this.bruto_id = bruto_id;
        this.cantidad = cantidad;
    }

    public Sueldo() {
    }
    
    
    
    
}

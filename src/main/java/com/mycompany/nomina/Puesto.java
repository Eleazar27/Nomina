/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;

/**
 *
 * @author Eleazar
 */
public class Puesto {
    private int id;
    private String nombre;
    private double salarioDia;
    private double pagoHorasExtras;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public void setPagoHorasExtras(double pagoHorasExtras) {
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public Puesto() {
    }
}

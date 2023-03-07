/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;

import java.util.ArrayList;

/**
 *
 * @author t3rel
 */
public class Historial {
    private double salario;
    private double pagoHorasExtras;
    public ArrayList<String> meses = new ArrayList<>();

    public double getSalario() {
        return salario;
    }

    public double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public ArrayList<String> getMeses() {
        return meses;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPagoHorasExtras(double pagoHorasExtras) {
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public void setMeses(ArrayList<String> meses) {
        this.meses = meses;
    }

    public Historial() {
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
    }
}

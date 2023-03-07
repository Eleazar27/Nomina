/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

/**
 *
 * @author Eleazar
 */
public class Gestion {

    private HashMap<Integer, Empleado> listaEmpleados = new HashMap<>();
    private HashMap<Integer, Puesto> listaPuestos = new HashMap<>();
    private Empleado em;
    private Puesto pu = new Puesto();

    public Gestion() {
        // Carga de 2 registros de puestos
        Puesto pu1 = new Puesto();
        pu1.setId(1);
        pu1.setNombre("Repartidor");
        pu1.setPagoHorasExtras(50);
        pu1.setSalarioDia(100);

        Puesto pu2 = new Puesto();
        pu2.setId(2);
        pu2.setNombre("Vendedor");
        pu2.setPagoHorasExtras(25);
        pu2.setSalarioDia(150);

        listaPuestos.put(1, pu1);
        listaPuestos.put(2, pu2);
    }

    // Metodo para agregar puestos
    public HashMap<Integer, Puesto> agregarPuesto() {
        pu.setId(listaPuestos.size() + 1);
        System.out.print("Nombre del puesto: ");
        String job = Excepciones.exString();
        pu.setNombre(job);
        System.out.print("Pago por horas extras: ");
        double paEx = Excepciones.exDouble();
        pu.setPagoHorasExtras(paEx);
        System.out.print("Salario por dia: ");
        double paDay = Excepciones.exDouble();
        pu.setSalarioDia(paDay);
        listaPuestos.put(listaPuestos.size() + 1, pu);
        return listaPuestos;
    }

    // Metodo para mostrar puestos
    public void mostrarPuestos() {
        System.out.println(" ");
        for (Map.Entry<Integer, Puesto> pue : listaPuestos.entrySet()) {
            System.out.println("ID: " + pue.getValue().getId());
            System.out.println("Nombre del puesto: " + pue.getValue().getNombre());
            System.out.println("Pago por horas extras: " + pue.getValue().getPagoHorasExtras());
            System.out.println("Salario por dia: " + pue.getValue().getSalarioDia());
            System.out.println(" ");
        }
    }

    // Metodo para agreagar empleados
    public HashMap<Integer, Empleado> agregarEmpleado() throws IOException {
        em = new Empleado();
        em.setId(listaEmpleados.size() + 1);

        System.out.print("Nombre del empleado: ");
        String name = Excepciones.exString();
        em.setNombre(name);

        System.out.print("Apellidos del empleado: ");
        String lastname = Excepciones.exString();
        em.setApellido(lastname);

        System.out.print("Edad del empleado: ");
        int age = Excepciones.exInt();
        em.setEdad(age);

        System.out.print("Domicilio del empleado: ");
        String address = Excepciones.exString();
        em.setDomicilio(address);

        em.setHorasExtras(0);
        em.setDiasTrabajados(0);

        System.out.println("Puestos vigentes: ");
        for (Map.Entry<Integer, Puesto> pue : listaPuestos.entrySet()) {
            System.out.println("ID: " + pue.getValue().getId());
            System.out.println("Nombre del puesto: " + pue.getValue().getNombre());
        }
        System.out.println("Seleccione su puesto: ");
        int optem = Excepciones.exInt();
        em.setPuesto(listaPuestos.get(optem));

        listaEmpleados.put(listaEmpleados.size() + 1, em);

        return listaEmpleados;
    }

    // Metodo para mostrar todos los empleados
    public void mostrarEmpleados() {
        System.out.println(" ");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre());
            System.out.println("Apellido: " + em.getValue().getApellido());
            System.out.println("Edad: " + em.getValue().getEdad());
            System.out.println("Domicilio: " + em.getValue().getDomicilio());
            System.out.println("Dias trabajados: " + em.getValue().getDiasTrabajados());
            System.out.println("Horas extras: " + em.getValue().getHorasExtras());
            System.out.println("Puesto: " + em.getValue().getPuesto().getNombre());
            System.out.println(" ");
        }
    }

    // Metodo para eliminar empleados
    public void eliminarEmpleados() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println(" ");
        }
        System.out.print("ID del empleado a eliminar:");
        int delete = Excepciones.exInt();
        listaEmpleados.remove(delete);
    }

    // Metodos para actualizar empleados
    // Metodo para actualizar nombre
    public void actualizarNombre() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println("Edad: " + em.getValue().getEdad());
            System.out.println(" ");
        }
        System.out.print("ID del empleado a actualizar nombre: ");
        int actNombre = Excepciones.exInt();
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = Excepciones.exString();
        listaEmpleados.get(actNombre).setNombre(nuevoNombre);
    }

    // Metodo para actualizar apellidos
    public void actualizarApellidos() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println("Edad: " + em.getValue().getEdad());
            System.out.println(" ");
        }
        System.out.print("ID del empleado a actualizar apellido: ");
        int actApellido = Excepciones.exInt();
        System.out.println("Nuevo apellido: ");
        String nuevoApellido = Excepciones.exString();
        listaEmpleados.get(actApellido).setApellido(nuevoApellido);
    }

    // Metodo para actualizar edad
    public void actualizarEdad() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println("Edad: " + em.getValue().getEdad());
            System.out.println(" ");
        }
        System.out.print("ID del empleado a actualizar edad: ");
        int actEdad = Excepciones.exInt();
        System.out.println("Nueva edad: ");
        int nuevaEdad = Excepciones.exInt();
        listaEmpleados.get(actEdad).setEdad(nuevaEdad);
    }

    // Metodos para registrar dias trabajados
    // Metodo para todos los empleados
    public void diasTodos() throws IOException {
        System.out.print("Dias trabajados para todos los empleados: ");
        int diasT = Excepciones.exInt();
        for (int i = 1; i <= listaEmpleados.size(); i++) {
            if (diasT <= 20 && diasT > 0) {
                listaEmpleados.get(i).setDiasTrabajados(diasT);
                System.out.println("Se asignaron " + diasT + " dias");
            } else if (diasT > 0) {
                System.out.println("Aviso: El maximo de dias para trabajar son 20");
                System.out.println("Se asignaron 20 dias");
                listaEmpleados.get(i).setDiasTrabajados(20);
            } else {
                System.out.println("Valor erroneo");
                System.out.println("Se asignaron 0 dias");
                listaEmpleados.get(i).setDiasTrabajados(0);
            }
        }
    }

    //Metodo para un solo empleado
    public void diasUno() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println("Dias trabajados: " + em.getValue().getDiasTrabajados());
            System.out.println(" ");
        }
        System.out.print("Selecciona la ID del empleado: ");
        int idDias = Excepciones.exInt();
        System.out.print("Dias trabajados: ");
        int unoDias = Excepciones.exInt();
        if (unoDias <= 20 && unoDias > 0) {
            listaEmpleados.get(idDias).setDiasTrabajados(unoDias);
            System.out.println("Se asignaron " + unoDias + " dias");
        } else if (unoDias > 0) {
            System.out.println("Aviso: El maximo de dias para trabajar son 20");
            System.out.println("Se asignaron 20 dias");
            listaEmpleados.get(idDias).setDiasTrabajados(20);
        } else {
            System.out.println("Valor erroneo");
            System.out.println("Se asignaron 0 dias");
            listaEmpleados.get(idDias).setDiasTrabajados(0);
        }
    }

    // Metodos para registrar horas extra
    // Metodo para todos los empleados
    public void horasTodos() throws IOException {
        System.out.print("Horas extra para todos los empleados: ");
        int horasT = Excepciones.exInt();
        // Sacar condición*
        for (int i = 1; i <= listaEmpleados.size(); i++) {
            if (horasT <= 40 && horasT > 0) {
                listaEmpleados.get(i).setHorasExtras(horasT);
                System.out.println("Se asignaron " + horasT + " horas extra");
            } else if (horasT > 0) {
                System.out.println("Aviso: El maximo de horas extras por mes son 40");
                System.out.println("Se asignaron 40 horas");
                listaEmpleados.get(i).setHorasExtras(40);
            } else {
                System.out.println("Valor erroneo");
                System.out.println("Se asignaron 0 horas");
                listaEmpleados.get(i).setHorasExtras(0);
            }
        }
    }

    //Metodo para un solo empleado
    public void horasUno() throws IOException {
        System.out.println("Empleados existentes:");
        for (Map.Entry<Integer, Empleado> em : listaEmpleados.entrySet()) {
            System.out.println("ID: " + em.getValue().getId());
            System.out.println("Nombre: " + em.getValue().getNombre() + " " + em.getValue().getApellido());
            System.out.println("Horas extras: " + em.getValue().getHorasExtras());
            System.out.println(" ");
        }
        System.out.print("Selecciona la ID del empleado: ");
        int idHoras = Excepciones.exInt();
        System.out.print("Horas extra: ");
        int unoHoras = Excepciones.exInt();
        if (unoHoras <= 40 && unoHoras > 0) {
            listaEmpleados.get(idHoras).setHorasExtras(unoHoras);
            System.out.println("Se asignaron " + unoHoras + " horas extra");
        } else if (unoHoras > 0) {
            System.out.println("Aviso: El maximo de horas extras por mes son 40");
            System.out.println("Se asignaron 40 horas");
            listaEmpleados.get(idHoras).setHorasExtras(40);
        } else {
            System.out.println("Valor erroneo");
            System.out.println("Se asignaron 0 horas");
            listaEmpleados.get(idHoras).setHorasExtras(0);
        }
    }

    // Metodos para calcular nominas
    // Metodo para calcular salario
    public double salario() {

        return 0;
    }

    // Metodo que permite generar el menu principal del sistema
    public void menu() throws IOException {
        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido al sistema de nomina");
            System.out.println("1.- Agregar puesto");
            System.out.println("2.- Mostrar puestos");
            System.out.println("3.- Agregar empleado");
            System.out.println("4.- Mostrar empleados");
            System.out.println("5.- Eliminar empleado");
            System.out.println("6.- Actualizar empleado");
            System.out.println("7.- Registrar dias trabajados");
            System.out.println("8.- Registrar horas extras");
            System.out.println("9.- Calcular nomina");
            System.out.println("10.- Ver historial de nomina");
            System.out.println("11.- Salir");

            try {
                System.out.print("Selecciona una opción: ");
                int opt = Excepciones.exInt();
                switch (opt) {
                    case 1:
                        agregarPuesto();
                        break;
                    case 2:
                        mostrarPuestos();
                        break;
                    case 3:
                        agregarEmpleado();
                        break;
                    case 4:
                        mostrarEmpleados();
                        break;
                    case 5:
                        eliminarEmpleados();
                        break;
                    case 6:
                        System.out.println("Actualizar empleado");
                        System.out.println("1.- Nombre");
                        System.out.println("2.- Apellidos");
                        System.out.println("3.- Edad");
                        System.out.print("Selecciona una opción: ");
                        int act = Excepciones.exInt();
                        switch (act) {
                            case 1:
                                actualizarNombre();
                                break;
                            case 2:
                                actualizarApellidos();
                                break;
                            case 3:
                                actualizarEdad();
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Asignar dias trabajados");
                        System.out.println("1.- A todos los trabajadores");
                        System.out.println("2.- A un solo trabajador");
                        System.out.print("Selecciona una opción: ");
                        int asgd = Excepciones.exInt();
                        switch (asgd) {
                            case 1:
                                diasTodos();
                                break;
                            case 2:
                                diasUno();
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Asignar horas extras");
                        System.out.println("1.- A todos los trabajadores");
                        System.out.println("2.- A un solo trabajador");
                        System.out.print("Selecciona una opción: ");
                        int asgh = Excepciones.exInt();
                        switch (asgh) {
                            case 1:
                                horasTodos();
                                break;
                            case 2:
                                horasUno();
                                break;
                        }
                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:
                        salir = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Salecciona una opción correcta");
                Excepciones.exInt();
            }
        }
    }
}

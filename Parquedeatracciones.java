/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parquedeatracciones;
import java.util.ArrayList;
/**
 *
 * @author adria
 */
public class Parquedeatracciones {
private ArrayList <Atraccion> listaAtracciones;
    private ArrayList <Empleado> listaEmpleados;
    ArrayList <Visitante> listaVisistantes;
    Iterable<Visitante> listaVisitantes;
    
    public Parquedeatracciones () {
        listaAtracciones = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaVisistantes = new ArrayList<>();
    }
    
    //Metodos
    public void agregarAtraccion(Atraccion atraccion) {
        listaAtracciones.add(atraccion);
        System.out.println("Atracción agregada: " + atraccion.mostrarInformacion());
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.mostrarInformacion());
    }

    public void agregarVisitante(Visitante visitante) {
        listaVisistantes.add(visitante);
        System.out.println("Visitante agregado: " + visitante.mostrarInformacion());
    }

    public void mostrarInformacionParque() {
        System.out.println("Informacion del Parque");
        System.out.println("Atracciones:");
        for (Atraccion a : listaAtracciones) {
            System.out.println(a.mostrarInformacion());
        }
        System.out.println("Empleados:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e.mostrarInformacion());
        }
        System.out.println("Visitantes:");
        for (Visitante v : listaVisistantes) {
            System.out.println(v.mostrarInformacion());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;

/**
 *
 * @author adria
 */
public class Empleado {
    private String nombre;
    private int idEmpleado;
    private String puesto;

    //Constructor
    public Empleado(String nombre, int idEmplado, String puesto) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // Métodos
    public void asignarTarea(String tarea) {
        System.out.println(nombre + " ha sido asignado a la tarea: " + tarea);
    }

    public void realizarTarea() {
        System.out.println(nombre + " está realizando su tarea.");
    }

    // Mostrar informacion
    public String mostrarInformacion() {
        return "Empleado: " + nombre + ", ID: " + idEmpleado + ", Puesto: " + puesto;
    }
}

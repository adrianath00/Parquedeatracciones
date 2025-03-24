/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;

/**
 *
 * @author adria
 */
public class Mantenimiento extends Empleado {
    private String areaResponsable;
    
    
    public Mantenimiento(String nombre, int idEmpleado) {
        super(nombre, idEmpleado, "Mantenimiento");
        this.areaResponsable = areaResponsable;
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }
    
    public void setAreaResponsable(String areaResponsable) {
        this.areaResponsable = areaResponsable;
    }
    
    public void realizarTarea() {
        System.out.println(getNombre() + " está realizando el mantenimiento en el área de " + areaResponsable);
    }

    public void realizarMantenimiento() {
        System.out.println("Empleado " + getNombre() + " realizando mantenimiento en área: " + areaResponsable);
    }

    public void reportarProblema() {
        System.out.println("Empleado " + getNombre() + " reportando un problema.");
    }
}

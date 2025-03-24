/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;

/**
 *
 * @author adria
 */
public class Vendedor extends Empleado {
    private int ventasRealizadas;

    //Constructor
    public Vendedor(String nombre, int idEmpleado) {
        super(nombre, idEmpleado, "Vendedor");
        this.ventasRealizadas = ventasRealizadas;
    }

    //Getters y setters
    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    //Metodos
    public void venderEntrada() {
        ventasRealizadas++;
        System.out.println(getNombre() + " ha vendido una entrada.");
    }

    public void reportarVentas() {
        System.out.println(getNombre() + " ha realizado " + ventasRealizadas + " ventas.");
    }
}

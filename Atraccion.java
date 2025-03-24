/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;

/**
 *
 * @author adria
 */
public class Atraccion {
    private String nombre;
    private int capacidad;
    private String estado;

    //Constructor
    public Atraccion(String nombre, int capacidad, String estado, int tiempoUso) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        try {
            if (estado.equals("Operativa") || estado.equals("En Mantenimiento") || estado.equals("Cerrada")) {
                this.estado = estado;
            } else {
                throw new IllegalArgumentException("Estado no válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    // Metodos
    public void iniciarAtraccion() {
        System.out.println("La atracción " + nombre + " ha iniciado.");
    }

    public void detenerAtraccion() {
        System.out.println("La atracción " + nombre + " se ha detenido.");
    }

    public void cambiarEstado(String nuevoEstado) {
        try {
            if (nuevoEstado.equals("Operativa") || nuevoEstado.equals("En Mantenimiento") || nuevoEstado.equals("Fuera de Servicio")) {
                this.estado = nuevoEstado;
                System.out.println("El estado de la atracción " + nombre + " ha cambiado a: " + nuevoEstado);
            } else {
                throw new IllegalArgumentException("Estado no válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Mostrar informacion
    public String mostrarInformacion() {
        return "Atracción: " + nombre + ", Capacidad: " + capacidad + ", Estado: " + estado;
    } 
}


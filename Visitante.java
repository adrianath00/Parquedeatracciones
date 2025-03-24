/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;

/**
 *
 * @author adria
 */
public class Visitante {
    private String nombre;
    private int idVisitante;
    private int edad;

    public Visitante (String nombre, int idVisitante, int edad) {
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
            this.edad = edad;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    //Metodos adicionales
    public void comprarEntrada() {
        System.out.println(nombre + " ha comprado una entrada.");
    }

    public void usarAtraccion(String atraccion) {
            System.out.println(nombre + " está usando la atracción: " + atraccion);
    }

    // Método para mostrar información del visitante
    public String mostrarInformacion() {
        return "Visitante: " + nombre + ", ID: " + idVisitante + ", Edad: " + edad ;
    }
}

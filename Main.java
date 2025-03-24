/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedeatracciones;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parquedeatracciones parque = new Parquedeatracciones();
    do {
        System.out.println("\n--- Menu del Parque de Atracciones ---");
        System.out.println("1. Agregar Atraccion");
        System.out.println("2. Agregar Empleado");
        System.out.println("3. Agregar Visitante");
        System.out.println("4. Mostrar Informacion del Parque");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
             case 1 ->             {
                 System.out.print("Agregar atraccion: ");
                 String nombreAtraccion = scanner.nextLine();
                 System.out.print("Capacidad de la atraccion: ");
                 int capacidad = scanner.nextInt();
                 System.out.print("Tiempo de uso (minutos): ");
                 int tiempoUso = scanner.nextInt();
                 {
                     String estado = null;
                     parque.agregarAtraccion(new Atraccion(nombreAtraccion, capacidad, estado, tiempoUso));
                 }
            }


            case 2 -> {
                System.out.print("Nombre del empleado: ");
                String nombreEmpleado = scanner.nextLine();
                System.out.print("ID del empleado: ");
                int idEmpleado = scanner.nextInt();
                System.out.print("Puesto (Operador/Mantenimiento): ");
                String puesto = scanner.nextLine();
                
                if (puesto.equalsIgnoreCase("Operador")) {
                    System.out.print("Atracción asignada: ");
                    String atraccionAsignada = scanner.nextLine();
                    parque.agregarEmpleado(new Empleado (nombreEmpleado, idEmpleado, atraccionAsignada));
                } else {
                    parque.agregarEmpleado(new Empleado (nombreEmpleado, idEmpleado, puesto));
                }
                }

            case 3 -> {
                System.out.print("Nombre del visitante: ");
                String nombreVisitante = scanner.nextLine();
                System.out.print("ID del visitante: ");
                int idVisitante = scanner.nextInt();
                System.out.print("Edad del visitante: ");
                int edadVisitante = scanner.nextInt();
                scanner.nextLine();
                Visitante visitante = new Visitante(nombreVisitante, idVisitante, edadVisitante);
                parque.agregarVisitante(visitante);
                }

            case 4 -> parque.mostrarInformacionParque();

            case 5 -> {
                System.out.println("Saliendo del sistema...");
                scanner.close();
                return;
                }

            default -> System.out.println("Opción no válida. Intente de nuevo.");
        }
    }while (true);
    }
}

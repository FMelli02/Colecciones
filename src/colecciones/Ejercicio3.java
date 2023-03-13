/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.Servicio.ServicioAlumno;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioAlumno servicio = new ServicioAlumno();
       
        while (true) {
            System.out.print("Desea crear un alumno? (s/n): ");
            String opcion = leer.nextLine();
            if (opcion.equals("s")) {
                servicio.crearAlumno();
            } else {
                break;
            }
        }
        
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = leer.nextLine();
        float notaFinal = servicio.notaFinal(nombre);
        if (notaFinal != -1) {
            System.out.println("La nota final de " + nombre + " es " + notaFinal);
        } else {
            System.out.println("El alumno no fue encontrado.");
        }
    }
}


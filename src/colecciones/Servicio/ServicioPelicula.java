/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Servicio;

import colecciones.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    String opcion;
    public void crearPelicula(ArrayList<Pelicula> peliculas) {
        System.out.println("Ingrese los datos de la Película");
        do {
            System.out.print("\nTítulo: ");
            String titulo = leer.next();
            System.out.print("Director: ");
            String director = leer2.next();
            System.out.print("Duración de la película (en horas):");
            Double duracion = leer.nextDouble();
            Pelicula p = new Pelicula(titulo, director, duracion);
            peliculas.add(p);
            System.out.print("\nDesea ingresar otra película? (s/n): ");
            opcion=leer.next();
        } while (opcion.equalsIgnoreCase("s"));
    }
}

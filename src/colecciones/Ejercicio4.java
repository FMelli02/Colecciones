/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.entidades.Pelicula;
import colecciones.Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPelicula sp = new ServicioPelicula();
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        sp.crearPelicula(peliculas);
        
        System.out.println("\nLas películas son las siguientes:");
        for (Pelicula p : peliculas) {
            System.out.println("[" + p.toString() + "]");
        }
        
        System.out.println("\nPelículas con duración mayor a 1 hora:");
        for (Pelicula p : peliculas) {
            if (p.getDuracion() > 1) {
                System.out.println("[" + p.toString() + "]");
            }
        }
        
        peliculas.sort(Pelicula.duracMayoraMenor);
        System.out.println("\nPelículas ordenadas por duración de mayor a menor:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.duracMenoraMayor);
        System.out.println("\nPelículas ordenadas por duración de menor a mayor:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.porTitulo);
        System.out.println("\nPelículas ordenadas por título alfabéticamente:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
        
        peliculas.sort(Pelicula.porDirector);
        System.out.println("\nPelículas ordenadas por director alfabéticamente:");
        for (Pelicula p : peliculas){
            System.out.println("[" + p.toString() + "]");
        }
    }
}

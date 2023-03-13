/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.Servicio.ServicioPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<String> paises = new HashSet();
        ServicioPaises sp = new ServicioPaises();
        
        sp.ingresarPaises(paises);
        
        ArrayList<String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        
        System.out.println("\nPaises ordenados alfabéticamente: ");
        for (String listaPais : listaPaises) {
            System.out.println(listaPais);
        }
        
        System.out.println("\nIngrese el país que quiere eliminar de la lista:");
        String eliminar = leer.next();
        
        sp.eliminarPais(eliminar, paises);
    }
}

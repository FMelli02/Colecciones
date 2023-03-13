/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        ArrayList<String> razasPerro = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese la raza de un perro o escriba 'salir' para frenar: ");
            String raza = leer.nextLine();
            if (raza.equalsIgnoreCase("salir")) {
                break;
            }
            razasPerro.add(raza);
        }
        
        System.out.println("\nLas razas son las siguientes");
        for (String var : razasPerro) {
            System.out.println(var);
        }
        
        System.out.println("\nIngrese la raza que quiere eliminar.");
        String eliminar=leer.next();
        boolean encontrar = false;
        
        Iterator<String> it = razasPerro.iterator();
        while (it.hasNext()) {
            if (it.next().equals(eliminar)) {
                it.remove();
                encontrar = true;
                break;
            }
        }
        
        if (encontrar) {
            System.out.println("\n" + eliminar + " ha sido removido de la lista.");
        }else{
            System.out.println("\n" + eliminar + " no ha sido encontrado en la lista.");
        }
        
        Collections.sort(razasPerro);
        System.out.println("\nLista actualizada de razas de perro:");
        for (String var : razasPerro
                ) {
            System.out.println(var);
        }
    }
}

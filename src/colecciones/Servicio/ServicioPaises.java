/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPaises {
    Scanner leer = new Scanner(System.in);
    
    public void ingresarPaises(HashSet<String> paises) {
        String opcion;
        do {
            System.out.print("Ingrese un País: ");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("¿Desea ingresar otro país? (s/n)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.println("\nLista de países: ");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(String eliminar, HashSet<String> paises) {
        Iterator<String> it = paises.iterator();
        int cont=0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(eliminar)) {
                it.remove();
                cont++;
                for (String pais : paises) {
                    System.out.println(pais);
                }
            }
        }
        if (cont==0) {
            System.out.println("\nEl país ingresado no se encuentra en la lista.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.Servicio.ServicioProductos;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioProductos sp = new ServicioProductos();
        HashMap<String, Double> productos = new HashMap();
        int opcion;
        do {
            System.out.println("\nMenú interactivo: ");
            System.out.println("\n1. Introducir un Producto");
            System.out.println("2. Modificar el Precio");
            System.out.println("3. Eliminar un Producto");
            System.out.println("4. Mostrar los Productos");
            System.out.println("5. Salir");
            System.out.print("\nIngrese su respuesta: ");
            opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    sp.ingresarProducto(productos);
                    break;
                case 2:
                    sp.modificarPrecio(productos);
                    break;
                case 3:
                    sp.eliminarProducto(productos);
                    break;
                case 4:
                    sp.mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("\nUsted ha salido correctamente del sistema.");
                    break;
                default:
                    System.out.println("\nEl valor ingresado no corresponde a una acción existente.");
                    break;
            }
        } while (opcion!=5);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProductos {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    public void ingresarProducto(HashMap<String, Double> productos) {
        String opcion;
        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String producto = leer.next();
            System.out.print("Ingrese el precio del producto: ");
            double precio = leer2.nextDouble();
            productos.put(producto, precio);
            
            System.out.println("Desea añadir otro producto? (s/n)");
            opcion=leer.next();
        } while (opcion.equalsIgnoreCase("s"));
    }
    
    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.print("\nIngrese el nombre del producto a modificar su precio: ");
        String newproduct = leer.next();
        
        if (productos.containsKey(newproduct)) {
            productos.remove(newproduct);
            System.out.print("Ingrese el nuevo precio: ");
            Double newprice = leer.nextDouble();
            productos.put(newproduct, newprice);
        } else {
            System.out.println("\nEl producto ingresado no existe en la base de datos.");
        }
    }
    
    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.print("\nIngrese el producto a eliminar del sistema: ");
        String delete = leer.next();
        
        if (productos.containsKey(delete)) {
            productos.remove(delete);
        } else {
            System.out.println("\nEl producto ingresado no existe en la base de datos.");
        }
    }
    
    public void mostrarProductos(HashMap<String, Double> productos) {
        System.out.println("\nLista de productos:");
        
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: "+entry.getKey()+" || Precio: "+entry.getValue());
        }
    }
}

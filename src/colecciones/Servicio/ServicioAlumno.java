/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {
    //Atributos
    private String nombre;
    private ArrayList<Integer> notas;
    private ArrayList<ServicioAlumno> alumnos;
    
    //Constructores
    public ServicioAlumno() {
        alumnos = new ArrayList();
    }
    
    public ServicioAlumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    //Métodos
    public void crearAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = leer.nextLine();
        notas = new ArrayList();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            notas.add(leer.nextInt());
        }
        alumnos.add(new ServicioAlumno(nombre, notas));
    }

    public float notaFinal(String nombreAlumno) {
        for (ServicioAlumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                float suma = 0;
                for (int nota : alumno.getNotas()) {
                    suma += nota;
                }
                return suma / 3;
            }
        }
        return -1;
    }
}

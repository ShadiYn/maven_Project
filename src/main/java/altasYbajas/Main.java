package altasYbajas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static altasYbajas.Servicio.*;

public class Main {

    public static Scanner sc = new Scanner (System.in);
    public static ArrayList<Alumno>alumno = new ArrayList<Alumno>();


    public static void main(String[] args) {

        int opcion;
        String Nombre = null;
        String edad= null;
        do {
            System.out.println("Introduce la operacion que quieras realizar");
            System.out.println("1. añadir alumno");
            System.out.println("2. eliminar alumno");
            System.out.println("3. modificar alumno");
            System.out.println("4. consultar alumnos");
            System.out.println("5. salir");

            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    AñadirAlumno(Nombre, edad);
                    break;

                case 2:
                    EliminarAlumno(Nombre,edad);
                    break;

                case 3:
                    ModificarAlumno(Nombre, edad);
                    break;

                case 4:
                    ConsultarAlumnos(Nombre, edad);
                    break;

                default:

            }

        }while(opcion!=5);
        System.out.println("No has escogido ninguna opcion");
    }








}



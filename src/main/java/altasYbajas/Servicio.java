package altasYbajas;

import java.util.Iterator;
import java.util.Scanner;

import static altasYbajas.Main.alumno;

public class Servicio {

    public static Scanner sc = new Scanner(System.in);
    public static databaseConnection db = new databaseConnection();
    public static void ConsultarAlumnos(String nombre, String edad) {
        //recorremos con un bucle los alumnos
        for(Alumno a :alumno) {
            System.out.println("Nombre: "+a.getNombre()
                    +" Edad: "+a.getEdad());
        }



    }


    public static void ModificarAlumno(String nombre, String edad) {
        System.out.println("Introduce el nombre del alumno que quieras modificar");
        nombre=sc.next();
        System.out.println("Nuevo nombre: ");
        String nombre2=sc.next();
        System.out.println("Introduce la edad: ");
        String edad2= sc.next();
        Iterator <Alumno> iterar = alumno.iterator();
        //ahora recorremos el iterador de los alumnos
        //mientras el bucle tenga algo que recorrer cogera al
        //alumno que itera y si el nombre es igual al introducido entonce slo eliminará
        while(iterar.hasNext()) {
            Alumno a = iterar.next();

            if(a.getNombre().equals(nombre)) {
                a.setNombre(nombre2);
                a.setEdad(edad2);
            }
        }


    }

    public static void EliminarAlumno(String nombre, String edad) {
        System.out.println("Introduce el nombre del alumno que quieras eliminar");
        nombre=sc.next();

        Iterator <Alumno> iterar = alumno.iterator();
        //ahora recorremos el iterador de los alumnos
        //mientras el bucle tenga algo que recorrer cogera al
        //alumno que itera y si el nombre es igual al introducido entonce slo eliminará
        while(iterar.hasNext()) {
            Alumno a = iterar.next();

            if(a.getNombre().equals(nombre)) {
                iterar.remove();
            }
        }

    }


    public static void AñadirAlumno(String nombre, String edad) {
        System.out.println("Introduce el nombre del alumno");
        nombre = sc.next();
        System.out.println("Introduce la edad del alumno");
        edad = sc.next();



        //ahora llamamos a alumno

        /*Alumno a = new Alumno();
        a.setNombre(nombre);
        a.setEdad(edad);
        //ahora lo tendremos que pasar al listado
        alumno.add(a);*/



    }








}

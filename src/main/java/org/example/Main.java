package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Define the data source for the driver
            String sourceURL = "jdbc:mysql://localhost/library?useSSL=false&serverTimezone=UTC";
            // Create a connection through the DriverManager
            Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "");

            List<Persona> personas = new ArrayList<>();

            Statement statement = databaseConnection.createStatement();
            ResultSet personasRS = statement.executeQuery("SELECT * FROM datos");


            while (personasRS.next()){
                Persona p = new Persona();
                String nombre = personasRS.getString("nombre");
                String dni = personasRS.getString("dni");
                p.setNombre(nombre);
                p.setDni(dni);
                System.out.println("nombre: "+p.nombre+" dni: "+p.dni);
            }



            databaseConnection.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
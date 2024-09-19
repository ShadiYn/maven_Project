package altasYbajas;

import org.example.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class databaseConnection {


    public void databaseConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Define the data source for the driver
            String sourceURL = "jdbc:mysql://localhost/library?useSSL=false&serverTimezone=UTC";
            // Create a connection through the DriverManager
            Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "");
            Statement statement = databaseConnection.createStatement();
            ResultSet alumnosRs = statement.executeQuery("SELECT * FROM altaybajas");

            while (alumnosRs.next()){//para insertar?
                Alumno a = new Alumno();
                String nombre = alumnosRs.getString("nombre");
                String edad = alumnosRs.getString("edad");
                a.setNombre(nombre);
                a.setEdad(edad);
                System.out.println("nombre: "+a.nombre+" edad: "+a.edad);
            }



            databaseConnection.close();

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

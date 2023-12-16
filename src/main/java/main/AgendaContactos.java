
package main;

import java.sql.*;

public class AgendaContactos {
    
    Connection conexion = null;
    
    private String user = "root";
    private String password = "admin";
    private String database = "agenda_contactos";
    private String host = "localhost";
    private String port = "3306";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
    
    public Connection getConection () {
        try {
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Base de datos conectada con éxito");  
        }
        catch( SQLException e) {
            System.out.println("No pudo conectarse con su base de datos: " + e);
        }
        return conexion;
    }
    

    public static void main(String[] args) {
        
        AgendaContactos app = new AgendaContactos();
        app.getConection();
        
    }
}

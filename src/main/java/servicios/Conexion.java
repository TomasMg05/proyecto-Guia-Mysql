package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conn;

    public static Connection obtener() throws SQLException {
        if (conn == null) {
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotel",  
                    "root",                               
                    ""                            
                );
                System.out.println("Conexión establecida correctamente."); 
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                throw new SQLException(e);
            }
        }
        return conn;
    }
    public static void cerrar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}

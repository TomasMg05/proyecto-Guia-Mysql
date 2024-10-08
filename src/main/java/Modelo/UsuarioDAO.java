package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import servicios.Conexion;

public class UsuarioDAO {

    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuario (nombre, documento, edad, tipoAlquiler) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.obtener(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getDocumento());
            ps.setInt(3, usuario.getEdad());
            ps.setString(4, usuario.getTipoAlquiler());

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                System.out.println("Inserción exitosa.");  
            } else {
                System.out.println("No se insertó ningún registro."); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

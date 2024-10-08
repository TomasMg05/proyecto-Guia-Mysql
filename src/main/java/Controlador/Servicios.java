package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;

public class Servicios {
    private UsuarioDAO usuarioDAO;

    public Servicios() {
        usuarioDAO = new UsuarioDAO();
    }

    public void alquilar(String nombre, String documento, int edad, String tipoAlquiler) {
        Usuario usuario = new Usuario(0, nombre, documento, edad, tipoAlquiler);
        usuarioDAO.agregarUsuario(usuario);
    }
}

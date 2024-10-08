package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String documento;
    private int edad;
    private String tipoAlquiler; 

    public Usuario(int id, String nombre, String documento, int edad, String tipoAlquiler) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.tipoAlquiler = tipoAlquiler;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlquiler() {
        return tipoAlquiler;
    }

    public void setTipoAlquiler(String tipoAlquiler) {
        this.tipoAlquiler = tipoAlquiler;
    }
}

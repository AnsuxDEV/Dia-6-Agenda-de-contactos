public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    // Constructor
    public Contacto (String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters
    public String getNombre() { 
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    //Metodo para mostrar el contacto
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nTelefono: " + telefono + "\nEmail: " + email;
    }
}

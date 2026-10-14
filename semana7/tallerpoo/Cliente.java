package semana7.tallerpoo;

public class Cliente {
    private String cedula;
    private String nombre;
    private Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Clientetaller [cedula=" + cedula + ", nombre=" + nombre + "]";
    }
}

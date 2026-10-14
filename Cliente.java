public class Cliente {
    private int indetificacion;
    private String nombre;
    public Cliente(int indetificacion, String nombre) {
        this.indetificacion = indetificacion;
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Cliente [indetificacion=" + indetificacion + ", nombre=" + nombre + "]";
    }
    
}

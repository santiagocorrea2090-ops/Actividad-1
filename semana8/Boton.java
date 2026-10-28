public class Boton {

    private String nombre;
    private boolean encendido;
    private boolean danado;

    public Boton(String nombre) {
        this.nombre = nombre;
        encendido = false;
        danado = false;
    }

    public void presionar() {
        if (danado) {
            System.out.println("Alerta: el boton " + nombre + " esta danado");
        } else {
            encendido = true;
            System.out.println("Boton " + nombre + " presionado. Sonido de confirmacion.");
        }
    }

    public void apagar() {
        encendido = false;
    }

    public void danar() {
        danado = true;
    }

    public boolean estaDanado() {
        return danado;
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
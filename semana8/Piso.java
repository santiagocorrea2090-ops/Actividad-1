public class Piso {

    private int numero;
    private Boton subir;
    private Boton bajar;

    public Piso(int numero) {
        this.numero = numero;
        subir = new Boton("Subir del piso " + numero);
        bajar = new Boton("Bajar del piso " + numero);
    }

    public int getNumero() {
        return numero;
    }

    public Boton getSubir() {
        return subir;
    }

    public Boton getBajar() {
        return bajar;
    }
}
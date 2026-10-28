public class Ascensor {

    private int pisoActual;
    private String direccion;
    private boolean danado;
    private Boton[] botones;
    private Puerta puerta;

    public Ascensor(int cantidadPisos) {
        pisoActual = 1;
        direccion = "Detenido";
        danado = false;
        puerta = new Puerta();
        botones = new Boton[cantidadPisos];

        for (int i = 0; i < cantidadPisos; i++) {
            botones[i] = new Boton("Piso " + (i + 1));
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void seleccionarPiso(int destino) {
        if (danado) {
            System.out.println("El ascensor esta fuera de servicio");
        } else if (destino < 1 || destino > botones.length) {
            System.out.println("Piso no valido");
        } else if (puerta.estaAbierta()) {
            System.out.println("Cierra la puerta antes de moverte");
        } else {
            botones[destino - 1].presionar();

            if (botones[destino - 1].estaDanado()) {
                System.out.println("No se puede registrar la solicitud");
            } else {
                mover(destino);
                botones[destino - 1].apagar();
            }
        }
    }

    private void mover(int destino) {
        if (destino > pisoActual) {
            direccion = "Subiendo";
        } else if (destino < pisoActual) {
            direccion = "Bajando";
        } else {
            System.out.println("Ya estas en ese piso");
            return;
        }

        while (pisoActual != destino && !danado) {
            if (direccion.equals("Subiendo")) {
                pisoActual++;
            } else {
                pisoActual--;
            }

            System.out.println("Ascensor en piso " + pisoActual);
        }

        if (!danado) {
            direccion = "Detenido";
            puerta.abrir();
            System.out.println("Llegaste a tu destino");
        }
    }

    public void cerrarPuerta() {
        puerta.cerrar();
    }

    public void mantenerPuertaAbierta() {
        puerta.abrir();
        System.out.println("Puerta mantenida abierta");
    }

    public void simularObstaculo(boolean estado) {
        puerta.detectarObstaculo(estado);
    }

    public void simularFalla() {
        danado = true;
        direccion = "Detenido";
        puerta.abrir();
        System.out.println("ALERTA: falla detectada. Avisar a mantenimiento");
        System.out.println("Ascensor detenido en el piso " + pisoActual);
    }

    public void mostrarEstado() {
        System.out.println("Piso actual: " + pisoActual);
        System.out.println("Direccion: " + direccion);
        System.out.println("Puerta: " +
                (puerta.estaAbierta() ? "Abierta" : "Cerrada"));
    }
}
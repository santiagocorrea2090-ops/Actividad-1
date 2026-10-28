public class Puerta {

    private boolean abierta;
    private boolean obstaculo;

    public Puerta() {
        abierta = false;
        obstaculo = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta");
    }

    public void cerrar() {
        if (obstaculo) {
            System.out.println("Hay un obstaculo. La puerta sigue abierta");
            abierta = true;
        } else {
            abierta = false;
            System.out.println("Puerta cerrada");
        }
    }

    public void detectarObstaculo(boolean estado) {
        obstaculo = estado;

        if (obstaculo) {
            abierta = true;
            System.out.println("Alerta: obstaculo detectado");
        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
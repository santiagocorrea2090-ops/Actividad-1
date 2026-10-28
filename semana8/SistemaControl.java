import java.util.Scanner;

public class SistemaControl {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadPisos = 5;
        Ascensor ascensor = new Ascensor(cantidadPisos);
        Piso[] pisos = new Piso[cantidadPisos];

        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE ASCENSOR ===");
            System.out.println("1. Seleccionar piso");
            System.out.println("2. Llamar ascensor para subir");
            System.out.println("3. Llamar ascensor para bajar");
            System.out.println("4. Cerrar puerta");
            System.out.println("5. Mantener puerta abierta");
            System.out.println("6. Simular obstaculo");
            System.out.println("7. Simular falla");
            System.out.println("8. Ver estado del ascensor");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el piso de destino: ");
                int destino = teclado.nextInt();
                ascensor.seleccionarPiso(destino);
            } else if (opcion == 2) {
                int piso = ascensor.getPisoActual();

                pisos[piso - 1].getSubir().presionar();
                ascensor.cerrarPuerta();
                ascensor.mostrarEstado();

            } else if (opcion == 3) {
                int piso = ascensor.getPisoActual();

                pisos[piso - 1].getBajar().presionar();
                ascensor.cerrarPuerta();
                ascensor.mostrarEstado();

            } else if (opcion == 4) {
                ascensor.cerrarPuerta();

            } else if (opcion == 5) {
                ascensor.mantenerPuertaAbierta();

            } else if (opcion == 6) {
                System.out.print("Hay obstaculo? (1=Si, 0=No): ");
                int respuesta = teclado.nextInt();

                if (respuesta == 1) {
                    ascensor.simularObstaculo(true);
                } else {
                    ascensor.simularObstaculo(false);
                }

            } else if (opcion == 7) {
                ascensor.simularFalla();

            } else if (opcion == 8) {
                ascensor.mostrarEstado();

            } else if (opcion != 9) {
                System.out.println("Opcion no valida");
            }

        } while (opcion != 9);

        System.out.println("Sistema finalizado");
        teclado.close();
    }
}
import java.util.Date;

public class EjecutarPedido {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("16791597", "alexander correa");

        Foto foto1 = new Foto("foto1");
        Foto foto2 = new Foto("foto2");

        Foto[] fotos = { foto1, foto2 };

        Impresion impresion = new Impresion(1, "Verde", fotos);

        Camara camara = new Camara(2, "EOS Rebel", null);

        Producto[] productos = { impresion, camara };

        Date fecha = new Date();

        Pedido pedido = new Pedido(cliente, productos, fecha, 1233);

        pedido.mostrarPedido();

        impresion.getFotos();

        System.out.println(camara);
    }
}
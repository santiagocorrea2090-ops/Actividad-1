public class Mainbanco {
    public static void main(String[] args) {
        Cuenta cuenta= new Cuenta("12345678910","brandon alexis ocoro",0);
        Cliente cliente= new Cliente(12345,"brandon alexis ocoro");
        Banco banco= new Banco("UCCbanco","carrera 27#42-61", cuenta);

        System.out.println(banco);
    }
    
}

public class Cuenta {
    private String numerodecuenta;
    private String titula;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numerodecuenta, String titula, double saldo) {
        this.numerodecuenta = numerodecuenta;
        this.titula = titula;
        this.saldo = saldo;
    }

    public void cosnginar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        return "Cuenta [numerodecuenta=" + numerodecuenta + ", titula=" + titula + ", saldo=" + saldo + "]";
    }
}
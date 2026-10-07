package semana6;

public class Trabajador {
    //atributos
    private int cedula;
    private String nombre;
    private double salario;
    //constructor
    public Trabajador(int cedula, String nombre, double salario){
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }
    public double pagar (){
        return salario * 1.10;

    }
    public String getNombre(){
        return nombre;
    }
}

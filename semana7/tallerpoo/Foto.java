package semana7.tallerpoo;

public class Foto {
    private  String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }
    public void print(){
        System.out.println(fichero);
    }
}
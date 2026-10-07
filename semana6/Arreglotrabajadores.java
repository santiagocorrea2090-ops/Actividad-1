package semana6;

public class Arreglotrabajadores {
    public static void main(String[] args)throws Exception {
        //creacion del arreglo trabajadroes(arreglo de objetos)
        Trabajador[] trabajadores = new Trabajador [3];
        //creacion del objeto trabajador y asignado a la posicion del arreglo  
        trabajadores[0] =new Trabajador (101125635, "alex",1000.0);
        trabajadores[1] =new Operario (153145675, "brandon",2000.0, 120);
        trabajadores[2] =new Vendedor (111432622, "Jonier",2000.0, 21.5);
        for(int i = 0; i< trabajadores.length;i++){
            System.out.println("salario a pagar a: "+ trabajadores[i].getNombre()+"es:"+trabajadores[i].pagar());
        }
    }
}
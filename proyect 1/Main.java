public class Main {
    public static void main(String[] args) {
        Estudiante objest1 = new Estudiante("Santiago", "197456945", 20, "ingeneria en sistemas");
        Estudiante objest2 = new Estudiante("Camilo", "1108566989", 22, "ingeneria en sistemas");
        Estudiante objest3 = new Estudiante("Alex", "1200566487", 24, "ingeneria en sistemas");

        // mostrar la infroamcion del objeto
        System.out.println(objest1);
        System.out.println(objest2);
        System.out.println(objest3);
        // uso de los metodos get y set

        System.out.println(objest1.getEdad());// 20
        System.out.println(objest1.getEdad());// 18

        // cambiar el nombre del "objest2"
        objest2.setNombre("yurany urquijo");

        System.out.println(objest2);// estudiante[nombre: yurany urquijo, documento: 1108566989, edad: 18, programa:
                                    // ingeneria en sistemas]

        // validar con el metdo setEdad que la edad sea mayor o igual a cero
        objest1.setEdad(30);
        System.out.println(objest1);
        objest1.setEdad(-30);// edad tiene q ser mayor o igual a cero
        // validar con el metodo setNombre para que nose cree un nombre vacio
        objest2.setNombre(""); // nombre vacio
        objest2.setNombre("amparo");
        System.out.println(objest2);
    }
}
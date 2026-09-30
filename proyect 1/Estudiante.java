public class Estudiante {
    //atributos 
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

    //contructor de la clase
public Estudiante(String nombre, String documento, int edad, String programa) {
    this.nombre = nombre;
    this.documento = documento;
    this.edad = edad;
    this.programa = programa;
}
    //geter y setter 
    public String getnombre(){
        return nombre;
    }
        public void setNombre(String nombre){
            if(nombre.equals(""))
            System.out.println("Nombre vacio...");
        else
            this.nombre = nombre;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getPrograma(){
        return programa;
    }
    public void setPrograma(String programa){
        this.programa = programa;
    }
    //metodos toString (mostrar la informacion del objeto)

    public String toString (){ 
        return "estudiante[nombre: "+ nombre + "documento: "+ documento + "edad: "+ edad + "programa: "+ programa + "]";
    }
}

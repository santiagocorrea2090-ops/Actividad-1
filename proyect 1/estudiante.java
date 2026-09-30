public class Estudiante {
    //atributos 
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

|   //contructor de la clase
public estudiante(string nombre, string documento, int edad, string programa) {
    this.nombre = nombre;
    this.documento = documento;
    this.edad = edad;
    this.programa = programa;
    
    //geter y setter 
    publicx string get nombre(){
        return nombre;
    }
    public void setNombre(string nombre){
        if(nombre.equals(""))
            System.out.println("Nombre vacio...");
        else
            this.nombre = nombre;
    }
    public string getDocumento(){
        return documento;
    }
    public void setDocumento(string documento){
        this.documento = documento;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public string getPrograma(){
        return programa;
    }
    public void setPrograma(string programa){
        this.programa = programa;
    }
    //metodos tostring (mostrar la informacion del objeto)

    public string tostring (){ 
        return "estudiante[nombre: "+ nombre + "documento: "+ documento + "edad: "+ edad + "programa: "+ programa + "]";
    }
    }
}
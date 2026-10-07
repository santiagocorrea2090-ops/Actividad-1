public class Libro{
//atributos 

private int titulo;
private String autor;
private int Publicacion;
private String disponibilidad;

//construccion de base de datos

public Libro(int titulo, String autor, int Publicacion, String disponibilidad){
    this.titulo = titulo;
    this.autor = autor;
    this.Publicacion = Publicacion;
    this.disponibilidad = disponibilidad;
}
    // geter y setter
    public int getTitulo(){
        return titulo;
    }
    public void setTitulo(int titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getPublicacion(){
        return Publicacion;
    }
    public void setPublicacion(int Publicacion){
        this.Publicacion = Publicacion;
    }
    public String getDisponibilidad(){
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    //mostrar informacion
    public String toString(){
        return "Libro[titulo: "+ titulo + "autor: "+ autor + "Publicacion: "+ Publicacion + "disponibilidad: "+ disponibilidad + "]";
    }
}

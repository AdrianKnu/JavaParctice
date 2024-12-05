package Biblioteca;

public class Persona{
    String nombre;
    String apellido;
    Libro[] librosPrestados;

    

    public Persona(String nombre, String apellido, int i) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPrestados =  new Libro[i];
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }
    public void setLibrosPrestados(Libro[] librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void pedirPrestado(Libro libro, int i){
        this.librosPrestados[i]=libro;
    }

    public void devolverLibro(Libro libro){
        for(int i=0; i<librosPrestados.length;i++){
            if(librosPrestados[i] == libro){
                librosPrestados[i]=null;
                break; 
            }
        }

    }

}

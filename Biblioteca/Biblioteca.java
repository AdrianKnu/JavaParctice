package Biblioteca;
import Biblioteca.*;
public class Biblioteca {
    Libro[] catalogo;
    

    public Biblioteca(int cantLibros) {
        this.catalogo =  new Libro[cantLibros];;
    }

    public Libro[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Libro[] catalogo) {
        this.catalogo = catalogo;
    }
    
    public void agregaLibro(Libro libro, int i){
        catalogo[i]= libro;
        System.out.println("El libro fue agregado");
    }

    public void mostrarCatalogo(){
        for(int i=0;i<catalogo.length;i++){
            catalogo[i].mostrarInformacion();
        }
    }

    public void prestarLibro(Libro libro, Persona persona,int i){
        persona.pedirPrestado(libro, i);
        libro.prestarLibro();
    }

    public void devolverLibro(Libro libro, Persona persona){
        persona.devolverLibro(libro);
        libro.devolverLibro();
    }


}

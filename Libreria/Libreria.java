package Libreria;

import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
    
    HashSet<Libro> libros = new HashSet<>();

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro(int ISBN){
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro ejemplo = iterator.next();
            if(ejemplo.getISBN() == ISBN ) {
                iterator.remove();
                System.out.println("El libro con ISBN: "+ISBN+ " se ha eliminado");
            }
        }
    }

    public void mostrarCatalogo(){
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitulo());
        }
    }
}

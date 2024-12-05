package Biblioteca;
import Biblioteca.*;
public class App {
    
    public static void main (String[] args){
        Biblioteca biblioteca= new Biblioteca(3);

        Libro libro1 = new Libro("Harry Potter", "JK Rowling",400);
        Libro libro2 = new Libro("EL señor de los anillos", "Jakanda Rowling",400);
        Libro libro3 = new Libro("Las cronicas de narnia", "El placard?",423);
   
        Persona persona1= new Persona("Juan","Perez",3);
        Persona persona2 = new Persona("Lady", "Gaga", 3);
        Persona persona3 = new Persona("Manuel", "Pedroza", 3);
        
        biblioteca.agregaLibro(libro1,0);
        biblioteca.agregaLibro(libro2,1);
        biblioteca.agregaLibro(libro3,2);
    
        biblioteca.prestarLibro(libro1,persona1,0);
        biblioteca.prestarLibro(libro2,persona2,1);
        biblioteca.prestarLibro(libro3,persona3,0);
        biblioteca.mostrarCatalogo();

        biblioteca.devolverLibro(libro1,persona1);
        biblioteca.devolverLibro(libro2,persona2);
        biblioteca.devolverLibro(libro3,persona3);


        biblioteca.mostrarCatalogo();
    }
    
}
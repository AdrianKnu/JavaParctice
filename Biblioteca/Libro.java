package Biblioteca;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean prestado;
    
    //Constructor
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado=false;
    }

    //Getters y Setters
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    
    public void mostrarInformacion() {
       System.out.println("Titulo del libro: "+ this.getTitulo() );
       System.out.println("Autor: "+ this.getAutor());
       System.out.println("Cantidad de Paginas: "+ this.getNumeroPaginas());
       System.out.println("Prestado: "+ this.isPrestado());
       
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestarLibro(){
        this.prestado=true;
    }

    public void devolverLibro(){
        this.prestado=false;
    }
}

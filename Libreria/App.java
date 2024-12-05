package Libreria;

import java.util.Scanner;

public class App {
   
public static void main(String[] args) {
        Libreria libreria = new Libreria();
		int opcion;
		try(Scanner scanner = new Scanner(System.in)){
			do {
				menu();
				opcion = scanner.nextInt();
				scanner.nextLine();
				switch (opcion) {
					case 1 -> {
						System.out.println("Ingrese el nombre del libro: ");
						String nombre = scanner.nextLine();
                        System.out.println("Ingrese el Autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.println("Ingrese el ISBN del libro: ");
                        int iSBN = scanner.nextInt();
                        Libro libroN = new Libro(nombre, autor, iSBN);
                        libreria.agregarLibro(libroN);
					}
					case 2 -> {
						System.out.println("Indica el ISBN del libro a remover");
						int iSBN = scanner.nextInt();
                        libreria.eliminarLibro(iSBN);
					}
					case 3 -> {
						libreria.mostrarCatalogo();
					}
					case 4 -> {
					}
					default -> System.out.println("Opción inválida");
				}
			} while (opcion!=4);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void menu(){
		System.out.println("MENÚ LIBRERIA");
		System.out.println("1- Agregar");
		System.out.println("2- Eliminar");
		System.out.println("3- Mostrar");
		System.out.println("4- Salir");
	}

}

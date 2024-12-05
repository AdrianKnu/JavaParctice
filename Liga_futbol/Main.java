package Liga_futbol;

import java.util.Scanner;

import Liga_futbol.Modelo.Equipo;
import Liga_futbol.Modelo.Jugador;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Equipo[] listaEquipos = new Equipo[10];
    static Jugador[] listaJugadores = new Jugador[10];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;

        do {
            System.out.println("""
                    Menú de opciones:
                    1. Crear jugador
                    2. Crear equipo
                    3. Asignar jugador a equipo
                    4. Mostrar lista de jugadores
                    5. Mostrar lista de equipos
                    6. Salir
                    """);

            opcion = sc.nextInt();
            sc.nextLine();
            opciones(opcion);
        } while (opcion != 6);

    }

    public static void opciones(int opcion) {
        switch (opcion) {
            case 1 -> crearJugador();
            case 4 -> mostrarListaJugadores();
            case 6 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida. Inténtelo de nuevo");
        }
    }

    public static void crearJugador() {
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        Jugador nuevoJugador = new Jugador();
        nuevoJugador.setNombre(nombre);

        if (Equipo.counter == 0) {
            System.out.println("No hay equipos disponibles");
            Equipo equipo = new Equipo();
            equipo.setNombre(null);
            nuevoJugador.setEquipo(equipo);
            Equipo.counter--;
        } else {
            nuevoJugador.setEquipo(listaEquipos[0]);
            Equipo.mostrarEquipos(listaEquipos);

            System.out.println("Seleccione el número de equipo: ");
            int indiceEquipo = sc.nextInt();

            nuevoJugador.setEquipo(listaEquipos[indiceEquipo - 1]);
        }
        listaJugadores[Jugador.counter - 1] = nuevoJugador;

        System.out.println("Jugador " + nombre + " creado\n");

    }

    public static void mostrarListaJugadores() {
        if (Jugador.counter == 0) {
            System.out.println("No hay jugadores existentes\n");
            return;
        }
        Jugador.listarJugadores(listaJugadores);
    }

    // Crear equipo: Esta opción te permitirá crear un nuevo equipo. Deberás pedir
    // al usuario el nombre del equipo.
    public static void crearEquipo() {
        System.out.print("Como se llama el equipo?: ");
        String nombreEquipo = sc.nextLine();
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo);
    }

}

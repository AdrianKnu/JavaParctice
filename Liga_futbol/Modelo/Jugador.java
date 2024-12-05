package Liga_futbol.Modelo;

public class Jugador {

    private String nombre;
    private Equipo equipo;
    public static int counter = 0;

    public Jugador() {
        Jugador.counter++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public static void listarJugadores(Jugador[] jugadores) {
        System.out.println("\nLista de jugadores: ");

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                System.out.print((i + 1) + ". Nombre jugador: " + jugadores[i].getNombre());
                if (jugadores[i].getEquipo().getNombre() != null) {
                    System.out.println(", Equipo asignado: " + jugadores[i].getEquipo().getNombre());
                } else {
                    System.out.println(", Equipo asignado: Aun no tiene");

                }
            }
        }

        System.out.println();
    }

}

package Liga_futbol.Modelo;

public class Equipo {

    private String nombre;
    public static int counter = 0;

    public Equipo() {
        Equipo.counter++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void mostrarEquipos(Equipo[] equipos) {
        System.out.println("\nLista de equipos: ");

        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null) {
                System.out.println((i + 1) + ". " + equipos[i].getNombre());
            }
        }

        System.out.println();
    }
}

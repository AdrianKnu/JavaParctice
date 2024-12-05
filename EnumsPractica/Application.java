package EnumsPractica;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // Crear un arreglo con 10 días de la semana generados al azar
        DiaSemana[] diasAleatorios = generarDiasAleatorios(10);

        // Imprimir si cada día es laboral o no
        for (DiaSemana dia : diasAleatorios) {
            System.out.println(dia + ": " + imprimirDiaLaboral(dia));
        }
    }

    // Método para generar un arreglo de días de la semana aleatorios
    private static DiaSemana[] generarDiasAleatorios(int cantidad) {
        DiaSemana[] dias = new DiaSemana[cantidad];
        Random random = new Random();
        DiaSemana[] valores = DiaSemana.values();

        for (int i = 0; i < cantidad; i++) {
            dias[i] = valores[random.nextInt(valores.length)];
        }

        return dias;
    }

    // Método para imprimir si un día es laboral o no
    private static String imprimirDiaLaboral(DiaSemana dia) {
        return dia.esDiaLaboral() ? "Día laboral" : "No es día laboral";
    }

}

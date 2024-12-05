package EnumsPractica;

// Definición del enum DiaSemana
public enum DiaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

    // Método para verificar si el día es laboral
    public boolean esDiaLaboral() {
        return this != SÁBADO && this != DOMINGO;
    }
}
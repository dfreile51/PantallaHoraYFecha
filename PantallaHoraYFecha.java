
/**
 * Pantalla que marca la hora y la fehca
 * 
 * @author (Diego) 
 * @version (1.0)
 */
public class PantallaHoraYFecha {
    // La pantalla del dia
    private PantallaDosDigitos pantallaDia;
    // La pantalla del mes
    private PantallaDosDigitos pantallaMes;
    // La pantalla del año
    private PantallaDosDigitos pantallaAno;
    // La pantalla de las horas
    private PantallaDosDigitos pantallaHoras;
    // la pantalla de los minutos
    private PantallaDosDigitos pantallaMinutos;

    /**
     * Constructor de la clase PantallaHoraYFecha. Este constructor crea un nuevo reloj
     * con la fecha 1-1-1 y la hora 00:00.
     */
    public PantallaHoraYFecha() {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAno = new PantallaDosDigitos(1, 100);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }
}

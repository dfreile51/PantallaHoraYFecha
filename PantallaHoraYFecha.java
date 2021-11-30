
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
    
    /**
     * Este metodo provoca el avance del reloj en un minuto.
     */
    public void avanzarMinuto() {
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0) {
            pantallaHoras.incrementaValorAlmacenado();
            if (pantallaHoras.getValorAlmacenado() == 0) {
                pantallaDia.incrementaValorAlmacenado();
                if (pantallaDia.getValorAlmacenado() == 1) {
                    pantallaMes.incrementaValorAlmacenado();
                    if (pantallaMes.getValorAlmacenado() == 1) {
                        pantallaAno.incrementaValorAlmacenado();
                    }
                }
            }
        }
    }
    
    /**
     * Fija las horas, los minutos, los dias, los meses y los años que pongamos
     */
    public void fijarFechaYHora (int horas, int minutos, int dias, int meses, int anos) {
        pantallaHoras.setValorAlmacenado(horas);
        pantallaMinutos.setValorAlmacenado(minutos);
        pantallaDia.setValorAlmacenado(dias);
        pantallaMes.setValorAlmacenado(meses);
        pantallaAno.setValorAlmacenado(anos);
    }
    
    /**
     * Devuelve la hora y la fecha actual de esta pantalla en el formato HH:MM DD-MM-AA.
     */
    public String getHoraYFecha() {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " " + pantallaDia.getTextoDeLaPantalla() + "-" + 
        pantallaMes.getTextoDeLaPantalla() + "-" + pantallaAno.getTextoDeLaPantalla();
    }
}

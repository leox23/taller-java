package trece;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class Trece {
    Trece(){}
    private static final Logger log = Logger.getLogger(String.valueOf(Trece.class));

    /**
     * Metodo que lee la fecha y hora local, y la imprime en un formato especifico YYYY/MM/DD HH:MM:SS
     */
    public static void darfechYhora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        log.info("Se consulta la fecha en formato: YYYY/MM/DD HH:MM:SS" +
                "\ny el resultado es -> "+ dtf.format(LocalDateTime.now()));
    }
}

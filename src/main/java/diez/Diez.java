package diez;

import java.util.Scanner;
import java.util.logging.Logger;

public class Diez {
    public static final Logger log = Logger.getLogger(String.valueOf(Diez.class));
    private Diez() {}

    public static void eliminarEspaciosDeFrase(){
        Scanner scan = new Scanner(System.in);
        log.info("Ingresa una frase y eliminaremos los espacios");
        String phrase = scan.nextLine().replace(" ", "");
        log.info(phrase);
    }
}

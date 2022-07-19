package siete;

import java.util.Scanner;
import java.util.logging.Logger;

public class Siete {
    public static final Logger log = Logger.getLogger(String.valueOf(Siete.class));
    private Siete(){}

    public static void validarMayorQueCero() {
        Scanner scan = new Scanner(System.in);
        Integer numero;
        do {
            log.info("Introduce un numero y validaremos si es mayor que cero:");
            numero = Integer.valueOf(scan.nextLine()) ;
            if (numero >= 0) {
                log.info("Bien, el numero es mayor o igual que cero.");
            } else {
                log.info("El numero es menor que cero.");
            }
        } while (numero < 0);
    }
}

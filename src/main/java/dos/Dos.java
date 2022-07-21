package dos;

import java.util.Scanner;
import java.util.logging.Logger;

public class Dos {
    private Dos() {
    }

    public static final Logger log = Logger.getLogger(String.valueOf(Dos.class));

    /**
     * Recibe 2 numeros por teclado del usuario y los compara
     */
    public static void numeroMayorQue() {
        Scanner scan = new Scanner(System.in);
        log.info("Ingresa el primer numero a comparar");
        Integer primerValor = Integer.parseInt(scan.nextLine());
        log.info("Ingresa el segundo valor a comparar");
        Integer segundoValor = Integer.parseInt(scan.nextLine());
        if (primerValor < segundoValor) {
            log.info("el segundo valor es mayor");
        } else if (primerValor > segundoValor) {
            log.info("el primer valor es mayor");
        } else {
            log.info("los valores son iguales");
        }


    }
}

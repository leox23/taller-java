package uno;

import java.util.logging.Logger;

public class Uno {
    public static final Logger log = Logger.getLogger(String.valueOf(Uno.class));
    private Uno() {}

    public static void numeroMayorQue() {
        Integer primerValor = 2;
        Integer segundoValor = 7;

        if (primerValor < segundoValor){
            log.info("El segundo numero es mayor");
        } else if (primerValor > segundoValor) {
            log.info("El primer numero es mayor");
        } else {
            log.info("los dos numeros son iguales son iguales");
        }
    }
}
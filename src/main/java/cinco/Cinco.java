package cinco;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Cinco {
    private Cinco() {
    }

    public static final Logger log = Logger.getLogger(String.valueOf(Cinco.class));

    /**
     * Metodo que muestra los pares e impares que hay del 1 al 100
     */
    public static void verParesImpares() {
        ArrayList<String> numerosPares = new ArrayList<>();
        ArrayList<String> numerosImpares = new ArrayList<>();
        Integer x = 1;
        while(x <= 100){
            if ((x % 2) == 0){
                numerosPares.add(String.valueOf(x));
            } else {
                numerosImpares.add(String.valueOf(x));
            }
            x++;
        }
        String msgPart1 = "La cantidad de pares es: ".concat(numerosPares.toString());
        String msgPart2 = "\nLa cantidad de impares es: ".concat(numerosImpares.toString());

        log.info(msgPart1 + msgPart2);
    }
}

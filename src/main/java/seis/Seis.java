package seis;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Seis {
    public static final Logger log = Logger.getLogger(String.valueOf(Seis.class));
    private Seis() {}

    public static void verParesImparesFor() {
        ArrayList<String> numerosPares = new ArrayList<>();
        ArrayList<String> numerosImpares = new ArrayList<>();
        for (int k = 1; k<100; k++){
            if ((k % 2) == 0){
                numerosPares.add(String.valueOf(k));
            } else {
                numerosImpares.add(String.valueOf(k));
            }
        }
        String msgPart1 = "La cantidad de pares es: ".concat(numerosPares.toString());
        String msgPart2 = "\nLa cantidad de impares es: ".concat(numerosImpares.toString());

        log.info(msgPart1 + msgPart2);
    }
}

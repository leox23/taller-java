package tres;

import java.util.Scanner;
import java.util.logging.Logger;

public class Tres {
    public static final Logger log = Logger.getLogger(String.valueOf(Tres.class));
    private Tres() {}

    public static void calcularAreaDeCirculo(){
        Scanner scan = new Scanner(System.in);
        log.info("Ingresa radio del circulo");
        Double radioDelCirculo = Double.parseDouble(scan.nextLine());
        Double areaResult = Math.pow(radioDelCirculo,2) + Math.PI;
        log.info("El area resultante es : ".concat(areaResult.toString()));
    }
}

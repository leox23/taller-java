package catorce;

import java.util.Scanner;
import java.util.logging.Logger;

public class Catorce {

    private static final Logger log = Logger.getLogger(String.valueOf(Catorce.class));

    /**
     * metodo que recibe un numero y cuenta de dos en dos hasta mil, imprimiendolos por consola
     */
    public static void contarHastaMilSaltosDeDos() {
        Scanner scan = new Scanner(System.in);
        log.info("Introduce el numero, y contaremos desde alli de dos en dos");
        Integer numero = Integer.valueOf(scan.nextLine());
        for (int i = numero; i <= 1000; i = i += 2) {
            log.info(String.valueOf(i));
        }
    }
}

package ocho;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ocho {
    public static final Logger log = Logger.getLogger(String.valueOf(Ocho.class));
    Ocho(){}

    public static void diaDeSemana() {
        Scanner scan = new Scanner(System.in);
        String inputDia;
        log.info("Introduce un dia de la semana para saber si es laborable");
        inputDia = scan.nextLine().toLowerCase();
        switch (inputDia){
            case "sabado":
            case "domingo":
                log.info("EL dia introducido es un dia libre");
                break;
            default:
                log.info("Es un dia laborable, te toca trabajar");
                break;
        }
    }

}

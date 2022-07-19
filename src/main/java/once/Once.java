package once;

import java.util.Scanner;
import java.util.logging.Logger;

public class Once {
    private Once(){}

    public static final Logger log = Logger.getLogger(String.valueOf(Once.class));

    public static void contarVocales(){
        Scanner scan = new Scanner(System.in);
        log.info("Introduce un string:");
        String[] usrString = scan.nextLine().split("");
        String[] vocals = {"a","e","i","o","u"};
        Integer[] counters = {0,0,0,0,0};
        for (int i = 0; i < usrString.length; i++){
            for (int j = 0; j < vocals.length; j++){
                if (usrString[i].equals(vocals[j])){
                    counters[j]++;
                    break;
                }
            }
        }

        log.info("Los resultados son");
        log.info("Largo del texto: " + usrString.length);
        for (int j = 0; j < vocals.length; j++){
            log.info("La vocal " + vocals[j] + ": " + counters[j]);
        }
    }
}

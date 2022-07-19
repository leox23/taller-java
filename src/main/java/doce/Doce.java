package doce;

import java.util.Scanner;
import java.util.logging.Logger;

public class Doce {
    Doce(){}
    public static final Logger log = Logger.getLogger(String.valueOf(Doce.class));

    public static void compararStrings() {
        Scanner scan = new Scanner(System.in);
        log.info("Introduce el primer string a comparar");
        String string1 = scan.nextLine();
        log.info("Introduce el segundo string a comparar");
        String string2 = scan.nextLine();
        Integer minorLength = 0;
        StringBuilder comparator = new StringBuilder("");
        Integer differ = 0;

        if (string1.equals(string2)){
            log.info("Los 2 strings son iguales");
        } else {
            if (string1.length() <= string2.length()){
                minorLength = string1.length();
                differ = string2.length() - string1.length();
            } else{
                minorLength = string2.length();
                differ =  string1.length() - string2.length();
            }

            for (int j = 0; j < minorLength; j++) {
                if (string1.charAt(j) == string2.charAt(j)) {
                    comparator.append(" ");
                } else {
                    comparator.append("↕");
                }
            }
            for (int i = 0; i < differ; i++){
                comparator.append("↕");
            }

            //para legibilidad
            log.info("Los strings son diferentes:");
            System.out.println("String1: " + string1);
            System.out.println("Diferen: " + comparator);
            System.out.println("String2: " + string2);
        }
    }

}

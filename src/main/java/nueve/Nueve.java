package nueve;

import java.util.logging.Logger;

public class Nueve {
    public static final Logger log = Logger.getLogger(String.valueOf(Nueve.class));
    Nueve(){}

    /**
     * metodo que reemplaza las "a" por "e" de la frase de Sofka, y une una frase fija que la culmina.
     */
    public static void changeAtoE(){
        String sofkaPhrase = "La sonrisa sera la mejor arma contra la tristeza";
        sofkaPhrase = sofkaPhrase.replace("a","e");
        String finalPhrase = ", y hasta el mas duro de corazon, se conmovera de felicidad...";
        log.info(sofkaPhrase.concat(finalPhrase));
    }
}

package quince;

import java.util.Scanner;
import java.util.logging.Logger;

public class Quince {
    private Quince(){}

    public static final Logger log = Logger.getLogger(String.valueOf(Quince.class));

    /**
     * metodo que muestra un menu, se repite si seleccionas cualquiera, pero si selecciona 8 se cierra la app.
     */
    public static void menuMovie() {
        Scanner scan = new Scanner(System.in);
        String menuSelection = "****** GESTION CINEMATOGRÁFICA ********" +
                "\n1-NUEVO ACTOR" +
                "\n2-BUSCAR ACTOR" +
                "\n3-ELIMINAR ACTOR" +
                "\n4-MODIFICAR ACTOR" +
                "\n5-VER TODOS LOS ACTORES" +
                "\n6-VER PELICULAS DE LOS ACTORES" +
                "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                "\n8-SALIR";
        while (true) {
            log.info(menuSelection);
            switch (Integer.parseInt(scan.nextLine())) {
                case 8:
                    System.exit(0);
                    break;
                default:
                    log.info("OPCION INCORRECTA");
            }
    }

}}

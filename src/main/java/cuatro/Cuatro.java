package cuatro;

import java.util.Scanner;
import java.util.logging.Logger;

public class Cuatro {
    public static final Logger log = Logger.getLogger(String.valueOf(Cuatro.class));
    private Cuatro(){}

    public static void precioTotalConIva(){
        Scanner scan = new Scanner(System.in);
        Integer valorIva = 21;
        log.info("Ingresa el precio del producto");
        Integer precioDelArticulo = Integer.valueOf(scan.nextLine());
        Integer calculo = ((precioDelArticulo * valorIva)/100) + precioDelArticulo;
        String mensaje = "El precio total del producto \ncon el iva es: ";
        log.info(mensaje.concat(calculo.toString()));
    }
}
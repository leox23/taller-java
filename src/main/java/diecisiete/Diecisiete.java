package diecisiete;

import java.util.logging.Logger;

public class Diecisiete {
    private static final Logger log = Logger.getLogger(String.valueOf(Diecisiete.class));
    public static void main2(){
        Electrodomestico[] electrodomesticos = {
                new Electrodomestico(),
                new Electrodomestico(300, 41),
                new Electrodomestico(250, "azul", 'b', 83),
                new Lavadora(),
                new Lavadora(50, 60),
                new Lavadora(32, 120, "blanco", 'b', 51),
                new Television(120, 52),
                new Television(45, true, 200, "azul", 'a', 60),
                new Television(),
                new Television(70, true, 500, "negro", 'a', 90)
        };
        Integer totalpagarElectrodomesticos = 0;
        Integer totalpagarLavadoras = 0;
        Integer totalpagarTelevisores = 0;

        for(int i = 0;i<electrodomesticos.length;i++){
            if (electrodomesticos[i] instanceof Television) {
                totalpagarTelevisores += Television.precioFinal(electrodomesticos[i]);
                totalpagarElectrodomesticos += Television.precioFinal(electrodomesticos[i]);
            } else if (electrodomesticos[i] instanceof Lavadora) {
                totalpagarLavadoras += Lavadora.precioFinal(electrodomesticos[i]);
                totalpagarElectrodomesticos += Lavadora.precioFinal(electrodomesticos[i]);
            } else {
                totalpagarElectrodomesticos += Electrodomestico.precioFinal(electrodomesticos[i]);
            }
        }
        log.info("El precio total a pagar en electrodomesticos es: "+totalpagarElectrodomesticos
                +"\nEl total solo en lavadoras es: "+totalpagarLavadoras
                +"\nEl total solo en televisores es: "+totalpagarTelevisores);
    }

}

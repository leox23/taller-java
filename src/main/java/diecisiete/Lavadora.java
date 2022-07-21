package diecisiete;

/**
 * subclase de Electrodomestico, implementacion personalizada
 */
public class Lavadora extends Electrodomestico {
    private static Integer carga = 5;

    Lavadora(){

    }

    Lavadora(Integer precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    Lavadora(Integer carga, Integer precioBase, String color, char consumoEnergetico, Integer peso){
        this.carga = carga;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getCarga() {
        return carga;
    }


    /**
     * Metodo que agrega mas costo a la lavadora segun la carga que puede lavart
     * @param carga int
     * @return int del precio a sumar
     */
    public static Integer precioPorCarga(Integer carga){
        if (carga > 30){
            return 50;
        }else {
            return 0;
        }
    }

    /**
     * Metodo que calcula el precio final del producto
     * @param producto Objeto Lavadora
     * @return int con el precio final
     */
    public static Integer precioFinal(Lavadora producto){
        return  precioPorCarga(producto.carga)
                + Electrodomestico.precioFinal(producto.precioBase, producto.peso, producto.consumoEnergetico);
    }


    /**
     * Metodo con implementacion generica
     * @return precio generico
     */
    public static Integer precioFinal(){
        return  precioPorCarga(carga)
                + Electrodomestico.precioFinal(precioBase, peso, consumoEnergetico);
    }

}

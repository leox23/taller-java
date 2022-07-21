package diecisiete;

/**
 * subclase o clase hija de Electrodomestico, implementacion mas esecifica
 */
public class Television extends Electrodomestico{
    public static Integer resolucion = 20;
    public static Boolean sintonnizadotTDT = false;

    Television(){

    }
    Television(Integer precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    Television(Integer resolucion, Boolean sintonizadorTDT, Integer precioBase, String color, char consumoEnergetico, Integer peso){
        this.resolucion = resolucion;
        this.sintonnizadotTDT = sintonizadorTDT;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getResulucion() {
        return resolucion;
    }

    public Boolean getSintonnizadotTDT() {
        return sintonnizadotTDT;
    }

    /**
     * Metodo que aplica porcentaje de precio adicional segun el tamaño de la resolucion de la TV
     * @param resolucion entero con la resolucion del producto
     * @return int
     */
    public static Integer precioResolucion(Integer resolucion){
        if (resolucion >= 40) {
            return 130;
        } else {
            return 100;
        }
    }

    /**
     * Metodo que aumenta el precio si la tv tiene Sintonizador TDT
     * @param sintoTDT booleano
     * @return int con precio que agregara mas al precio final
     */
    public static Integer precioSintonizadorTDT(Boolean sintoTDT){
        if (sintoTDT){
            return 50;
        } else {
            return 0;
        }
    }

    /**
     * Metodos para calcular el precio adicional
     * @param producto vatiable tipo Television
     * @return Integer con el precio final
     */
    public static Integer precioFinal(Television producto){
        return (( precioSintonizadorTDT(producto.sintonnizadotTDT)
                + Electrodomestico.precioFinal(producto.precioBase, producto.peso, producto.consumoEnergetico))
                * precioResolucion(resolucion))/100;
    }

    /**
     * Metodo con implementacion generica
     * @return precio generico
     */
    public static Integer precioFinal() {
        return  ((precioSintonizadorTDT(sintonnizadotTDT)
                + Electrodomestico.precioFinal(precioBase, peso, consumoEnergetico))
                * precioResolucion(resolucion))/100;
    }
}

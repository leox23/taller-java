package diecisiete;


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

    public static Integer precioResolucion(Integer resolucion){
        if (resolucion >= 40) {
            return 130;
        } else {
            return 100;
        }
    }

    public static Integer precioSintonizadorTDT(Boolean sintoTDT){
        if (sintoTDT){
            return 50;
        } else {
            return 0;
        }
    }

    public static Integer precioFinal(Television producto){
        return (( precioSintonizadorTDT(producto.sintonnizadotTDT)
                + Electrodomestico.precioFinal(producto.precioBase, producto.peso, producto.consumoEnergetico))
                * precioResolucion(resolucion))/100;
    }

    public static Integer precioFinal() {
        return  ((precioSintonizadorTDT(sintonnizadotTDT)
                + Electrodomestico.precioFinal(precioBase, peso, consumoEnergetico))
                * precioResolucion(resolucion))/100;
    }
}

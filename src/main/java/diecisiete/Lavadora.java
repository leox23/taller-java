package diecisiete;

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


    public static Integer precioPorCarga(Integer carga){
        if (carga > 30){
            return 50;
        }else {
            return 0;
        }
    }

    public static Integer precioFinal(Lavadora producto){
        return  precioPorCarga(producto.carga)
                + Electrodomestico.precioFinal(producto.precioBase, producto.peso, producto.consumoEnergetico);
    }


    public static Integer precioFinal(){
        return  precioPorCarga(carga)
                + Electrodomestico.precioFinal(precioBase, peso, consumoEnergetico);
    }

}

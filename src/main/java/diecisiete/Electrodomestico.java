package diecisiete;


public class Electrodomestico {
    public static Integer precioBase = 100;
    public String color = "blanco";
    public static char consumoEnergetico = 'f';
    public static Integer peso = 5;

    Electrodomestico(){

    }

    Electrodomestico(Integer precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    Electrodomestico(Integer precioBase, String color, char consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private static Integer precioPorConsumoEnergetico(char letra) {
        switch (Character.toLowerCase(letra)){
            case 'a':
                return 100;
            case 'b':
                return 80;
            case 'c':
                return 60;
            case 'd':
                return 50;
            case 'e':
                return 30;
            default:
                return 10;
        }
    }

    private void comprobarColor(String color){
        //metodo no usado, quedara asi
        switch (color.toLowerCase()){
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                break;
        }
    }

    public static Integer precioPorPeso(Integer peso){
        if (peso >= 0 && peso <= 19){
            return 10;
        } else if (peso >= 20 && peso <= 49){
            return 50;
        } else if (peso >= 50 && peso <= 79){
            return 80;
        } else {
            return 100;
        }
    }

    public static Integer precioFinal(Electrodomestico producto){
        return producto.getPrecioBase() +
                precioPorPeso(producto.getPeso()) +
                precioPorConsumoEnergetico(producto.getConsumoEnergetico());
    }

    public static Integer precioFinal(Integer preciobase, Integer peso,  char letraConsumo){
        return  preciobase +
                precioPorPeso(peso) +
                precioPorConsumoEnergetico(letraConsumo);
    }

    public static Integer precioFinal(Integer preciobase, Integer peso){
        return preciobase
                + precioPorPeso(peso)
                + precioPorConsumoEnergetico(consumoEnergetico);
    }

    public static Integer precioFinal(){
        return precioBase
                + precioPorPeso(peso)
                + precioPorConsumoEnergetico(consumoEnergetico);
    }
}
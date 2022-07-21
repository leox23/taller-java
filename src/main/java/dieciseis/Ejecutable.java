package dieciseis;


import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase destinada al analisis de los datos suministrados por el usuario
 */
public class Ejecutable {

    public static final Logger log = Logger.getLogger(String.valueOf(Ejecutable.class));
    static Scanner scan=new Scanner(System.in);
    private Ejecutable() {
    }

    /**
     * Metodo que muestra por consola el estad del peso de la persona
     * @param persona Modelo persona que contiene el indice de masa corporal a usar
     */
    public static void mostrarPeso(Persona persona){
        Integer imc = persona.IMC(persona);
        switch (imc){
            case -1:
                log.info("la persona esta por debajo de su peso ideal");
                break;
            case 0:
                log.info("la persona esta en su peso ideal");
                break;
            case 1:
                log.info("la persona tiene sobrepeso");
                break;
            default:
        }
    }

    /**
     * Metodo para pedir los datos al usuario
     * @return los datos segmentados [Array]
     */
    public static String[] pedirDatos(){
        log.info("Por favor ingresa tu nombre, sexo, edad, peso y altura separador por coma \",\"");
        String info= scan.nextLine();
        String[] datos = info.split(",");
        return datos;
    }

    /**
     * Metodo para conseguir un numero enteroa aleatorio
     * @param max Numero maximo que se desea (int)
     * @param min Numero minimo que se desea (int)
     * @return numero random int
     */
    public static Integer random(Integer max,Integer min) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    /**
     * metodo que muestra por consola si una persona es mayor de edad
     * @param persona
     */
    public  static  void mostrarMayorDeEdad(Persona persona){
        Boolean mayor=persona.esMayorDeEdad();
        if (mayor==true){
            log.info(" si es mayor de edad");
        }else {
            log.info(" no es mayor de edad");
        }
    }


    /**
     * metodo que genera un DNI random
     * @return un Int de ocho cifras
     */
    public static String generateDni(){
        String DNI=String.valueOf(random(99999999,00000000)).concat(randomChar());
        return DNI;
    }

    /**
     * metodo para gernerar un caracter random
     * @return una variable tipo char.
     */
    public static String randomChar() {
        Random rnd= new Random();
        String randomChar = String.valueOf(((char) ('a' + rnd.nextInt(26))));
        return randomChar;
    }

    /**
     * establece un DNI random al objeto persona.
     * @param persona
     */
    public static void asignarDNI(Persona persona){
        persona.setDNI(generateDni());
    }
}

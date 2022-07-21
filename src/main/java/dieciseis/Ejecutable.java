package dieciseis;


import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;


public class Ejecutable {

    public static final Logger log = Logger.getLogger(String.valueOf(Ejecutable.class));
    static Scanner scan=new Scanner(System.in);
    private Ejecutable() {
    }

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
    public static String[] pedirDatos(){
        log.info("Por favor ingresa tu nombre, sexo, edad, peso y altura separador por coma \",\"");
        String info= scan.nextLine();
        String[] datos = info.split(",");
        return datos;
    }


    public static Integer random(Integer max,Integer min) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    public  static  void mostrarMayorDeEdad(Persona persona){
        Boolean mayor=persona.esMayorDeEdad();
        if (mayor==true){
            log.info(" si es mayor de edad");
        }else {
            log.info(" no es mayor de edad");
        }
    }


    public static String generateDni(){
        String DNI=String.valueOf(random(99999999,00000000)).concat(randomChar());
        return DNI;
    }

    public static String randomChar() {
        Random rnd= new Random();
        String randomChar = String.valueOf(((char) ('a' + rnd.nextInt(26))));
        return randomChar;
    }

    public static void asignarDNI(Persona persona){
        persona.setDNI(generateDni());
    }
}

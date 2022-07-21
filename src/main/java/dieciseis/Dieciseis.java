package dieciseis;

import java.util.logging.Logger;

/**
 * Clase destinada a probar la funcionalidad de la app
 */
public class Dieciseis {

    public static final Logger log = Logger.getLogger(String.valueOf(Dieciseis.class));
    public static void startTest() {
        String[] datos = Ejecutable.pedirDatos();
        Persona persona1 = new Persona(datos[0], datos[1], Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), Double.parseDouble(datos[4]));
        Ejecutable.asignarDNI(persona1);
        Persona persona2 = new Persona(datos[0], datos[1], Integer.parseInt(datos[2]));
        Ejecutable.asignarDNI(persona2);

        Persona persona3 = new Persona();
        Ejecutable.asignarDNI(persona3);
        persona3.setNombre("juan");
        persona3.setEdad(16);
        persona3.setSexo("H");
        persona3.setAltura(1.80);
        persona3.setPeso(80);

        persona1.verificarSexo();
        persona2.verificarSexo();
        persona3.verificarSexo();

        Ejecutable.mostrarPeso(persona1);
        Ejecutable.mostrarPeso(persona2);
        Ejecutable.mostrarPeso(persona3);

        Ejecutable.mostrarMayorDeEdad(persona1);
        Ejecutable.mostrarMayorDeEdad(persona2);
        Ejecutable.mostrarMayorDeEdad(persona3);

        log.info(persona1.toString());
        log.info(persona2.toString());
        log.info(persona3.toString());
    }
}
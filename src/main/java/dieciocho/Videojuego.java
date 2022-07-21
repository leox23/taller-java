package dieciocho;

import lombok.Data;

/**
 * clase tipo dato que sera la implementacion de la interfaz Entregable
 */
@Data
public class Videojuego implements Entregable{
    private String titulo="";
    private Integer horas_estimadas=10;
    private Boolean entregado=false;
    private String genero="";
    private String compañia="";

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, Integer horas_estimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void Devolver() {
        entregado=false;

    }

    @Override
    public Boolean isEntregado() {
        return entregado;

    }

    @Override
    public Object compareTo(Object a) {
        Videojuego videojuego;
        if (this.horas_estimadas < ((Videojuego) a).getHoras_estimadas()) {
            videojuego = (Videojuego) a;
        } else {
            videojuego = this;
        }
        return videojuego;
    }

    public static Integer juegosentregados (Videojuego[] juegos){
        Integer juegosentregados=0;
        for (int i =0 ;i< juegos.length;i++){
            if (juegos[i].isEntregado()==true){
                juegosentregados++;
                juegos[i].Devolver();
            }
        }
        return juegosentregados;

    }


}

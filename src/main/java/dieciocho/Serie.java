package dieciocho;

import lombok.Data;

@Data
public class Serie implements Entregable{
    private String titulo="";
    private Integer numeroTemporadas=3;
    private Boolean entregado=false;
    private String genero="";
    private String creador="";


    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
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

    public Object compareTo(Object a) {
        Serie serie;
        if (this.numeroTemporadas < ((Videojuego) a).getHoras_estimadas()) {
            serie = (Serie) a;
        } else {
            serie = this;
        }
        return serie;
    }

    public static Integer seriesEntregadas (Serie[] series){
        Integer seriesentregadas=0;
        for (int i =0 ;i< series.length;i++){
            if (series[i].isEntregado()==true){
                seriesentregadas++;
                series[i].Devolver();
            }
        }
        return seriesentregadas;

    }

}

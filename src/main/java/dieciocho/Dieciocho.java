package dieciocho;

import static uno.Uno.log;

public class Dieciocho {
    public static void startTest(){
        Serie[] series = {new Serie("Friends","Warner"),
                new Serie("see",4,"accion","jsonmomoa") ,
                new Serie("halo","Dc"),new Serie() ,new Serie()};

        Videojuego[] videojuegos={new Videojuego("Legend Of Zelda",40,"accion","infinitywar"),
                new Videojuego("scapefromtarkov",200),new Videojuego("Readyornot",50),
                new Videojuego(),new Videojuego()};

        series[2].entregar();
        series[0].entregar();

        videojuegos[3].entregar();
        videojuegos[2].entregar();

        log.info("Numero de juegos entregados ".concat(String.valueOf(Videojuego.juegosentregados(videojuegos))));
        log.info("Numero de juegos entregados ".concat(String.valueOf(Serie.seriesEntregadas(series))));
    }
}

package Enemigo.EnemigoTerrestre;

import Personaje.Personaje;

public class EnemigoTerrestreComun extends EnemigoTerrestre {

    private String[] nombre = { "Loco", "Emú", "Sapo" };

    public EnemigoTerrestreComun(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int correr,
            String[] nombre) {

        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, correr);
        this.nombre = nombre;
    }

    @Override
    public void ataque1(Personaje personaje) {
        if (nombre.equals("Loco")) {
            System.out.println("El enemigo ha usado el ataque Lanzamiento de cocos");
            // El loco lanza un coco con fuerza que hace 60 de daño fisico según del atributo correr y lo aumenta en 10.
            personaje.setVida(personaje.getVida() - (int)(0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * correr / 100)));
            correr += 10;
        } else if (nombre.equals("Emú")) {
            System.out.println("El enemigo ha usado el ataque Patada de la extinción");
            // El emú da una patada que hace 60 de daño fisico según del atributo correr y aumenta su velocidad en 10.
            personaje.setVida(personaje.getVida() - (int)(0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (40 * correr / 100)));
            velocidad += 10;
        } else if (nombre.equals("Sapo")) {
            System.out.println("El enemigo ha usado el ataque Lengua del Abismo");
            // El sapo lanza un lengüetazo al personaje, haciendo 60 de daño fisico según del atributo correr y aumenta su daño físico en 10.
            personaje.setVida(personaje.getVida() - (int)(0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (50 * correr / 100)));
            dañoFisico += 10;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
    }

    @Override
    public void ataque3(Personaje personaje) {

    }

}

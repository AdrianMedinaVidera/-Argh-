package Enemigo.EnemigoMarino;

import Personaje.Personaje;

public class EnemigoMarinoComun extends EnemigoMarino {

    private String[] nombre = { "Amonite", "Trilobite", "Zooplacton" };
    private String enemigoSeleccionado;

    public EnemigoMarinoComun(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nado, String[] nombre) {
        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, nado);
        this.nombre = nombre;
    }

    @Override
    public void ataque1(Personaje personaje) {
        if (enemigoSeleccionado.equals("Amonite")) {
            System.out.println("El enemigo ha usado el ataque Mordisco del devónico");
            // El amonite muerde al personaje, haciendo 60 de daño fisico según del atributo nado y aumenta su daño fisico en 10.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * nado / 100)));
            dañoFisico += 10;
        }else if(enemigoSeleccionado.equals("Trilobite")){
            System.out.println("El enemigo ha usado el ataque Restriego de caparazón cámbrico");
            //El trilobite se restriega contra el personaje, haciendo 40 de daño fisico y aumenta su resistencia fisica en 10 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 40));
            resistenciaFisica += 10;
            velocidad *= nado/100;
        }else if(enemigoSeleccionado.equals("Zooplacton")){
            System.out.println("El enemigo ha usado el ataque Involuntario precámbrico");
            //El zooplacton se lanza contra el personaje, haciendo 50 de daño fisico y aumenta su resistencia magica en 10 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 50));
            resistenciaMagica += 10;
            velocidad *= nado/100;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
        if (enemigoSeleccionado.equals("Amonite")) {
            System.out.println("El enemigo ha usado el ataque Cuerno tormentoso");
            // El amonite aumenta sus revoluciones generando un campo electroestatico que hace 5 puntos de daño mágico, disminuye su velocidad en 20 y aumenta su dañomágico en 150
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 5));
            velocidad -= 20;
            dañoMagico += 150;
        }else if(enemigoSeleccionado.equals("Trilobite")){
            System.out.println("El enemigo ha usado el ataque Succión de concha");
            //El trilobite crea vacío y quita 30 puntos de vida, 10 de daño mágico al personaje y aumenta su resistencia fisica en 20 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - 30);
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 10));
            resistenciaFisica += 20;
            velocidad *= nado/100;
        }else if(enemigoSeleccionado.equals("Zooplacton")){
            System.out.println("El enemigo ha usado el ataque Mordisquito minúsculo");
            //El zooplacton quita 5 puntos de daño físico y aumenta su resistencia magica en 10 y su resistencia física en 20 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 10));
            resistenciaMagica += 10;
            resistenciaFisica += 20;
            velocidad *= nado/100;
        }
    }

    @Override
    public void ataque3(Personaje personaje) {
        if (enemigoSeleccionado.equals("Amonite")) {
            System.out.println("El enemigo ha usado el ataque Furia Egipcia");
            // El amonite 
            //Esto es nuevo, a ver si se imprime en el repo
        }else if(enemigoSeleccionado.equals("Trilobite")){
            System.out.println("El enemigo ha usado el ataque Succión de concha");
            //El trilobite crea vacío y quita 30 puntos de vida, 10 de daño mágico al personaje y aumenta su resistencia fisica en 20 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - 30);
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 10));
            resistenciaFisica += 20;
            velocidad *= nado/100;
        }else if(enemigoSeleccionado.equals("Zooplacton")){
            System.out.println("El enemigo ha usado el ataque Mordisquito minúsculo");
            //El zooplacton quita 5 puntos de daño físico y aumenta su resistencia magica en 10 y su resistencia física en 20 y su velocidad en nado.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 10));
            resistenciaMagica += 10;
            resistenciaFisica += 20;
            velocidad *= nado/100;
        }
    }

}

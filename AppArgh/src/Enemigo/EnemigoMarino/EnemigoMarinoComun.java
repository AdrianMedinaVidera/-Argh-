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
        switch(enemigoSeleccionado) {
            case "Amonite":
                System.out.println("El enemigo ha usado el ataque Mordisco del devónico");
                // El amonite muerde al personaje, haciendo 60 de daño fisico según del atributo nado y aumenta su daño fisico en 10.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * nado / 100)));
                dañoFisico += 10;
                System.out.println("El enemigo ha aumentado su daño físico ↑");
                break;
            
            case "Trilobite":
                System.out.println("El enemigo ha usado el ataque Restriego de caparazón cámbrico");
                //El trilobite se restriega contra el personaje, haciendo 40 de daño fisico y aumenta su resistencia fisica en 10 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 40));
                resistenciaFisica += 10;
                velocidad *= nado/100;
                System.out.println("El enemigo ha aumentado su resistencia física ↑");
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
            
            case "Zooplacton":
                System.out.println("El enemigo ha usado el ataque Involuntario precámbrico");
                //El zooplacton se lanza contra el personaje, haciendo 50 de daño fisico y aumenta su resistencia magica en 10 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 50));
                resistenciaMagica += 10;
                velocidad *= nado/100;
                System.out.println("El enemigo ha aumentado su resistencia mágica ↑");
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
        switch(enemigoSeleccionado) {
            case "Amonite":
                System.out.println("El enemigo ha usado el ataque Cuerno tormentoso");
                // El amonite aumenta sus revoluciones generando un campo electroestatico que hace 5 puntos de daño mágico, disminuye su velocidad en 20 y aumenta su dañomágico en 150
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 5));
                velocidad -= 20;
                dañoMagico += 150;
                System.out.println("El enemigo ha disminuido su velocidad ↓");
                System.out.println("El enemigo ha aumentado su daño mágico ↑");
                break;
            
            case "Trilobite":
                System.out.println("El enemigo ha usado el ataque Succión de caparazón");
                //El trilobite crea vacío y quita 30 puntos de vida, 10 de daño mágico al personaje y aumenta su resistencia fisica en 20 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - 30);
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 10));
                resistenciaFisica += 20;
                velocidad *= nado/100;
                System.out.println("El enemigo ha aumentado su resistencia física ↑");
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
            
            case "Zooplacton":
                System.out.println("El enemigo ha usado el ataque Mordisquito minúsculo");
                //El zooplacton quita 5 puntos de daño físico y aumenta su resistencia magica en 10 y su resistencia física en 20 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 10));
                resistenciaMagica += 10;
                resistenciaFisica += 20;
                velocidad *= nado/100;
                System.out.println("El enemigo ha aumentado su resistencia mágica ↑");
                System.out.println("El enemigo ha aumentado su resistencia física ↑");
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
        }
    }

    @Override
    public void ataque3(Personaje personaje) {
        switch(enemigoSeleccionado) {
            case "Amonite":
                System.out.println("El enemigo ha usado el ataque Furia Egipcia");
                // El amonite piensa en el origen de su nombre y se enfurece, causando daño fisico y mágico en 20 y su velocidad en nado donde se resta 10 puntos de resistencia mágica.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 20));
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 20));
                resistenciaMagica -= 10;
                velocidad *= nado/100;
                System.out.println("El enemigo ha disminuido su resistencia mágica ↓");
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
            
            case "Trilobite":
                System.out.println("El enemigo ha usado el ataque Revuelto de tierras");
                //El trilobite hace una danza donde mueve arena y causa 40 de daño mágico y 5 de daño físcio, disminuyendo su resistencia mágica y física en 15 puntos
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 40));
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 5));
                resistenciaMagica -= 15;
                resistenciaFisica -= 15;
                System.out.println("El enemigo ha disminuido su resistencia mágica ↓");
                System.out.println("El enemigo ha disminuido su resistencia física ↓");
                break;
            
            case "Zooplacton":
                System.out.println("El enemigo ha usado el ataque Marea microscópica");
                //El zooplacton genera una corriente invisible en el agua que atrae microdepredadores de su ecosistema, creando un enjambre de microorganismos que atacan al enemigo,
                //causando 60 de daño físico, reduciendo la resistencia física del enemigo en 10 y aumentando su velocidad en nado con un plus.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 60));
                personaje.setResistenciaFisica(personaje.getResistenciaFisica() - 10);
                velocidad *= (nado+30)/100;
                System.out.println("El enemigo ha aumentado su velocidad ↑");
                break;
        }
    }

}

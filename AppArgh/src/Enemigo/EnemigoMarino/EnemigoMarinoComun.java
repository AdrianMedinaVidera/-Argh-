package Enemigo.EnemigoMarino;

import Personaje.Personaje;

public class EnemigoMarinoComun extends EnemigoMarino {

    private String enemigoSeleccionado;

    public EnemigoMarinoComun(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nado, String enemigoSeleccionado) {
        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, nado);
        this.enemigoSeleccionado = enemigoSeleccionado;
    }

    public String getEnemigoSeleccionado() {
        return enemigoSeleccionado;
    }
    

    @Override
    public void ataque1(Personaje personaje) {
        switch(enemigoSeleccionado) {
            case "Amonite":
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha usado el ataque              ║");
                System.out.println("║  Mordisco del devonico                      ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * nado / 100)));
                dañoFisico += 10;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado su daño fisico     ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Trilobite":
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha usado el ataque              ║");
                System.out.println("║  Restriego de caparazon cambrico            ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 40));
                resistenciaFisica += 10;
                velocidad *= nado/100;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado su resistencia     ║");
                System.out.println("║  fisica y su velocidad                      ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Zooplacton":
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha usado el ataque              ║");
                System.out.println("║  Involuntario precambrico                   ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 50));
                resistenciaMagica += 10;
                velocidad *= nado/100;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado su resistencia     ║");
                System.out.println("║  magica y su velocidad                      ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
        switch(enemigoSeleccionado) {
            case "Amonite":
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha usado el ataque              ║");
                System.out.println("║  Cuerno tormentoso                          ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 5));
                velocidad *= 0.8;
                dañoMagico += 150;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha disminuido su velocidad      ║");
                System.out.println("║  y aumentado su daño magico                 ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Trilobite":
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha usado el ataque              ║");
                System.out.println("║  Succion de caparazon                       ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                //El trilobite crea vacio y quita 30 puntos de vida, 10 de daño magico al personaje y aumenta su resistencia fisica en 20 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - 30);
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 10));
                resistenciaFisica += 20;
                velocidad *= nado/100;
                System.out.println("El enemigo ha aumentado su resistencia fisica");
                System.out.println("El enemigo ha aumentado su velocidad");
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado su resistencia     ║");
                System.out.println("║  fisica y ha  aumentado su velocidad        ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Zooplacton":
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha usado el ataque              ║");
            System.out.println("║  Mordisquito minusculo                      ║");
            System.out.println("╚═════════════════════════════════════════════╝");
                //El zooplacton quita 5 puntos de daño fisico y aumenta su resistencia magica en 10 y su resistencia fisica en 20 y su velocidad en nado.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 10));
                resistenciaMagica += 10;
                resistenciaFisica += 20;
                velocidad *= nado/100;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado sus resistencias   ║");
                System.out.println("║  y su velocidad                             ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
        }
    }

    @Override
    public void ataque3(Personaje personaje) {
        switch(enemigoSeleccionado) {
            case "Amonite":
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha usado el ataque              ║");
            System.out.println("║  Furia egipcia                              ║");
            System.out.println("╚═════════════════════════════════════════════╝");
                // El amonite piensa en el origen de su nombre y se enfurece, causando daño fisico y magico en 20 y su velocidad en nado donde se resta 10% de puntos de resistencia magica.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 20));
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 20));
                resistenciaMagica *= 0.9;
                velocidad *= nado/100;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha disminuido su resistencia    ║");
                System.out.println("║  magica y ha aumentado su velocidad         ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Trilobite":
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha usado el ataque              ║");
            System.out.println("║  Revuelta de tierras                        ║");
            System.out.println("╚═════════════════════════════════════════════╝");
                //El trilobite hace una danza donde mueve arena y causa 40 de daño magico y 5 de daño fiscio, disminuyendo su resistencia magica y fisica en 15 puntos
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 40));
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 5));
                resistenciaMagica *= 0.85;
                resistenciaFisica *= 0.85;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha disminuido sus resistencias  ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
            
            case "Zooplacton":
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha usado el ataque              ║");
            System.out.println("║  Marea Microscopica                         ║");
            System.out.println("╚═════════════════════════════════════════════╝");
                //El zooplacton genera una corriente invisible en el agua que atrae microdepredadores de su ecosistema, creando un enjambre de microorganismos que atacan al enemigo,
                //causando 60 de daño fisico, reduciendo la resistencia fisica del enemigo en 10 y aumentando su velocidad en nado con un plus.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 60));
                personaje.setResistenciaFisica(personaje.getResistenciaFisica() - 10);
                velocidad *= (nado+30)/100;
                System.out.println("╔═════════════════════════════════════════════╗");
                System.out.println("║  El enemigo ha aumentado su velocidad       ║");
                System.out.println("╚═════════════════════════════════════════════╝");
                break;
        }
    }
}

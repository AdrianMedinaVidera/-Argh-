package Personaje;

import Enemigo.*;
import Producto.Producto;

public class PersonajeCapitan extends Personaje {

    //private String arma;
    public PersonajeCapitan(String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
            int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
            int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
            Producto objetoEquipado, boolean pedoActivado, boolean estaSomnoliento, boolean estaSangrando) {
        super(genero, vida, dañoFisico, dañoMagico, resistenciaFisica, resistenciaMagica, velocidad, experiencia, nivel,
                monedas, grumetesRestantes, islasConquistadas, enemigosDerrotados, estaEnCombate, inventario,
                objetoEquipado, pedoActivado, estaSomnoliento, estaSangrando);
        //this.arma = arma;
    }

    @Override
    public void infoAtaquesMenu() {
        System.out.println("+ ------------------------------ +");
        System.out.println("| 	  Información de ataques	 |");
        System.out.println("| 1 - Látigo de hierro			 |");
        System.out.println("| 2 - Bramido de acero			 |");
        System.out.println("| 3 - Espectro náutico			 |");
        System.out.println("+ ------------------------------ +");
    }

       @Override
    public void infoAtaque1() {
        System.out.println("Látigo de hierro: El capitán se abalanza contra el enemigo y le realiza un gancho de boxeo con su garfio, realizando 50 de daño físico y dejando un sangrado en el enemigo, lo que le resta un 10% de la vida total al final del turno.");
    }

    @Override
    public void infoAtaque2() {
        System.out.println("Bramido de acero: El capitán se agarra a las empuñaduras de un cañón y dispara un proyectil extremadamente potente que hace 120 de daño físico, lo que hace que la explosión le reste un 50% de la vida actual al capitán.");
    }

    @Override
    public void infoAtaque3() {
        System.out.println("Espectro náutico: El capitán lanza al aire una botella con un barco dentro, la botella explota, dejando caer el barco encima del enemigo e infligiéndole 120 de daño mágico, lo que deja somnoliento al capitán.");
    }

    @Override
    public void ataque1(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Látigo de hierro.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 50));
        enemigo.setEstaSangrando(true);
    }

    @Override
    public void ataque2(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Bramido de acero.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 120));
        vida *= 0.5;
    }

    @Override
    public void ataque3(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Espectro náutico.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 120));
        estaSomnoliento = true;
    }

}

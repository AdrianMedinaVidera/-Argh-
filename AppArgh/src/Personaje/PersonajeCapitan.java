package Personaje;

import Enemigo.*;
import Producto.Producto;

public class PersonajeCapitan extends Personaje {

    public PersonajeCapitan(String nombre, String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
            int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
            int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
            Producto objetoEquipado, boolean pedoActivado, boolean estaSomnoliento, boolean estaSangrando, int barrilesDisponibles) {
        super(nombre, genero, vida, dañoFisico, dañoMagico, resistenciaFisica, resistenciaMagica, velocidad, experiencia, nivel,
                monedas, grumetesRestantes, islasConquistadas, enemigosDerrotados, estaEnCombate, inventario,
                objetoEquipado, pedoActivado, estaSomnoliento, estaSangrando, barrilesDisponibles);
    }

    @Override
    public void infoAtaquesMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACIÓN DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Látigo de hierro               ║");
        System.out.println("║    2. Bramido de acero               ║");
        System.out.println("║    3. Espectro náutico               ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    @Override
    public void eleccionAtaquesMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACIÓN DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Látigo de hierro (dñF)         ║");
        System.out.println("║    2. Bramido de acero (dñF)         ║");
        System.out.println("║    3. Espectro náutico (dñM)         ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void infoAtaque1() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           LÁTIGO DE HIERRO           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  El capitán se abalanza contra el    ║");
        System.out.println("║  enemigo y le realiza un gancho de   ║");
        System.out.println("║  boxeo con su garfio.                ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño físico: 50                     ║");
        System.out.println("║  Efecto: Sangrado (10% vida/turno)   ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void infoAtaque2() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           BRAMIDO DE ACERO           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  El capitán dispara un proyectil     ║");
        System.out.println("║  extremadamente potente desde un      ║");
        System.out.println("║  cañón.                              ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño físico: 120                    ║");
        System.out.println("║  Efecto: -50% vida propia            ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void infoAtaque3() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║          ESPECTRO NÁUTICO            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  El capitán lanza una botella con    ║");
        System.out.println("║  un barco dentro. Al explotar, el    ║");
        System.out.println("║  barco cae sobre el enemigo.         ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño mágico: 120                    ║");
        System.out.println("║  Efecto: Somnolencia propia          ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void ataque1(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Látigo de hierro.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 50));
        enemigo.setEstaSangrando(true);
        System.out.println("El enemigo ha empezado a sangrar");
    }

    @Override
    public void ataque2(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Bramido de acero.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 120));
        vida *= 0.5;
        System.out.println("El capitán ha disminuido su vida ↓");
    }

    @Override
    public void ataque3(Enemigo enemigo) {
        System.out.println("El capitán ha usado el ataque Espectro náutico.");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 120));
        estaSomnoliento = true;
        System.out.println("El capitán está somnoliento zZ");
    }

}
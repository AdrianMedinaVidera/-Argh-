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
        System.out.println("║         INFORMACIoN DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Latigo de hierro               ║");
        System.out.println("║    2. Bramido de acero               ║");
        System.out.println("║    3. Espectro nautico               ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    @Override
    public void eleccionAtaquesMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACIoN DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Latigo de hierro (dñF)         ║");
        System.out.println("║    2. Bramido de acero (dñF)         ║");
        System.out.println("║    3. Espectro nautico (dñM)         ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void infoAtaque1() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           LaTIGO DE HIERRO           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  El capitan se abalanza contra el    ║");
        System.out.println("║  enemigo y le realiza un gancho de   ║");
        System.out.println("║  boxeo con su garfio.                ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño fisico: 50                     ║");
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
        System.out.println("║  El capitan dispara un proyectil     ║");
        System.out.println("║  extremadamente potente desde un     ║");
        System.out.println("║  cañon.                              ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño fisico: 120                    ║");
        System.out.println("║  Efecto: -50% vida propia            ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void infoAtaque3() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║          ESPECTRO NaUTICO            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  El capitan lanza una botella con    ║");
        System.out.println("║  un barco dentro. Al explotar, el    ║");
        System.out.println("║  barco cae sobre el enemigo.         ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño magico: 120                    ║");
        System.out.println("║  Efecto: Somnolencia propia          ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    @Override
    public void ataque1(Enemigo enemigo) {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║  El capitan  ha usado el ataque         ║");
        System.out.println("║  Latigo de Hierro                       ║");
        System.out.println("╚═════════════════════════════════════════╝");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 50));
        enemigo.setEstaSangrando(true);
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  El enemigo esta sangrando...                     ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    @Override
    public void ataque2(Enemigo enemigo) {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║  El capitan  ha usado el ataque         ║");
        System.out.println("║  Bramido de Acero                       ║");
        System.out.println("╚═════════════════════════════════════════╝");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 120));
        vida *= 0.5;
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  El capitan ha disminuido su vida                 ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    @Override
    public void ataque3(Enemigo enemigo) {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║  El capitan  ha usado el ataque         ║");
        System.out.println("║  Espectro Nautico                       ║");
        System.out.println("╚═════════════════════════════════════════╝");
        enemigo.setVida(enemigo.getVida() - (int) (0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 120));
        estaSomnoliento = true;
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║  El capitan esta somnoliento...                   ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

}
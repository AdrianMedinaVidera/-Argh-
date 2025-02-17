package Enemigo.EnemigoMarino;

import Personaje.Personaje;

public class EnemigoMarinoComun extends EnemigoMarino {

    private String[] nombre = { "Amonite", "Trilobite", "Zooplacton" };

    public EnemigoMarinoComun(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nado,
            String[] nombre) {
        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, nado);
        this.nombre = nombre;
    }

    @Override
    public void ataque1(Personaje personaje) {
        if (nombre.equals("Amonite")) {
            System.out.println("El enemigo ha usado el ataque Mordisco de la Prehistoria");
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
    }

    @Override
    public void ataque3(Personaje personaje) {

    }

}

package Enemigo.EnemigoMarino;

import Enemigo.Enemigo;
import Personaje.Personaje;

public abstract class EnemigoMarino extends Enemigo {

    protected int nado;

    public EnemigoMarino(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nado) {

        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando);
        this.nado = nado;
    }

    @Override
    public abstract void ataque1(Personaje personaje);

    @Override

    public abstract void ataque2(Personaje personaje);

    @Override
    public abstract void ataque3(Personaje personaje);

    public int getNado() {
        return nado;
    }

    public void setNado(int nado) {
        this.nado = nado;
    }
}

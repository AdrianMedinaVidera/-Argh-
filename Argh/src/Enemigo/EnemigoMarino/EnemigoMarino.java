package Enemigo.EnemigoMarino;

import Enemigo.Enemigo;

public abstract class EnemigoMarino extends Enemigo {

    protected int nado;

    public EnemigoMarino(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nado) {

        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando);
        this.nado = nado;
    }

    @Override
    public abstract void ataque1();

    @Override

    public abstract void ataque2();

    @Override
    public abstract void ataque3();

    public int getNado() {
        return nado;
    }

    public void setNado(int nado) {
        this.nado = nado;
    }
}

package Enemigo.EnemigoTerrestre;

import Enemigo.Enemigo;

public abstract class EnemigoTerrestre extends Enemigo  {

    protected int correr;

    public EnemigoTerrestre(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int correr) {

        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando);
        this.correr = correr;
    }

    public int getCorrer() {
        return correr;
    }

    public void setCorrer(int correr) {
        this.correr = correr;
    }

}

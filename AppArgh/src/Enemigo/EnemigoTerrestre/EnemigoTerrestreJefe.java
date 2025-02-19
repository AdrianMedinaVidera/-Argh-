package Enemigo.EnemigoTerrestre;
import Personaje.Personaje;
public class EnemigoTerrestreJefe extends EnemigoTerrestre{
    private String[] nombre = {"Casuario", "Trex", "Rajoy"}; 
    private String jefeSeleccionado;
    
    public EnemigoTerrestreJefe(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int correr,
            String[] nombre, String jefeSeleccionado) {
        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, correr);
        this.nombre = nombre;
        this.jefeSeleccionado = jefeSeleccionado;
    }

    public String[] getNombre() {
        return nombre;
    }

    public String getJefeSeleccionado() {
        return jefeSeleccionado;
    }

    public void setJefeSeleccionado(String jefeSeleccionado) {
        this.jefeSeleccionado = jefeSeleccionado;
    }

    @Override
    public void ataque1(Personaje personaje) {
        if (jefeSeleccionado.equals("Casuario")) {
            System.out.println("El jefe enemigo ha usado el ataque Garra del Inframundo Tropical");
            // El loco lanza un coco con fuerza que hace 60 de daño fisico según del atributo correr y lo aumenta en 10.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * correr / 100)));
            correr += 10;
        } else if (jefeSeleccionado.equals("Emú")) {
            System.out.println("El jefe enemigo ha usado el ataque Patada de la Extinción");
            // El emú da una patada que hace 60 de daño fisico según del atributo correr y aumenta su velocidad en 10.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * correr / 100)));
            velocidad += 10;
        } else if (jefeSeleccionado.equals("Sapo")) {
            System.out.println("El jefe enemigo ha usado el ataque Lengua del Abismo");
            // El sapo lanza un lengüetazo al personaje, haciendo 60 de daño fisico según del atributo correr y aumenta su daño físico en 10.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + (60 * correr / 100)));
            dañoFisico += 10;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
        if (jefeSeleccionado.equals("Loco")) {
            System.out.println("El jefe enemigo ha usado el ataque Danza del Chamán");
            // El loco lanza realiza una danza que aumenta sus daños, su velocidad en y correr en 20.
            dañoFisico += 20;
            dañoMagico += 20;
            velocidad += 20;
            correr += 20;
        } else if (jefeSeleccionado.equals("Emú")) {
            System.out.println("El jefe enemigo ha usado el ataque Alba del Emú");
            // El emú alza el vuelo frente al alba y aumenta sus resistencias, velocidad y correr en 20.
            resistenciaFisica += 20;
            resistenciaMagica += 20;
            velocidad += 20;
            correr += 20;
        } else if (jefeSeleccionado.equals("Sapo")) {
            System.out.println("El jefe enemigo ha usado el ataque Eco del Pantano");
            // El sapo llama a sus amigos para que le ayuden, aumentando su vida y correr en 20 y quitando el sangrado.
            vida += 20;
            correr += 20;
            estaSangrando = false;
        }
    }

    @Override
    public void ataque3(Personaje personaje) {
        if (jefeSeleccionado.equals("Loco")) {
            System.out.println("El jefe enemigo ha usado el ataque Invocación de Cangrejos");
            // El loco lanza acude a los cangrejos para hacer 35 de daño mágico y deja sangrado
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + (35 * correr / 100)));
            personaje.setEstaSangrando(true);
            
        } else if (jefeSeleccionado.equals("Emú")) {
            System.out.println("El jefe enemigo ha usado el ataque Tormenta Celeste");
            // El emú crea una tormenta que no permite ver al enemigo, dejándolo somnoliento y realizando 25 de daño mágico.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + (25 * correr / 100)));
            personaje.setEstaSomnoliento(true);
        } else if (jefeSeleccionado.equals("Sapo")) {
            System.out.println("El jefe enemigo ha usado el ataque Lluvia de Babas");
            // El sapo genera una tormenta que segrega babas tóxicas que realizan 50 de daño mágico y ralentizan al personaje en 20.
            personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + (50 * correr / 100)));
            personaje.setVelocidad(personaje.getVelocidad() - 20);
            
        }
    }
}

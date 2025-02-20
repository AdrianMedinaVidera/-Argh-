package Enemigo.EnemigoMarino;
import Personaje.Personaje;
public class EnemigoMarinoJefe extends EnemigoMarino {

    private String jefeSeleccionado;
    
    public EnemigoMarinoJefe(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
            int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando, int nadar,
            String[] nombre, String jefeSeleccionado) {
        super(vida, dañoMagico, resistenciaMagica, resistenciaFisica, velocidad, experienciaData, dineroDado, nivel,
                dañoFisico, estaSangrando, nadar);
        this.jefeSeleccionado = jefeSeleccionado;
    }

    @Override
    public void ataque1(Personaje personaje) {
        switch(jefeSeleccionado) {
            case "Sirena":
                System.out.println("El jefe enemigo ha usado el ataque Canto de las Profundidades");
                // La sirena entona una melodía hipnótica que confunde al jugador, realizando 150 de daño mágico y proporcionando el estado somnoliento.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 150));
                personaje.setEstaSomnoliento(true);
                System.out.println("El personaje está somnoliento...");
                break;
            
            case "Patricio":
                System.out.println("El jefe enemigo ha usado el ataque Abrazo Mortal");
                // Patricio agarra al personaje con sus brazos regordetes, si éste no es lo suficientemente fuerte, lo aplasta. Realiza 100 de daño físico y si el jugador tiene menos del 20% de la vida máxima, es ejecutado.
                int vidaInicial = (int) (100 * Math.pow(1.1, personaje.getNivel()));
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 100));
                if (personaje.getVida() < vidaInicial/5){
                    System.out.println("Has sido ejecutado.");
                    personaje.setVida(0);
                }
                break;
            
            case "Kraken":
                System.out.println("El jefe enemigo ha usado el ataque Tentáculos Aplastantes");
                // El Kraken usa sus tentáculos para aplastar al jugador, realizando 120 de daño físico y reduciendo sus resistencias un 20%.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 120));
                personaje.setResistenciaFisica((int) (personaje.getResistenciaFisica() * 0.8));
                personaje.setResistenciaMagica((int) (personaje.getResistenciaMagica() * 0.8));
                System.out.println("El enemigo ha reducido su Resistencia Física ↓");
                System.out.println("El enemigo ha reducido su Resistencia Mágica ↓");
                break;
        }
    }

    @Override
    public void ataque2(Personaje personaje) {
        switch(jefeSeleccionado) {
            case "Sirena":
                System.out.println("El jefe enemigo ha usado el ataque Bendición de Poseidón");
                // La sirena recibe la bendición de Poseidón, restaurando 100 de vida y aumenta su velocidad y daño en 20%, pero reduce sus resistencias un 20%
                vida += 100;
                dañoFisico *= 1.2;
                dañoMagico *= 1.2;
                velocidad *= 1.2;
                resistenciaFisica = (int) (resistenciaFisica * 0.8);
                resistenciaMagica = (int) (resistenciaMagica * 0.8);
                System.out.println("El enemigo ha aumentado su Vida ↑");
                System.out.println("El enemigo ha aumentado su Daño Físico ↑");
                System.out.println("El enemigo ha aumentado su Daño Mágico ↑");
                System.out.println("El enemigo ha aumentado su Velocidad ↑");
                System.out.println("El enemigo ha reducido su Resistencia Física ↓");
                System.out.println("El enemigo ha reducido su Resistencia Mágica ↓");
                break;
            
            case "Patricio":
                System.out.println("El jefe enemigo ha usado el ataque Furia Estrellada");
                // Patricio entra en un estado de furia estrellada, aumentando enormemente su ataque. Aumenta en 200 su daño físico.
                dañoFisico += 200;
                System.out.println("El enemigo ha aumentado su Daño Físico ↑");
                break;
            
            case "Kraken":
                System.out.println("El jefe enemigo ha usado el ataque Corrientes Abisales");
                // El Kraken controla las corrientes marinas, aumentando exageradamente su velocidad un 777%
                velocidad *= 8.77;
                System.out.println("El enemigo ha aumentado su Velocidad ↑");
                break;
        }
    }

    @Override
    public void ataque3(Personaje personaje) {
        switch(jefeSeleccionado) {
            case "Sirena":
                System.out.println("El jefe enemigo ha usado el ataque Tridente Maldito");
                // La sirena invoca un tridente maldito que ignora las defensas físicas del rival, realizando 120 de daño mágico
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico + 120)));
                break;
            
            case "Patricio":
                System.out.println("El jefe enemigo ha usado el ataque Vórtice Estelar");
                // Patricio crea un vórtice que absorbe la energía vital del rival, realizando 120 de daño mágico y absorbiendo vida
                int dañoRealizado = (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 120);
                personaje.setVida(personaje.getVida() - dañoRealizado);
                vida += dañoRealizado/2.5;
                System.out.println("El enemigo ha aumentado su Vida ↑");
                break;
            
            case "Kraken":
                System.out.println("El jefe enemigo ha usado el ataque Tinta de las Profundidades");
                // El Kraken libera una nube de tinta mágica que aturde al jugador, realizando 120 de daño mágico y dejándolo somnoliento
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 120));
                personaje.setEstaSomnoliento(true);
                break;
        }
    }
}

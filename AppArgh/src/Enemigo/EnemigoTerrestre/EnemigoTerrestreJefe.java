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
        switch(jefeSeleccionado) {
            case "Casuario":
                System.out.println("El jefe enemigo ha usado el ataque Garra del Inframundo Tropical");
                // El casuario realiza un salto brutal seguido de un tajo con sus garras asesinas, dejándote mareado, realizando 150 de daño físico y proporcionando el estado somnoliento.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 150));
                personaje.setEstaSomnoliento(true);
                break;
            
            case "Trex":
                System.out.println("El jefe enemigo ha usado el ataque Festín del Depredador");
                // El Trex agarra al personaje con la boca, si éste no es lo suficientemente fuerte, se lo come. Realiza 100 de daño físico y si el jugador tiene menos del 20% de la vida máxima, es ejecutado.
                int vidaInicial = (int) (100 * Math.pow(1.1, personaje.getNivel())); // Calculamos la vida que debe tener el personaje según su nivel.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 100));
                if (personaje.getVida() < vidaInicial/5){ // Comprobación sobre si la vida es menor al 20% de la original para la ejecución. 
                    personaje.setVida(0);
                }
                break;
            
            case "Rajoy":
                System.out.println("El jefe enemigo ha usado el ataque 'España es una gran nación y los españoles muy españoles y mucho españoles.'");
                // Rajoy dice una de sus míticas frases que hiere al jugador y le desmotiva por culpa de la política del país, realizando 120 de daño físico y reduciendo sus resistencias un 20%.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoFisico - personaje.getResistenciaFisica()) + 120));
                personaje.setResistenciaFisica((int) (personaje.getResistenciaFisica() * 0.8));
                personaje.setResistenciaMagica((int) (personaje.getResistenciaMagica() * 0.8));
                System.out.println("El personaje ha disminuido su resistencia física");
                System.out.println("El personaje ha disminuido su resistencia mágica");
                break;
        }
    }
    @Override
    public void ataque2(Personaje personaje) {
        switch(jefeSeleccionado) {
            case "Casuario":
                System.out.println("El jefe enemigo ha usado el ataque Renacer del Emperador");
                // El casuario resurge de las cenizas cual Fénix y restaura y/o aumenta su vida en 100 y aumenta su velocidad y daño en 20%, pero reduce sus resistencias un 20%
                vida += 100;
                dañoFisico *= 1.2;
                dañoMagico *= 1.2;
                velocidad *= 1.2;
                resistenciaFisica = (int) (resistenciaFisica * 0.8);
                resistenciaMagica = (int) (resistenciaMagica * 0.8);
                System.out.println("El enemigo ha aumentado su vida ");
                System.out.println("El enemigo ha aumentado su daño físico ");
                System.out.println("El enemigo ha aumentado su daño mágico ");
                System.out.println("El enemigo ha aumentado su velocidad ");
                System.out.println("El enemigo ha disminuido su resistencia física ");
                System.out.println("El enemigo ha disminuido su resistencia mágica ");
                break;
            
            case "Trex":
                System.out.println("El jefe enemigo ha usado el ataque Cólera del Titán");
                // El Trex entra en cólera, aumentando enormemente su ataque. Aumenta en 200 su daño físico.
                dañoFisico += 200;
                System.out.println("El enemigo ha aumentado su daño físico");
                break;
            
            case "Rajoy":
                System.out.println("El jefe enemigo ha usado el ataque 'Como decía Galileo, el movimiento siempre se acelera cuando se va a detener.'");
                // Rajoy adopta los conocimientos de Galileo y aumenta exageradamente su velocidad. Su velocidad aumenta un 777%
                velocidad *= 8.77;
                System.out.println("El enemigo ha aumentado su velocidad");
                break;
        }
    }
    @Override
    public void ataque3(Personaje personaje) {
        switch(jefeSeleccionado) {
            case "Casuario":
                System.out.println("El jefe enemigo ha usado el ataque Pico del Vacío");
                // El casuario da un picotazo al jugador, generando un agujero negro que hace 120 de daño mágico. Este ataque ignora las estadísticas de defensa del rival
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico + 120)));
                break;
            
            case "Trex":
                System.out.println("El jefe enemigo ha usado el ataque Colmillos del Inframundo");
                // El Trex crea un portal desde el inframundo por el que aparece y muerde al personaje con colmillos de fuego y sangre, realizando 120 de daño mágico y absorbiendo vida en función del daño realizado.
                int dañoRealizado = (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 120);
                personaje.setVida(personaje.getVida() - dañoRealizado);
                vida += dañoRealizado/2.5;
                System.out.println("El enemigo ha aumentado su vida");
                break;
            
            case "Rajoy":
                System.out.println("El jefe enemigo ha usado el ataque 'Lo que nosotros hemos hecho, cosa que no hizo usted, es engañar a la gente.'");
                // Rajoy crea un clon de él mismo para despistar al jugador, para ir por la espalda y clavarle un puñal con todo el poder de la ley, lo que aturde al jugador. Este ataque inflinge 120 de daño mágico y deja somnoliento al jugador.
                personaje.setVida(personaje.getVida() - (int) (0.5 * (dañoMagico - personaje.getResistenciaMagica()) + 120));
                personaje.setEstaSomnoliento(true);
                break;
        }
    }
}
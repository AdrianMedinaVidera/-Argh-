package Tendera;
import Personaje.Personaje;
import Producto.Producto;
import java.util.Arrays;
import java.util.Scanner;

public class Tendera {
    private Producto[] items = { // La cantidad de los objetos es 0, pues no es necesario modificarla en ningún momento.
        new Producto("Minipocion", 0, 20), // Recupera 20 de vida. [0]
        new Producto("Poción", 0, 30), // Recupera 60 de vida. [1]
        new Producto("Superpoción", 0, 60), // Recupera 120 de vida. [2]
        new Producto("Báculo", 0, 15), // Aumenta 20 de daño físico. [3]
        new Producto("Espada", 0, 30), // Aumenta 50 de daño físico. [4]
        new Producto("Mandoble", 0, 120), // Aumenta 100 de daño físico. [5]
        new Producto("Varita Madera", 0, 15), // Aumenta 20 de daño mágico. [6]
        new Producto("Varita Plástico", 0, 30), // Aumenta 50 de daño mágico. [7]
        new Producto("Varita Oro", 0, 120), // Aumenta 100 de daño mágico. [8]
        new Producto("Escudito", 0, 15), // Aumenta 20 de resistencia física. [9]
        new Producto("Escudo", 0, 30), // Aumenta 40 de resistencia física. [10] 
        new Producto("Escudazo", 0, 120), // Aumenta 100 de resistencia física. [11]
        new Producto("Capita", 0, 15), // Aumenta 20 de resistencia mágica. [12]
        new Producto("Capa", 0, 30), // Aumenta 40 de resistencia mágica. [13]
        new Producto("Capaza", 0, 120), // Aumenta 100 de resistencia mágica. [14]
        new Producto("Alas", 0, 30), // Aumenta 20% de velocidad. [15]
        new Producto("Pedo", 0, 30), // Aumenta la probabilidad de huir un 25% [16]
        new Producto("???", 0, 50), // Nada [17]
        new Producto("Redbull", 0, 10), // Quita el estado de somonliento. [18]
        new Producto("Caramelo", 0, 70) // Aumenta un nivel. [19]
    };

    private boolean abierto;

    public Tendera(Producto[] items, boolean abierto) {
        this.items = items;
        this.abierto = abierto;
    }

    public Producto[] getItems() {
        return items;
    }

    public void setItems(Producto[] items) {
        this.items = items;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    @Override
    public String toString() {
        return "Tendera [items=" + Arrays.toString(items) + ", abierto=" + abierto + "]";
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000); // Convierte de segundos a milisegundos, pues .sleep solo acepta ms.
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido un error al esperar.");
        }
    }

    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Limpia la termial en Windows.
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J"); //Limpia la terminal en sistemas operativos basados en Unix.
                System.out.flush();
            }
        } catch (Exception e) {
            // Si falla al limpiar la pantalla, genera muchos espacios.
            for (int i = 0; i < 40; i++) {
                System.out.println();
            }
        }
    }

    public void comprobarSaldoCasino () {

    }

    public void menuCompra (Personaje personaje){
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║                      A R G H                       ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        if (personaje.getGenero().equals("H") || personaje.getGenero().equals("Man") || personaje.getGenero().equals("Hombre") || personaje.getGenero().equals("Macho") || personaje.getGenero().equals("M")){
        System.out.println("║           Bienvenido al a tienda de Argh!          ║");}
        else if (personaje.getGenero().equals("F") || personaje.getGenero().equals("Woman") || personaje.getGenero().equals("Mujer") || personaje.getGenero().equals("Hembra") || personaje.getGenero().equals("Femenino")){
        System.out.println("║           Bienvenida a la tienda de Argh!          ║");}
  else {System.out.println("║           Bienvenide a la tienda de Argh!          ║");}
        System.out.println("║               ¿QUÉ DESEA COMPRAR?                  ║");
        System.out.println("╠════════════════════╦═════════════╦═════════════════╣");
        System.out.println("║ 1. Minipoción      ║ 20 de vida  ║ 20 monedas      ║");
        System.out.println("║ 2. Poción          ║ 60 de vida  ║ 30 monedas      ║");
        System.out.println("║ 3. Superpoción     ║ 120 de vida ║ 60 monedas      ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 4. Báculo          ║ 20 de dñF   ║ 15 monedas      ║");
        System.out.println("║ 5. Espada          ║ 50 de dñF   ║ 30 monedas      ║");
        System.out.println("║ 6. Mandoble        ║ 100 de dñF  ║ 120 monedas     ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 7. Varita Madera   ║ 20 de dñM   ║ 15 monedas      ║");
        System.out.println("║ 8. Varita Plástico ║ 50 de dñM   ║ 30 monedas      ║");
        System.out.println("║ 9. Varita Oro      ║ 100 de dñM  ║ 120 monedas     ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 10. Escudito       ║ 20 de resF  ║ 15 monedas      ║");
        System.out.println("║ 11. Escudo         ║ 40 de resF  ║ 30 monedas      ║");
        System.out.println("║ 12. Escudazo       ║ 100 de resF ║ 120 monedas     ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 13. Capita         ║ 20 de resM  ║ 15 monedas      ║");
        System.out.println("║ 14. Capa           ║ 40 de resM  ║ 30 monedas      ║");
        System.out.println("║ 15. Capaza         ║ 100 de resM ║ 120 monedas     ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 16. Alas           ║ 20% de vel  ║ 30 monedas      ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 17. Pedo           ║ 25% de huir ║ 30 monedas      ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 18. ???            ║     ???     ║ 50 monedas      ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 19. Redbull        ║ Despertar   ║ 10 monedas      ║");
        System.out.println("╠════════════════════╬═════════════╬═════════════════╣");
        System.out.println("║ 20. Caramelo       ║ +1 nivel    ║ 70 monedas      ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║              21. Salir de la tienda                ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    public void entrarBarril (Personaje personaje, Scanner sc) {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║                      A R G H                       ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║                   ___________________              ║");
        System.out.println("║                  /                   \\             ║");
        System.out.println("║                 /                     \\            ║");
        System.out.println("║                /                       \\           ║");
        System.out.println("║               |   ╔═══════════════╗    |           ║");
        System.out.println("║               |   ║   BARRIL DE   ║    |           ║");
        System.out.println("║               |   ║    TESOROS    ║    |           ║");
        System.out.println("║               |   ╚═══════════════╝    |           ║");
        System.out.println("║          ╔════╩═══════════════════════╩════╗       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ║  ║║║║║║║║║║║║║║║║║║║║║║║║║║║║   ║       ║");
        System.out.println("║          ╚════╦═══════════════════════╦════╝       ║");
        System.out.println("║               |                       |            ║");
        System.out.println("║               |                       |            ║");
        System.out.println("║               |                       |            ║");
        System.out.println("║                \\                     /             ║");
        System.out.println("║                 \\                   /              ║");
        System.out.println("║                  \\                 /               ║");
        System.out.println("║                   _________________/               ║");
        if (personaje.getBarrilesDisponibles() <= 0) {
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("║       AQUÍ APARECERAN LOS BARRILES QUE TENGAS      ║");
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("║                 1. Salir.                          ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
        } else {
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.println("            BARRILES DISPONIBLES " + personaje.getBarrilesDisponibles());
            System.out.println("║               1. Abrir barril.                     ║");
            System.out.println("║               2. Salir.                            ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
        }
    }

    public void abrirBarril (Personaje personaje) {
        int numAleatorio = (int) (Math.random() * items.length + 1);
        int index = 0;
        boolean inventarioVacio = false;
        for (int i = 0; i < items.length; i++) {
            if (personaje.getInventario()[i] == null) {
                inventarioVacio = true;
                index = i;
                break;
            }
        }
        if (inventarioVacio) {
            // Metemos al inventario un objeto aleatorio de la lista de productos.
            if (numAleatorio == items.length + 1) {
                int monedasRandom = (int) (Math.random() * 200 + 1);
                System.out.println("Has encontrado " + monedasRandom + " monedas!");
                personaje.setMonedas(personaje.getMonedas() + monedasRandom);
            } else {
                personaje.getInventario()[index] = items[numAleatorio];
                System.out.println("Has encontrado un " + items[numAleatorio].getNombre() + "!");
                esperar(2);
                limpiarPantalla();
            }
        } else {
            System.out.println("No tienes espacio en el inventario.");
            esperar(2);
            limpiarPantalla();
        }
        System.out.println("Se va a abrir un barril.");
        esperar(2);

    }

    public void entrarCasino(Personaje personaje, Scanner sc) {
        limpiarPantalla();
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                      CASINO                          ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║          ¡Bienvenido al Casino de Argh!              ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        boolean seguirJugando = true;
        
        while (seguirJugando) {
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║             ¿Cuántas monedas apuestas?               ║");
            System.out.println("          (Tienes " + personaje.getMonedas() + " monedas disponibles)");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            int apuesta = 0;
            while (true) {
                try {
                    apuesta = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("╔══════════════════════════════════════════════════════╗");
                    System.out.println("║           ¡Debes introducir un número!               ║");
                    System.out.println("╚══════════════════════════════════════════════════════╝");
                    sc.nextLine();
                }
            }
            if (apuesta > personaje.getMonedas()) {
                System.out.println("╔══════════════════════════════════════════════════════╗");
                System.out.println("║         ¡No tienes suficientes monedas!              ║");
                System.out.println("╚══════════════════════════════════════════════════════╝");
                esperar(2);
            } else {
                int opcionCasino = 0;
                while (true) {
                    limpiarPantalla();
                    System.out.println("╔══════════════════════════════════════════════════════╗");
                    System.out.println("║                      CASINO                          ║");
                    System.out.println("╠══════════════════════════════════════════════════════╣");
                    System.out.println("      Has apostado " + apuesta + " monedas. ¡Buena suerte!");
                    System.out.println("╠══════════════════════════════════════════════════════╣");
                    System.out.println("║                  ¿A qué juegas?                      ║");
                    System.out.println("║                                                      ║");
                    System.out.println("║              1 - Dados malditos                      ║");
                    System.out.println("║              2 - Ruleta                              ║");
                    System.out.println("║              3 - Espada o cuerda                     ║");
                    System.out.println("║              4 - Naufragio                           ║");
                    System.out.println("║              5 - Cómo jugar (?)                      ║");
                    System.out.println("║              6 - Salir                               ║");
                    System.out.println("╚══════════════════════════════════════════════════════╝");
                    try {
                        opcionCasino = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("No has introducido un numero.");
                        sc.nextLine();
                    }
                }
                switch (opcionCasino) {
                    case 1 -> {
                        limpiarPantalla();
                        System.out.println("Bienvenido al juego de los dados malditos.");
                        System.out.println("Se van a lanzar los dados.");
                        int dado1 = (int) (Math.random() * 6) + 1;
                        int dado2 = (int) (Math.random() * 6) + 1;
                        esperar(3);
                        System.out.println("El dado 1 ha salido " + dado1);
                        esperar(3);
                        System.out.println("El dado 2 ha salido " + dado2);
                        esperar(2);
                        System.out.println("La suma es de " + (dado1 + dado2));
                        if (dado1 + dado2 == 7 || dado1 + dado2 == 11) {
                            System.out.println("Felicidades!");
                            System.out.println("Has ganado " + (apuesta * 2) + " monedas.");
                            personaje.setMonedas(personaje.getMonedas() + apuesta * 2);
                        } else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) {
                            System.out.println("Lo sentimos.");
                            System.out.println("Has perdido " + apuesta + " monedas.");
                            personaje.setMonedas(personaje.getMonedas() - apuesta);
                        } else {
                            System.out.println("Has empatado.");
                        }
                        esperar(2);
                        System.out.println("¿Quieres volver al casino? (S/N)");
                        sc.nextLine();
                        String respuesta = sc.nextLine().toLowerCase();
                        if (!respuesta.equals("s")) {
                            seguirJugando = false;
                        }
                        limpiarPantalla();
                    }
                    case 2 -> {
                        limpiarPantalla();
                        System.out.println("Bienvenido al juego de la ruleta.");
                        System.out.println("Se va a girar la ruleta.");
                        esperar(3);
                        System.out.println("La ruleta ha girado.");
                        int numero = (int) (Math.random() * 37) + 1;
                        esperar(1);
                        System.out.println("El numero es " + numero);
                        esperar(1);
                        if (numero == 0) {
                            System.out.println("Felicidades!");
                            System.out.println("Has ganado " + (apuesta * 10) + " monedas.");
                            personaje.setMonedas(personaje.getMonedas() + apuesta * 10);
                        } else if (numero % 2 == 0) {
                            System.out.println("Felicidades!");
                            System.out.println("Has ganado " + apuesta + " monedas.");
                            personaje.setMonedas(personaje.getMonedas() + apuesta);
                        } else {
                            System.out.println("Lo sentimos.");
                            System.out.println("Has perdido " + apuesta + " monedas.");
                            personaje.setMonedas(personaje.getMonedas() - apuesta);
                        }
                        esperar(2);
                        System.out.println("Quieres volver al casino? (S/N)");
                        sc.nextLine(); //
                        String respuesta = sc.nextLine().toLowerCase();
                        if (!respuesta.equals("s")) {
                            seguirJugando = false;
                        }
                        limpiarPantalla();
                    }
                    case 3 -> {
                        limpiarPantalla();
                        System.out.println("Bienvenido al juego de la espada o cuerda.");
                        while (true) {
                            System.out.println("Elige una opcion:");
                            System.out.println("1 - Espada");
                            System.out.println("2 - Cuerda");
                            int opcionCuerdaEspada = 0;
                            try {
                                opcionCuerdaEspada = sc.nextInt();
                                System.out.println(opcionCuerdaEspada == 1 ? "Has elegido la espada." : "Has elegido la cuerda.");
                                System.out.println("Se va a lanzar la espada.");
                                int azar = (int) (Math.random() * 2) + 1;
                                esperar(3);
                                if (azar == 1) {
                                    System.out.println("La espada ha roto la cuerda.");
                                    if (opcionCuerdaEspada == 1) {
                                        System.out.println("Has ganado " + apuesta + " monedas.");
                                        personaje.setMonedas(personaje.getMonedas() + apuesta);
                                        break;
                                    } else {
                                        System.out.println("Has perdido " + apuesta + " monedas.");
                                        personaje.setMonedas(personaje.getMonedas() - apuesta);
                                        break;
                                    }
                                } else {
                                    System.out.println("La cuerda no se ha roto.");
                                    if (opcionCuerdaEspada == 2) {
                                        System.out.println("Felicidades");
                                        System.out.println("Has ganado " + apuesta + " monedas.");
                                        personaje.setMonedas(personaje.getMonedas() + apuesta);
                                    } else {
                                        System.out.println("Lo sentimos.");
                                        System.out.println("Has perdido " + apuesta + " monedas.");
                                        personaje.setMonedas(personaje.getMonedas() - apuesta);
                                    }
                                }
                                esperar(3);
                                System.out.println("¿Quieres volver al casino? (S/N)");
                                sc.nextLine();
                                String respuesta = sc.nextLine().toLowerCase();
                                if (!respuesta.equals("s")) {
                                    seguirJugando = false;
                                }
                                limpiarPantalla();
                            }
                             catch (Exception e) {
                                System.out.println("Opcion no valida.");
                                sc.nextLine();
                            }
                            
                        }
                        esperar(3);
                                System.out.println("¿Quieres volver al casino? (S/N)");
                                sc.nextLine();
                                String respuesta = sc.nextLine().toLowerCase();
                                if (!respuesta.equals("s")) {
                                    seguirJugando = false;
                                }
                                limpiarPantalla();
                    }
                    case 4 -> {
                        limpiarPantalla();
                        System.out.println("Bienvenido al juego de naufragio.");
                        System.out.println("Empiezas con " + apuesta + " monedas");
                        int total = apuesta;
                        while (true) {
                            System.out.println("Estás al naufragio...");
                            esperar(2);
                            int azar = (int) (Math.random() * 2) + 1;
                            if (azar == 1) {
                                System.out.println("Lo sentimos.");
                                System.out.println("Te ha caído un rayo y has perdido " + total + " monedas.");
                                personaje.setMonedas(personaje.getMonedas() - total);
                                break;
                            } else {
                                System.out.println("Sigues al naufragio y te has encontrado un barril.");
                                System.out.println("Has obtenido " + apuesta + " monedas.");
                                total += apuesta;
                            }
                            System.out.println("El total actualmente es: " + total);
                            System.out.println("¿Quieres seguir al naufragio? (S/N)");
                            sc.nextLine();
                            String respuesta = sc.nextLine().toLowerCase();
                            if (!respuesta.equals("s")) {
                                if (total < 0) {
                                    System.out.println("Lo sentimos.");
                                    System.out.println("Has perdido un total de " + total + " monedas");
                                    personaje.setMonedas(personaje.getMonedas() - total);
                                    break;
                                } else {
                                    System.out.println("Has ganado un total de " + total + " monedas");
                                    personaje.setMonedas(personaje.getMonedas() + total);
                                    break;
                                }
                            }
                        }
                        esperar(3);
                        System.out.println("¿Quieres volver al casino? (S/N)");
                        sc.nextLine();
                        String respuesta = sc.nextLine().toLowerCase();
                        if (!respuesta.equals("s")) {
                            seguirJugando = false;
                        }
                        limpiarPantalla();
                    }
                    case 5 -> {
                        limpiarPantalla();
                        System.out.println("╔══════════════════════════════════════════════════════╗");
                        System.out.println("║                      A R G H                         ║");
                        System.out.println("╠══════════════════════════════════════════════════════╣");
                        System.out.println("║                    COMO JUGAR                        ║");
                        System.out.println("╠══════════════════════════════════════════════════════╣");
                        System.out.println("║            Selecciona un juego para ver              ║");
                        System.out.println("║               sus reglas y premios:                  ║");
                        System.out.println("║                                                      ║");
                        System.out.println("║              1. Dados Malditos                       ║");
                        System.out.println("║              2. Ruleta                               ║");
                        System.out.println("║              3. Espada o Cuerda                      ║");
                        System.out.println("║              4. Naufragio                            ║");
                        System.out.println("╚══════════════════════════════════════════════════════╝");
                        int opcionCasinoJugar = 0;
                        while (true) {
                            try {
                                opcionCasinoJugar = sc.nextInt();
                                if (opcionCasinoJugar >= 1 && opcionCasinoJugar <= 4) {
                                    break;
                                }
                            } catch (Exception e) {
                                limpiarPantalla();
                                System.out.println("Introduce un valor válido.");
                            }
                        }
                        switch (opcionCasinoJugar) {
                            case 1 -> {
                                limpiarPantalla();
                                System.out.println("╔══════════════════════════════════════════════════════╗");
                                System.out.println("║                  DADOS MALDITOS                      ║");
                                System.out.println("╠══════════════════════════════════════════════════════╣");
                                System.out.println("║  Se lanzan dos dados malditos y se suman sus         ║");
                                System.out.println("║  valores.                                            ║");
                                System.out.println("║                                                      ║");
                                System.out.println("║  RESULTADOS:                                         ║");
                                System.out.println("║  - Si sumas 7 u 11: ¡GANAS x2 tu apuesta!            ║");
                                System.out.println("║  - Si sumas 2, 3 o 12: Pierdes tu apuesta            ║");
                                System.out.println("║  - Cualquier otro número: Empate                     ║");
                                System.out.println("╚══════════════════════════════════════════════════════╝");
                                System.out.println("Presiona enter para continuar...");
                                sc.nextLine();
                                sc.nextLine();
                                limpiarPantalla();
                            }
                            case 2 -> {
                                limpiarPantalla();
                                System.out.println("╔══════════════════════════════════════════════════════╗");
                                System.out.println("║                     RULETA                           ║");
                                System.out.println("╠══════════════════════════════════════════════════════╣");
                                System.out.println("║  La ruleta girará y se detendrá en un número         ║");
                                System.out.println("║  del 0 al 36.                                        ║");
                                System.out.println("║                                                      ║");
                                System.out.println("║  RESULTADOS:                                         ║");
                                System.out.println("║  - Si sale 0: ¡GANAS x10 tu apuesta!                 ║");
                                System.out.println("║  - Si sale par: Ganas tu apuesta                     ║");
                                System.out.println("║  - Si sale impar: Pierdes tu apuesta                 ║");
                                System.out.println("╚══════════════════════════════════════════════════════╝");
                                System.out.println("Presiona enter para continuar...");
                                sc.nextLine();
                                sc.nextLine();
                                limpiarPantalla();
                            }
                            case 3 -> {
                                limpiarPantalla();
                                System.out.println("╔══════════════════════════════════════════════════════╗");
                                System.out.println("║                ESPADA O CUERDA                       ║");
                                System.out.println("╠══════════════════════════════════════════════════════╣");
                                System.out.println("║  Elige entre la espada o la cuerda. La espada        ║");
                                System.out.println("║  intentará cortar la cuerda.                         ║");
                                System.out.println("║                                                      ║");
                                System.out.println("║  RESULTADOS:                                         ║");
                                System.out.println("║  - Si elegiste espada y corta: Ganas tu apuesta      ║");
                                System.out.println("║  - Si elegiste cuerda y resiste: Ganas tu apuesta    ║");
                                System.out.println("║  - Si fallas tu elección: Pierdes tu apuesta         ║");
                                System.out.println("╚══════════════════════════════════════════════════════╝");
                                System.out.println("Presiona enter para continuar...");
                                sc.nextLine();
                                sc.nextLine();
                                limpiarPantalla();
                            }
                            case 4 -> {
                                limpiarPantalla();
                                System.out.println("╔══════════════════════════════════════════════════════╗");
                                System.out.println("║                   NAUFRAGIO                          ║");
                                System.out.println("╠══════════════════════════════════════════════════════╣");
                                System.out.println("║  Navega por la tormenta y decide si continuar        ║");
                                System.out.println("║  o retirarte con tus ganancias.                      ║");
                                System.out.println("║                                                      ║");
                                System.out.println("║  RESULTADOS:                                         ║");
                                System.out.println("║  - Si encuentras un barril: Duplicas tu apuesta      ║");
                                System.out.println("║  - Si te cae un rayo: ¡Pierdes todo!                 ║");
                                System.out.println("║  - Si te retiras: Te llevas lo acumulado             ║");
                                System.out.println("╚══════════════════════════════════════════════════════╝");
                                System.out.println("Presiona enter para continuar...");
                                sc.nextLine();
                                sc.nextLine();
                                limpiarPantalla();
                            }
                        }
                    }
                    case 6 -> {
                        seguirJugando = false;
                        limpiarPantalla();
                    }
                }   
            }
        }
    }
}

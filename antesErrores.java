import Enemigo.*;
import Enemigo.EnemigoMarino.*;
import Enemigo.EnemigoTerrestre.*;
import Personaje.*;
import Producto.*;
import Tendera.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class antesErrores {

	private static int mundoActual = 0;

	private static Producto minipocion = new Producto("Minipoción", 0, 20);
	private static Producto pocion = new Producto("Poción", 0, 30);
	private static Producto superpocion = new Producto("Superpoción", 0, 60);
	
	private static Producto baculo = new Producto("Báculo", 0, 15);
	private static Producto espada = new Producto("Espada", 0, 30);
	private static Producto mandoble = new Producto("Mandoble", 0, 120);
	
	private static Producto varitaMadera = new Producto("Varita Madera", 0, 15);
	private static Producto varitaPlastico = new Producto("Varita Plástico", 0, 30);
	private static Producto varitaOro = new Producto("Varita Oro", 0, 120);
	
	private static Producto escudito = new Producto("Escudito", 0, 15);
	private static Producto escudo = new Producto("Escudo", 0, 30);
	private static Producto escudazo = new Producto("Escudazo", 0, 120);
	
	private static Producto capita = new Producto("Capita", 0, 15);
	private static Producto capa = new Producto("Capa", 0, 30);
	private static Producto capaza = new Producto("Capaza", 0, 120);
	
	private static Producto alas = new Producto("Alas", 0, 30);
	private static Producto pedo = new Producto("Pedo", 0, 30);
	private static Producto objetoMisterioso = new Producto("???", 0, 50);
	private static Producto redbull = new Producto("Redbull", 0, 10);
	private static Producto caramelo = new Producto("Caramelo", 0, 70);

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

	public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000); // Convierte de segundos a milisegundos, pues .sleep solo acepta ms.
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido un error al esperar.");
        }
    }

	public static void salirJuego() {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║         ¡Gracias por jugar!          ║");
		System.out.println("║         ¡Hasta la próxima!           ║");
		System.out.println("║                                      ║");
		System.out.println("║        (Cerrando el juego...)        ║");
		System.out.println("╚══════════════════════════════════════╝");
		esperar(3);
		limpiarPantalla();
		System.exit(0);
	}

	public static void entrarTienda (Tendera tendera, Personaje personajeActivo, Scanner sc) { 
		boolean dentroTienda = true;
		while (dentroTienda) {
			tendera.menuCompra(personajeActivo);
			try {
				int opcionCompra = sc.nextInt();
				switch (opcionCompra) {
					case 1 -> {
						personajeActivo.procesarCompra(minipocion, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 2 -> {
						personajeActivo.procesarCompra(pocion, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 3 ->
					{
						personajeActivo.procesarCompra(superpocion, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 4 ->
					{
						personajeActivo.procesarCompra(baculo, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 5 ->
					{
						personajeActivo.procesarCompra(espada, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 6 ->
					{
						personajeActivo.procesarCompra(mandoble, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 7 ->
					{
						personajeActivo.procesarCompra(varitaMadera, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 8 ->
					{
						personajeActivo.procesarCompra(varitaPlastico, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 9 ->
					{
						personajeActivo.procesarCompra(varitaOro, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 10 ->
					{
						personajeActivo.procesarCompra(escudito, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 11 ->
					{
						personajeActivo.procesarCompra(escudo, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 12 ->
					{
						personajeActivo.procesarCompra(escudazo, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 13 ->
					{
						personajeActivo.procesarCompra(capita, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 14 ->
					{
						personajeActivo.procesarCompra(capa, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 15 ->
					{
						personajeActivo.procesarCompra(capaza, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 16 ->
					{
						personajeActivo.procesarCompra(alas, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 17 ->
					{
						personajeActivo.procesarCompra(pedo, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 18 ->
					{
						personajeActivo.procesarCompra(objetoMisterioso, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 19 ->
					{
						personajeActivo.procesarCompra(redbull, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 20 ->
					{
						personajeActivo.procesarCompra(caramelo, personajeActivo.getInventario());
						esperar(3);
						limpiarPantalla();
					}
					case 21 -> {dentroTienda = false;limpiarPantalla();
					}
					default -> {dentroTienda = false;limpiarPantalla();
					}
				}
			} catch (Exception e) {
				limpiarPantalla();
				System.out.println("Introduce un número.");
				sc.nextLine();
			}
		}
	}

	public static void menuInicial() {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║           1. Jugar                   ║");
		System.out.println("║           2. Salir                   ║");
		System.out.println("║           3. Cómo Jugar              ║");
		System.out.println("╚══════════════════════════════════════╝");
	}

	public static void menuDificultad() {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║        Escoge la dificultad:         ║");
		System.out.println("║           1. Normal                  ║");
		System.out.println("║           2. Extremo                 ║");
		System.out.println("╚══════════════════════════════════════╝");
	}

	public static void menuComoJugar () {
		System.out.println("+------------------------ARGH------------------------+");
		System.out.println("");
		System.out.println("+----------------------------------------------------+");
	}

	public static void menuContinuar() {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║           1. Avanzar                 ║");
		System.out.println("║           2. Inventario              ║");
		System.out.println("║           3. Tienda                  ║");
		System.out.println("║           4. Menú                    ║");
		System.out.println("╚══════════════════════════════════════╝");
	}

	public static void menuPantallaCombate(Personaje personaje, Enemigo enemigo) {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.printf("║                              %-12s%n", enemigo instanceof EnemigoMarinoComun ? ((EnemigoMarinoComun)enemigo).getEnemigoSeleccionado() : enemigo instanceof EnemigoMarinoJefe ? ((EnemigoMarinoJefe)enemigo).getJefeSeleccionado() : enemigo instanceof EnemigoTerrestreComun ? ((EnemigoTerrestreComun)enemigo).getEnemigoSeleccionado() : enemigo instanceof EnemigoTerrestreJefe ? ((EnemigoTerrestreJefe)enemigo).getJefeSeleccionado() : 
		"Enemigo");		System.out.println("║                              ┌──────┐║");
		System.out.printf("║                              ║HP:%3d║║%n", enemigo.getVida());
		System.out.printf("║                              ║LV:%3d║║%n", enemigo.getNivel());
		System.out.println("║                              └──────┘║");
		System.out.println("║                                      ║");
		System.out.println("║ ┌──────┐                             ║");
		System.out.printf("║ ║HP:%3d║ %-28s║%n", personaje.getVida(), personaje.getNombre());
		System.out.printf("║ ║LV:%3d║ %-28s║%n", personaje.getNivel(), 
			personaje instanceof PersonajeGrumete ? 
			"Grumete " + ((PersonajeGrumete)personaje).getRolSeleccionado() : "Capitán");
		System.out.println("║ └──────┘                             ║");
		System.out.println("╚══════════════════════════════════════╝");
	}

	public static void menuInventario (Personaje personaje) {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║          OBJETOS A EQUIPAR           ║");
		System.out.println("╚══════════════════════════════════════╝");
		if (personaje.getInventario()[0] == null) {// Si el inventario está vacío, no se muestra el objeto (null)
			System.out.println("   1. " + "Vacío");
		} else {
			System.out.println("   1. " + personaje.getInventario()[0].getNombre() + " " + personaje.getInventario()[0].getCantidad());
		}
		if (personaje.getInventario()[1] == null) {
			System.out.println("   2. " + "Vacío");
		} else {
			System.out.println("   2. " + personaje.getInventario()[1].getNombre() + " " + personaje.getInventario()[1].getCantidad());
		}
		if (personaje.getInventario()[2] == null) {
			System.out.println("   3. " + "Vacío");
		} else {
			System.out.println("   3. " + personaje.getInventario()[2].getNombre() + " " + personaje.getInventario()[2].getCantidad());
		}
		if (personaje.getInventario()[3] == null) {
			System.out.println("   4. " + "Vacío");
		} else {
			System.out.println("   4. " + personaje.getInventario()[3].getNombre() + " " + personaje.getInventario()[3].getCantidad());
		}
		if (personaje.getInventario()[4] == null) {
			System.out.println("   5. " + "Vacío");
		} else {
			System.out.println("   5. " + personaje.getInventario()[4].getNombre() + " " + personaje.getInventario()[4].getCantidad());
		}
		if (personaje.getInventario()[5] == null) {
			System.out.println("   6. " + "Vacío");
		} else {
			System.out.println("   6. " + personaje.getInventario()[5].getNombre() + " " + personaje.getInventario()[5].getCantidad());
		}
		if (personaje.getInventario()[6] == null) {
			System.out.println("   7. " + "Vacío");
		} else {
			System.out.println("   7. " + personaje.getInventario()[6].getNombre() + " " + personaje.getInventario()[6].getCantidad());
		}
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║     8. Desequipar objeto actual      ║");
		System.out.println("║     9. Salir                         ║");
		System.out.println("╚══════════════════════════════════════╝");

	}

	public static void menuInventarioCombate (Personaje personaje) {
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║                A R G H               ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║            OBJETOS A USAR            ║");
		System.out.println("╚══════════════════════════════════════╝");
		if (personaje.getInventario()[0] == null) {// Si el inventario está vacío, no se muestra el objeto (null)
			System.out.println("   1. " + "Vacío");
		} else {
			System.out.println("   1. " + personaje.getInventario()[0].getNombre() + " " + personaje.getInventario()[0].getCantidad());
		}
		if (personaje.getInventario()[1] == null) {
			System.out.println("   2. " + "Vacío");
		} else {
			System.out.println("   2. " + personaje.getInventario()[1].getNombre() + " " + personaje.getInventario()[1].getCantidad());
		}
		if (personaje.getInventario()[2] == null) {
			System.out.println("   3. " + "Vacío");
		} else {
			System.out.println("   3. " + personaje.getInventario()[2].getNombre() + " " + personaje.getInventario()[2].getCantidad());
		}
		if (personaje.getInventario()[3] == null) {
			System.out.println("   4. " + "Vacío");
		} else {
			System.out.println("   4. " + personaje.getInventario()[3].getNombre() + " " + personaje.getInventario()[3].getCantidad());
		}
		if (personaje.getInventario()[4] == null) {
			System.out.println("   5. " + "Vacío");
		} else {
			System.out.println("   5. " + personaje.getInventario()[4].getNombre() + " " + personaje.getInventario()[4].getCantidad());
		}
		if (personaje.getInventario()[5] == null) {
			System.out.println("   6. " + "Vacío");
		} else {
			System.out.println("   6. " + personaje.getInventario()[5].getNombre() + " " + personaje.getInventario()[5].getCantidad());
		}
		if (personaje.getInventario()[6] == null) {
			System.out.println("   7. " + "Vacío");
		} else {
			System.out.println("   7. " + personaje.getInventario()[6].getNombre() + " " + personaje.getInventario()[6].getCantidad());
		}
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║     8. Salir del inventario          ║");
		System.out.println("╚══════════════════════════════════════╝");

	}

	public static void suspense(){
		esperar(0);
		System.out.print(".");
		esperar(0);
		System.out.print(".");
		esperar(0);
		System.out.print(".");
		esperar(0);
	}

	public static boolean obtenerRespuestaConIntentos(String claveCorrecta, int intentosMaximos, Scanner scanner) {
		boolean exito = false;
	
		System.out.println("¡Espabila, puberscente! Si quieres salvar este barco, di la palabra correcta.");
		System.out.println("¿Cómo se llama alguien que navega los mares saqueando barcos y son muy famosos los del Caribe?");
	
		for (int i = 1; i <= intentosMaximos; i++) {
			System.out.println("Intento " + i + " de " + intentosMaximos + ". ¡Responde rápido!");
	
			String respuesta = scanner.nextLine();
			if (respuesta.equalsIgnoreCase(claveCorrecta)) {
				System.out.println("¡Bien hecho, grumete! Te has ganado tu lugar en la tripulación.");
				exito = true;
				esperar(3);
				limpiarPantalla();
				break;
			} else {
				limpiarPantalla(); // Se asume que la función limpiarPantalla() está definida en otro lugar.
				System.out.println("¡Eso no es correcto! Prueba de nuevo.");
				System.out.println("¿Cómo se llama alguien que navega los mares saqueando barcos y son muy famosos los del Caribe?");
			}
		}
	
		if (!exito) {
			System.out.println("¡Has fallado! Menuda cena van a tener los tiburones contigo...");
		}
		return exito;
	}
	
	public static void  CalaveraGameOver() {
			System.out.println("       ______ ");
			System.out.println("    .-'      '-.");
			System.out.println("   /            \\");
			System.out.println("  |              |");
			System.out.println("  |,  .-.  .-.  ,|");
			System.out.println("  | )(_o/  \\o_)( |");
			System.out.println("  |/     /\\     \\|");
			System.out.println("  (_     ^^     _)");
			System.out.println("   \\__|IIIIII|__/");
			System.out.println("    | \\IIIIII/ |");
			System.out.println("    \\          /");
			System.out.println("     `--------`");
			System.out.println();
			System.out.println("     GAME OVER");
			System.out.println("¡A los tiburones contigo!");
	}

	public static void muerteCombate(Personaje personajeActivo, Scanner sc) {
		if (personajeActivo instanceof PersonajeCapitan) {
			CalaveraGameOver();
			salirJuego();
		} else {
			// Reestablecemos sus estadísticas ------------------------------------------------
			personajeActivo.setVida((int) (100 * Math.pow(1.1, personajeActivo.getNivel())));
			personajeActivo.setResistenciaFisica((int) (20 * Math.pow(1.1, personajeActivo.getNivel())));
			personajeActivo.setResistenciaMagica((int) (20 * Math.pow(1.1, personajeActivo.getNivel())));
			personajeActivo.setDañoFisico((int) (20 * Math.pow(1.1, personajeActivo.getNivel())));
			personajeActivo.setDañoMagico((int) (20 * Math.pow(1.1, personajeActivo.getNivel())));
			personajeActivo.setVelocidad((int) (20 * Math.pow(1.1, personajeActivo.getNivel())));
			// Pierde la mitad del dinero
			personajeActivo.setMonedas(personajeActivo.getMonedas() / 2);
			// Vaciamos el inventario
			personajeActivo.setInventario(new Producto[7]);
			// Reestablecemos sus estadísticas ------------------------------------------------
			PersonajeGrumete personajeGrumete = (PersonajeGrumete) personajeActivo;
			suspense();
			limpiarPantalla();
			System.out.println("¡Has sido derrotado!");
			if (personajeActivo.getGrumetesRestantes() > 0) {
				System.out.println("¡Pero viene un grumete a tu rescate!");
				personajeActivo.setGrumetesRestantes(personajeActivo.getGrumetesRestantes() - 1);
				if (personajeGrumete.getContadorCocinero()) {
					int random = (int) (Math.random() * 100);
					if (random <= 50) { // Le sale el rol cubierta
						System.out.println("¡Ahora eres un grumete de cubierta!");
						personajeGrumete.setContadorCubierta(true);
						personajeGrumete.setRolSeleccionado("Cubierta");
					} else { // Le sale el rol artillero
						System.out.println("¡Ahora eres un grumete artillero!");
						personajeGrumete.setContadorArtillero(true);
						personajeGrumete.setRolSeleccionado("Artillero");
					}
				} else if (personajeGrumete.getContadorCubierta()) {
					int random = (int) (Math.random() * 100);
					if (random <= 50) { // Le sale el rol cocinero
						System.out.println("¡Ahora eres un grumete cocinero!");
						personajeGrumete.setContadorCocinero(true);
						personajeGrumete.setRolSeleccionado("Cocinero");
					} else { // Le sale el rol artillero
						System.out.println("¡Ahora eres un grumete artillero!");
						personajeGrumete.setContadorArtillero(true);
						personajeGrumete.setRolSeleccionado("Artillero");
					}
				} else if (personajeGrumete.getContadorArtillero()) {
					int random = (int) (Math.random() * 100);
					if (random <= 50) { // Le sale el rol cubierta
						System.out.println("¡Ahora eres un grumete de cubierta!");
						personajeGrumete.setContadorCubierta(true);
						personajeGrumete.setRolSeleccionado("Cubierta");
					} else { // Le sale el rol cocinero
						System.out.println("¡Ahora eres un grumete cocinero!");
						personajeGrumete.setContadorCocinero(true);
						personajeGrumete.setRolSeleccionado("Cocinero");
					}
				} else if (personajeGrumete.getContadorCocinero() && personajeGrumete.getContadorCubierta()) {
					System.out.println("¡Ahora eres un grumete artillero!");
					personajeGrumete.setRolSeleccionado("Artillero");
					personajeGrumete.setContadorArtillero(true);
				} else if (personajeGrumete.getContadorCocinero() && personajeGrumete.getContadorArtillero()) {
					System.out.println("¡Ahora eres un grumete de cubierta!");
					personajeGrumete.setRolSeleccionado("Cubierta");
					personajeGrumete.setContadorCubierta(true);
				} else if (personajeGrumete.getContadorArtillero() && personajeGrumete.getContadorCubierta()) {
					System.out.println("¡Ahora eres un grumete cocinero!");
					personajeGrumete.setRolSeleccionado("Cocinero");
					personajeGrumete.setContadorCocinero(true);
				} else {
					CalaveraGameOver();
					salirJuego();
				}
			} else {
				CalaveraGameOver();
				salirJuego();
			}
			System.out.println("Pulsa enter para continuar...");
			sc.nextLine();
			limpiarPantalla();
		}
	}

	public static boolean usarObjetoCombate (Producto[] inventario, int opcion, Personaje personaje, Scanner sc) {
		opcion = opcion - 1;
		if (inventario[opcion] == null){
			System.out.println("No tienes ningún objeto en esa posición.");
			return false;
		} else {
			personaje.usarObjeto(inventario[opcion], sc);
			return true;
		}
	}
	
	public static void combate(Personaje personajeActivo, Enemigo enemigo, Scanner sc, Random rand) {
		boolean combateActivo = true;
		int[] ataquesEnemigo = {1,2,3};
	
		while (combateActivo) {
			if (enemigo.getVida() <= 0) {
				break;
			}
			if (personajeActivo.getVida() <= 0) {
				muerteCombate(personajeActivo, sc);
				break;
			}
	
			int opcionCombate = obtenerOpcionCombate(personajeActivo, sc, enemigo);
			
			switch (opcionCombate) {
				case 1 -> gestionarAtaque(personajeActivo, enemigo, sc, rand, ataquesEnemigo);
				case 2 -> gestionarUsoObjeto(personajeActivo, sc);
				case 3 -> mostrarEstadisticasCombate(personajeActivo, sc);
				case 4 -> combateActivo = !personajeActivo.huir(enemigo, sc);
			}
		}
	}
	
	private static int obtenerOpcionCombate(Personaje personajeActivo, Scanner sc, Enemigo enemigo) {
		while (true) {
			limpiarPantalla();
			menuPantallaCombate(personajeActivo, enemigo);
			personajeActivo.menuCombate();
			try {
				int opcion = sc.nextInt();
				sc.nextLine();
				if (opcion >= 1 && opcion <= 4) {
					return opcion;
				}
				System.out.println("Opción inválida. Introduce una opción válida (1-4).");
				esperar(2);
			} catch (Exception e) {
				System.out.println("Por favor, introduce un número válido.");
				sc.nextLine();
				esperar(2);
			}
		}
	}
	// TODO COMPROBAR
	private static void gestionarAtaque(Personaje personajeActivo, Enemigo enemigo, Scanner sc, Random rand, int[] ataquesEnemigo) {
		int opcionAtaque = obtenerOpcionAtaque(personajeActivo, sc);
		if (opcionAtaque != -1) {
			// Determinar quién ataca primero basado en la velocidad
			if (personajeActivo.getVelocidad() > enemigo.getVelocidad()) {
				// El personaje ataca primero
				esperar(1);
				// Ataque del personaje
				switch (opcionAtaque) {
					case 1 -> {
						personajeActivo.ataque1(enemigo);
					}
					case 2 -> {
						personajeActivo.ataque2(enemigo);}
					case 3 -> {
						personajeActivo.ataque3(enemigo);
					}
				}
				esperar(1);
				// Si el enemigo sobrevive, contraataca
				if (enemigo.getVida() > 0) {
					if (enemigo instanceof EnemigoMarinoComun) {
						// Hacemos el casting para que el enemigo sea de tipo EnemigoMarinoComun
						EnemigoMarinoComun enemigoMarinoComun = (EnemigoMarinoComun) enemigo; 
						System.out.println("¡" + enemigoMarinoComun.getEnemigoSeleccionado() + " contraataca!");
					} else if (enemigo instanceof EnemigoMarinoJefe) {
						// Hacemos el casting para que el enemigo sea de tipo EnemigoMarinoJefe
						EnemigoMarinoJefe enemigoMarinoJefe = (EnemigoMarinoJefe) enemigo;
						System.out.println("¡" + enemigoMarinoJefe.getJefeSeleccionado() + " contraataca!");
					} else if (enemigo instanceof EnemigoTerrestreComun) {
						// Hacemos el casting para que el enemigo sea de tipo EnemigoTerrestreComun
						EnemigoTerrestreComun enemigoTerrestreComun = (EnemigoTerrestreComun) enemigo;
						System.out.println("¡" + enemigoTerrestreComun.getEnemigoSeleccionado() + " contraataca!");
					} else if (enemigo instanceof EnemigoTerrestreJefe) {
						// Hacemos el casting para que el enemigo sea de tipo EnemigoTerrestreJefe
						EnemigoTerrestreJefe enemigoTerrestreJefe = (EnemigoTerrestreJefe) enemigo;
						System.out.println("¡" + enemigoTerrestreJefe.getJefeSeleccionado() + " contraataca!");
					}
					esperar(1);
					int ataqueEnemigo = ataquesEnemigo[rand.nextInt(ataquesEnemigo.length)];
					switch (ataqueEnemigo) {
						case 1 -> {
							enemigo.ataque1(personajeActivo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
						case 2 -> {
							enemigo.ataque2(personajeActivo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
						case 3 -> {
							enemigo.ataque3(personajeActivo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
					}
					esperar(1);
				} else {
					System.out.println("¡Has derrotado al enemigo!");
					esperar(2);
					limpiarPantalla();
				}
			} else {
				// El enemigo ataca primero
				if (enemigo instanceof EnemigoMarinoComun) {
					// Hacemos el casting para que el enemigo sea de tipo EnemigoMarinoComun
					EnemigoMarinoComun enemigoMarinoComun = (EnemigoMarinoComun) enemigo; 
					System.out.println("¡" + enemigoMarinoComun.getEnemigoSeleccionado() + " ataca!");
				} else if (enemigo instanceof EnemigoMarinoJefe) {
					// Hacemos el casting para que el enemigo sea de tipo EnemigoMarinoJefe
					EnemigoMarinoJefe enemigoMarinoJefe = (EnemigoMarinoJefe) enemigo;
					System.out.println("¡" + enemigoMarinoJefe.getJefeSeleccionado() + " ataca!");
				} else if (enemigo instanceof EnemigoTerrestreComun) {
					// Hacemos el casting para que el enemigo sea de tipo EnemigoTerrestreComun
					EnemigoTerrestreComun enemigoTerrestreComun = (EnemigoTerrestreComun) enemigo;
					System.out.println("¡" + enemigoTerrestreComun.getEnemigoSeleccionado() + " ataca!");
				} else if (enemigo instanceof EnemigoTerrestreJefe) {
					// Hacemos el casting para que el enemigo sea de tipo EnemigoTerrestreJefe
					EnemigoTerrestreJefe enemigoTerrestreJefe = (EnemigoTerrestreJefe) enemigo;
					System.out.println("¡" + enemigoTerrestreJefe.getJefeSeleccionado() + " ataca!");
				}
				int ataqueEnemigo = ataquesEnemigo[rand.nextInt(ataquesEnemigo.length)];
				switch (ataqueEnemigo) {
					case 1 -> enemigo.ataque1(personajeActivo);
					case 2 -> enemigo.ataque2(personajeActivo);
					case 3 -> enemigo.ataque3(personajeActivo);
				}
				esperar(1);
				
				// Si el personaje sobrevive, contraataca
				if (personajeActivo.getVida() > 0) {
					System.out.println("¡" + personajeActivo.getNombre() + " contraataca!");
					esperar(1);
					switch (opcionAtaque) {
						case 1 -> {
							personajeActivo.ataque1(enemigo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
						case 2 -> {
							personajeActivo.ataque2(enemigo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
						case 3 -> {
							personajeActivo.ataque3(enemigo);
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
						}
					}
					esperar(1);
				}
			}
		}
	}
	// ! COMPROBAR
	private static int obtenerOpcionAtaque(Personaje personajeActivo, Scanner sc) {
		limpiarPantalla();
		personajeActivo.eleccionAtaquesMenu();
		try {
			int opcion = sc.nextInt();
			sc.nextLine();
			if (opcion >= 1 && opcion <= 3) {
				return opcion;
			}
			System.out.println("Ataque inválido. Elige entre 1 y 3.");
			esperar(2);
		} catch (Exception e) {
			System.out.println("Por favor, introduce un número válido.");
			sc.nextLine();
			esperar(2);
		}
		return -1;
	}
	// * ESTA BIEN O ESO PARECE
	private static void gestionarUsoObjeto(Personaje personajeActivo, Scanner sc) {
		boolean dentroInventario = true;
		while (dentroInventario) {
			int opcionObjeto = obtenerOpcionInventario(personajeActivo, sc);
			if (opcionObjeto != 8) {
				limpiarPantalla();
				if (usarObjetoCombate(personajeActivo.getInventario(), opcionObjeto, personajeActivo, sc)) {
					dentroInventario = false;
					break;
				}
			} else {
				dentroInventario = false;
				limpiarPantalla();
			}
		}
	}
	// * ESTA BIEN O ESO PARECE
	private static int obtenerOpcionInventario(Personaje personajeActivo, Scanner sc) {
		while (true) {
			limpiarPantalla();
			menuInventarioCombate(personajeActivo);
			try {
				int opcion = sc.nextInt();
				sc.nextLine();
				if (opcion >= 1 && opcion <= 8) {
					return opcion;
				}
				System.out.println("Opción inválida. Introduce un número del 1 al 8.");
				esperar(2);
			} catch (Exception e) {
				System.out.println("Por favor, introduce un número válido.");
				sc.nextLine();
				esperar(2);
			}
		}
	}
	// * ESTA BIEN O ESO PARECE
	private static void mostrarEstadisticasCombate(Personaje personajeActivo, Scanner sc) {
		limpiarPantalla();
		personajeActivo.mostrarInfoCombate();
		System.out.println("Pulsa enter para volver al combate...");
		sc.nextLine();
		limpiarPantalla();
	}
	public static void main(String[] args) {
		
		//Creación de objetos.
		Tendera tendera = new Tendera(null, false);      

		Personaje personajeActivo = null;
		Producto[] inventario = new Producto[7]; // Inventario del jugador

		//Comienzo del juego.
		Scanner sc = new Scanner(System.in);
		while (true) { // Bucle de menú inicial
			menuInicial();
			int opcionInical = 0;
			try {
				opcionInical = sc.nextInt();
			} catch (Exception e) {
				limpiarPantalla();
				sc.nextLine(); // Clear invalid input
				System.out.println("Opción inválida. Introduce un número.");
				menuInicial();
			}
			limpiarPantalla();
			if (opcionInical == 1) {
				// Inicio del juego
				System.out.println("╔══════════════════════════════════════╗");
				System.out.println("║                A R G H               ║");
				System.out.println("╠══════════════════════════════════════╣");
				System.out.println("║        ¿Cuál es tu género?           ║");
				System.out.println("╚══════════════════════════════════════╝");
				String genero = sc.next().toLowerCase();
				limpiarPantalla();
				System.out.println("╔══════════════════════════════════════╗");
				System.out.println("║                A R G H               ║");
				System.out.println("╠══════════════════════════════════════╣");
				System.out.println("║         ¿Cómo te llamas?             ║");
				System.out.println("╚══════════════════════════════════════╝");
				String nombre = sc.next();
				limpiarPantalla();
				menuDificultad();
				int opcionDificultad = 0;
				while (true) {
					try {
						opcionDificultad = sc.nextInt();
						if (opcionDificultad == 1 || opcionDificultad == 2) {
							limpiarPantalla();
							break;
						} else {
							limpiarPantalla();
							System.out.println("Opción incorrecta. Introduce una opción válida.");
							menuDificultad();
						}
					} catch (Exception e) {
						sc.nextLine(); // Limpia la opción anterior.
						limpiarPantalla();
						System.out.println("Opción inválida. Introduce un número.");
						menuDificultad();
					}
				}
				if (opcionDificultad == 1) {
					// Dificultad normal
					System.out.println("");
					System.out.println("╔══════════════════════════════════════╗");
					System.out.println("║                A R G H               ║");
					System.out.println("╠══════════════════════════════════════╣");
					System.out.println("║         DIFICULTAD NORMAL            ║");
					System.out.println("║                                      ║");
					System.out.println("║          ¡Eres un grumete!           ║");
					System.out.println("║                                      ║");
					int randomRol = (int) (Math.random() * 100); // Número aleatorio para seleccionar rol
					String rolSeleccionado;
					boolean contadorCubierta = false;
					boolean contadorCocinero = false;
					boolean contadorArtillero = false;

					if (randomRol <= 33) {
						System.out.println("║  ¡Tu rol seleccionado es CUBIERTA!   ║");
						rolSeleccionado = "Cubierta";
						contadorCubierta = true;
					} else if (randomRol <= 66) {
						System.out.println("║  ¡Tu rol seleccionado es COCINERO!   ║");
						rolSeleccionado = "Cocinero";
						contadorCocinero = true;
					} else {
						System.out.println("║  ¡Tu rol seleccionado es ARTILLERO!  ║");
						rolSeleccionado = "Artillería";
						contadorArtillero = true;
					}
					System.out.println("╚══════════════════════════════════════╝");
					Personaje grumete = new PersonajeGrumete(nombre, genero, 100, 20, 20, 20, 20, 20, 0, 0, 10000000, 3, 0, 0, false, inventario, null, false, false, false, rolSeleccionado, contadorCocinero, contadorArtillero, contadorCubierta);
					personajeActivo = grumete;
					System.out.println("¡BUENA SUERTE PIRATA " + nombre.toUpperCase() + "!");
					System.out.println("");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					sc.nextLine();
					limpiarPantalla();
					break;
				} else if (opcionDificultad == 2) {
					// Dificultad extrema
					System.out.println("");
					System.out.println("╔══════════════════════════════════════╗");
					System.out.println("║                A R G H               ║");
					System.out.println("╠══════════════════════════════════════╣");
					System.out.println("║         DIFICULTAD EXTREMA           ║");
					System.out.println("║                                      ║");
					System.out.println("║          ¡Eres el capitán!           ║");
					System.out.println("╚══════════════════════════════════════╝");
					System.out.println("¡BUENA SUERTE PIRATA " + nombre.toUpperCase() + "!");
					System.out.println("");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					sc.nextLine();
					limpiarPantalla();
					Personaje capitán = new PersonajeCapitan(nombre, genero, 100, 30, 20, 10, 30, 20, 0, 0, 10000000, 3, 0, 0, false, inventario, null, false, false, false);
					personajeActivo = capitán;
					break;
				} else {
					// Opción inválida
					System.out.println("Opción inválida");
				}
			} else if (opcionInical == 2) {
				// Salir del juego	
				salirJuego();
			} else if (opcionInical == 3) {
				// Cómo jugar
				menuComoJugar();
			} else {
				// Opción inválida
				System.out.println("Opción inválida. Prueba otra vez.");
			}
		} // Fin del bucle del inicio
		
		while (true) { // Comienzo del juego principal.
			menuContinuar();
			int opcionContinuar = 0;
			try {
			opcionContinuar = sc.nextInt();
			limpiarPantalla();
			} catch (Exception e) {
				limpiarPantalla();
				sc.nextLine(); 
				System.out.println("Opción inválida. Introduce un número.");
			}
			if (opcionContinuar == 1) {
				// Avanzar
				if (mundoActual == 0) {
					System.out.println("╔═════════════════════════════════════════════╗");
					System.out.println("║        ¡TU AVENTURA VA A COMENZAR!          ║");
					System.out.println("╚═════════════════════════════════════════════╝");
					esperar(1);
					if(personajeActivo instanceof PersonajeCapitan){
						System.out.println("┌─────────────────────────────────────────────┐");
						System.out.println("║  Es un placer tenerte con nosotros          ║");
						System.out.println("└─────────────────────────────────────────────┘");
						System.out.println("  capitán " + personajeActivo.getNombre() + ". ");
						System.out.println("┌─────────────────────────────────────────────┐");
						System.out.println("║  Su barco se está aproximando a las         ║");
						System.out.println("║  Tierras desconocidas...                    ║");
						System.out.println("║                                             ║");
						System.out.println("║  Pulsa enter para continuar...              ║");
						System.out.println("└─────────────────────────────────────────────┘");

						sc.nextLine();
						limpiarPantalla();
						System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
						System.out.println();
						System.out.println("  Capitán, llega un aviso del mástil mayor");
						System.out.println("  que se atisba una isla en el horizonte.");
						System.out.println("  Vamos a desplegar a la tripulación para");
						System.out.println("  defender el barco, tengo un mal");
						System.out.println("  presentimiento...");
						System.out.println();
						System.out.println("  Pulsa enter para continuar...");
						System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
						sc.nextLine();
						limpiarPantalla();
						System.out.println("╔══════════════════════════════════════════════╗");
						System.out.println("║  ¡ATENCIÓN CAPITÁN!                          ║");
						System.out.println("║  Da la orden de proteger el barco            ║");
						System.out.println("║  (debes gritar, si no no te escucharán):     ║");
						System.out.println("╚══════════════════════════════════════════════╝");
						String aviso = sc.nextLine();
						while(true){
							int contador = 1; 
							for (int i = 1; i < aviso.length(); i++) {
								if (aviso.charAt(i) == aviso.charAt(i - 1)) {
									contador++;
									if(contador>=4){
										break;
									}
								} else {
									contador = 1;
								}
							}
							System.out.println();
							if(contador>=4){
								break;
							}else{
								System.out.println("⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️");
								System.out.println("⚠️  ¡No le han escuchado, capitán!   ⚠️");
								System.out.println("⚠️  ¡Tiene que GRITAAAAAAAAAAAAAAAR  ⚠️");
								System.out.println("⚠️   MUUUUUUCHOOOOOO!                ⚠️");
								System.out.println("⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ⚠️ ");
								esperar(3);
								limpiarPantalla();
								System.out.println("╔═══════════════════════════════════════════╗");
								System.out.println("║  Da la orden de proteger el barco         ║");
								System.out.println("║  (debes gritar, si no, no te escucharán): ║");
								System.out.println("╚═══════════════════════════════════════════╝");
								aviso = sc.nextLine();
							}
						}
						System.out.println("╔═════════════════════════════════════════════╗");
						System.out.println("║  El grito del capitán es tan potente que    ║");
						System.out.println("║  hace brincar a los peces del agua.         ║");
						System.out.println("║                                             ║");
						System.out.println("║  La tripulación se pone en alerta y         ║");
						System.out.println("║  preparan las defensas del barco...         ║");
						System.out.println("║                                             ║");
						System.out.println("║  Pulsa enter para continuar...              ║");
						System.out.println("╚═════════════════════════════════════════════╝");
						sc.nextLine();
						limpiarPantalla();
						System.out.println("╔═════════════════════════════════════════════╗");
						System.out.println("║  Hay una calma de repente en el horizonte   ║");
						System.out.println("╚═════════════════════════════════════════════╝");
						suspense();
						limpiarPantalla();
						esperar(2);
						System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
						System.out.println("  ¡Capitán, prepárese, nos atacan!");
						System.out.println("  Pulsa enter para continuar...");
						System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
						sc.nextLine();
						limpiarPantalla();
					} else{
						System.out.println("╔═════════════════════════════════════════════╗");
						System.out.println("  ║  ¡Bienvenido a bordo, " + personajeActivo.getNombre() + "!".formatted("%-28s") + "║");
						System.out.println("║  El barco del capitán se aproxima a las     ║");
						System.out.println("║  Tierras desconocidas...                    ║");
						System.out.println("║                                             ║");
						System.out.println("║  Pulsa enter para continuar...              ║");
						System.out.println("╚═════════════════════════════════════════════╝");
						sc.nextLine();
						limpiarPantalla();
						System.out.println("╔═════════════════════════════════════════════╗");
						System.out.println("║  Grumete, llega un aviso del mástil mayor:  ║");
						System.out.println("║  se atisba una isla en el horizonte.        ║");
						System.out.println("║  Voy a informar al capitán, tengo un mal    ║");
						System.out.println("║  presentimiento...                          ║");
						System.out.println("║                                             ║");
						System.out.println("║  Pulsa enter para continuar...              ║");
						System.out.println("╚═════════════════════════════════════════════╝");
						sc.nextLine();
						limpiarPantalla();
						System.out.println("╔═════════════════════════════════════════════╗");
						System.out.println("║  Debemos advertir al capitán de la posible  ║");
						System.out.println("║  amenaza. ¡Corre y dile que debe            ║");
						System.out.println("║  prepararse!                                ║");
						System.out.println("╚═════════════════════════════════════════════╝");
						//------------------------------------------------------------------------------------------------------------
						boolean pruebaDeLaVerdad = obtenerRespuestaConIntentos("pirata",  5, sc);
						//------------------------------------------------------------------------------------------------------------
						if(pruebaDeLaVerdad){
							System.out.println("╔═════════════════════════════════════════════╗");
							System.out.println("║  Tus pasos resuenan en todo el barco,       ║");
							System.out.println("║  haciendo temblar toda la nave.             ║");
							System.out.println("║                                             ║");
							System.out.println("║  El capitán se alerta y ordena preparar     ║");
							System.out.println("║  las defensas del barco...                  ║");
							System.out.println("║                                             ║");
							System.out.println("║  Pulsa enter para continuar...              ║");
							System.out.println("╚═════════════════════════════════════════════╝");
							sc.nextLine();
							limpiarPantalla();
							System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
							System.out.println("  Todo parece calmarse repentinamente...");
							System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
							suspense();
							limpiarPantalla();
							esperar(2);
							System.out.println("╔═════════════════════════════════════════════╗");
							System.out.println("║  ¡Grumete, mantente alerta,                 ║");
							System.out.println("║   algo se acerca!                           ║");
							System.out.println("║                                             ║");
							System.out.println("║   Pulsa enter para continuar...             ║");
							System.out.println("╚═════════════════════════════════════════════╝");
							sc.nextLine();
							limpiarPantalla();
						}else{
							System.out.println("╔═════════════════════════════════════════════╗");
							System.out.println("║     FIN DEL JUEGO                           ║");
							System.out.println("║     EL BARCO SE HA IDO A PIQUE...           ║");
							System.out.println("╚═════════════════════════════════════════════╝");
							CalaveraGameOver();
						}
					}
				}
				Enemigo[] listaEnemigosMarinos = { 
					new EnemigoMarinoComun(100, 20, 20, 20, 30, 30, 30, 0, 20, false, 15, "Amonite"),
					new EnemigoMarinoComun(100, 20, 20, 20, 20, 30, 30, 0, 20, false, 20, "Trilobite"),
					new EnemigoMarinoComun(100, 20, 20, 20, 10, 30, 30, 0, 20, false, 10, "Zooplacton")
				};
				Random rand = new Random();
				int indiceAleatorio = rand.nextInt(listaEnemigosMarinos.length); 
				Enemigo e1 = listaEnemigosMarinos[indiceAleatorio];
				listaEnemigosMarinos[indiceAleatorio] = null; 
				// Enemigo e2 = listaEnemigosMarinos[indiceAleatorio];
				// Enemigo e3 = listaEnemigosMarinos[indiceAleatorio];
				EnemigoMarinoComun enemigoComunMarino = (EnemigoMarinoComun) e1;
				System.out.println("╔═════════════════════════════════════════════╗");
				System.out.println("║  ¡ALERTA! ¡ENEMIGOS A LA VISTA!             ║");
				System.out.println("║  Cuidado, nos atacan un grupo de            ║");
				System.out.println("║  " + enemigoComunMarino.getEnemigoSeleccionado() + "                                    ║");
				System.out.println("║  Vas a entrar en combate, prepárate...      ║");
				System.out.println("╚═════════════════════════════════════════════╝");
				suspense();
				limpiarPantalla();
				System.out.println("╔═════════════════════════════════════════════╗");
				System.out.println("║  Antes de nada te recomiendo que veas la    ║");
				System.out.println("║  información de tus ataques.                ║");
				System.out.println("║                                             ║");
				System.out.println("║  ¿Quieres ver tus ataques? S/N              ║");
				System.out.println("╚═════════════════════════════════════════════╝");
				String respuestaAyudaAtaque = sc.nextLine();
				limpiarPantalla();
				if(respuestaAyudaAtaque.toLowerCase().equals("s")){
					personajeActivo.infoAtaque1();
					System.out.println();
					personajeActivo.infoAtaque2();
					System.out.println();
					personajeActivo.infoAtaque3();
					System.out.println();
					System.out.println("Pulsa enter para continuar... ");
					sc.nextLine();
					limpiarPantalla();
				}
				combate(personajeActivo, enemigoComunMarino, sc, rand);
				mundoActual ++;
				System.out.println("╔═════════════════════════════════════════════╗");
				System.out.println("║            ¡ENHORABUENA!                    ║");
				System.out.println("║     Has superado el combate con éxito       ║");
				System.out.println("║                                             ║");
				System.out.println("║     Pulsa enter para continuar...           ║");
				System.out.println("╚═════════════════════════════════════════════╝");
				sc.nextLine();
				limpiarPantalla();
			
				
			} else if (opcionContinuar == 2) {
				// Inventario
				boolean dentroInventario = true;
				while (dentroInventario) {
					int opcionInventario = 0;
					try {
						menuInventario(personajeActivo);
						opcionInventario = sc.nextInt();
					} catch (Exception e) {
						limpiarPantalla();
						sc.nextLine();
					}
					switch (opcionInventario) {
						case 1 -> {
							// Equipar objeto 1
							personajeActivo.equiparObjeto(inventario,0);
						}
						case 2 -> {
							// Equipar objeto 2
							personajeActivo.equiparObjeto(inventario,1);
						}
						case 3 -> {
							// Equipar objeto 3
							personajeActivo.equiparObjeto(inventario,2);
						}
						case 4 -> {
							// Equipar objeto 4
							personajeActivo.equiparObjeto(inventario,3);
						}
						case 5 -> {
							// Equipar objeto 5
							personajeActivo.equiparObjeto(inventario,4);
						}
						case 6 -> {
							// Equipar objeto 6
							personajeActivo.equiparObjeto(inventario,5);
						}
						case 7 -> {
							// Equipar objeto 7
							personajeActivo.equiparObjeto(inventario,6);
						}
						case 8 -> {
							// Desequipar objeto
							personajeActivo.desequiparObjeto();
						}
						case 9 -> {
							// Salir del inventario
							dentroInventario = false;
							limpiarPantalla();
							break;
						}
						default -> {
							// Opción inválida
							limpiarPantalla();
							System.out.println("Opción inválida. Prueba otra vez.");
						}
					}
				}
			} else if (opcionContinuar == 3) {
				// Tienda
				entrarTienda(tendera, personajeActivo, sc);
			} else if (opcionContinuar == 4) {
				// Menú
				boolean dentroMenu = true;
				while (dentroMenu) {
					personajeActivo.menu();
					int opcionMenu = 0;
					while (true) {
						try {
							opcionMenu = sc.nextInt();
							if (opcionMenu >= 1 && opcionMenu <= 7) {
								break;
							} else {
								limpiarPantalla();
								System.out.println("Opción inválida. Introduce una opción válida.");
								personajeActivo.menu();
							}
						} catch (InputMismatchException e) {
							limpiarPantalla();
							sc.nextLine();
							System.out.println("Opción inválida. Introduce un número.");
							personajeActivo.menu();
						}
					}
					switch (opcionMenu) {
						case 1 -> {
							limpiarPantalla();
							dentroMenu = false;
						}
						case 2 -> {
							// Ataques
							limpiarPantalla();
							personajeActivo.infoAtaquesMenu();
							int opcionInfoAtaque = 0;
							try {
								opcionInfoAtaque = sc.nextInt();
								switch (opcionInfoAtaque) {
									case 1 -> {
										// Ataque 1
										limpiarPantalla();
										personajeActivo.infoAtaque1();
										System.out.println("Pulsa enter para continuar...");
										sc.nextLine();
										sc.nextLine();
										limpiarPantalla();
									}
									case 2 -> {
										// Ataque 2
										limpiarPantalla();
										personajeActivo.infoAtaque2();
										System.out.println("Pulsa enter para continuar...");
										sc.nextLine();
										sc.nextLine();
										limpiarPantalla();
									}
									case 3 -> {
										// Ataque 3
										limpiarPantalla();
										personajeActivo.infoAtaque3();
										System.out.println("Pulsa enter para continuar...");
										sc.nextLine();
										sc.nextLine();
										limpiarPantalla();
									}
									default -> {System.out.println("Opción no válida.");limpiarPantalla();}
								}
							} catch (Exception e) {
								limpiarPantalla();
								sc.nextLine();
							}
						}
						case 3 -> {
							// Estadísticas
							limpiarPantalla();
							personajeActivo.estadísticas();
							System.out.println("Pulsa enter para continuar...");
							sc.nextLine();
							sc.nextLine();
							limpiarPantalla();
						}
						case 4 -> {
							// Tienda
							limpiarPantalla();
							entrarTienda(tendera, personajeActivo, sc);
						}
						case 5 -> {
							// Descansar
							limpiarPantalla();
							personajeActivo.descansar(sc);
						}
						case 6 -> {
							// Casino
							tendera.entrarCasino(personajeActivo,sc);
						}
						case 7 -> {
							// Salir del juego
							salirJuego();
						}
						default -> {
							// Opción inválida
							System.out.println("Opción inválida. Prueba otra vez.");
						}
					}
				}
			}
		}
	}
}

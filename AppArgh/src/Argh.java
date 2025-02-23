import Enemigo.*;
import Enemigo.EnemigoMarino.*;
import Personaje.*;
import Producto.Producto;
import Tendera.Tendera;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Argh {

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

	public static void suspense(){
		esperar(2);
		System.out.print(".");
		esperar(2);
		System.out.print(".");
		esperar(2);
		System.out.print(".");
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
					if (randomRol <= 33) {
						System.out.println("║  ¡Tu rol seleccionado es CUBIERTA!   ║");
						rolSeleccionado = "Cubierta";
					} else if (randomRol <= 66) {
						System.out.println("║  ¡Tu rol seleccionado es COCINERO!   ║");
						rolSeleccionado = "Cocinero";
					} else {
						System.out.println("║  ¡Tu rol seleccionado es ARTILLERO!  ║");
						rolSeleccionado = "Artillería";
					}
					System.out.println("╚══════════════════════════════════════╝");
					Personaje grumete = new PersonajeGrumete(nombre, genero, 100, 20, 20, 20, 20, 20, 0, 1, 0, 3, 0, 0, false, inventario, null, false, false, false, rolSeleccionado);
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
					Personaje capitán = new PersonajeCapitan(nombre, genero, 100, 20, 20, 20, 20, 20, 0, 1, 10000000, 3, 0, 0, false, inventario, null, false, false, false);
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
				System.out.println("¡Tu aventura va a comenzar!");
				esperar(4);
				// String[] comienzo = new String[3];
				if(personajeActivo instanceof PersonajeCapitan){
					System.out.println("Es un placerte tenerte con nosotros, capitán "+personajeActivo.getNombre()+".");
					System.out.println("Su barco se está aproximando a las Tierras desconocidas...");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					limpiarPantalla();
					System.out.println("Capitán, llega un aviso del mástil mayor que se atisba una isla en el horizonte.");
					System.out.println("Vamos a desplegar a la tripulación para defender el barco... tengo un mal presentimiento...");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					limpiarPantalla();
					System.out.println("Da la órden de proteger el barco (debes gritar, si no no te escucharán): ");
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
							System.out.println("No le han escuchado, capitán. ¡Tiene que GRITAAAAAAAAAAAAAAAR MUUUUUUCHOOOOOO!");
							esperar(3);
							limpiarPantalla();
							System.out.println("Da la órden de proteger el barco (debes gritar, si no, no te escucharán): ");
							aviso = sc.nextLine();
						}
					}
					System.out.println("El grito del capitán es tan potente que hace brincar a los peces del agua.");
					System.out.println("La tripulación se pone en alerta y preparan las defensas del barco...");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					limpiarPantalla();
					System.out.println("Hay una calma de repente el el horizonte");
					suspense();
					limpiarPantalla();
					esperar(2);
					Enemigo[] listaEnemigosMarinos = { 
						new EnemigoMarinoComun(100, 20, 20, 20, 20, 30, 30, 1, 20, false, 20, "Amonite"),
						new EnemigoMarinoComun(100, 20, 20, 20, 20, 30, 30, 1, 20, false, 20, "Trilobite"),
						new EnemigoMarinoComun(100, 20, 20, 20, 20, 30, 30, 1, 20, false, 20, "Zooplacton")
					};
					Random rand = new Random();
					int indiceAleatorio = rand.nextInt(listaEnemigosMarinos.length); 
					Enemigo e1 = listaEnemigosMarinos[indiceAleatorio];
					Enemigo e2 = listaEnemigosMarinos[indiceAleatorio];
					Enemigo e3 = listaEnemigosMarinos[indiceAleatorio];
					EnemigoMarinoComun enemigoComun = (EnemigoMarinoComun) e1;
    				System.out.println("Capitán, nos atacan un grupo de " + enemigoComun.getEnemigoSeleccionado());
					System.out.println("¡Capitán, prepárese!");
					System.out.println("Pulsa enter para continuar...");
					sc.nextLine();
					limpiarPantalla();
					System.out.println("Vas a entrar en combate, prepárate");
					suspense();
					limpiarPantalla();
					System.out.println("Antes de nada te recomiendo que veas la información de tus ataques.");
					System.out.println("¿Quieres ver tus ataques? S/N");
					String respuestaAyudaAtaque = sc.next();
					suspense();
					limpiarPantalla();
					if(respuestaAyudaAtaque.equals("S")){
						personajeActivo.infoAtaque1();
						System.out.println();
						personajeActivo.infoAtaque2();
						System.out.println();
						personajeActivo.infoAtaque3();
						System.out.println();
						System.out.println("Pulsa enter para continuar: ");
						sc.nextLine();
						limpiarPantalla();
					}
					while (true) { 
												
					}
					
				}else{

				}
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
									default -> {System.out.println("Opción no válida.");}
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

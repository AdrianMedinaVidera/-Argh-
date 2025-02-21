import java.util.InputMismatchException;
import java.util.Scanner;

import Personaje.*;
import Producto.Producto;
import Tendera.Tendera;

public class Argh {

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
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

	public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000); // Convierte de segundos a milisegundos.
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido un error al esperar.");
        }
    }

	public static void salirJuego () {
		System.out.println("¡Gracias por jugar!");
		System.out.println("¡Hasta la próxima!");
		System.out.println("(Espera mientras se cierra el juego...)");
		esperar(3);
		limpiarPantalla();
		System.exit(0);
	}

	public static void entrarTienda (Tendera tendera, Personaje personajeActivo, Scanner sc) {
		boolean dentroTienda = true;
		while (dentroTienda) {
			tendera.menuCompra(personajeActivo);
			int opcionCompra = sc.nextInt();
			switch (opcionCompra) {
				case 1 -> 
				{
					personajeActivo.procesarCompra(minipocion, personajeActivo.getInventario());
					esperar(3);
					limpiarPantalla();
				}
				case 21 -> {dentroTienda = false;limpiarPantalla();}
				default -> {dentroTienda = false;limpiarPantalla();}
			}
		}
	}

	public static void menuInicial () {
		System.out.println(" ");
		System.out.println("+------------ARGH------------+");
		System.out.println("|      Bienvenido a Argh     |");
		System.out.println("|      1. Jugar              |");
		System.out.println("|      2. Salir              |");
		System.out.println("|      3. Cómo Jugar         |");
		System.out.println("+----------------------------+");
	}

	public static void menuDificultad () {
		System.out.println("+--------------ARGH--------------+");
		System.out.println("|      Escoge la dificultad      |");
		System.out.println("|      1. Normal                 |");
		System.out.println("|      2. Extremo                |");
		System.out.println("+--------------------------------+");
	}

	public static void menuComoJugar () {
		System.out.println("+------------------------ARGH------------------------+");
		System.out.println("");
		System.out.println("+----------------------------------------------------+");
	}

	public static void menuContinuar () {
		System.out.println("+--------------ARGH--------------+");
		System.out.println("|      1. Continuar              |");
		System.out.println("|      2. Inventario             |");
		System.out.println("|      3. Tienda                 |");
		System.out.println("|      4. Menú                   |");
		System.out.println("+--------------------------------+");
	}

	public static void menuInventario (Personaje personaje) {
		System.out.println("+--------------ARGH--------------+");
		System.out.println("      Objetos a equipar          ");
		System.out.println("1. " + personaje.getInventario()[0] + " ");
		System.out.println("2. " + personaje.getInventario()[0] + " ");
		System.out.println("3. " + personaje.getInventario()[0] + " ");
		System.out.println("4. " + personaje.getInventario()[0] + " ");
		System.out.println("5. " + personaje.getInventario()[0] + " ");
		System.out.println("6. " + personaje.getInventario()[0] + " ");
		System.out.println("7. " + personaje.getInventario()[0] + " ");
		System.out.println("      8. Salir                        ");
		System.out.println("+--------------------------------+");

	}
	public static void main(String[] args) {
		
		Tendera tendera = new Tendera(null, false);

		// Creación de todos los objetos del juego.        

		Personaje personajeActivo = null;
		Producto[] inventario = new Producto[7]; // Inventario del jugador
		Scanner sc = new Scanner(System.in);
		while (true) { // Bucle de menú inicial
			menuInicial();
			int opcionInical = 0;
			try {
				opcionInical = sc.nextInt();
			} catch (InputMismatchException e) {
				limpiarPantalla();
				sc.nextLine(); // Clear invalid input
				System.out.println("Opción inválida. Introduce un número.");
				menuInicial();
			}
			limpiarPantalla();
			if (opcionInical == 1) {
				// Inicio del juego
				System.out.println("¿Cuál es tu género?");
				String genero = sc.next().toLowerCase();
				limpiarPantalla();
				System.out.println("¿Cómo te llamas?");
				String nombre = sc.next();
				limpiarPantalla();
				menuDificultad();
				int opcionDificultad = 0;
				while (true) {
					try {
						opcionDificultad = sc.nextInt();
						if (opcionDificultad == 1 || opcionDificultad == 2) {
							break;
						} else {
							limpiarPantalla();
							System.out.println("Opción incorrecta. Introduce una opción válida.");
							menuDificultad();
						}
					} catch (InputMismatchException e) {
						sc.nextLine(); // Limpia la opción anterior.
						limpiarPantalla();
						System.out.println("Opción inválida. Introduce un número.");
						menuDificultad();
					}
				}
				if (opcionDificultad == 1) {
					// Dificultad normal
					System.out.println("");
					System.out.println("Dificultad normal");
					System.out.println("¡" + nombre + " eres un grumete!");
					int randomRol = (int) (Math.random() * 100); // Número aleatorio para seleccionar rol
					int opcionRol;
					String rolSeleccionado;
					if (randomRol <= 33) {
						opcionRol = 0; // Rol de cubierta
						System.out.println("¡Tu rol seleccionado ha sido el de cubierta!");
						rolSeleccionado = "Cubierta";
					} else if (randomRol <= 66) {
						opcionRol = 1; // Rol de cocinero
						rolSeleccionado = "Cocinero";
						System.out.println("¡Tu rol seleccionado ha sido el de cocinero!");
					} else {
						opcionRol = 2; // Rol de Artillería
						System.out.println("¡Tu rol seleccionado ha sido el de artillero!");
						rolSeleccionado = "Artillería";
					}
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
					System.out.println("Dificultad extrema");
					System.out.println("¡Eres el capitán!");
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
		
		while (true) {
			menuContinuar();
			int opcionContinuar = sc.nextInt();
			limpiarPantalla();
			if (opcionContinuar == 1) {
				// Continuar
			} else if (opcionContinuar == 2) {
				// Inventario
				boolean dentroInventario = true;
				while (dentroInventario) {
					menuInventario(personajeActivo);
					int opcionInventario = sc.nextInt();
					switch (opcionInventario) {
						case 1 -> {
							// Equipar objeto
						}
						case 8 -> {
							// Salir del inventario
							dentroInventario = false;
							limpiarPantalla();
							break;
						}
						default -> {
							// Opción inválida
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
					int opcionMenu = sc.nextInt();
					switch (opcionMenu) {
						case 1 -> {
							dentroMenu = false;
						}
						case 5 -> {
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
			sc.close();
		}
	}
}

import java.util.Scanner;

import Personaje.*;
import Producto.Producto;

public class Argh {

	public static void menuInicial () {
		System.out.println(" ");
		System.out.println("+ ------------ARGH------------+");
		System.out.println("|      Bienvenido a Argh      |");
		System.out.println("|      1. Jugar               |");
		System.out.println("|      2. Salir               |");
		System.out.println("|      3. Cómo Jugar          |");
		System.out.println("+ ----------------------------+");
	}

	public static void menuDificultad () {
		System.out.println("+ --------------ARGH--------------+");
		System.out.println("|      Escoge la dificultad       |");
		System.out.println("|      1. Normal                  |");
		System.out.println("|      2. Extremo                 |");
		System.out.println("+ --------------------------------+");
	}
	public static void main(String[] args) {
		Producto[] inventario = new Producto[7]; // Inventario del jugador
		//Producto objetoEquipado = new Producto("Pocion", 20, 2);
		// Creación de todos los objetos del juego.
		Producto minipocion = new Producto("Minipoción", 20, 0);
		Producto pocion = new Producto("Poción", 30, 0);
		Producto superpocion = new Producto("Superpoción", 60, 0);
		
		Producto baculo = new Producto("Báculo", 15, 0);
		Producto espada = new Producto("Espada", 30, 0);
		Producto mandoble = new Producto("Mandoble", 120, 0);
		
		Producto varitaMadera = new Producto("Varita Madera", 15, 0);
		Producto varitaPlastico = new Producto("Varita Plástico", 30, 0);
		Producto varitaOro = new Producto("Varita Oro", 120, 0);
		
		Producto escudito = new Producto("Escudito", 15, 0);
		Producto escudo = new Producto("Escudo", 30, 0);
		Producto escudazo = new Producto("Escudazo", 120, 0);
		
		Producto capita = new Producto("Capita", 15, 0);
		Producto capa = new Producto("Capa", 30, 0);
		Producto capaza = new Producto("Capaza", 120, 0);
		
		Producto alas = new Producto("Alas", 30, 0);
		Producto pedo = new Producto("Pedo", 30, 0);
		Producto objetoMisterioso = new Producto("???", 50, 0);
		Producto redbull = new Producto("Redbull", 10, 0);
		Producto caramelo = new Producto("Caramelo", 70, 0);
        


		Scanner sc = new Scanner(System.in);
		while (true) {
			menuInicial();
			int opcionInical = sc.nextInt();
			if (opcionInical == 1) {
				// Inicio del juego
				System.out.println("¿Cuál es tu género?");
				String genero = sc.next();
				System.out.println("¿Cómo te llamas?");
				String nombre = sc.next();
				menuDificultad();
				int opcionDificultad = sc.nextInt();
				if (opcionDificultad == 1) {
					// Dificultad normal
					System.out.println("Dificultad normal");
					System.out.println("¡Eres un grumete!");
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
					System.out.println("¡BUENA SUERTE PIRATA!");
					Personaje grumete = new PersonajeGrumete(genero, 100, 20, 20, 20, 20, 20, 0, 1, 0, 3, 0, 0, false, inventario, null, false, false, false, rolSeleccionado);
					break;
				} else if (opcionDificultad == 2) {
					// Dificultad extrema
					System.out.println("Dificultad extrema");
					System.out.println("¡Eres el capitán!");
					Personaje capitán = new PersonajeCapitan(genero, 100, 20, 20, 20, 20, 20, 0, 1, 0, 3, 0, 0, false, inventario, null, false, false, false);
					break;
				} else {
					// Opción inválida
					System.out.println("Opción inválida");
				}
			} else if (opcionInical == 2) {
				// Salir del juego	
				System.out.println("Gracias por jugar");
			} else if (opcionInical == 3) {
				// Cómo jugar
				System.out.println("Cómo jugar");
			} else {
				// Opción inválida
				System.out.println("Opción inválida");
			}
		}
		
		
		
	}
}

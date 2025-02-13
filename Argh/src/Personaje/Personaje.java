package Personaje;
import java.util.Scanner;

import Enemigo.Enemigo;
import Producto.Producto;

public abstract class Personaje {
	    protected String genero; //Género a elegir por el jugador
	    protected int vida; // Vida que se usará en combate
	    protected int dañoFisico; // Tipo de daño, que es resistido por la resistencia física
	    protected int dañoMagico; // Tipo de daño, que es resistido por la resistencia mágica
	    protected int resistenciaFisica; // Tipo de resistencia, que resiste el daño físico
	    protected int resistenciaMagica; // Tipo de resistencia, que resiste el daño mágico
	    protected int velocidad; // Velocidad del personaje, es usado en la batalla para saber el orden de los turnos |
	    protected int experiencia = 0; // Experiencia que aumenta y sirve para subir de nivel
	    protected int nivel = 0; // Nivel del personaje, según el nivel, más fuerte se hace.
	    protected int monedas = 0; // El dinero que tiene el jugador para poder comprar en la tienda
	    protected int grumetesRestantes; // La cantidad de oportunidades (vidas) restantes que le queda al jugador
	    protected int islasConquistadas = 0; // El número de islas conquistadas (ha vencido al jefe)
	    protected int enemigosDerrotados = 0; // Número de enemigos comunes derrotados (estadística)
	    protected boolean estaEnCombate = false; // Cuando entra en combate, este atributo empieza a valer "true"

	    protected Producto[] inventario = new Producto[5]; //Es un inventario con una cantidad de objetos limitada (5)
	    protected Producto objetoEquipado; // Objeto que puede equiparse el jugador para obtener beneficios
	    
		//Constructor de Personaje
	    public Personaje(String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
				int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
				int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
				Producto objetoEquipado) 
	    {
			super();
			this.genero = genero;
			this.vida = vida;
			this.dañoFisico = dañoFisico;
			this.dañoMagico = dañoMagico;
			this.resistenciaFisica = resistenciaFisica;
			this.resistenciaMagica = resistenciaMagica;
			this.velocidad = velocidad;
			this.experiencia = experiencia;
			this.nivel = nivel;
			this.monedas = monedas;
			this.grumetesRestantes = grumetesRestantes;
			this.islasConquistadas = islasConquistadas;
			this.enemigosDerrotados = enemigosDerrotados;
			this.estaEnCombate = estaEnCombate;
			this.inventario = inventario;
			this.objetoEquipado = objetoEquipado;
	    }
	    
	    // Getters y Setters de Personaje ---------------------------------------------------------------------------

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getVida() {
			return vida;
		}

		public void setVida(int vida) {
			this.vida = vida;
		}

		public int getDañoFisico() {
			return dañoFisico;
		}

		public void setDañoFisico(int dañoFisico) {
			this.dañoFisico = dañoFisico;
		}

		public int getDañoMagico() {
			return dañoMagico;
		}

		public void setDañoMagico(int dañoMagico) {
			this.dañoMagico = dañoMagico;
		}

		public int getResistenciaFisica() {
			return resistenciaFisica;
		}

		public void setResistenciaFisica(int resistenciaFisica) {
			this.resistenciaFisica = resistenciaFisica;
		}

		public int getResistenciaMagica() {
			return resistenciaMagica;
		}

		public void setResistenciaMagica(int resistenciaMagica) {
			this.resistenciaMagica = resistenciaMagica;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getExperiencia() {
			return experiencia;
		}

		public void setExperiencia(int experiencia) {
			this.experiencia = experiencia;
		}

		public int getNivel() {
			return nivel;
		}

		public void setNivel(int nivel) {
			this.nivel = nivel;
		}

		public int getMonedas() {
			return monedas;
		}

		public void setMonedas(int monedas) {
			this.monedas = monedas;
		}

		public int getGrumetesRestantes() {
			return grumetesRestantes;
		}

		public void setGrumetesRestantes(int grumetesRestantes) {
			this.grumetesRestantes = grumetesRestantes;
		}

		public int getIslasConquistadas() {
			return islasConquistadas;
		}

		public void setIslasConquistadas(int islasConquistadas) {
			this.islasConquistadas = islasConquistadas;
		}

		public int getEnemigosDerrotados() {
			return enemigosDerrotados;
		}

		public void setEnemigosDerrotados(int enemigosDerrotados) {
			this.enemigosDerrotados = enemigosDerrotados;
		}

		public boolean isEstaEnCombate() {
			return estaEnCombate;
		}

		public void setEstaEnCombate(boolean estaEnCombate) {
			this.estaEnCombate = estaEnCombate;
		}

		public Producto[] getInventario() {
			return inventario;
		}

		public void setInventario(Producto[] inventario) {
			this.inventario = inventario;
		}

		public Producto getObjetoEquipado() {
			return objetoEquipado;
		}

		public void setObjetoEquipado(Producto objetoEquipado) {
			this.objetoEquipado = objetoEquipado;
		}
	    
	    // Fin de Getters y Setters de Personaje --------------------------------------------------------------------
	    
		// Métodos de Personaje
		
		public void estadística() {
			System.out.println("+ ------------------------------------ +");
			System.out.println("Estadísticas del jugador:");
			System.out.println("");
			System.out.println(" Vida: " + vida);
			System.out.println(" Daño Físico:" + dañoFisico);
			System.out.println(" Daño Mágico:" + dañoMagico);
			System.out.println(" Resistencia Física: " + resistenciaFisica);
			System.out.println(" Resistencia Mágica: " + resistenciaMagica);
			System.out.println(" Velocidad: " + velocidad);
			System.out.println(" Nivel: " + nivel);
			System.out.println(" Experiencia: " + experiencia + " / 100 " + "(" + (100 - experiencia) + " más necesaria para subir de nivel)");
			System.out.println(" Monedas: " + monedas);
			System.out.println(" Inventario: " + inventario.toString());
			System.out.println(" Objeto Equipado: " + objetoEquipado);
			System.out.println("+ ------------------------------------ +");
		}
		
		public abstract void infoAtaques ();
		public abstract void ataque1 ();
		public abstract void ataque2 ();
		public abstract void ataque3 ();
		
		public void mostrarInfoCombate() {
			System.out.println("+ ------------------------------------ +");
			System.out.println("Estadísticas del jugador:");
			System.out.println("");
			System.out.println(" Vida: " + vida);
			System.out.println(" Daño Físico:" + dañoFisico);
			System.out.println(" Daño Mágico:" + dañoMagico);
			System.out.println(" Resistencia Física: " + resistenciaFisica);
			System.out.println(" Resistencia Mágica: " + resistenciaMagica);
			System.out.println(" Velocidad: " + velocidad);
			System.out.println(" Nivel: " + nivel);
			System.out.println(" Experiencia: " + experiencia + " / 100 " + "(" + (100 - experiencia) + " más necesaria para subir de nivel)");
			System.out.println(" Objeto Equipado: " + objetoEquipado);
			System.out.println("+ ------------------------------------ +");
		}
	    
		public void menuCombate () {
			System.out.println("1 - Atacar: 				2 - Inventario: ");
			System.out.println("3 - Estadísticas: 			4 - Huir: ");
		}
		
		public void usarObjeto(Producto objeto) {
			System.out.println("Se va a usar el objeto " + objeto);
			System.out.println("¿Está seguro? (S/N)");
			Scanner sc = new Scanner(System.in);
			String opcion = sc.nextLine().toLowerCase();
			if (opcion.equals("s")) {
				System.out.println("El objeto se ha utilizado correctamente.");
			} else {System.out.println("No se ha usado el objeto.");}
			
			// Para cada tipo de objeto un caso diferente ------
			sc.close();
		}
		
		public void procesarCompra(Producto producto, Producto inventario[]) {
			if (monedas < producto.getPrecio()) {
				System.out.println("Lo sentimos, no tiene suficientes monedas para realizar la compra.");
			} else {
				System.out.println("Se ha realizado la compra correctamente.");
				monedas -= producto.getPrecio();
				for (int i = 0; i < inventario.length; i++) {
					if (inventario[i] != null) {
						inventario[i] = producto;
						System.out.println("Su nuevo balance es de " + monedas + " monedas.");
						break;
					} else {
						System.out.println("No tiene espacio en el inventario.");
						monedas += producto.getPrecio();
						// Añadir el menú de compra.
					}
				}
			}
		}
		
		public void menu () {
			System.out.println("1 - Continuar");
			System.out.println("2 - Ataques");
			System.out.println("3 - Estadísticas");
			System.out.println("4 - Tienda");
			System.out.println("5 - Salir");
		}
		
		public void huir (Enemigo enemigo) {
			System.out.println("¿Está seguro de que quiere huir del combate? (S/N) :P");
			Scanner sc = new Scanner(System.in);
			String opcion = sc.nextLine().toLowerCase();
			if (opcion.equals("s")) {
				if (velocidad < enemigo.getVelocidad()) {
					
				}
			}
			sc.close();
		}

}

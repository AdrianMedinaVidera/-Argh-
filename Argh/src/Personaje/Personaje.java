package Personaje;
import Producto.Producto;

public abstract class Personaje {
	    private String genero;
	    private int vida;
	    private int dañoFisico;
	    private int dañoMagico;
	    private int resistenciaFisica;
	    private int resistenciaMagica;
	    private int velocidad;
	    private int experiencia = 0;
	    private int nivel = 0;
	    private int monedas = 0;
	    private int grumetesRestantes;
	    private int islasConquistadas = 0;
	    private int enemigosDerrotados = 0;
	    private boolean estaEnCombate = false;

	    private Producto[] inventario = new Producto[10];
	    private Producto objetoEquipado;
		//Constructor de Personaje
	    public Personaje(String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
				int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
				int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
				Producto objetoEquipado) {
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
			System.out.println("GAAAAA");
		}

	    
}

package Enemigo;

import Personaje.Personaje;
import Producto.Producto;

abstract public class Enemigo {

	protected int vida;
	protected int dañoFisico;
	protected int dañoMagico;
	protected int resistenciaMagica;
	protected int resistenciaFisica;
	protected int velocidad;
	protected int experienciaData;
	protected int dineroDado;
	protected int nivel;
	protected Producto objetoEquipado;
	protected boolean estaSomnoliento = false;
	protected boolean estaSangrando = false;

	public Enemigo(int vida, int dañoMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
			int experienciaData, int dineroDado, int nivel, int dañoFisico, boolean estaSangrando) {
		this.dañoFisico = dañoFisico;
		this.vida = vida;
		this.dañoMagico = dañoMagico;
		this.resistenciaMagica = resistenciaMagica;
		this.resistenciaFisica = resistenciaFisica;
		this.velocidad = velocidad;
		this.experienciaData = experienciaData;
		this.dineroDado = dineroDado;
		this.nivel = nivel;
		this.estaSangrando = estaSangrando;
	}

	public void mostrarInfo() {
		System.out.println("Vida del enemigo: " + vida);
		System.out.println("Daño fisico del enemigo: " + dañoFisico);
		System.out.println("Daño magico del enemigo: " + dañoMagico);
		System.out.println("Resistencia magica del enemigo: " + resistenciaMagica);
		System.out.println("Resistencia fisica del enemigo: " + resistenciaFisica);
		System.out.println("Velocidad del enemigo: " + velocidad);
		System.out.println("Experiencia del enemigo: " + experienciaData);
		System.out.println("Dinero del enemigo: " + dineroDado);
		System.out.println("Nivel del enemigo: " + nivel);
	}

	abstract public void ataque1(Personaje personaje);
	abstract public void ataque2(Personaje personaje);
	abstract public void ataque3(Personaje personaje);

	@Override
	public String toString() {
		return "Enemigo [vida=" + vida + ", dañoMagico=" + dañoMagico + ", dañoFisico=" + dañoFisico
				+ ", resistenciaMagica=" + resistenciaMagica
				+ ", resistenciaFisica=" + resistenciaFisica + ", velocidad=" + velocidad + ", experienciaData="
				+ experienciaData + ", dineroDado=" + dineroDado + ", nivel=" + nivel + "]";
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getdañoFisico() {
		return dañoFisico;
	}

	public int getdañoMagico() {
		return dañoMagico;
	}

	public void setdañoFisico(int dañoFisico) {
		this.dañoFisico = dañoFisico;
	}

	public void setdañoMagico(int dañoMagico) {
		this.dañoMagico = dañoMagico;
	}

	public int getResistenciaMagica() {
		return resistenciaMagica;
	}

	public void setResistenciaMagica(int resistenciaMagica) {
		this.resistenciaMagica = resistenciaMagica;
	}

	public int getResistenciaFisica() {
		return resistenciaFisica;
	}

	public void setResistenciaFisica(int resistenciaFisica) {
		this.resistenciaFisica = resistenciaFisica;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperienciaData() {
		return experienciaData;
	}

	public void setExperienciaData(int experienciaData) {
		this.experienciaData = experienciaData;
	}

	public int getDineroDado() {
		return dineroDado;
	}

	public void setDineroDado(int dineroDado) {
		this.dineroDado = dineroDado;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean getEstaSangrando() {
		return estaSangrando;
	}

	public void setEstaSangrando(boolean estaSangrando) {
		this.estaSangrando = estaSangrando;
	}

	public Producto getObjetoEquipado() {
		return objetoEquipado;
	}

	public void setObjetoEquipado(Producto objetoEquipado) {
		this.objetoEquipado = objetoEquipado;
	}

	public boolean getEstaSomnoliento() {
		return estaSomnoliento;
	}

	public void setEstaSomnoliento(boolean estaSomnoliento) {
		this.estaSomnoliento = estaSomnoliento;
	}

	public void usarObjeto(Producto objeto) {
		System.out.println("El enemigo ha usado el objeto: " + objeto.getNombre());

		// Para cada tipo de objeto un caso diferente ------
		switch (objeto.getNombre()) {
			case "Minipocion" -> {
				vida += 20;
			}
			case "Pocion" -> {
				vida += 60;
			}
			case "Superpocion" -> {
				vida += 120;
			}

			case "Baculo" -> {
				dañoFisico += 20;
			}

			case "Espada" -> {
				dañoFisico += 50;
			}

			case "Mandoble" -> {
				dañoFisico += 100;
			}

			case "Varita Madera" -> {
				dañoMagico += 20;
			}

			case "Varita Plastico" -> {
				dañoMagico += 50;
			}

			case "Varita Oro" -> {
				dañoMagico += 100;
			}

			case "Escudito" -> {
				resistenciaFisica += 20;
			}

			case "Escudo" -> {
				resistenciaFisica += 40;
			}

			case "Escudazo" -> {
				resistenciaFisica += 100;
			}

			case "Capita" -> {
				resistenciaMagica += 20;
			}

			case "Capa" -> {
				resistenciaMagica += 40;
			}

			case "Capaza" -> {
				resistenciaFisica += 100;
			}

			case "Alas" -> {
				velocidad += velocidad * 0.2;
			}

			case "Redbull" -> {
				estaSomnoliento = false;
			}
		}
	}

}
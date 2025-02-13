package Enemigo;


abstract public class Enemigo {
	
	protected int vida;
	protected int danioMagico; 
	protected int resistenciaMagica;
	protected int resistenciaFisica; 
	protected int velocidad;
	protected int experienciaData;
	protected int dineroDado;
	protected int nivel;
	
	public Enemigo(int vida, int danioMagico, int resistenciaMagica, int resistenciaFisica, int velocidad,
		int experienciaData, int dineroDado, int nivel) {
		this.vida = vida;
		this.danioMagico = danioMagico;
		this.resistenciaMagica = resistenciaMagica;
		this.resistenciaFisica = resistenciaFisica;
		this.velocidad = velocidad;
		this.experienciaData = experienciaData;
		this.dineroDado = dineroDado;
		this.nivel = nivel;
	}

	
	public void mostrarInfo() {
		System.out.println("Vida del enemigo: "+vida);
		System.out.println("Daño mágico del enemigo: "+danioMagico);
		System.out.println("Resistencia mágica del enemigo: "+resistenciaMagica);
		System.out.println("Resistencia física del enemigo: "+resistenciaFisica);
		System.out.println("Velocidad del enemigo: "+velocidad);
		System.out.println("Experiencia del enemigo: "+experienciaData);
		System.out.println("Dinero del enemigo: "+dineroDado);
		System.out.println("Nivel del enemigo: "+nivel);
		}
	
	abstract public int ataque1();
	abstract public int ataque2();
	abstract public int ataque3();
	abstract public Producto usarObjeto();
	
	@Override
	public String toString() {
		return "Enemigo [vida=" + vida + ", danioMagico=" + danioMagico + ", resistenciaMagica=" + resistenciaMagica
				+ ", resistenciaFisica=" + resistenciaFisica + ", velocidad=" + velocidad + ", experienciaData="
				+ experienciaData + ", dineroDado=" + dineroDado + ", nivel=" + nivel + "]";
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getDanioMagico() {
		return danioMagico;
	}


	public void setDanioMagico(int danioMagico) {
		this.danioMagico = danioMagico;
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

	public void usarObjeto(Producto objeto) {
		System.out.println("Se va a usar el objeto " + objeto);
	}
	
	
	
}

	
	
	


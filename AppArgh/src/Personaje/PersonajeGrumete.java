package Personaje;

import Enemigo.Enemigo;
import Producto.Producto;

public class PersonajeGrumete extends Personaje{
	private String[] rol = {"Cubierta","Cocinero","Artillería"};
	private String rolSeleccionado;

	public PersonajeGrumete(String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
			int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
			int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
			Producto objetoEquipado, boolean pedoActivado, boolean estaSomnoliento, boolean estaSangrando,
			String[] rol) {
		super(genero, vida, dañoFisico, dañoMagico, resistenciaFisica, resistenciaMagica, velocidad, experiencia, nivel,
				monedas, grumetesRestantes, islasConquistadas, enemigosDerrotados, estaEnCombate, inventario,
				objetoEquipado, pedoActivado, estaSomnoliento, estaSangrando);
		this.rol = rol;
	}

	@Override
	public void infoAtaquesMenu() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			
			System.out.println("+ ------------------------------ +");
			System.out.println("| 	  Información de ataques   |");
			System.out.println("| 1 - Barrido Arcano			   |");
			System.out.println("| 2 - Vendaval Ascendente		   |");
			System.out.println("| 3 - Disparo Certero			   |");
			System.out.println("+ ------------------------------ +");
			
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			
			System.out.println("+ ------------------------------ +");
			System.out.println("| 	  Información de ataques   |");
			System.out.println("| 1 - Meteoro Cheddar			   |");
			System.out.println("| 2 - Caldo de los condenados	   |");
			System.out.println("| 3 - Hongo explosivo			   |");
			System.out.println("+ ------------------------------ +");
			
		} else {
			
			System.out.println("+ ------------------------------ +");
			System.out.println("| 	  Información de ataques   |");
			System.out.println("| 1 - Lanzamiento de barril	   |");
			System.out.println("| 2 - Carga de ancla			   |");
			System.out.println("| 3 - Embestida blindada		   |");
			System.out.println("+ ------------------------------ +");
			
		}
		
	}
	// Información de los ataques --------------------------------------------------------------------------------------
	@Override
	public void infoAtaque1() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			System.out.println("Barrido Arcano: Las cerdas de la escoba se juntan en un mismo punto para lanzar una bola de energía que inflige 80 de daño mágico al enemigo.");
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			System.out.println("Meteoro Cheddar: Comienza una tormenta de bolas de cheddar que actuan como un meteorito y realizan 60 de daño mágico y reducen la velocidad del enemigo un 20%");
		} else {		
			System.out.println("Lanzamiento de barril: Lanza un barril lleno de pólvora que explota al impactar, infligiendo 100 de daño físico al enemigo y reduciendo tu resistencia física un 10%");
		}
	}

	@Override
	public void infoAtaque2() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			System.out.println("Vendaval Ascendente: Generas un vendaval que iza las velas del barco, proporcionándote un aumento de velocidad dependiendo de tu daño mágico.");
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			System.out.println("Caldo de los condenados: Lanzas una olla de agua con las almas de los difuntos, dejando somnoliento al enemigo y reduciendo su resistencia mágica un 20%");
		} else {		
			System.out.println("Carga de ancla: Cargas un ancla a tu espalda, aumentando tu daño y resistencia física en 20% pero reduciendo tu velocidad un 5%");
		}
	}

	@Override
	public void infoAtaque3() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			System.out.println("Disparo Certero: Realizas un disparo a través de tu catalejo, infligiendo 50 de daño físico. Este ataque siempre es crítico.");
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			System.out.println("Hongo explosivo: Lanzas un hongo explosivo que realiza 20 de daño mágico, envenena al enemigo, restándole un 5% de vida cada turno y reduce su resistencia mágica un 10%");
		} else {		
			System.out.println("Embestida Blindada: Cargas hacia el enemigo con una pieza de artillería, realizándole 65 de daño físico y aumentando tu resistencia física un 20%");
		}
	}
	// Fin información de los ataques ----------------------------------------------------------------------------------
	
	// Declaración de los ataques --------------------------------------------------------------------------------------
	@Override
    public void ataque1(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("El grumete ha usado el ataque Barrido Arcano");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 80));
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("El grumete ha usado el ataque Meteoro Cheddar");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 60));
            enemigo.setVelocidad((int)(enemigo.getVelocidad() * 0.8));
            System.out.println("El enemigo ha disminuido su velocidad ↓");
        } else {        
            System.out.println("El grumete ha usado el ataque Lanzamiento de Barril");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 100));
            resistenciaFisica = (int)(resistenciaFisica * 0.9);
            System.out.println("El grumete ha disminuido su resistencia física ↓");
        }
    }

    @Override
    public void ataque2(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("El grumete ha usado el ataque Vendaval Ascendente");
            velocidad += dañoMagico * 0.5;
            System.out.println("El grumete ha aumentado su velocidad ↑");
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("El grumete ha usado el ataque Caldo de los condenados");
            enemigo.setEstaSomnoliento(true);
            enemigo.setResistenciaMagica((int)(enemigo.getResistenciaMagica() * 0.8));
            System.out.println("El enemigo ha quedado somnoliento");
            System.out.println("El enemigo ha disminuido su resistencia mágica ↓");
        } else {
            System.out.println("El grumete ha usado el ataque Carga de ancla");
            dañoFisico = (int)(dañoFisico * 1.2);
            resistenciaFisica = (int)(resistenciaFisica * 1.2);
            velocidad = (int)(velocidad * 0.95);
            System.out.println("El grumete ha aumentado su daño físico ↑");
            System.out.println("El grumete ha aumentado su resistencia física ↑");
            System.out.println("El grumete ha disminuido su velocidad ↓");
        }
    }

    @Override
    public void ataque3(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("El grumete ha usado el ataque Disparo Certero");
            enemigo.setVida(enemigo.getVida() - (int)(dañoFisico - enemigo.getResistenciaFisica() + 50));
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("El grumete ha usado el ataque Hongo explosivo");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 20));
            enemigo.setEstaSangrando(true);
            enemigo.setResistenciaMagica((int)(enemigo.getResistenciaMagica() * 0.9));
            System.out.println("El enemigo ha empezado a sangrar");
            System.out.println("El enemigo ha disminuido su resistencia mágica ↓");
        } else {
            System.out.println("El grumete ha usado el ataque Embestida Blindada");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 65));
            resistenciaFisica = (int)(resistenciaFisica * 1.2);
            System.out.println("El grumete ha aumentado su resistencia física ↑");
        }
    }
}
	// Fin declaración de los ataques ----------------------------------------------------------------------------------
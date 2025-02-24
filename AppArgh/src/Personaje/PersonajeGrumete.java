package Personaje;

import Enemigo.Enemigo;
import Producto.Producto;

public class PersonajeGrumete extends Personaje{
	private String rolSeleccionado;
    private boolean contadorCocinero = false;
    private boolean contadorArtillero = false;
    private boolean contadorCubierta = false;

	public PersonajeGrumete(String nombre, String genero, int vida, int dañoFisico, int dañoMagico, int resistenciaFisica,
			int resistenciaMagica, int velocidad, int experiencia, int nivel, int monedas, int grumetesRestantes,
			int islasConquistadas, int enemigosDerrotados, boolean estaEnCombate, Producto[] inventario,
			Producto objetoEquipado, boolean pedoActivado, boolean estaSomnoliento, boolean estaSangrando,
			String rolSeleccionado, boolean contadorCocinero, boolean contadorArtillero, boolean contadorCubierta) {
		super(nombre, genero, vida, dañoFisico, dañoMagico, resistenciaFisica, resistenciaMagica, velocidad, experiencia, nivel,
				monedas, grumetesRestantes, islasConquistadas, enemigosDerrotados, estaEnCombate, inventario,
				objetoEquipado, pedoActivado, estaSomnoliento, estaSangrando);
		this.rolSeleccionado = rolSeleccionado;
		this.contadorCocinero = contadorCocinero;
		this.contadorArtillero = contadorArtillero;
		this.contadorCubierta = contadorCubierta;
	}

	public String getRolSeleccionado() {
		return rolSeleccionado;
	}

	public void setRolSeleccionado(String rolSeleccionado) {
		this.rolSeleccionado = rolSeleccionado;
	}

	public boolean getContadorCocinero() {
		return contadorCocinero;
	}

	public void setContadorCocinero(boolean contadorCocinero) {
		this.contadorCocinero = contadorCocinero;
	}

	public boolean getContadorArtillero() {
		return contadorArtillero;
	}

	public void setContadorArtillero(boolean contadorArtillero) {
		this.contadorArtillero = contadorArtillero;
	}

	public boolean getContadorCubierta() {
		return contadorCubierta;
	}

	public void setContadorCubierta(boolean contadorCubierta) {
		this.contadorCubierta = contadorCubierta;
	}

	@Override
public void infoAtaquesMenu() {
    if (rolSeleccionado.toLowerCase().equals("cubierta")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACION DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Barrido Arcano                 ║");
        System.out.println("║    2. Vendaval Ascendente            ║");
        System.out.println("║    3. Disparo Certero                ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACION DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Meteoro Cheddar                ║");
        System.out.println("║    2. Caldo de los Condenados        ║");
        System.out.println("║    3. Hongo Explosivo                ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║         INFORMACION DE ATAQUES       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Lanzamiento de Barril          ║");
        System.out.println("║    2. Carga de Ancla                 ║");
        System.out.println("║    3. Embestida Blindada             ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}

@Override
public void infoAtaque1() {
    if (rolSeleccionado.toLowerCase().equals("cubierta")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           BARRIDO ARCANO             ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  Las cerdas de la escoba se juntan   ║");
        System.out.println("║  en un mismo punto para lanzar una   ║");
        System.out.println("║  bola de energía.                    ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño mágico: 80                     ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           METEORO CHEDDAR            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  Comienza una tormenta de bolas de   ║");
        System.out.println("║  cheddar que actúan como meteoritos. ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño mágico: 60                     ║");
        System.out.println("║  Efecto: -20% velocidad enemigo      ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║        LANZAMIENTO DE BARRIL         ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  Lanza un barril lleno de pOlvora    ║");
        System.out.println("║  que explota al impactar.            ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño físico: 100                    ║");
        System.out.println("║  Efecto: -10% resistencia propia     ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}

	@Override
	public void infoAtaque2() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║         VENDAVAL ASCENDENTE          ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Generas un vendaval que iza las     ║");
			System.out.println("║  velas del barco.                    ║");
			System.out.println("║                                      ║");
			System.out.println("║  Efecto: +Velocidad según daño       ║");
			System.out.println("║          mágico                      ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║       CALDO DE LOS CONDENADOS        ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Lanzas una olla de agua con las     ║");
			System.out.println("║  almas de los difuntos.              ║");
			System.out.println("║                                      ║");
			System.out.println("║  Efecto: Somnolencia enemigo         ║");
			System.out.println("║          -20% resistencia mágica     ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else {		
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║           CARGA DE ANCLA             ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Cargas un ancla a tu espalda.       ║");
			System.out.println("║                                      ║");
			System.out.println("║  Efecto: +20% daño físico            ║");
			System.out.println("║          +20% resistencia física     ║");
			System.out.println("║          -5% velocidad               ║");
			System.out.println("╚══════════════════════════════════════╝");
		}
	}

	@Override
	public void infoAtaque3() {
		if (rolSeleccionado.toLowerCase().equals("cubierta")) {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║           DISPARO CERTERO            ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Realizas un disparo a través de     ║");
			System.out.println("║  tu catalejo.                        ║");
			System.out.println("║                                      ║");
			System.out.println("║  Daño físico: 50                     ║");
			System.out.println("║  Efecto: Golpe crítico garantizado   ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║          HONGO EXPLOSIVO             ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Lanzas un hongo explosivo al        ║");
			System.out.println("║  enemigo.                            ║");
			System.out.println("║                                      ║");
			System.out.println("║  Daño mágico: 20                     ║");
			System.out.println("║  Efecto: Veneno (5% vida/turno)      ║");
			System.out.println("║          -10% resistencia mágica     ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║         EMBESTIDA BLINDADA           ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Cargas hacia el enemigo con una     ║");
			System.out.println("║  pieza de artillería.                ║");
			System.out.println("║                                      ║");
			System.out.println("║  Daño físico: 65                     ║");
			System.out.println("║  Efecto: +20% resistencia física     ║");
			System.out.println("╚══════════════════════════════════════╝");
		}
	}
	// Fin informaciOn de los ataques ----------------------------------------------------------------------------------
	
	// DeclaraciOn de los ataques --------------------------------------------------------------------------------------
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
	// Fin declaraciOn de los ataques ----------------------------------------------------------------------------------
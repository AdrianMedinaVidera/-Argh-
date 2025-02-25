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
			String rolSeleccionado, boolean contadorCocinero, boolean contadorArtillero, boolean contadorCubierta, int barrilesDisponibles) {
		super(nombre, genero, vida, dañoFisico, dañoMagico, resistenciaFisica, resistenciaMagica, velocidad, experiencia, nivel,
				monedas, grumetesRestantes, islasConquistadas, enemigosDerrotados, estaEnCombate, inventario,
				objetoEquipado, pedoActivado, estaSomnoliento, estaSangrando, barrilesDisponibles);
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
public void eleccionAtaquesMenu() {
    if (rolSeleccionado.toLowerCase().equals("cubierta")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      Elige el ataque a realizar:     ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Barrido Arcano (dñM)           ║");
        System.out.println("║    2. Vendaval Ascendente (Est)      ║");
        System.out.println("║    3. Disparo Certero (dñF)          ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      Elige el ataque a realizar:     ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Meteoro Cheddar (dñM)          ║");
        System.out.println("║    2. Caldo de los Condenados (Est)  ║");
        System.out.println("║    3. Hongo Explosivo (dñM)          ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      Elige el ataque a realizar:     ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║    1. Lanzamiento de Barril (dñF)    ║");
        System.out.println("║    2. Carga de Ancla (Est)           ║");
        System.out.println("║    3. Embestida Blindada (dñF)       ║");
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
        System.out.println("║  bola de energia.                    ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño magico: 80                     ║");
        System.out.println("╚══════════════════════════════════════╝");
    } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                A R G H               ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║           METEORO CHEDDAR            ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  Comienza una tormenta de bolas de   ║");
        System.out.println("║  cheddar que actUan como meteoritos. ║");
        System.out.println("║                                      ║");
        System.out.println("║  Daño magico: 60                     ║");
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
        System.out.println("║  Daño fisico: 100                    ║");
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
			System.out.println("║  Efecto: +Velocidad segUn daño       ║");
			System.out.println("║          magico                      ║");
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
			System.out.println("║          -20% resistencia magica     ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else {		
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║           CARGA DE ANCLA             ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Cargas un ancla a tu espalda.       ║");
			System.out.println("║                                      ║");
			System.out.println("║  Efecto: +20% daño fisico            ║");
			System.out.println("║          +20% resistencia fisica     ║");
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
			System.out.println("║  Realizas un disparo a traves de     ║");
			System.out.println("║  tu catalejo.                        ║");
			System.out.println("║                                      ║");
			System.out.println("║  Daño fisico: 50                     ║");
			System.out.println("║  Efecto: Golpe critico garantizado   ║");
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
			System.out.println("║  Daño magico: 20                     ║");
			System.out.println("║  Efecto: Veneno (5% vida/turno)      ║");
			System.out.println("║          -10% resistencia magica     ║");
			System.out.println("╚══════════════════════════════════════╝");
		} else {
			System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║                A R G H               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║         EMBESTIDA BLINDADA           ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║  Cargas hacia el enemigo con una     ║");
			System.out.println("║  pieza de artilleria.                ║");
			System.out.println("║                                      ║");
			System.out.println("║  Daño fisico: 65                     ║");
			System.out.println("║  Efecto: +20% resistencia fisica     ║");
			System.out.println("╚══════════════════════════════════════╝");
		}
	}
	// Fin informaciOn de los ataques ----------------------------------------------------------------------------------
	
	// DeclaraciOn de los ataques --------------------------------------------------------------------------------------
	@Override
    public void ataque1(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("El grumete ha usado el ataque Barrido Arcano");
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Barrido Arcano ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 80));
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("╔════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Meteoro Cheddar ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 60));
            enemigo.setVelocidad((int)(enemigo.getVelocidad() * 0.8));
            System.out.println("╔════════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha disminuido su velocidad         ║");
            System.out.println("╚════════════════════════════════════════════════╝");
        } else {        
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Lanzamiento de Barril       ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 100));
            resistenciaFisica = (int)(resistenciaFisica * 0.9);
            System.out.println("El grumete ha disminuido su resistencia fisica");
        }
    }

    @Override
    public void ataque2(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Vendaval Ascendente         ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
            velocidad += dañoMagico * 0.5;
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha aumentado su velocidad       ║");
            System.out.println("╚═════════════════════════════════════════════╝");
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Caldo de los condenados     ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
            enemigo.setEstaSomnoliento(true);
            enemigo.setResistenciaMagica((int)(enemigo.getResistenciaMagica() * 0.8));
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha quedado somnoliento        ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha disminuido su resistencia magica   ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
        } else {
            System.out.println("╔═══════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Carga de ancla     ║");
            System.out.println("╚═══════════════════════════════════════════════════╝");
            dañoFisico = (int)(dañoFisico * 1.2);
            resistenciaFisica = (int)(resistenciaFisica * 1.2);
            velocidad = (int)(velocidad * 0.95);
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha aumentado su daño fisico       ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha aumentado su resistencia fisica     ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║  El grumete ha disminuido su velocidad    ║");
            System.out.println("╚═══════════════════════════════════════════╝");
        }
    }

    @Override
    public void ataque3(Enemigo enemigo) {
        if (rolSeleccionado.toLowerCase().equals("cubierta")) {
            System.out.println("╔═════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Disparo Certero  ║");
            System.out.println("╚═════════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(dañoFisico - enemigo.getResistenciaFisica() + 50));
        } else if (rolSeleccionado.toLowerCase().equals("cocinero")) {
            System.out.println("╔═════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Hongo explosivo  ║");
            System.out.println("╚═════════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoMagico - enemigo.getResistenciaMagica()) + 20));
            enemigo.setEstaSangrando(true);
            enemigo.setResistenciaMagica((int)(enemigo.getResistenciaMagica() * 0.9));
            System.out.println("╔═════════════════════════════════════╗");
            System.out.println("║  El enemigo ha empezado a sangrar   ║");
            System.out.println("╚═════════════════════════════════════╝");
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("║  El enemigo ha disminuido su resistencia magica  ║");
            System.out.println("╚══════════════════════════════════════════════════╝");
        } else {
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha usado el ataque Embestida Blindada  ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            enemigo.setVida(enemigo.getVida() - (int)(0.5 * (dañoFisico - enemigo.getResistenciaFisica()) + 65));
            resistenciaFisica = (int)(resistenciaFisica * 1.2);
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║  El grumete ha aumentado su resistencia fisica     ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
        }
    }
}
	// Fin declaracion de los ataques ----------------------------------------------------------------------------------
package Tendera;

import Producto.Producto;
import Personaje.Personaje;
import java.util.Arrays;

public class Tendera {
    private Producto[] items = { // La cantidad de los objetos es 0, pues no es necesario modificarla en ningún momento.
        new Producto("Minipocion", 0, 20), // Recupera 20 de vida. [0]
        new Producto("Poción", 0, 30), // Recupera 60 de vida. [1]
        new Producto("Superpoción", 0, 60), // Recupera 120 de vida. [2]
        new Producto("Báculo", 0, 15), // Aumenta 20 de daño físico. [3]
        new Producto("Espada", 0, 30), // Aumenta 50 de daño físico. [4]
        new Producto("Mandoble", 0, 120), // Aumenta 100 de daño físico. [5]
        new Producto("Varita Madera", 0, 15), // Aumenta 20 de daño mágico. [6]
        new Producto("Varita Plástico", 0, 30), // Aumenta 50 de daño mágico. [7]
        new Producto("Varita Oro", 0, 120), // Aumenta 100 de daño mágico. [8]
        new Producto("Escudito", 0, 15), // Aumenta 20 de resistencia física. [9]
        new Producto("Escudo", 0, 30), // Aumenta 40 de resistencia física. [10] 
        new Producto("Escudazo", 0, 120), // Aumenta 100 de resistencia física. [11]
        new Producto("Capita", 0, 15), // Aumenta 20 de resistencia mágica. [12]
        new Producto("Capa", 0, 30), // Aumenta 40 de resistencia mágica. [13]
        new Producto("Capaza", 0, 120), // Aumenta 100 de resistencia mágica. [14]
        new Producto("Alas", 0, 30), // Aumenta 20% de velocidad. [15]
        new Producto("Pedo", 0, 30), // Aumenta la probabilidad de huir un 25% [16]
        new Producto("???", 0, 50), // Nada [17]
        new Producto("Redbull", 0, 10), // Quita el estado de somonliento. [18]
        new Producto("Caramelo", 0, 70) // Aumenta un nivel. [19]
    };

    private boolean abierto;

    public Tendera(Producto[] items, boolean abierto) {
        this.items = items;
        this.abierto = abierto;
    }

    public Producto[] getItems() {
        return items;
    }

    public void setItems(Producto[] items) {
        this.items = items;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    @Override
    public String toString() {
        return "Tendera [items=" + Arrays.toString(items) + ", abierto=" + abierto + "]";
    }

    public void menuCompra (Personaje personaje){
        if (personaje.getGenero().equals("femenino")|| personaje.getGenero().equals("f")|| personaje.getGenero().equals("mujer")|| personaje.getGenero().equals("hembra")){
            System.out.println("Bienvenida a la tienda");
        } else if (personaje.getGenero().equals("masculino") || personaje.getGenero().equals("m") || personaje.getGenero().equals("hombre") || personaje.getGenero().equals("macho") || personaje.getGenero().equals("h")) {
            System.out.println("Bienvenido a la tienda");
        } else {
            System.out.println("Bienvenide a la tienda");
        }
        System.out.println("¿Qué desea comprar?");
        System.out.println("1. Minipoción");
        System.out.println("2. Poción");
        System.out.println("3. Superpoción");
        System.out.println("4. Báculo");
        System.out.println("5. Espada");
        System.out.println("6. Mandoble");
        System.out.println("7. Varita Madera");
        System.out.println("8. Varita Plástico");
        System.out.println("9. Varita Oro");
        System.out.println("10. Escudito");
        System.out.println("11. Escudo");
        System.out.println("12. Escudazo");
        System.out.println("13. Capita");
        System.out.println("14. Capa");
        System.out.println("15. Capaza");
        System.out.println("16. Alas");
        System.out.println("17. Pedo");
        System.out.println("18. ???");
        System.out.println("19. Redbull");
        System.out.println("20. Caramelo");
        System.out.println("");
        System.out.println("21. Salir");
    }
}

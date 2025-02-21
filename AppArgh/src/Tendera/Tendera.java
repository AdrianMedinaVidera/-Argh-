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
        System.out.println("+-----------------------------------------------+");
        if (personaje.getGenero().equals("femenino")|| personaje.getGenero().equals("f")|| personaje.getGenero().equals("mujer")|| personaje.getGenero().equals("hembra")){
            System.out.println("           Bienvenida " + personaje.getNombre() +  " a la tienda");
        } else if (personaje.getGenero().equals("masculino") || personaje.getGenero().equals("m") || personaje.getGenero().equals("hombre") || personaje.getGenero().equals("macho") || personaje.getGenero().equals("h")) {
            System.out.println("           Bienvenido " + personaje.getNombre() + " a la tienda");
        } else {
            System.out.println("           Bienvenide " + personaje.getNombre() + " a la tienda");
        }
        System.out.println("+------------------------------------------------+");
        System.out.println("|            ¿Qué desea comprar?                 |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 1. Minipoción      | 20 de vida  | 20 monedas  |");
        System.out.println("| 2. Poción          | 60 de vida  | 30 monedas  |");
        System.out.println("| 3. Superpoción     | 120 de vida | 60 monedas  |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 4. Báculo          | 20 de dñF   | 15 monedas  |");
        System.out.println("| 5. Espada          | 50 de dñF   | 30 monedas  |");
        System.out.println("| 6. Mandoble        | 100 de dñF  | 120 monedas |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 7. Varita Madera   | 20 de dñM   | 15 monedas  |");
        System.out.println("| 8. Varita Plástico | 50 de dñM   | 30 monedas  |");
        System.out.println("| 9. Varita Oro      | 100 de dñM  | 120 monedas |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 10. Escudito       | 20 de resF  | 15 monedas  |");
        System.out.println("| 11. Escudo         | 40 de resF  | 30 monedas  |");
        System.out.println("| 12. Escudazo       | 100 de resF | 120 monedas |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 13. Capita         | 20 de resM  | 15 monedas  |");
        System.out.println("| 14. Capa           | 40 de resM  | 30 monedas  |");
        System.out.println("| 15. Capaza         | 100 de resM | 120 monedas |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 16. Alas           | 20% de vel  | 30 monedas  |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 17. Pedo           | 25% de huir | 30 monedas  |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 18. ???            |     ???     | 50 monedas  |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 19. Redbull        | Despertar   | 10 monedas  |");
        System.out.println("+--------------------+-------------+-------------+");
        System.out.println("| 20. Caramelo       | +1 nivel    | 70 monedas  |");
        System.out.println("+------------------------------------------------+");
        System.out.println("|            21. Salir de la tienda              |");
        System.out.println("+-----------------------------------------------+");
    }
}

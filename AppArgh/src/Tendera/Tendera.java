package Tendera;

import Producto.Producto;
import java.util.Arrays;

public class Tendera {
    private Producto[] items = {
        new Producto("Minipocion", 3, 20),
        new Producto("Poción", 3, 30),
        new Producto("Superpoción", 3, 60),
        new Producto("Báculo", 3, 15),
        new Producto("Espada", 3, 30),
        new Producto("Mandoble", 2, 120),
        new Producto("Varita Madera", 3, 15),
        new Producto("Varita Plástico", 2, 30),
        new Producto("Varita Oro", 1, 120),
        new Producto("Escudito", 2, 15),
        new Producto("Escudo", 2, 30),
        new Producto("Escudazo", 1, 120),
        new Producto("Capita", 1, 15),
        new Producto("Capa", 2, 30),
        new Producto("Capaza", 1, 120),
        new Producto("Alas", 1, 30),
        new Producto("Pedo", 47, 30),
        new Producto("???", 1, 50),
        new Producto("Redbull", 8, 10),
        new Producto("Caramelo", 1, 70)
    };

    private boolean abierto;

    public Tendera(Producto[] items, boolean abierto) {
        this.items = items;
        if(Math.random() > 0.5){
            this.abierto = true;
        }
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

    public void menuCompra (){
        System.out.println("Bienvenido a la tendera");
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
    }
}

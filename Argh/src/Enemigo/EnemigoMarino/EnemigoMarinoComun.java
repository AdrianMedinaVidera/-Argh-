package Enemigo.EnemigoMarino;

public class EnemigoMarinoComun extends EnemigoMarino {

    private String[] nombre = {"Loco", "Emú", "Sapo"};

    

    @Override
    public void ataque1() {
        if (nombre.equals("Loco")) {
            System.out.println("El enemigo ha usado el ataque ");
        }
    }

    @Override
    public void ataque2() {
    }

    @Override
    public void ataque3() {

    }

}

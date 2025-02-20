public class ExcepcionAritmetica {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int resultado = num1/num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}

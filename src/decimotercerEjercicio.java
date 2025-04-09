import java.util.Scanner;

public class decimotercerEjercicio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[8];

            System.out.println("Ingrese 8 números enteros:");
            for (int i = 0; i < numeros.length; i++) {

                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            System.out.println("\nResultados:");

            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] % 2 == 0) {
                    System.out.println(numeros[i] + " es par");

                } else {
                    System.out.println(numeros[i] + " es impar");
                }
            }
        }
}
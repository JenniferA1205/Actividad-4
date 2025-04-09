import java.util.Scanner;

public class duodecimoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Arreglos (Orden Inverso):
        Desarrolla un programa que reciba 10 números por consola, los almacene en un arreglo
        y luego los muestre en orden inverso, enfatizando el manejo de índices y la lógica de
        recorrido inverso de estructuras lineales*/

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }
    }
}
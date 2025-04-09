import java.util.Scanner;

public class sextoEjercicio {
    public static void main(String[] args) {
    /*Ejercicio Condicionales (Primera Cifra de un Número):
    Implementa un programa que determine la primera cifra de un número entero de hasta 5 dígitos ingresado por teclado,
    ya sea convirtiendo el número a una cadena o mediante operaciones matemáticas, para practicar la manipulación de datos numéricos*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cifra: ");
        String cadena = scanner.nextLine();

        char cifra = cadena.charAt(0);

        System.out.println("La primera cifra ingresada es: "+cifra);
    }
}

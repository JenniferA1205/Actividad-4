import java.util.Scanner;

public class octavoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Ciclos (Promedio de Números Positivos):
        Desarrolla un programa que calcule el promedio de un conjunto de números positivos
        ingresados por teclado y que finalice cuando se introduzca un número negativo, combinando bucles
        y condicionales para el procesamiento de datos.*/

        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double nota;
        int numero = 1;

        do {
            System.out.print("Ingrese su nota número " + numero + ": ");
            nota = scanner.nextDouble();

            if (nota >= 0) {
                suma += nota;
                contador++;
                numero++;
            }

        } while (nota >= 0);

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de las " + contador + " notas ingresadas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }

    }
}

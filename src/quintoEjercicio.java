import java.util.Scanner;

public class quintoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Condicionales (Ordenamiento de Números):
        Desarrolla un programa que ordene tres números enteros ingresados por teclado,
        mostrando primero el orden original y luego el ordenado, lo que refuerza el uso de condicionales
        y la lógica de comparación para ordenar datos.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        System.out.println("El orden original es: " + numero1 + ", " + numero2 + ", " + numero3);

        int primero, segundo, tercero;

        if (numero1 <= numero2 && numero1 <= numero3) {
            primero = numero1;
            if (numero2 <= numero3) {
                segundo = numero2;
                tercero = numero3;
            } else {
                segundo = numero3;
                tercero = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            primero = numero2;
            if (numero1 <= numero3) {
                segundo = numero1;
                tercero = numero3;
            } else {
                segundo = numero3;
                tercero = numero1;
            }
        } else {
            primero = numero3;
            if (numero1 <= numero2) {
                segundo = numero1;
                tercero = numero2;
            } else {
                segundo = numero2;
                tercero = numero1;
            }
        }

        System.out.println("Ordenado de menor a mayor: " + primero + ", " + segundo + ", " + tercero);
    }
}

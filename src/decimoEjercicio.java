import java.util.Scanner;

public class decimoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Ciclos (Pirámide Numérica):
        Escribe un programa que, al recibir un número por consola, imprima una pirámide de números
        (por ejemplo, 1; 121; 12321; 1234321) utilizando bucles anidados para generar patrones simétricos
        y  practicar la lógica de impresión de secuencias numéricas.*/

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número: ");
                int numero = scanner.nextInt();

                for (int i = 1; i <= numero; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }

                    for (int j = i - 1; j >= 1; j--) {
                        System.out.print(j);
                    }

                    System.out.println();
                }
    }
}
import java.util.Scanner;

public class novenoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Ciclos (Conteo de Positivos y Negativos):
        Elabora un programa que lea diez números ingresados por consola y cuente cuántos son
        positivos y cuántos negativos, utilizando bucles y estructuras condicionales para
        clasificar y contar cada caso.*/

        Scanner scanner = new Scanner(System.in);

        int negativos = 0;
        int positivos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contador = 1;
        int numero;

        do {

            System.out.print("Ingrese el numero "+contador+": ");
            numero = scanner.nextInt();

            if (numero < 0) {
                negativos += numero;
                contadorNegativos++;
            } else {
                positivos += numero;
                contadorPositivos++;
            }

            contador ++;

        } while (contador <= 10);

        System.out.println("Cantidad de positivos: "+contadorPositivos);
        System.out.println("Cantidad de negativos: "+contadorNegativos);
        System.out.println("Suma de positivos: "+positivos);
        System.out.println("Suma de negativos: "+negativos);
    }
}

public class septimoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Ciclos (Múltiplos de 8):
        Crea un programa que, utilizando un bucle while, muestre todos los números múltiplos de 8
        en el rango de 0 a 100, permitiendo comprender la iteración y el uso del operador módulo
        para determinar divisibilidad.*/

        int numero = 8;

        while (numero <= 100) {
            if (numero % 8 == 0) {
                System.out.println(numero);
            }
            numero++;
        }

    }
}
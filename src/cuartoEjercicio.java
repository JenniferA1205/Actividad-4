import java.util.Scanner;

public class cuartoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Condicionales (Día de la Semana):
        Escribe un programa que, dado un número del 1 al 7, imprima en consola el nombre correspondiente
        del día de la semana, utilizando estructuras condicionales (if-else o switch)
        para validar la entrada y asociarla correctamente.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día ingresado invalido.");
                break;
        }

    }
}

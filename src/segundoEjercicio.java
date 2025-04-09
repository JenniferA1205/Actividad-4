import java.util.Scanner;

public class segundoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Variables (Conversor de Moneda):
        Realiza un conversor de pesos a dólar en el que la cantidad en pesos esté almacenada en una variable
        y se utilice el valor fijo de 1 dólar = $3.895, permitiendo practicar operaciones aritméticas
        y el manejo de tipos de datos decimales.*/

        Scanner scanner = new Scanner(System.in);

        int Dolar = 3895;

        System.out.print("Ingrese la cantidad de dolares que desea convertir a pesos Colombianos: ");
        int Pesos = scanner.nextInt();

        int valorTotal = Pesos * Dolar;

        System.out.println(Pesos+" dolares equivalen a "+valorTotal+" pesos Colombianos.");

    }
}

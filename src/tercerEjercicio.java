import java.util.Scanner;

public class tercerEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Variables (Factura con IVA):
        Calcula el total de una factura a partir de la base de compra (precio sin IVA),
        mostrando en consola la base, el IVA calculado (aproximadamente el 19% de la base) y el total,
        aplicando conceptos de cálculo de impuestos y aritmética aplicada.*/


        // Miguel Cardenas

        Scanner scanner = new Scanner(System.in);
        double iva = 0.19;


        System.out.print("Ingrese el valor base de su compra: ");
        double compra = scanner.nextDouble();

        double valorIva = compra*iva;
        double valorCompra = compra+valorIva;

        System.out.println("El valor total de la compra (incluyendo el valor del IVA) es de: "+valorCompra);

    }

}

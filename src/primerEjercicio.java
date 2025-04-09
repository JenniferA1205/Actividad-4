public class primerEjercicio {
    public static void main(String[] args) {
        /*Ejercicio Variables:
        Declara dos variables enteras, numeroA y numeroB, asignándoles los valores 89 y 323,
        y muestra en consola el valor de cada variable, además de la suma, resta, división y multiplicación,
        lo que introduce conceptos básicos de declaración de variables y operaciones aritméticas en Java*/

        int numeroA = 89;
        int numeroB = 323;

        int Suma = numeroA+numeroB;
        int Resta = numeroA-numeroB;
        int Multiplicación = numeroA*numeroB;
        double División = (double) numeroA/numeroB;

        System.out.println(numeroA);
        System.out.println(numeroB);
        System.out.println("Suma: "+Suma);
        System.out.println("Resta: "+Resta);
        System.out.println("Multiplicación: "+Multiplicación);
        System.out.println("División: "+División);

    }
}
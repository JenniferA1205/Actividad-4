public class undecimoEjercicio {
    public static void main(String[] args) {

        /*Ejercicio Arreglos (Arreglo de Caracteres):
        Crea un arreglo de 10 caracteres llamado caracteres y asigna a cada posición
        los valores especificados en una tabla (por ejemplo, posición 0 'h', posición 1 'z', etc.),
        para familiarizarte con la declaración, inicialización y manipulación de arreglos en Java.*/

                char[] caracteres = new char[10];

                caracteres[0] = 'a';
                caracteres[1] = 'b';
                caracteres[2] = 'c';
                caracteres[3] = 'd';
                caracteres[4] = 'e';
                caracteres[5] = 'f';
                caracteres[6] = 'g';
                caracteres[7] = 'h';
                caracteres[8] = 'i';
                caracteres[9] = 'j';

                System.out.println("Contenido del arreglo:");
                for (int i = 0; i < caracteres.length; i++) {
                    System.out.println("Posición " + i + ": " + caracteres[i]);
                }
    }
}
package arreglos;

public class PruebaArreglo {
    public static void main(String[] args) {

        int[] arregloUD = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] arregloBD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        String palabra = "murcielago";
        char caracter = 'l';

        Arreglo.sumarLista(arregloUD);
        System.out.println("El mayor numero en el arreglo es: "+Arreglo.buscaMayor(arregloBD));
        System.out.println("La cadena tiene "+ Arreglo.cuentaVocales(palabra)+" vocales");
        System.out.println("la cadena tiene "+Arreglo.cuentaCaracter(palabra, caracter)+" veces el caracter "+caracter);
    }
}

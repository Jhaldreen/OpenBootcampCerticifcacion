package Ejercicio3;

public class Arrays {
    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     *
     * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
     *
     * String[] nombres = {"", "", "", ""}
     * @param args
     */
    public static void main(String[] args) {

        //Creamos el array de tipo String
        String[] texto = new String[]{"Texto 1, ", "Texto 2, ", "Texto 3 ","\nFin del Array de tipo String"};
        //Creamos el array de tipo Integer
        int[] num = new int[]{1,2,3};
        //Recorremos el array y mostramos su contenido
        for(int i = 0; i < texto.length; i++) {
            System.out.print(texto[i]);
        }
        //Recorremos el array y mostramos su contenido
        for(int i = 0; i < num.length; i++) {
        // de esta manera nos sale en vertical
            System.out.print("\n"+num[i]);

        }
        System.out.println("\nFin del Array de tipo Integer ");
    }
}

package Ejercicio2;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class funcionIVA {


     static double obtenerIva(double precio, double porcentaje) {
         //obtenemos el IVA
        double ivaIncuido =precio * porcentaje /100;
        //se lo añadicmos al precio
        return  ivaIncuido + precio ;
    }
    public static void main(String[] args) {
         //añadimos los valores que pasamos por parametro en la funcion
        double resultado = obtenerIva(110,21);
        System.out.println("Resultado: " + resultado);


    }

}

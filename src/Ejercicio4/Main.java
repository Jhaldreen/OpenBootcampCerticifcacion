package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartPhone android = new SmartPhone(5.6,true);
        SmartPhone apple = new SmartPhone(6.6,false);
        SmartWatch xiaomi = new SmartWatch("hombre","Podometro");
        SmartWatch ios = new SmartWatch("mujer","Podómetro, Despertador, Mensajería de texto");
        SmartDevice device1 = new SmartDevice("Android","Smansung","galaxy","negro",android,xiaomi);

        System.out.println("SO: "+device1.sistemaOperativo);
        System.out.println(device1.marca);
        System.out.println(device1.modelo);
        System.out.println(device1.color);
        System.out.println(android.tamaño);
        System.out.println(android.tactil);
        System.out.println("Genero: "+ xiaomi.genero);
        System.out.println(xiaomi.funcionEspecial);


    }
}

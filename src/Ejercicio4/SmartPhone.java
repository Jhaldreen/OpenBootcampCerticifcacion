package Ejercicio4;

public class SmartPhone extends SmartDevice {

    double tamaño;
    boolean tactil;

    public SmartPhone() {

    }

    public SmartPhone(double tamaño, boolean tactil) {
        this.tamaño = tamaño;
        this.tactil = tactil;
    }

    public SmartPhone(String sistemaOperativo, String marca, String modelo, String color, SmartPhone smartPhone, SmartWatch smartWatch, double tamaño, boolean tactil) {
        super(sistemaOperativo, marca, modelo, color, smartPhone, smartWatch);
        this.tamaño = tamaño;
        this.tactil = tactil;
    }
}

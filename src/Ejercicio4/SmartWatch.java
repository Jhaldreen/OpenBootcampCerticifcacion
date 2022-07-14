package Ejercicio4;

public class SmartWatch extends SmartDevice {

    String genero;
    String funcionEspecial;

    public SmartWatch() {

    }

    public SmartWatch(String genero, String funcionEspecial) {
        this.genero = genero;
        this.funcionEspecial = funcionEspecial;
    }

    public SmartWatch(String sistemaOperativo, String marca, String modelo, String color, SmartPhone smartPhone, SmartWatch smartWatch, String genero, String funcionEspecial) {
        super(sistemaOperativo, marca, modelo, color, smartPhone, smartWatch);
        this.genero = genero;
        this.funcionEspecial = funcionEspecial;
    }
}

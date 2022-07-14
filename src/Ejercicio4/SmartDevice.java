package Ejercicio4;

public class SmartDevice {

    String sistemaOperativo;
    String marca;
    String modelo;
    String color;
    SmartPhone smartPhone;
    SmartWatch smartWatch;

    public SmartDevice(){

    }

    public SmartDevice(String sistemaOperativo, String marca, String modelo, String color, SmartPhone smartPhone, SmartWatch smartWatch) {
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.smartPhone = smartPhone;
        this.smartWatch = smartWatch;
    }


}

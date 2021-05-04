package com.company;

public class Usb {
    private String typeOfPort;
    private int id;

    public Usb(){
    }

    public Usb(String typeOfPort, int id) {
        this.typeOfPort = typeOfPort;
        this.id = id;
    }

    public String getTypeOfPort() {
        return typeOfPort;
    }

    public void setTypeOfPort(String typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package com.company;

public class Ram {
    private int volume;
    private String manufacturer;

    public Ram(){
    }

    public Ram(int volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

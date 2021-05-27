package com.company;

public class City extends AbstractLocality {
    private String[] region;

    public City(){
    }

    public City(String nameOfRegion, String theLeader, String[] region) {
        super(nameOfRegion, theLeader);
        this.region = region;
    }
}

package com.company;

public abstract class AbstractLocality {
    private String nameOfRegion;
    private String theLeader;

    public AbstractLocality(){
    }

    public AbstractLocality(String nameOfRegion, String theLeader) {
        this.nameOfRegion = nameOfRegion;
        this.theLeader = theLeader;
    }

    public String getTheLeader() {
        return theLeader;
    }

    public void setTheLeader(String theLeader) {
        this.theLeader = theLeader;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }
}

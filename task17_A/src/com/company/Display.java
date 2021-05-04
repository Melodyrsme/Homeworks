package com.company;

public class Display {
    private int diagonal;
    private String manufacturer;
    private String matrixType;

    public Display(){
    }

    public Display(int diagonal, String manufacturer, String matrixType) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }
}

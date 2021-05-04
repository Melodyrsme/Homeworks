package com.company;

public class SSD {
    private int memorySize;
    private int numberOfDisks;

    public SSD() {
    }

    public SSD(int memorySize, int numberOfDisks) {
        this.memorySize = memorySize;
        this.numberOfDisks = numberOfDisks;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public void setNumberOfDisks(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }
}

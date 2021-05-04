package com.company;

public class Computer {
    private Display display;
    private String mark;
    private String color;
    private SSD ssd;
    private Ram ram;
    private String graphicsCard;
    private Usb[] usbs;
    private Keyboard keyboard;

    public Computer() {
    }

    public Computer(Display display, String mark, String color, SSD ssd, Ram ram,
                    String graphicsCard, Usb[] usbs, Keyboard keyboard) {
        this.display = display;
        this.mark = mark;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.usbs = usbs;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Usb[] getUsbs() {
        return usbs;
    }

    public void setUsbs(Usb[] usbs) {
        this.usbs = usbs;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}

package com.exmple;

public class Socks {

    private String color;

    private int cottonPart;

    public Socks(String color, int cottonPart) {
        this.color = color;
        this.cottonPart = cottonPart;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCottonPart() {
        return cottonPart;
    }

    public void setCottonPart(int cottonPart) {
        this.cottonPart = cottonPart;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "color='" + color + '\'' +
                ", cottonPart=" + cottonPart +
                '}';
    }
}

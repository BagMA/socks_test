package com.exmple.entity;

import javax.persistence.*;

@Entity
@Table(name = "socks")
public class Socks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "color")
    private String color;

    @Column(name = "cottonPart")
    private int cottonPart;

    public Socks() {
    }

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

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

    @Column(name = "orderNumber")
    private int orderNumber;

    public Socks() {
    }

    public Socks(String color, int cottonPart) {
        this.color = color;
        this.cottonPart = cottonPart;
        this.orderNumber = this.id + 10;
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

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", cottonPart=" + cottonPart +
                ", orderNumber=" + orderNumber +
                '}';
    }
}

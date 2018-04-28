package com.company;

public class RoseFlower {
    private String color;
    private int length;
    private String fresh;
    private float cash;

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFresh() {
        return fresh;
    }

    public void setFresh(String fresh) {
        this.fresh = fresh;
    }

    public RoseFlower(String color, int length, String fresh) {
        this.color = color;
        this.length = length;
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "RoseFlower{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", fresh='" + fresh + '\'' +
                ", cash=" + cash +
                "$}";
    }
}

package com.company;

public class SnowdropFlower {
    private String color;
    private int lenght;
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

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getFresh() {
        return fresh;
    }

    public void setFresh(String fresh) {
        this.fresh = fresh;
    }

    public SnowdropFlower(String color, int lenght, String fresh, float cash) {
        this.color = color;
        this.lenght = lenght;
        this.fresh = fresh;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "SnowdropFlower{" +
                "color='" + color + '\'' +
                ", lenght=" + lenght +
                ", fresh='" + fresh + '\'' +
                ", cash=" + cash +
                "$}";
    }
}

package com.company;

public class Bouquet {
    // ?????
    private RoseFlower roseFlower;
    private TulipFlower tulipFlower;
    private SnowdropFlower snowdropFlower;


    public RoseFlower getRoseFlower() {
        return roseFlower;
    }

    public void setRoseFlower(RoseFlower roseFlower) {
        this.roseFlower = roseFlower;
    }

    public TulipFlower getTulipFlower() {
        return tulipFlower;
    }

    public void setTulipFlower(TulipFlower tulipFlower) {
        this.tulipFlower = tulipFlower;
    }

    public SnowdropFlower getSnowdropFlower() {
        return snowdropFlower;
    }

    public void setSnowdropFlower(SnowdropFlower snowdropFlower) {
        this.snowdropFlower = snowdropFlower;
    }

    public Bouquet(RoseFlower roseFlower, TulipFlower tulipFlower, SnowdropFlower snowdropFlower) {
        this.roseFlower = roseFlower;
        this.tulipFlower = tulipFlower;
        this.snowdropFlower = snowdropFlower;
    }

    @Override
    public String toString() {
        return "Букет:"  +
                  roseFlower + "/" +
                  tulipFlower + "/" + "/"
                + snowdropFlower;
    }
}

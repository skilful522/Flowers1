package com.company;

public class Main {
    public static void main(String[] args) {

        RoseFlower roseFlower = new RoseFlower("Красный",20,"Сегодняшние");
        TulipFlower tulipFlower = new TulipFlower("Жёлтый",15,"Вчерашний");
        SnowdropFlower snowdropFlower = new SnowdropFlower("Чёрный",30,"Гнилой", 0);
        Bouquet bouquet = new Bouquet(roseFlower,tulipFlower,snowdropFlower);
        System.out.println(bouquet);
    }
}

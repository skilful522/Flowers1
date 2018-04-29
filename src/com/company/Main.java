package com.company;

import com.company.bouquet.Bouquet;
import com.company.rose.RoseFlower;
import com.company.snowdrop.SnowdropFlower;
import com.company.tulip.TulipFlower;

public class Main {
    public static void main(String[] args) {

        RoseFlower roseFlower = new RoseFlower("Красный",20,"Сегодняшние",25);
        TulipFlower tulipFlower = new TulipFlower("Жёлтый",15,"Вчерашний", 15);
        SnowdropFlower snowdropFlower = new SnowdropFlower("Чёрный",30,"Гнилой", 0);
        Bouquet bouquet = new Bouquet(roseFlower,tulipFlower,snowdropFlower);
        System.out.println(bouquet);
    }
}

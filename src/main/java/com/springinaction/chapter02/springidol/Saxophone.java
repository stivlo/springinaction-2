package com.springinaction.chapter02.springidol;

import java.util.Random;

public class Saxophone implements Instrument {

    private int brand = new Random().nextInt(1000);

    @Override
    public void play() {
        System.out.println("Saxophone brand " + brand + " TOOT TOOT TOOT");
    }

}

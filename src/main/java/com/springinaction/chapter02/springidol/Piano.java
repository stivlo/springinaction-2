package com.springinaction.chapter02.springidol;

public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }

}

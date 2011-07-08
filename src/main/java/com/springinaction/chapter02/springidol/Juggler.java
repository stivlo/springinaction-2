package com.springinaction.chapter02.springidol;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
        //nothing to do!
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

}

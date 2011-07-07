package com.springinaction.chapter02.springidol;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("WHILE RECITING...");
        poem.recite();
    }

}

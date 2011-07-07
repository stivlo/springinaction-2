package com.springinaction.chapter02.springidol;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + ": ");
        instrument.play();
    }

}

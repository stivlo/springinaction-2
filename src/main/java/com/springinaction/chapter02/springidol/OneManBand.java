package com.springinaction.chapter02.springidol;

import java.util.Collection;

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

}

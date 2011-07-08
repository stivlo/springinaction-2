package com.springinaction.chapter02.springidol;

import java.util.Iterator;
import java.util.Properties;

public class OneManBandProperties implements Performer {

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {
        for (@SuppressWarnings("rawtypes")
        Iterator iter = instruments.keySet().iterator(); iter.hasNext();) {
            String key = (String) iter.next();
            System.out.println(key + " : " + instruments.getProperty(key));
        }
    }

}

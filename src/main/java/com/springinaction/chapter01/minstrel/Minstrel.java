package com.springinaction.chapter01.minstrel;

import org.apache.log4j.Logger;

import com.springinaction.chapter01.knight.Knight;

public class Minstrel {

    private static final Logger SONG = Logger.getLogger(Minstrel.class);

    /**
     * Sings before quest
     * 
     * @param knight
     */
    public void singBefore(Knight knight) {
        SONG.info("Fa la la; Sir " + knight.getName() + " is so brave!");
    }

    /**
     * Sings after quest
     */
    public void singAfter(Knight knight) {
        SONG.info("Tee-hee-he; Sir " + knight.getName() + " did embark on a quest!");
    }

}

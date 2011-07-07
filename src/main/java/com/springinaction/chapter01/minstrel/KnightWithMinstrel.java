package com.springinaction.chapter01.minstrel;

import com.springinaction.chapter01.knight.KnightOfTheRoundTable;
import com.springinaction.chapter01.knight.QuestFailedException;

public class KnightWithMinstrel extends KnightOfTheRoundTable {

    private Minstrel minstrel;

    public KnightWithMinstrel(String name) {
        super(name);
    }

    public void setMinstrel(Minstrel minstrel) {
        this.minstrel = minstrel;
    }

    @Override
    public Object embarkOnQuest() throws QuestFailedException {
        minstrel.singBefore(this);
        System.out.println("Hi, I am " + getName() + " and I'm a " + this.getClass().getSimpleName() + ".");
        System.out.println("I'm going to embark on " + quest.getClass().getSimpleName() + "!");
        Object result = quest.embark();
        minstrel.singAfter(this);
        return result;
    }

}

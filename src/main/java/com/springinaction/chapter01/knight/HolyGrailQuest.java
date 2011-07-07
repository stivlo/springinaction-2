package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest {

    @Override
    public HolyGrail embark() throws QuestFailedException {
        HolyGrail grail = null;
        System.out.println("A " + this.getClass().getSimpleName() + " has been embarked.");
        grail = new HolyGrail(); //that was easy!
        return grail;
    }

}

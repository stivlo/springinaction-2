package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {

    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }

    @Override
    public Object embarkOnQuest() throws QuestFailedException {
        System.out.println("Hi, my name is " + name + " and I'm a " + this.getClass().getSimpleName() + ".");
        System.out.println("I'm going to embark on " + quest.getClass().getSimpleName() + "!");
        return quest.embark();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

}

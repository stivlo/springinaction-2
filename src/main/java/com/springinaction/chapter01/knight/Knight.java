package com.springinaction.chapter01.knight;

public interface Knight {

    Object embarkOnQuest() throws QuestFailedException;

    String getName();

}

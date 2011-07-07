package com.springinaction.chapter01.knight;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.springinaction.chapter01.knight.KnightOfTheRoundTable;

public class KnightOfTheRoundTableTest {

    @Test
    public void embarkOnQuest() throws QuestFailedException {
        KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");

        //mocking and setting the Quest
        Quest mockedQuest = Mockito.mock(Quest.class);
        Mockito.when(mockedQuest.embark()).thenReturn(new Object());
        knight.setQuest(mockedQuest);

        Object questResult = knight.embarkOnQuest();
        assertNotNull(questResult);
    }

}

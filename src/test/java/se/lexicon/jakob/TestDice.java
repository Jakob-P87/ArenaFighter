package se.lexicon.jakob;

import models.Dice;
import org.junit.Before;
import org.junit.Test;

public class TestDice
{
    private Dice dice;

    @Before
    public void initDice()
    {
        dice = new Dice();
    }

    @Test
    public void testDiceRoll()
    {
        System.out.println(dice.getDice());
    }
}

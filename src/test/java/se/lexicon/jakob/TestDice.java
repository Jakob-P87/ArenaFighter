package se.lexicon.jakob;

import static org.junit.Assert.*;

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

    @Test //Check so the dice roll is within the scope of 1 - 6
    public void testDiceRoll()
    {
        System.out.println(dice.getDice());

        assertTrue(dice.getDice() >= 1 && dice.getDice() <= 6);
    }
}

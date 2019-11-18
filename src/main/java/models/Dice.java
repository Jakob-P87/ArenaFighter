package models;

import java.util.Random;

public class Dice
{
    private int dice;

    public Dice()
    {
        this.dice = rollDice();
    }

    private int rollDice()
    {
        int[] roll = {1,2,3,4,5,6};

        Random random = new Random();
        int newRoll = random.nextInt(roll.length);

        return roll[newRoll];
    }

    public int getDice()
    {
        return dice;
    }
}

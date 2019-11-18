package models;

import java.util.Random;

public class Enemy
{
    private String enemyName;
    private int health;
    private int strength;

    public Enemy()
    {
        this.enemyName = randomEnemyNames();
        this.health = 30;
        this.strength = 5;
    }

    public String getEnemyName()
    {
        return enemyName;
    }

    public int getHealth()
    {
        return health;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setEnemyName(String enemyName)
    {
        this.enemyName = enemyName;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    private String randomEnemyNames() //Randomizer for enemy names
    {
        String[] enemyNames = {"Grugg", "Brunhildr", "Hjalle"};

        Random random = new Random(); //Create Random variable
        int newEnemyName = random.nextInt(enemyNames.length); //This will assign a random word from the array to a new variable

        return enemyNames[newEnemyName]; //Return the random word selected from the array
    }
}

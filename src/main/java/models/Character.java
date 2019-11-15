package models;

public class Character
{
    private final String characterName;                 //The character name
    private int health;                                 //Character health
    private int strength;

    public Character(String name)
    {
        this.characterName = name;
        this.health = 100;
        this.strength = 5;
    }

    public String getName()                             //Get the name of character
    {
        return characterName;
    }

    public int getHealth()                              //Get the health of character
    {
        return health;
    }

    public void setHealth(int health)                   //Set new health for character
    {
        this.health = health;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }
}

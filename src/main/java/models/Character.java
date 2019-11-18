package models;

public class Character
{
    private final String characterName;                 //The character name
    private int startHealth;
    private int health;                                 //Character health
    private int strength;                               //Character Strength
    private int defence;

    public Character(String name)
    {
        this.characterName = name.substring(0,1).toUpperCase() + name.substring(1);
        this.startHealth = 30;
        this.health = 30;
        this.strength = 5;
        this.defence = 3;
    }

    public String getName()                             //Get the name of character
    {
        return characterName;
    }

    public int getStartHealth()
    {
        return startHealth;
    }

    public void setStartHealth(int startHealth)
    {
        this.startHealth = startHealth;
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

    public int getDefence()
    {
        return defence;
    }

    public void setDefence(int defence)
    {
        this.defence = defence;
    }
}

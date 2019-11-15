package models;

public class Character
{
    private final String characterName;

    public Character(String name)
    {
        this.characterName = name;
    }

    public String getName()
    {
        return characterName;
    }
}

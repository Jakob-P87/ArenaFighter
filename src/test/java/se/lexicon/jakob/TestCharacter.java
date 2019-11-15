package se.lexicon.jakob;

import models.Character;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacter
{
    //------------------------- Character Creation ----------------------------------
    private Character newCharacter;
    private String characterName = "Conan";

    @Before
    public void initCharacter()
    {
        newCharacter = new Character(characterName);
    }

    @Test //To see if character has the new name
    public void testNewName()
    {
        //Act

        //Assert
        assertEquals(characterName, newCharacter.getName());
    }

    @Test //To see if health can be changed
    public void testSetHealth()
    {
        //Act
        newCharacter.setHealth(120);

        //Assert
        assertEquals(120, newCharacter.getHealth());
    }

    @Test //To see if health can be changed
    public void testSetStrength()
    {
        //Act
        newCharacter.setStrength(7);

        //Assert
        assertEquals(7, newCharacter.getStrength());
    }
}

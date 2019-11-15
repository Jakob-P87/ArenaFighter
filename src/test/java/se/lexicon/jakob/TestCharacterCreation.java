package se.lexicon.jakob;

import models.Character;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCharacterCreation
{
    //------------------------- Character Creation ----------------------------------
    private Character newCharacter;
    private String name = "Conan";

    @Before
    public void initCharacter()
    {
        newCharacter = new Character(name);
    }

    @Test
    public void testNewName()
    {
        //Act

        //Assert
        assertEquals(name, newCharacter.getName());
    }
}

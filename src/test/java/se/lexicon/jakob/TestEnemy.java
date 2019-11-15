package se.lexicon.jakob;

import models.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnemy
{
    private Enemy newEnemy;

    @Before
    public void initEnemy()
    {
        newEnemy = new Enemy();
    }

    @Test //To see if enemy has a name
    public void testEnemyName()
    {
        //Assert
        assertEquals("Grugg", newEnemy.getEnemyName());
    }

    @Test //To set a new name for the enemy
    public void testSetEnemyName()
    {
        //Act
        newEnemy.setEnemyName("Brunhildir");

        //Assert
        assertEquals("Brunhildir", newEnemy.getEnemyName());
    }

    @Test
    public void testSetEnemyHealth()
    {
        //Act
        newEnemy.setHealth(200);

        //Assert
        assertEquals(200, newEnemy.getHealth());
    }

    @Test
    public void testSetEnemyStrength()
    {
        //Act
        newEnemy.setStrength(10);

        //Assert
        assertEquals(10, newEnemy.getStrength());
    }
}

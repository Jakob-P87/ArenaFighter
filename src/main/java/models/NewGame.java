package models;

import se.lexicon.jakob.MainGame;

public class NewGame
{
    private static Character newCharacter;
    private static BattleSequence battle;

    public void newGame()
    {
        battle = new BattleSequence();

        String name = MainGame.scan.nextLine().trim();

        while(name.isEmpty())
        {
            name = MainGame.scan.nextLine().trim();
        }

        newCharacter = new Character(name);

        battle.Battle(newCharacter);
    }
}

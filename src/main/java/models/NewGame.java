package models;

import se.lexicon.jakob.MainGame;

public class NewGame
{
    private static Character newCharacter;
    private static Intermission menu;

    public void newGame()
    {
        menu = new Intermission();
        System.out.print("What is your champions name?" + "\n" + "Name: ");
        String name = MainGame.scan.nextLine().trim();


        while(name.isEmpty())
        {
            name = MainGame.scan.nextLine().trim();
        }

        newCharacter = new Character(name);

        menu.menu(newCharacter);
    }
}

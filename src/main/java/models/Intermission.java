package models;

import se.lexicon.jakob.MainGame;

public class Intermission
{
    private BattleSequence battle;
    private MainGame mainMenu;

    public void menu(Character player)
    {
        mainMenu = new MainGame();
        battle = new BattleSequence();

        boolean runMenu = true;

        while (runMenu)
        {
            System.out.println("=======[Menu]=======");
            System.out.println("[" + player.getName() + "]");
            System.out.println("Hp:" + player.getHealth() +
                    " Str:" + player.getStrength() +
                    " Def:" + player.getDefence());
            System.out.println("====================");

            System.out.print("[Fight]" +
                    " [Shop]" +
                    " [Exit game]");

            try
            {
                int choice = Integer.parseInt(MainGame.scan.nextLine());

                switch (choice)
                {
                    case 1:
                        battle.Battle(player);
                        break;
                    case 2:

                        break;
                    case 3:
                        runMenu = false;
                        break;
                    default:
                }
            } catch (Exception a)
            {
                System.out.println("Invalid input!");
            }
        }
    }
}

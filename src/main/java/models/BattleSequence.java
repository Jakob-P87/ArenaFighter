package models;

import se.lexicon.jakob.MainGame;

public class BattleSequence
{
    private static Character playerCharacter;
    private static Enemy enemy;

    public void Battle(Character player)
    {
        enemy = new Enemy();

        while (enemy.getHealth() > 0)
        {

            int choice = Integer.parseInt(MainGame.scan.nextLine());

            switch (choice)
            {
                case 1:
                    attack(player);
                    break;
                case 2:
                    break;
                default:
            }
            System.out.println("Enemy has " + enemy.getHealth() + " HP");
        }


    }

    private void attack(Character player)
    {
        if (enemy.getHealth() > 0);
        {
            enemy.setHealth(enemy.getHealth() - player.getStrength());
        }
    }

}

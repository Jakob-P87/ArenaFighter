package models;

import se.lexicon.jakob.MainGame;

public class BattleSequence
{
    private static Enemy enemy;
    private static Dice rollDice;

    public void Battle(Character player)
    {
        enemy = new Enemy();

        boolean runBattle = true;

        while (runBattle)
        {
            rollDice = new Dice(); //Reset the dice to get a new random roll inside the loop, not before
            System.out.println("What do you want to do?");
            System.out.println("#Attack" + "\n" + "#Defend");
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
            System.out.println(enemy.getEnemyName());
            System.out.println("Enemy has " + enemy.getHealth() + " HP");

            if (enemy.getHealth() <= 0)
            {
                System.out.println(enemy.getEnemyName() + " is dead!");
                runBattle = false;
            }
        }


    }

    private void attack(Character player)
    {
        if (enemy.getHealth() > 0);
        {
            System.out.println("You rolled " + rollDice.getDice());
            enemy.setHealth(enemy.getHealth() - player.getStrength() - rollDice.getDice());
        }
    }

}

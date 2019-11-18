package models;

import se.lexicon.jakob.MainGame;

public class BattleSequence
{
    private static Enemy enemy;
    private static Dice rollDice;
    private boolean runBattle;

    public void Battle(Character player)
    {
        runBattle = true;
        enemy = new Enemy();
        System.out.println("A new challenger has appeared!");
        System.out.print(enemy.getEnemyName() +
                " HP:" + enemy.getHealth() +
                " STR:" + enemy.getStrength() + "\n");

        while (runBattle)
        {
            rollDice = new Dice(); //Reset the dice to get a new random roll inside the loop, not before
            System.out.println("====================");
            System.out.println("[" + player.getName() + "]");
            System.out.println("Hp:" + player.getHealth() +
                    " Str:" + player.getStrength() +
                    " Def:" + player.getDefence());

            System.out.println("--------[VS]--------");
            System.out.println(enemy.getEnemyName());
            System.out.println("HP:" + enemy.getHealth() + " STR:" + enemy.getStrength());
            System.out.println("====================");

            System.out.println("What do you want to do?");
            System.out.println("#Attack" + "\n" + "#Defend" + "\n" + "#Retire");

            int choice = Integer.parseInt(MainGame.scan.nextLine());

            switch (choice)
            {
                case 1:
                    attack(player);
                    break;
                case 2:
                    defend(player);
                    break;
                case 3:
                    runBattle = false;
                    break;
                default:
            }
        }
    }

    private void attack(Character player)
    {
        int enemyRoll = new Dice().getDice(); //Make a new dice for the enemy damage

        if (enemy.getHealth() > 0)
        {
            System.out.println("You rolled: " + rollDice.getDice());
            enemy.setHealth(enemy.getHealth() - player.getStrength() - rollDice.getDice()); //Damage is equal to player strength and dice roll
            System.out.println("Enemy rolled: " + enemyRoll);
            player.setHealth(player.getHealth() - enemy.getStrength() - enemyRoll + player.getDefence()); //Damage is equal to enemy strength and dice roll

            if (player.getHealth() <= 0)
            {
                System.out.println("You have been defeated!");
                runBattle = false;
            }

            if (enemy.getHealth() <= 0)
            {
                System.out.println(enemy.getEnemyName() + " is defeated!");
                player.setHealth(player.getStartHealth()); //Reset player health if the player survive
                runBattle = false;
            }
        }
    }

    private void defend(Character player)
    {
        if (player.getHealth() > 0)
        {
            player.setHealth(player.getHealth() - enemy.getStrength() + player.getDefence());
        }
    }

}

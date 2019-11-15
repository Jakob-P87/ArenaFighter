package se.lexicon.jakob;

import models.NewGame;

import java.util.Scanner;

public class MainGame
{
    public static Scanner scan;
    private static NewGame newGame;

    public static void main(String[] args)
    {
        mainMenu();
    }

    static void mainMenu()
    {
        scan = new Scanner(System.in);
        newGame = new NewGame();

        boolean keepAlive = true;

        while(keepAlive)
        {

            System.out.println("==================[ARENA FIGHTER ULTIMATE EDITION]==================");
            System.out.println("     =======================[Main Menu]========================");
            System.out.print("#New Game" +
                    "\n" + "#Exit Game");

            int choice = Integer.parseInt(scan.nextLine().trim());

            switch (choice)
            {
                case 1:
                    System.out.println("New Game");
                    newGame.newGame();
                    break;
                case 2:
                    System.out.println("Exit Game");
                    keepAlive = false;
                    break;
                default:
            }
        }
        scan.close();
    }
}

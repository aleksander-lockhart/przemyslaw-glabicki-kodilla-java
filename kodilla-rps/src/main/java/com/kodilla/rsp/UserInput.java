package com.kodilla.rsp;

import java.util.Scanner;

public class UserInput {
    private String playerName;
    private int howManyGames;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return playerName;
    }

    public int getHowManyGames() {
        return howManyGames;
    }

    public void askPlayerName() {
        System.out.println("Player name?");
        playerName = sc.next();
    }

    public void askHowManyGames() {
        System.out.println("How many games?");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter number not some jibberish");
            sc.next();
        }
        howManyGames = sc.nextInt();
    }

    public static void newGame() {
        boolean isNewGame = true;
        System.out.println("Do you want to start a new game? Y/N");
        while(isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    RPS rps = new RPS();
                    rps.runRPS();
                case "N":
                    isNewGame = false;
                    break;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public static void quit(){
        System.out.println("Are you sure that you want end this game? Y/N");

        boolean isQuit = true;
        while (isQuit) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.out.println("End of the game.");
                    System.exit(0);
                case "N":
                    System.out.println("Resuming the game.");
                    isQuit = false;
                    break;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

}

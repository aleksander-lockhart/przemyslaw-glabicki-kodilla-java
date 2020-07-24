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
        howManyGames = sc.nextInt();
    }

    public boolean playAgain() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Play again? Y/N");
        String userSelection = input2.nextLine().toUpperCase();
        return userSelection.charAt(0) == 'Y';
    }
}

package com.kodilla.rsp;

import java.util.Scanner;

public class UserMove {
    Scanner input = new Scanner(System.in);

    public int userInput() {

        System.out.println("Select one: 1 - Rock, 2 - Paper, 3 - Scissors");
        System.out.println("x - for exit, n - for next game");

        while(true) {
            String selectedChar = input.nextLine().toLowerCase();

            switch (selectedChar) {
                case "1":
                    return GameLogic.rock;
                case "2":
                    return GameLogic.paper;
                case "3":
                    return GameLogic.scissors;
                case "x":
                    return GameLogic.exit;
                case "n":
                    return GameLogic.newgame;
                default:
                    System.out.println("Please select the correct option!");
                    System.out.println("Select one: 1 - Rock, 2 - Paper, 3 - Scissors");
                    System.out.println("x - for exit, n - for next game");

            }
        }
    }

}

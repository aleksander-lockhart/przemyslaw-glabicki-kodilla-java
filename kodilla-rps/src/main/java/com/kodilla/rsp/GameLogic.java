package com.kodilla.rsp;

import java.util.Scanner;

public class GameLogic {

    public static final int rock = 1;
    public static final int paper = 2;
    public static final int scissors = 3;
    public static final int exit = -1;
    public static final int newgame = -2;

    public static void gameLogic(String actualPlayer, int i) {
        switch (i) {
            case GameLogic.rock:
                System.out.println(actualPlayer + " shows rock!");
                break;
            case GameLogic.paper:
                System.out.println(actualPlayer + " shows paper!");
                break;
            case GameLogic.scissors:
                System.out.println(actualPlayer + " shows scissors");
                break;
            default:
                break;
        }
    }

    public static int compareAiAndPlayerMoves(int playerMove, int aiMove) {
        if (playerMove == aiMove) return 0;
        switch(playerMove) {
            case rock:
                return (aiMove == scissors ? 1 : -1);
            case paper:
                return (aiMove == rock ? 1 : -1);
            case scissors:
                return (aiMove == paper ? 1 : -1);
        }
        return 0;
    }

}

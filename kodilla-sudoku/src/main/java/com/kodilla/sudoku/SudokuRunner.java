package com.kodilla.sudoku;

import com.kodilla.sudoku.board.Board;
import com.kodilla.sudoku.input.UserDialogs;

public class SudokuRunner {

    public static void main(String[] args) {
        SudokuMain game = new SudokuMain();

        while(true) {
            System.out.println(game.getBoard());
            String input = UserDialogs.getOneData();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            if (input.equalsIgnoreCase("E")) {
                fillExampleData(game.getBoard());
            } else {
                int x = Integer.parseInt(input.substring(0, 1));
                int y = Integer.parseInt(input.substring(1, 2));
                int v = Integer.parseInt(input.substring(2));
                game.getBoard().setElement(y, x, v);
            }
        }
        game.resolveSudoku();
    }

    private static void fillExampleData(Board board) {
        board.setElement(0, 3, 2);
        board.setElement(0, 8, 3);
        board.setElement(1, 1, 7);
        board.setElement(1, 4, 9);
        board.setElement(1, 6, 2);
        board.setElement(2, 1, 6);
        board.setElement(2, 2, 1);
        board.setElement(2, 3, 5);
        board.setElement(2, 4, 8);
        board.setElement(2, 7, 4);
        board.setElement(2, 8, 9);
        board.setElement(3, 0, 8);
        board.setElement(3, 5, 4);
        board.setElement(3, 8, 1);
        board.setElement(5, 0, 7);
        board.setElement(5, 3, 8);
        board.setElement(5, 8, 4);
        board.setElement(6, 0, 5);
        board.setElement(6, 1, 9);
        board.setElement(6, 4, 7);
        board.setElement(6, 5, 8);
        board.setElement(6, 6, 3);
        board.setElement(6, 7, 1);
        board.setElement(7, 2, 4);
        board.setElement(7, 4, 3);
        board.setElement(7, 7, 5);
        board.setElement(8, 0, 6);
        board.setElement(8, 5, 1);
    }
}
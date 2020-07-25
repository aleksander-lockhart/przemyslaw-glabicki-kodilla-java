package com.kodilla.rsp;

public class RPS {
    private AiMove ai;
    private UserMove user;
    private UserInput userInput;
    private int playerScore;
    private int aiScore;
    private int gamesCounter;

    public void getPlayerName() {
        userInput.askPlayerName();
    }

    public void getHowManyGamesToPlay() {
        userInput.askHowManyGames();
    }

    public RPS() {
        ai = new AiMove();
        user = new UserMove();
        userInput = new UserInput();
        playerScore = 0;
        aiScore = 0;
        gamesCounter = 1;
    }

    public void runRPS() {
        RPS rps = new RPS();
        rps.getPlayerName();
        rps.getHowManyGamesToPlay();
        rps.startRSP();
    }

    public void startRSP() {
        while (userInput.getHowManyGames() > playerScore && userInput.getHowManyGames() > aiScore) {
            int playerSelect = user.userInput();

            if (playerSelect == GameLogic.newgame) {
                UserInput.newGame();
            } else if (playerSelect == GameLogic.exit) {
                UserInput.quit();

            } else {

                GameLogic.gameLogic(userInput.getName(), playerSelect);
                int aiSelect = ai.aiRandomMove();
                GameLogic.gameLogic("AI", aiSelect);
                int checkWhoWins = GameLogic.compareAiAndPlayerMoves(playerSelect, aiSelect);

                switch (checkWhoWins) {
                    case 0:
                        System.out.println("Tie!");
                        printStats();
                        break;
                    case 1:
                        System.out.println(userInput.getName() + " beats "
                                + "AI" + " You won!");
                        playerScore++;
                        printStats();
                        break;
                    case -1:
                        System.out.println("AI" + " beats "
                                + userInput.getName() + " You Lost!");
                        aiScore++;
                        printStats();
                        break;
                }
                gamesCounter++;


                if (playerScore == userInput.getHowManyGames()) {
                    System.out.println(userInput.getName() + " has won with: "
                            + userInput.getHowManyGames());
                    printStats();
                    UserInput.newGame();
                }
                if (aiScore == userInput.getHowManyGames()) {
                    System.out.println("Computer " + " has won with: "
                            + userInput.getHowManyGames());
                    printStats();
                    UserInput.newGame();
                }

            }
        }
    }
    public void printStats() {
        System.out.println("\n" + "------------------------------------------");
        System.out.println("Number of games played: " + gamesCounter);
        System.out.println(userInput.getName() +"'s score: " + playerScore);
        System.out.println("Computers score: " + aiScore);
        System.out.println("\n" + "------------------------------------------");
    }
}


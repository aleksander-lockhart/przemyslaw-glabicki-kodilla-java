package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws SecondChallengeExeption {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new SecondChallengeExeption();
        }
        return "Done!";
    }
}

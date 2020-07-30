package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result;

        try {
            result = secondChallenge.probablyIWillThrowException(3.0, 2.0);
            System.out.println(result);     

        } catch (SecondChallengeExeption e) {
            System.out.println("Check numbers, error: " + e);

        } finally {
            System.out.println("Calc completed");
        }
    }
}

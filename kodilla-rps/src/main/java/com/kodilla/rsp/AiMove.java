package com.kodilla.rsp;

import java.util.Random;

public class AiMove {

    public int aiRandomMove() {
        Random rnd = new Random();
        return rnd.nextInt(3) +1;
    }
}

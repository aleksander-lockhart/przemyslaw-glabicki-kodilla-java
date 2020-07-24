package com.kodilla.rsp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AiMove {

    public int aiRandomMove() {
        Random rnd = new Random();
        return rnd.nextInt(3);
    }
}

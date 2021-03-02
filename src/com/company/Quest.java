package com.company;

import java.util.Random;

public class Quest {

    public int score;

    public int getScore() {
        return score;
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public Primer getPrimer() {
        int a = generateRandomInt();
        int b = generateRandomInt();
        String question = a + " + " + b + " = ?";
        int answer = a + b;
        return new Primer(question, answer);
    }

    public void scorePlus() {
        this.score += 10;
    }
}

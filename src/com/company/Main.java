package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int generateRandomInt(int i) { // Генератор рандомного числа
        Random random = new Random();
        return random.nextInt(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer1;
        int score = 0;
        System.out.println("=========Mathematics Quest=========");
        for (int i = 0; i < 10; i++) {
            int a = generateRandomInt(10);
            int b = generateRandomInt(10);
            int chooseSymbol = generateRandomInt(4);
            switch (chooseSymbol) {
                case 0 -> {
                    Plus primer = new Plus(a, b);
                    answer1 = primer.getAnswer();
                    System.out.println(primer.getQuestion());
                }
                case 1 -> {
                    Minus primer = new Minus(a, b);
                    answer1 = primer.getAnswer();
                    System.out.println(primer.getQuestion());
                }
                case 2 -> {
                    Multiply primer = new Multiply(a, b);
                    answer1 = primer.getAnswer();
                    System.out.println(primer.getQuestion());
                }
                default -> {
                    Del primer = new Del(a, b);
                    answer1 = primer.getAnswer();
                    System.out.println(primer.getQuestion());
                }
            }
            int answer = in.nextInt();
            if (answer == answer1) {
                System.out.println("ВЕРНО");
                score += 10;
            } else {
                System.out.println("ОШИБКА");
            }
            System.out.println("-----");
        }
        System.out.println("Ваши очки: " + score);
    }
}

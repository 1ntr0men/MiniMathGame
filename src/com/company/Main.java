package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=========Mathematic Quest=========");
        Quest quest = new Quest();
        for (int i = 0; i < 3; i++) {
            Primer zadanie = quest.getPrimer();
            System.out.println(zadanie.getQuestion());
            int answer = in.nextInt();
            if (answer == zadanie.getAnswer()) {
                System.out.println("ВЕРНО");
            } else {
                System.out.println("ОШИБКА");
            }
            System.out.println("-----");
            quest.scorePlus();
        }
        System.out.println("Ваши очки: " + quest.getScore());
    }
}

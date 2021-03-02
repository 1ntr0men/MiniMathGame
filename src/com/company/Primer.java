package com.company;

public class Primer {
    public String question;
    public int answer;

    public Primer(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public boolean isRight(String answer) {
        return answer.equals(this.answer);
    }
}

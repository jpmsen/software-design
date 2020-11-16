package com.hz;


public class AnswerAdapter {
    private Answer answer;

    public AnswerAdapter(Answer a) {
        this.answer = a;
    }

    public Boolean checkAnswer(String line) {
        return this.answer.checkAnswer(line);
    }



}

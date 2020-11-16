package com.hz;

import java.util.ArrayList;

public class Answer {

    private ArrayList<String> acceptedAnswers;

    public Answer(ArrayList<String> ans) {
        this.acceptedAnswers = ans;
    }

    public Boolean checkAnswer(String answer) {
        for (String acceptedAnswer : acceptedAnswers) {
            if (acceptedAnswer.equals(answer)) {
                return true;
            }
        }

        return false;
    }
}

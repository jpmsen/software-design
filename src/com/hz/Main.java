package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // create list with all accepted answers
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");

        // create answer class and use an adapter to translate answers into a boolean.
        Answer answer = new Answer(list);
        AnswerAdapter answerAdapter = new AnswerAdapter(answer);

        // read response
        Boolean ans1 = answerAdapter.checkAnswer(reader.readLine());

        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }
    }
}

package com.hz;

import java.util.ArrayList;
import java.util.Collections;

public class WindowsBooleanAdapter implements BooleanAdapter {

    private ConsoleReader adaptee;
    private String[] answers;

    public WindowsBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;

        this.answers = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
    }

    @Override
    public Boolean readLineBoolean() {
        String line = this.adaptee.readLine();

        for (String acceptedAnswer : answers) {
            if (acceptedAnswer.equals(line)) {
                return true;
            }
        }
        return false;

    }
}

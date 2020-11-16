package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console {

    public Console() throws FileNotFoundException {
        System.setOut(new PrintStream(new File("studenten.txt")));
    }

    public void print(String msg) {
        System.out.println(msg  );
    }

}

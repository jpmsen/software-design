package com.hz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();


        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss.SS");

        writer.write(time.format(formattedTime));
    }
}

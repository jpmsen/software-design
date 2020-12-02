package com.company;

public class PostCard extends Card {
    public PostCard(Printer printer) {
        this.printer = printer;
    }

    public void printHeader() {
        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        this.printer.printLine(header);
    }

    public void printMessage() {
        String msg = "Greetings from the netherlands!";

        this.printer.printLine(msg);
    }

    public void printImage() {
            this.printer.printLine("        Art by Hayley Jane Wakenshaw");
            this.printer.printLine("");
            this.printer.printLine("             /)  (\\");
            this.printer.printLine("        .-._((,~~.))_.-,");
            this.printer.printLine("         `=.   99   ,='");
            this.printer.printLine("           / ,o~~o. \\");
            this.printer.printLine("          { { .__. } }");
            this.printer.printLine("           ) `~~~\' (");
            this.printer.printLine("          /`-._  _\\.-\\");
            this.printer.printLine("         /         )  \\");
            this.printer.printLine("       ,-X        #   X-.");
            this.printer.printLine("hjw   /   \\          /   \\");
            this.printer.printLine("     (     )| |  | |(     )");
            this.printer.printLine("      \\   / | |  | | \\   /");
            this.printer.printLine("       \\_(.-( )--( )-.)_/");
            this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
            this.printer.printLine("           /_,\\  /._\\");
    }

    public void printFooter() {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

        this.printer.printLine(footer);
    }

}

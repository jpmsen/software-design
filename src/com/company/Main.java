package com.company;

public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);

        HomeCinemaFacade homeCinema = new HomeCinemaFacade(amp, cd, dvd, popper, projector, screen, lights, tuner);

        homeCinema.startMovie(5, 5, "The Witcher");
        homeCinema.stopMovie();

        homeCinema.startMusic(5, "Spotify");
        homeCinema.stopMusic();

        homeCinema.startRadio(84,5);
        homeCinema.stopRadio();
    }
}

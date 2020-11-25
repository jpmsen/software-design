package com.company;

public class HomeCinemaFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    Tuner tuner;


    public HomeCinemaFacade(Amplifier amplifier,
                            CdPlayer cdPlayer,
                            DvdPlayer dvdPlayer,
                            PopcornPopper popcornPopper,
                            Projector projector,
                            Screen screen,
                            TheaterLights theaterLights,
                            Tuner tuner)
    {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }



    public void startMovie(int dimLightsValue, int volumeValue, String movieTitle) {
        // Turn popcornpopper on and pop
        this.popcornPopper.on();
        this.popcornPopper.pop();

        // Dim the lights using dimLightsValue
        this.theaterLights.dim(dimLightsValue);

        // Put screen down
        this.screen.down();

        // Put projector on and set to widescreen mode.
        this.projector.on();
        this.projector.wideScreenMode();

        // Turn on amplifier and put DVD in it.
        this.amplifier.on();
        this.amplifier.setDvd(this.dvdPlayer);

        // Put in surround sound mode and Set the volume using volumeValue
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(volumeValue);

        // Turn on dvdPlayer
        this.dvdPlayer.on();

        // Finally, play movie using movieTitle
        this.dvdPlayer.play(movieTitle);
    }

    public void stopMovie() {
        // Turn off popcorn popper.
        this.popcornPopper.off();

        // Put the lights back on.
        this.theaterLights.on();

        // Roll up screen
        this.screen.up();

        // Turn off projector and amplifier
        this.projector.off();
        this.amplifier.off();

        // Finally, stop dvd, eject dvd and turn off dvdPlayer
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }

    public void startMusic(int volumeValue, String cdTitle) {
        // Turn on lights
        this.theaterLights.on();

        // Turn on amplifier
        this.amplifier.on();

        // Set volume using volumeValue
        this.amplifier.setVolume(volumeValue);

        // Insert music disc into amplifier
        this.amplifier.setCd(this.cdPlayer);

        // Enable sterio sound
        this.amplifier.setStereoSound();

        // Turn on cdplayer and let the player play the cd
        this.cdPlayer.on();
        this.cdPlayer.play(cdTitle);
    }

    public void stopMusic() {
        // Turn off amplifier
        this.amplifier.off();

        // set amplifier to cd mode
        this.amplifier.setCd(this.cdPlayer);

        // eject cd and turn off cd player
        this.cdPlayer.eject();
        this.cdPlayer.off();
    }

    public void startRadio(double frequency, int volumeValue) {
        // turn the tuner on
        this.tuner.on();

        // set frequence to required number
        this.tuner.setFrequency(frequency);

        // turn on amplifier
        this.amplifier.on();

        // set volume to volumeValue
        this.amplifier.setVolume(volumeValue);

        // Set amplifier to tuner mode
        this.amplifier.setTuner(this.tuner);
    }

    public void stopRadio() {
        // Turn off tuner
        this.tuner.off();

        // Turn off amplifier
        this.amplifier.off();
    }
}

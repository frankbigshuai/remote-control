package edu.iu.habahram.remotecontroller.model;

public class Stereo {
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        setCD();
        setVolume(8);
        return location + " Stereo is on";

    }

    public String off() {
        return location + " Stereo is off";
    }

    public String setVolume(int volume) {
        return location + " Stereo volume set to " + volume;
    }

    public String setCD() {
        return location + " CD is set";
    }

    public String setDVD() {
        return location + " DVD is set";
    }

    public String setRadio() {
        return location + " Radio is set";
    }

}

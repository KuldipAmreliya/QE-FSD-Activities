package com.example;

public class Activity3 {

    public static void main(String[] args) {
        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("Age on EarthSeconds " + ageCounter(seconds, EarthSeconds));
        System.out.println("age on MercurySeconds " + ageCounter(seconds, MercurySeconds));
        System.out.println("Age on VenusSeconds " + ageCounter(seconds, VenusSeconds));
        System.out.println("Age on MarsSeconds " + ageCounter(seconds, MarsSeconds));
        System.out.println("Age on JupiterSeconds " + ageCounter(seconds, JupiterSeconds));
        System.out.println("Age on SaturnSeconds " + ageCounter(seconds, SaturnSeconds));
        System.out.println("Age on UranusSeconds " + ageCounter(seconds, UranusSeconds));
        System.out.println("Age on NeptuneSecondsrth " + ageCounter(seconds, NeptuneSeconds));
    }

    static double ageCounter(double seconds, double planet) {
        return planet / seconds;
    }

}

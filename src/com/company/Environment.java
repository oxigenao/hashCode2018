package com.company;

import java.util.ArrayList;

public class Environment {

    public int totalSteps;
    public int currentStep = 0;
    public int bonus;
    public int width;
    public int height;
    public int numRiders;
    public int numRides;

    public ArrayList<Ride> rides;

    public Environment(int totalSteps, int bonus, int width, int height, int numRiders, int numRides){
        this.totalSteps = totalSteps;
        this.bonus = bonus;
        this.width = width;
        this.height = height;
        this.numRiders = numRiders;
        this.numRides = numRides;

        this.rides = new ArrayList<>();
    }

    public void addRide(Ride ride){
        this.rides.add(ride);
    }
}

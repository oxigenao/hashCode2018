package com.company;

import java.util.ArrayList;

public class Rider {

    public int currentX;
    public int currentY;

    public ArrayList<Ride> assignedRides;

    Rider(){
        this.currentX = 0;
        this.currentY = 0;
        this.assignedRides = new ArrayList<>();
    }

    public void assignRide(Ride ride){
        this.assignedRides.add(ride);
    }
}

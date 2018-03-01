package com.company;

public class Ride {

    public int startX;
    public int startY;
    public int finishY;
    public int finishX;
    public int earliestStart;
    public int latestFinish;

    public boolean isAssigned = false;

    Ride(int startX, int startY, int finishX, int finishY, int earliestStart, int latestFinish){
        this.startX = startX;
        this.startY = startY;
        this.finishX = finishX;
        this.finishY = finishY;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }
}

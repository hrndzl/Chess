package com.hrndzl.chess;

public abstract class Pieces {
    public final String color;
    public String location;
    public int currentRow, currentColumn;

    public Pieces(String location, int currentRow, int currentColumn, String color) {
        this.location = location;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        this.color = color;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

}
package com.hrndzl.chess;

public abstract class Pieces {
    private final String name, color;
    private String location;

    public Pieces(String name, String location, String color) {
        this.name = name;
        this.location = location;
        this.color = color;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String newLocation) {

    }
}

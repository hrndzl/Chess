package com.hrndzl.chess;

public abstract class Pieces {
    String name, location, color;

    public Pieces(String name, String location, String color) {
        this.name = name;
        this.location = location;
        this.color = color;
    }
}

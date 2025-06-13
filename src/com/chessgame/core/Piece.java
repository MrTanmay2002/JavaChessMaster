package com.chessgame.core;

public abstract class Piece {
    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isValidMove(int x1, int y1, int x2, int y2);
}



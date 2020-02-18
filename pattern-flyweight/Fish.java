package com.company;
import java.awt.*;

public class Fish {
    private int x;
    private int y;
    private FishType type;

    public Fish(int x, int y, FishType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}

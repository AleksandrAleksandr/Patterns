package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Ocean extends JFrame{
    private List<Fish> fishes = new ArrayList<>();

    public void plantFish(int x, int y, String name, String path) {
        FishType type = FishFactory.getFishType(name, path);
        Fish fish = new Fish(x, y, type);
        fishes.add(fish);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Fish fish : fishes) {
            fish.draw(graphics);
        }
    }
}

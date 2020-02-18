package com.company;

public class TerraceDecorator extends HouseDecorator {
    public TerraceDecorator(House house) {
        super(house);
    }

    public int getPrice() {
        return house.getPrice() + 1000;
    }

    public int getSpace() {
        return house.getSpace() + 10;
    }

    public String getName() {
        return house.getName() + " with terrace";
    }
}

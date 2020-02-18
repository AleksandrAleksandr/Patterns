package com.company;

public class HouseDecorator implements House {
    protected final House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public int getPrice() {
        return house.getPrice();
    }

    @Override
    public int getSpace() {
        return house.getSpace();
    }

    @Override
    public String getName() {
        return house.getName();
    }
}

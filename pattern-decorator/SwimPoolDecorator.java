package com.company;

public class SwimPoolDecorator extends HouseDecorator{
    public SwimPoolDecorator(House house) {
        super(house);
    }

    public int getPrice() {
        return house.getPrice() + 9000;
    }

    public int getSpace() {
        return house.getSpace() + 20;
    }

    public String getName() {
        return house.getName() + " with swimming pool";
    }
}

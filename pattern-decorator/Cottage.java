package com.company;

public class Cottage implements House {
    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getSpace() {
        return 50;
    }

    @Override
    public String getName() {
        return "Cottage";
    }
}

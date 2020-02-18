package com.company;

public class Main {

    public static void main(String[] args) {

	    House cottage = new Cottage();
        System.out.println("Price: " + cottage.getPrice() + " Square: " + cottage.getSpace() + " Description: " + cottage.getName());

        cottage = new TerraceDecorator(cottage);
        System.out.println("Price: " + cottage.getPrice() + " Square: " + cottage.getSpace() + " Description: " + cottage.getName());

        cottage = new SwimPoolDecorator(cottage);
        System.out.println("Price: " + cottage.getPrice() + " Square: " + cottage.getSpace() + " Description: " + cottage.getName());
    }
}

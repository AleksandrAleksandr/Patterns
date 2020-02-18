package com.company;

public class Main {

    static int CANVAS_SIZE = 1000;

    public static void main(String[] args) {
        Ocean ocean = new Ocean();

        for (int i = 0; i < Math.floor(500 / 3); i++) {
            ocean.plantFish(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Shark", "src/shark.png");
            ocean.plantFish(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Plankton", "src/plankton.png");
            ocean.plantFish(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Turtle", "src/turtle.png");
        }
        ocean.setSize(CANVAS_SIZE, CANVAS_SIZE);
        ocean.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}

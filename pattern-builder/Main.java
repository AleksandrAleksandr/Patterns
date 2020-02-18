package com.company;

public class Main {

    public static void main(String[] args) {

        PoorBuilder builder = new PoorBuilder();
        Foreman foreman = new Foreman(builder);

        foreman.build("village");
        foreman.build("standart");

        RichBuilder builder2 = new RichBuilder();
        foreman = new Foreman(builder2);
        foreman.build("village");
        foreman.build("standart");
    }
}

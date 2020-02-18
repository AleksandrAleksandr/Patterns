package com.company;

public class PoorBuilder implements Builder {

    public void buildRoof(){System.out.println("\n      /   \\ \n" +
                                               "     /     \\ \n" +
                                               "    /       \\");};

    public void buildFloor(){System.out.println("    ----------\n" +
                                                "    |        |");};

    public void buildPodval(){ System.out.println("\n    |     |\n" +
                                                  "     ------");};

    public void buildGrass(){System.out.print("//");};
    public void buildStatue(){System.out.print("0");};

    @Override
    public void buildGround() {
        System.out.print("----------------");
    }
}

package com.company;

public class Foreman {

    Builder builder;

    Foreman(Builder b){
        builder = b;
    }

    public void build(String type){
        if (type.equals("village")){
            builder.buildRoof();
            builder.buildFloor();
            builder.buildStatue();
            builder.buildGrass();
            builder.buildGround();
            builder.buildGrass();
            builder.buildStatue();
            builder.buildPodval();
        }
        else if (type.equals("standart")){
            builder.buildRoof();
            builder.buildFloor();
            builder.buildFloor();
            builder.buildGround();
            builder.buildPodval();
        }

    }
}

package com.company;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FishFactory {
    static Map<String, FishType> fishTypes = new HashMap<>();

    public static FishType getFishType(String name, String path) {
        FishType result = fishTypes.get(name);
        if (result == null) {
            result = new FishType(name, path);
            fishTypes.put(name, result);
        }
        return result;
    }
}

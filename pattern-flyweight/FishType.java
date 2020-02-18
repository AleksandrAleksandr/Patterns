package com.company;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class FishType {
    private String name;
    private String sprite_path;
    private Image image;

    public FishType(String name, String path) {
        this.name = name;
        this.sprite_path = path;
    }

    public void draw(Graphics g, int x, int y) {
        try
        {
            image = ImageIO.read(new File(sprite_path));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        g.drawImage(image, x, y, null);
    }
}

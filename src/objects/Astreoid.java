package objects;

import core.FPS;
import core.Window;

import render.Renderable;
import render.Renderer;
import update.Updateable;
import update.Updater;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Astreoid implements Updateable, Renderable{
    private double width;
    private double height;
    private double x;
    private double y;

    private final int layer = 2;

    private static BufferedImage astreoid;

    private double speed = 150;

    public int randDimensionsMax = 75;
    public int randDimensionsMin = 35;

    Random rand = new Random();

    public Astreoid() throws IOException{
        int dimensions = rand.nextInt(randDimensionsMax + 1);

        if (dimensions < randDimensionsMin)
            dimensions = randDimensionsMin;

        width = dimensions;
        height = dimensions;

        int posX = rand.nextInt((int)Window.getWinWidth() - (int)getWidth() +1);
        this.x = posX;
        this.y = -getHeight();

        astreoid = ImageIO.read(new File("res/Astreoid.png"));

        Renderer.addRenderableObject(this);
        Updater.AddUpdateableObjects(this);
    }
    @Override
    public int getLayer() {
        return layer;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public BufferedImage getBufferedImage() {
        return astreoid;
    }

    @Override
    public void update() throws IOException{
        y += speed * FPS.getDeltaTime();

        if(y >= Window.getWinHeight()){
            Updater.RemoveUpdateableObjects(this);
            Renderer.removeRenderableObject(this);
        }
    }

    @Override
    public String getID(){
        return "astreoid";
    }

    @Override
    public Renderable getRenderable(){
        return this;
    }

    @Override
    public boolean drawCollisionBox(){
        return false;
    }
}

package effects;

import core.FPS;
import render.Renderable;
import render.Renderer;
import update.Updateable;
import update.Updater;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Explosion implements Renderable, Updateable {
    private BufferedImage[] frames;
    private int currentFrame = 0;
    private double frameDuration = 0.05;
    private double timeSinceLastFrame = 0;

    private double x, y;
    private int layer = 3;

    private int width, height;

    public Explosion(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
        BufferedImage spriteSheet = ImageIO.read(new File("res/a1.png"));
        frames = extractFrames(spriteSheet, 5, 5);

        width = frames[0].getWidth();
        height = frames[0].getHeight();

        Renderer.addRenderableObject(this);
        Updater.AddUpdateableObjects(this);
    }

    private BufferedImage[] extractFrames(BufferedImage sheet, int rows, int cols) {
        int frameWidth = sheet.getWidth() / cols;
        int frameHeight = sheet.getHeight() / rows;
        BufferedImage[] result = new BufferedImage[rows * cols];
        int index = 0;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if (index < result.length) {
                    result[index++] = sheet.getSubimage(x * frameWidth, y * frameHeight, frameWidth, frameHeight);
                }
            }
        }
        return result;
    }

    @Override
    public void update() {
        timeSinceLastFrame += FPS.getDeltaTime();
        if (timeSinceLastFrame >= frameDuration) {
            currentFrame++;
            timeSinceLastFrame = 0;

            if (currentFrame >= frames.length) {
                currentFrame = frames.length - 1;
                Renderer.removeRenderableObject(this);
                Updater.RemoveUpdateableObjects(this);
            }
        }
    }

    @Override
    public BufferedImage getBufferedImage() {
        return frames[currentFrame];
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
    public int getLayer() {
        return layer;
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
    public String getID() {
        return "explosion";
    }

    @Override
    public Renderable getRenderable() {
        return this;
    }

    @Override
    public boolean drawCollisionBox() {
        return false;
    }
}

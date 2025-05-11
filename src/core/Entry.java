package core;

import objects.Astreoid;
import objects.Background;
import objects.Spaceship;
import render.Renderer;
import update.Updater;
import objects.AstreoidSpawner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Entry {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        Window window = new Window("MeteoPix", Window.getWinWidth(), Window.getWinHeight());
        Renderer renderer = new Renderer();
        Updater updater = new Updater();


        window.addKeyListener(new Input());
        window.add(renderer);
        window.packWindow();
        window.setVisible(true);

        boolean RunGame = true;

        new Spaceship((Window.getWinWidth() / 2) - (Spaceship.width / 2), window.getWinHeight()-150);
        new Background(-Window.getWinHeight());
        new AstreoidSpawner();

        FPS.calBeginTime();
        while (RunGame) {
            updater.update();
            renderer.repaint();
            //System.out.printf("%f\n",FPS.getDeltaTime());
            FPS.calcDeltaTime();
        }
    }
}

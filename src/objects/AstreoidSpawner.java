package objects;

import java.io.IOException;

import core.Timer;

import render.Renderable;
import update.Updateable;
import update.Updater;

public class AstreoidSpawner implements Updateable{
    private static final int spawnTimeMillis = 500;
    Timer timer = new Timer(spawnTimeMillis);

    public AstreoidSpawner() {
        Updater.AddUpdateableObjects(this);
    }

    @Override
    public void update() throws IOException{
        if (timer.isRinging()){
            new Astreoid();
            timer.resetTimer();
        }
    }

    @Override
    public String getID(){
        return null;
    }

    @Override
    public Renderable getRenderable(){
        return null;
    }
}

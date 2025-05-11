package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    public static final int SPACE = 4;

    public static boolean[] keys = new boolean[5];

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            keys[LEFT] = true;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            keys[RIGHT] = true;
        if(e.getKeyCode() == KeyEvent.VK_UP)
            keys[UP] = true;
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            keys[DOWN] = true;
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
            keys[SPACE] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            keys[LEFT] = false;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            keys[RIGHT] = false;
        if(e.getKeyCode() == KeyEvent.VK_UP)
            keys[UP] = false;
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            keys[DOWN] = false;
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
            keys[SPACE] = false;
    }
}

package render;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import core.GameData;
import core.Window;

public class Renderer extends JPanel {

    private static ArrayList<Renderable> renderableObjects = new ArrayList<Renderable>();
    private static ArrayList<Renderable> addRenderableObjects = new ArrayList<Renderable>();
    private static ArrayList<Renderable> removeRenderableObjects = new ArrayList<Renderable>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (Renderable object : renderableObjects)
            object.drawSprite(g2d);

        renderableObjects.removeAll(removeRenderableObjects);
        if(addRenderableObjects.size() > 0){
            renderableObjects.addAll(addRenderableObjects);
            Collections.sort(renderableObjects);
        }

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Score: " + GameData.score, 20, 30);

        addRenderableObjects.clear();
        removeRenderableObjects.clear();

    }

    public static void addRenderableObject(Renderable object) {
        addRenderableObjects.add(object);
    }

    public static void removeRenderableObject(Renderable object) {
        removeRenderableObjects.add(object);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int) Window.getWinWidth(), (int) Window.getWinHeight());
    }
}

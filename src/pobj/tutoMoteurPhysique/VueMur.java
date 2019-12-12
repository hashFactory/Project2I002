package pobj.tutoMoteurPhysique;

import pobj.ihm.Drawable;
import pobj.physics.RectanglePhysique;

import java.awt.*;

public class VueMur implements Drawable {

    private double x;
    private double y;
    private double width;
    private double height;

    public VueMur() {
    }

    public VueMur(RectanglePhysique cp) {
        this.x = cp.getPosX();
        this.y = cp.getPosY();
        this.width = cp.getLarg();
        this.height = cp.getHaut();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect((int) x, (int) y, (int) width, (int) height);
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
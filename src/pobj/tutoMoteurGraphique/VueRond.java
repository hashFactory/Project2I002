package pobj.tutoMoteurGraphique;

import pobj.ihm.Drawable;

import java.awt.*;

public class VueRond implements Drawable {

    private int x;
    private int y;
    private int rayon;

    public VueRond() {
    }

    public VueRond(int x, int y, int rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void move() {
        this.x++;
        this.y++;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval((int) x, (int) y, (int) (2*rayon), (int) (2*rayon));
    }

    @Override
    public int getPriority() {
        return 0;
    }
}

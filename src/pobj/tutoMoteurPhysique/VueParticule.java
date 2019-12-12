package pobj.tutoMoteurPhysique;

import pobj.ihm.Drawable;
import pobj.physics.CerclePhysique;

import java.awt.*;

public class VueParticule implements Drawable {

    private double x;
    private double y;
    private double rayon;

    public VueParticule() {
    }

    public VueParticule(CerclePhysique cp) {
        this.x = cp.getPosX();
        this.y = cp.getPosY();
        this.rayon = cp.getRayon();
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
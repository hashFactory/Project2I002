package pobj.tutoMoteurPhysique;

import pobj.ihm.Drawable;
import pobj.ihm.Fenetre;
import pobj.simuagent.Terrain;
import pobj.simuagent.factory_terrain.MapFactoryFromFile_Matrix;

public class TestEverything {

    public static void main(String [] args) {
        Terrain[][] mp = MapFactoryFromFile_Matrix.build("src/salle_concert.trk");
        System.out.println(mp.toString());
        
        Terrain.display(mp);


    }

}

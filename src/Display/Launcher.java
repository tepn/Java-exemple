/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Display;

import animalKingdom.*;
import geometricShape.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tepn
 */
public class Launcher {
    /**
     * This is the main Frame, the window where the show takes place
     */
    public static MyJFrame myJFrame;
    public static Random rand = new Random();

    /**
     * This constructor create a Frame and a preset list of animals
     */
    public Launcher () {
            ArrayList<Vertebrate> vertebrates = new ArrayList<>(12);
            
            vertebrates.add(new Carnivora());
            vertebrates.add(new Carnivora());
            vertebrates.add(new Carnivora());
            vertebrates.add(new Carnivora());
            vertebrates.add(new Carnivora());
            
            vertebrates.add(new Falconiformes());
            vertebrates.add(new Falconiformes());
            vertebrates.add(new Falconiformes());
            vertebrates.add(new Falconiformes());
            vertebrates.add(new Falconiformes());
            
            vertebrates.add(new Galliformes());
            vertebrates.add(new Galliformes());
            vertebrates.add(new Galliformes());
            vertebrates.add(new Galliformes());
            vertebrates.add(new Galliformes());
            
            vertebrates.add(new Lacertilia());
            vertebrates.add(new Lacertilia());
            vertebrates.add(new Lacertilia());
            
            vertebrates.add(new Primates());
            vertebrates.add(new Primates());
            vertebrates.add(new Primates());
            vertebrates.add(new Primates());
            vertebrates.add(new Primates());
            
            vertebrates.add(new Serpentes());
            vertebrates.add(new Serpentes());
            
            myJFrame = new MyJFrame(vertebrates);
    }

    /**
     * Add a new animal in the list of animals to be painted on the screen.
     * @param a is the animal to be added in the list
     */
    public static void add(Vertebrate a) {
            myJFrame.panel.vertebrates.add(a);
    }

    /**
     * This function helps animals to be at a random position at the begining
     * @return a position random on the screen
     */
    public static Point getRandPosition() {
        int x = rand.nextInt(600);
        int y = rand.nextInt(600);
        return new Point(x,y);
    }
}

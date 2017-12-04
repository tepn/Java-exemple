/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Display;

import animalKingdom.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import animalKingdom.Vertebrate;
import java.awt.Image;

/**
 *
 * @author tepn
 */
public class MyJPanel extends JPanel {
    public static int gameTimeFrame = 120;
    public double lastFrameTime;
    Image dbImage;
    Graphics dbg;
    public ArrayList<Vertebrate> vertebrates;
    
    public MyJPanel(ArrayList<Vertebrate> vertebrates) {
        super();
        lastFrameTime = System.currentTimeMillis();
        this.vertebrates = vertebrates;
    }
    
    @Override
    public void paint(Graphics g){
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);	// Calling the method below
        g.drawImage(dbImage, 0, 0, null);
    }
    
    @Override
    public void paintComponent(Graphics g){
    	//update(System.currentTimeMillis());
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, 600, 600);
    	Vertebrate[] t = new Vertebrate[vertebrates.size()];
    	vertebrates.toArray(t);
    	for (int i = 0; i < t.length; i++) {
    		t[i].move();
    		t[i].paint(g);
    		for (int j = i + 1; j < t.length; j++) {
                    if ((t[i] instanceof Carnivora) && (t[j] instanceof Carnivora)) {
                        if (t[i].getPosition().dist(t[j].getPosition()) <50) {
                            t[i].setState(1);
                            t[j].setState(1);
                            
                        }
                    }
                    if ((t[i] instanceof Falconiformes) && (t[j] instanceof Falconiformes)) {
                        if (t[i].getPosition().dist(t[j].getPosition()) <50) {
                            t[i].setState(1);
                            t[j].setState(1);
                            
                        }
                    }
                    if ((t[i] instanceof Galliformes) && (t[j] instanceof Galliformes)) {
                        if (t[i].getPosition().dist(t[j].getPosition()) <50) {
                            t[i].setState(1);
                            t[j].setState(1);
                            
                        }
                    }
                    if ((t[i] instanceof Primates) && (t[j] instanceof Primates)) {
                        if (t[i].getPosition().dist(t[j].getPosition()) <50) {
                            t[i].setState(1);
                            t[j].setState(1);
                            
                        }
                    }
                }
        }
        repaint();
    }
}

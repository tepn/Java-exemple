package animalKingdom;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import geometricShape.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author tepn
 */
public interface Vertebrate {
    public Shape getShape();
    public Color getColor();
    public Point getPosition();
    public int getDirection();
    public int getState();
    public void setState(int state);
    public void move();
    public void paint(Graphics g);
}

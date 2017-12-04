package animalKingdom;

import geometricShape.*;
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author tepn
 */

//Lizard
public class Lacertilia extends Reptile{
    protected Shape shape;
    protected Color color;
    protected Point position;
    
    public Lacertilia() {
        this.color = Color.DARK_GRAY;
        position = Display.Launcher.getRandPosition();
        this.shape = new Circle(position, 15);
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void move() {
        if (position.x <= 580)
            position.x += 1;
        else
            position.x = 0;
    }
    
    @Override
    public void paint (Graphics g) {
        g.setColor(color);
        shape.draw(g, this.getPosition());
    }
}


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

//Snake
public class Serpentes extends Reptile{
    protected Shape shape;
    protected Color color;
    protected Point position;
    
    public Serpentes() {
        this.color = Color.GREEN;
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
        if (position.x >= 0)
            position.x -= 1;
        else
            position.x = 580;
    }

    @Override
    public void paint (Graphics g) {
        g.setColor(color);
        //++ age;
        shape.draw(g, this.getPosition());
    }
}

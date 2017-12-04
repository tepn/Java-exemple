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

//Terrestre bird
public class Galliformes extends Bird{
    protected Shape shape;
    protected Color color;
    protected Point position;
    protected int direction;
    protected int state;
    
    public Galliformes() {
        this.color = Color.ORANGE;
        position = Display.Launcher.getRandPosition();
        this.shape = new Triangle(position, new Point(position.x - 10, position.y - 5), new Point(position.x + 10, position.y - 5));
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
    public int getDirection() {
        return this.direction;
    }
    
    @Override
    public int getState() {
        return this.state;
    }
    
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void move() {
        if (this.state == 0) {
            switch(this.direction) {
                case 0:
                    if (position.x <= 580)
                        position.x += 1;
                    else
                        position.x = 580-position.x;
                    if (position.y <= 580)
                        position.y += 1;
                    else
                        this.direction = 5;
                    break;
                case 1:
                    if (position.y <= 580)
                        position.y += 1;
                    else
                        this.direction = 4;
                    break;
                case 2:
                    if (position.x >= 0)
                        position.x -= 1;
                    else
                        position.x = 580;
                    if (position.y <= 580)
                        position.y += 1;
                    else
                        this.direction = 3;
                    break;
                case 3:
                    if (position.x >= 0)
                        position.x -= 1;
                    else
                        position.x = position.x+580;
                    if (position.y >= 0)
                        position.y -= 1;
                    else
                        this.direction = 2;
                    break;
                case 4:
                    if (position.y >= 0)
                        position.y -= 1;
                    else
                        this.direction = 1;
                    break;
                case 5:
                    if (position.x <= 580)
                        position.x += 1;
                    else
                        position.x = 580-position.x;
                    if (position.y >= 0)
                        position.y -= 1;
                    else
                        this.direction = 0;
                    break;
                default:
                    break;
            }
        } else {
            if (position.x <= 580)
                position.x += 2;
            else
                position.x = 0;
        }
    }
    
    @Override
    public void paint (Graphics g) {
        g.setColor(color);
        //++ age;
        shape.draw(g, this.getPosition());
    }
}

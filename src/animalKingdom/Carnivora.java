/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalKingdom;

import geometricShape.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author tepn
 */
public class Carnivora extends Mammal {
    protected Shape shape;
    protected Color color;
    protected Point position;
    protected int direction;
    protected int state;
    
    public Carnivora() {
        this.state = 0; //look for friends
        this.direction = Display.Launcher.rand.nextInt(8);
        this.color = Color.RED;
        position = Display.Launcher.getRandPosition();
        this.shape = new Square(position, new Point(position.x + 40, position.y + 40));
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
    public void move() {
        if (this.state == 0) {
            switch(this.direction) {
                case 0:
                    if (position.x <= 580)
                        position.x += 2;
                    else
                        position.x = 0;
                    break;
                case 1:
                    if (position.x <= 580)
                        position.x += 1;
                    else
                        position.x = 580-position.x;
                    if (position.y <= 580)
                        position.y += 1;
                    else
                        position.y = 580-position.y;
                    break;
                case 2:
                    if (position.y <= 580)
                        position.y += 2;
                    else
                        position.y = 580-position.y;
                    break;
                case 3:
                    if (position.x >= 0)
                        position.x -= 1;
                    else
                        position.x = 580;
                    if (position.y <= 580)
                        position.y += 1;
                    else
                        position.y = position.y-580;
                    break;
                case 4:
                    if (position.x >= 0)
                        position.x -= 2;
                    else
                        position.x = 580;
                    break;
                case 5:
                    if (position.x >= 0)
                        position.x -= 1;
                    else
                        position.x = position.x+580;
                    if (position.y >= 0)
                        position.y -= 1;
                    else
                        position.y = position.y+580;
                    break;
                case 6:
                    if (position.y >= 0)
                        position.y -= 2;
                    else
                        position.y = position.y+580;
                    break;
                case 7:
                    if (position.x <= 580)
                        position.x += 1;
                    else
                        position.x = 580-position.x;
                    if (position.y >= 0)
                        position.y -= 1;
                    else
                        position.y = position.y+580;
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
    public void setState(int state) {
        this.state = state;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        shape.draw(g, this.getPosition());
    }
}

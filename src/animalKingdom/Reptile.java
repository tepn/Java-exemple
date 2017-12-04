/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalKingdom;

import geometricShape.*;
import java.awt.Color;

/**
 *
 * @author tepn
 */
public abstract class Reptile implements Vertebrate{
    private Shape shape;
    private Color color;
    private Point position;
    protected int direction;
    protected int state;

    @Override
    public Shape getShape() {
        return this.shape;
    }
    
    @Override
    public Color getColor() {
        return this.color;
    }
    
    @Override
    public Point getPosition() {
        return this.position;
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
}

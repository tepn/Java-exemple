package geometricShape;

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
public class Circle extends AbsShape{
    protected Point center;
    protected double radius;
    
    public Circle(Point c, double r) {
        center = c;
        radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw(Graphics g, Point position) {
        g.fillOval((int) position.x, (int) position.y, 30, 30);
    }
}


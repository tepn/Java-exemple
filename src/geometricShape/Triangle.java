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
public class Triangle extends AbsShape{
    String name;
    Point corner1, corner2, corner3;
    
    public Triangle(Point p1, Point p2, Point p3) {
        corner1 = p1;
        corner2 = p2;
        corner3 = p3;
    }
    
    @Override
    public double area() {
        return Math.abs(((corner2.x - corner1.x) * (corner3.y - corner1.y) - (corner3.x - corner1.x) * (corner2.y - corner1.y)) / 2);
    }

    @Override
    public void draw(Graphics g, Point position) {
        int a = (int) position.x;
        int b = (int) position.y;
        int x[] = {a, a - 10, a + 10};
        int y[] = {b, b + 5, b + 5};
        g.fillPolygon(x, y, 3);
        
    }
}

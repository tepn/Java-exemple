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
public class Square extends AbsShape{
    protected Point TL, BR;
    
    public Square(Point p1, Point p2) {
        TL = p1;
        BR = p2;
    }
    public void setCornerLD(Point p) {
        this.TL = p;
    }
    
    public void setCornerRU(Point p) {
        this.BR = p;
    }
    
    @Override
    public double area() {
        return (BR.x - TL.x) + (BR.y - TL.y);
    }

    @Override
    public void draw(Graphics g, Point position) {
            g.fillRect((int) TL.x, (int) TL.y, 20, 20);
    }
}

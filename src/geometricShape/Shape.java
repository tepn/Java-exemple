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
public interface Shape {
    public double area();
    public void draw(Graphics g, Point position);
}

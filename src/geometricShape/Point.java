package geometricShape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tepn
 */
public class Point {
    public double x, y;
    
    public Point(double a, double b) {
        x = a;
        y = b;
    }
    
    public int dist(Point p) {
        return (int) Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

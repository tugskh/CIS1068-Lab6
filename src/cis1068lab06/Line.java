/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis1068lab06;

/**
 *
 * @author tugsbilegkhaliunbat
 */
public class Line {
    private Point p1;
    private Point p2;
    
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(int x1, int y1, int x2, int y2){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        
    }
    public Point getP1(){
        return this.p1;
    }
    public Point getP2(){
        return this.p2;
    }
    public String toString(){
        return "["+p1+p2+"]";
    }
    public double getSlope(){
        return (double)(p2.getY()-p1.getY())/(double)(p2.getX()-p1.getX());
    }
    public boolean isCollinear(Point p){
        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p,p1);
        if(l1.getSlope()==l2.getSlope())
            return true;
        return false;
    }
}

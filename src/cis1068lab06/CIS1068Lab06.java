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
public class CIS1068Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point(0,1);
        Point p2 = new Point(2,3);
        
        Line l = new Line(p1,p2);
        System.out.println("P1:"+l.getP1()+" P2:"+l.getP2()+"\nLine:"+l.toString()+"\nSlope:"+l.getSlope());
        System.out.println("isCollinear: "+l.isCollinear(new Point(9,10)));
        
        Line l1 = new Line(4,7,5,1);
        System.out.println("P1:"+l1.getP1()+" P2:"+l1.getP2()+"\nLine:"+l1.toString()+"\nSlope:"+l1.getSlope());
        System.out.println("isCollinear: "+l1.isCollinear(new Point(9,10)));
        
        
        
        RationalNumber rn = new RationalNumber(12,-144);
        System.out.println(""+rn.toString());
    }
    
}

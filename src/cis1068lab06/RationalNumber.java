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
public class RationalNumber {
    private int num;
    private int den;
    public RationalNumber(int num, int den){
        this.num = num;
        this.den = den;
    }
    public int getNumerator(){
        return num;
    }
    public int getDenominator(){
        return den;
    }
    public int euclidean(int x, int y){
        if(x==0)
            return y;
        return euclidean(y%x,x);
    }
    public String toString(){
        if(den/euclidean(num,den)<0)
            return -1*num/euclidean(num, den)+"/"+-1*den/euclidean(num,den);
        else if(den/euclidean(num,den)==1)
            return ""+num/euclidean(num, den);
        else
            return num/euclidean(num, den)+"/"+den/euclidean(num,den);
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public abstract class Lingkaran extends bangunDatar {
    private double r;
    
    public Lingkaran(double r){
        this.r=r;
    }
    public double hitunganKeliling(){
        return 2*3.14*r;
    }
    public double hitunganLuas(){
        return 3.14*r*r;
    }
}

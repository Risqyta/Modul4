/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author ASUS
 */
public class Operasi implements Kalkulator{
    double Bil1;
    private double Bil2;

    public Operasi(double Bil1, double Bil2) {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }
   @Override
    public double Penjumlahan(){
        return Bil1+Bil2;
    }
    @Override
    public double Pengurangan(){
        return Bil1-Bil2;
    }
    @Override
    public double Perkalian(){
        return Bil1*Bil2;
    }
    @Override
    public double Pembagian(){
        return Bil1/Bil2;
    }

  
    
    }
    
    


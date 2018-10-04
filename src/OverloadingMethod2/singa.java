/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingMethod2;

/**
 *
 * @author ASUS
 */
public class singa extends hewan {
   
    @Override
    void setNama(){
        String singa = "Diablo";
        System.out.println("Nama kucing: "+singa);
    }
    @Override
    void setSuara(){
        String suara = "Roaaarrr";
        System.out.println("Suara singa: "+suara);
    }
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println("berat singa: "+berat+" kg");
        
    }
    
}

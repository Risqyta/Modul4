/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

public class CobaKalkulator  {
    public static void main(String[]args){
     
        
        Operasi obyek1 = new Operasi(10, 5){};
        System.out.println("Bilangan Pertama = 10 ");
        System.out.println("Bilangan Kedua = 5 ");
        System.out.println("Hasil Penjumlahan = "+obyek1.Penjumlahan());
        System.out.println("Hasil Pengurangan = "+obyek1.Pengurangan());
        System.out.println("Hasil Perkalian = "+obyek1.Perkalian());
         System.out.println("Hasil Pembagian = "+obyek1.Pembagian());
    
}}

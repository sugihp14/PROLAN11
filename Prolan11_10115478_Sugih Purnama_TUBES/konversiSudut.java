/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trigonometri;


import java.util.Scanner;

public class konversiSudut implements trigonometriInterface {
   double sudut, sudutDerajat,  sudutRadian, hasilSin, hasilCos, hasilTan, hasilAsin, hasilAcos, hasilAtan;
   
   Scanner scan = new Scanner(System.in);
   
     @Override
    public void cosinus() {
         System.out.print("Masukkan sudut: ");
        sudut = scan.nextDouble();
    
        //mengkonversi sudut derjat menjadi radian
        sudutRadian=Math.toRadians(sudut);
        sudutDerajat=Math.toDegrees(sudutRadian);
    
        //cos dari sudut
        hasilCos=Math.cos(sudutRadian);
        System.out.println("Hasil Konversi : " +hasilCos);
    }

    @Override
    public void tan() {
        System.out.print("Masukkan sudut: ");
        sudut = scan.nextDouble();
    
        //mengkonversi sudut derjat menjadi radian
        sudutRadian=Math.toRadians(sudut);
        sudutDerajat=Math.toDegrees(sudutRadian);
    
        //tan dari sudut
        hasilTan=Math.tan(sudutRadian);
         System.out.println("Hasil Konversi : " +hasilTan);
    }

    @Override
    public void sin() {
         System.out.print("Masukkan sudut: ");
         sudut =scan.nextDouble();
    
        //mengkonversi sudut derjat menjadi radian
         sudutRadian=Math.toRadians(sudut);
         sudutDerajat=Math.toDegrees(sudutRadian);
    
         //sinus dari sudut
         hasilSin=Math.sin(sudutRadian); 
          System.out.println("Hasil Konversi : " +hasilSin);
    }

   
}


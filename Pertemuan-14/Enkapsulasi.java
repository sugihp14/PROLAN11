/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperasiStandar;

import java.util.Scanner;

public class Enkapsulasi {
    private int a,b,hasil;
    
    Scanner scan = new Scanner(System.in);
    
    public int gethasil(){
        return hasil;
    }
    
    public void sethasil(){
        System.out.println("EDIT DATA");
        System.out.print("Masukan Nilai 1 :");
        a=scan.nextInt();
        System.out.print("Masukan Nilai 2 : ");
        b=scan.nextInt();
        
        hasil=a + b;
        
    }
}

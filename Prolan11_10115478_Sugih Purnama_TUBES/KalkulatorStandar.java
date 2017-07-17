/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperasiStandar;


import java.util.Scanner;

public class KalkulatorStandar extends Kalkulator {

    public int a, b, jumlah, i;
    public int hasil;

    Scanner scan = new Scanner(System.in);
   
    @Override
    public void Penjumlahan() {

        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a + b;

        System.out.println("Hasil Penjumlahan adalah : " + hasil);

    }
    
    @Override
    public void Pengurangan() {
        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a - b;
        System.out.println("Hasil Pengurangan adalah : " + hasil);

    }

    @Override
    public void Perkalian() {
        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a * b;
        System.out.println("Hasil Perkalian adalah : " + hasil);

    }

    @Override
    public void Pembagian() {

        System.out.print("Masukan Data ke-1 : ");
        float c = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        float d = scan.nextInt();
        float bagi = c / d;
        System.out.println("Hasil Pembagian adalah : " + bagi);

    }

}

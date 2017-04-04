

import java.util.Scanner;

public class Kalkulator {

    public int a, b, jumlah, i;
    public int hasil;

    Scanner scan = new Scanner(System.in);

    public void Penjumlahan() {

        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a + b;

        System.out.println("Hasilnya adalah : " + hasil);

    }

    public void Pengurangan() {
        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a - b;
        System.out.println("Hasilnya adalah : " + hasil);

    }

    public void Perkalian() {
        System.out.print("Masukan Data ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        b = scan.nextInt();
        hasil = a * b;
        System.out.println("Hasilnya adalah : " + hasil);

    }

    public void Pembagian() {

        System.out.print("Masukan Data ke-1 : ");
        float c = scan.nextInt();

        System.out.print("Masukan Data ke-2 : ");
        float d = scan.nextInt();
        float bagi = c / d;
        System.out.println("Hasilnya adalah : " + bagi);

    }

}

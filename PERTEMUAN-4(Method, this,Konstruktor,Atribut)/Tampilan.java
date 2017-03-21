

import java.util.Scanner;

public class Tampilan {

    int a, b;
    String Nama,Nim;

    public void Layar() {
        IsiData Diri=new IsiData();
        Kalkulator Tampilan = new Kalkulator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama : ");
        Nama = scan.nextLine();
        System.out.print("NIM : ");
         Nim = scan.nextLine();
        System.out.println("===========================================");
        System.out.println("||         PROGRAM KALKULATOR            ||");
        System.out.println("===========================================");
        System.out.print("Masukan Angka pertama : ");
        a = scan.nextInt();
        System.out.print("Masukan Angka kedua : ");
        b = scan.nextInt();
        System.out.println("===========================================");
        System.out.println("|| 1. PENJUMLAHAN(+)                     ||");
        System.out.println("|| 2. PENGURANGAN(-)                     ||");
        System.out.println("|| 3. PERKALIAN (X)                      ||");
        System.out.println("|| 4. PEMBAGIAN (/)                      ||");
        System.out.println("===========================================");
        System.out.print("PILIH 1-4 : ");
        int pilih = scan.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Hasil : ");
                System.out.println(Tampilan.Penjumlahan(a, b));
                Diri.Data(Nama,Nim);
                
                break;
            case 2:
                System.out.print("Hasil : ");
                System.out.println(Tampilan.Pengurangan(a, b));
                Diri.Data(Nama,Nim);
                break;
            case 3:
                System.out.print("Hasil : ");
                System.out.println(Tampilan.Perkalian(a, b));
                Diri.Data(Nama,Nim);
                break;
            case 4:
                System.out.print("Hasil : ");
                System.out.println(Tampilan.Pembagian(a, b));
                Diri.Data(Nama,Nim);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }

   

    

}

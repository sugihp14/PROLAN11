

import java.util.Scanner;

public class Tampilan {

    public String Nama, Nim;
    public char pilihkeluar;

    public Tampilan() {
        this.Nama = "Sugih Purnama";
        this.Nim = "10115478";

    }

    public void Layar() {
        Scanner scan = new Scanner(System.in);
        Kalkulator Kalkulatorprogram = new Kalkulator();
        KalkulatorMatriks Kalkulatormatriks = new KalkulatorMatriks();

        do {
            System.out.println("===========================================");
            System.out.println("||         PROGRAM KALKULATOR            ||");
            System.out.println("===========================================");
            System.out.println("|| 1. Kalkulator Desimal                 ||");
            System.out.println("|| 2. Kalkulator Matriks(2x2)            ||");
            System.out.println("||                                       ||");
            System.out.println("===========================================");
            System.out.print("PILIH 1-2 : ");
            int pilihmenu = scan.nextInt();

            switch (pilihmenu) {
                case 1: {
                    System.out.println("===========================================");
                    System.out.println("||         PROGRAM KALKULATOR            ||");
                    System.out.println("===========================================");
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
                            Kalkulatorprogram.Penjumlahan();

                            break;
                        case 2:

                            Kalkulatorprogram.Pengurangan();

                            break;
                        case 3:

                            Kalkulatorprogram.Perkalian();

                            break;
                        case 4:

                            Kalkulatorprogram.Pembagian();

                            break;
                        default:
                            System.out.println("Invalid");
                            break;

                    }
                    break;
                }
                case 2: {
                    System.out.println("===========================================");
                    System.out.println("||         PROGRAM KALKULATOR            ||");
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    System.out.println("|| 1. PENJUMLAHAN(+)                     ||");
                    System.out.println("|| 2. PENGURANGAN(-)                     ||");
                    System.out.println("|| 3. PERKALIAN (X)                      ||");
                    System.out.println("||                                       ||");
                    System.out.println("===========================================");
                    System.out.print("PILIH 1-4 : ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1:
                            Kalkulatormatriks.Penjumlahan();

                            break;
                        case 2:

                            Kalkulatormatriks.Pengurangan();

                            break;
                        case 3:

                            Kalkulatormatriks.Perkalian();

                            break;

                        default:
                            System.out.println("Invalid");
                            break;

                    }
                    break;
                }
                default:
                    System.out.println("Anda Salah Menginputkan Data");
                    System.out.println("Silahkan Pilih 1 atau 2");
                    break;
            }
            System.out.print(" y untuk lanjut, input t untuk keluar y/t :");
            pilihkeluar = scan.next().charAt(0);
        } while ((pilihkeluar == 'y') || (pilihkeluar == 'Y'));
    }

}

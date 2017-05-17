

import java.util.Scanner;

public class Tampilan {

    public String Nama, Nim;
    public char pilihkeluar,update;

    public Tampilan() {
        this.Nama = "Sugih Purnama";
        this.Nim = "10115478";

    }

    public void Layar() {
        Scanner scan = new Scanner(System.in);
        Kalkulator standar = new KalkulatorStandar();
        Kalkulator matriks = new KalkulatorMatriks();
        Enkapsulasi enkap = new Enkapsulasi();

        do {
            System.out.println("===========================================");
            System.out.println("||         PROGRAM KALKULATOR            ||");
            System.out.println("===========================================");
            System.out.println("|| 1. Kalkulator Standar                 ||");
            System.out.println("|| 2. Kalkulator Matriks(2x2)            ||");
            System.out.println("||                                       ||");
            System.out.println("===========================================");
            System.out.print("PILIH 1-2 : ");
            int pilihmenu = scan.nextInt();

            switch (pilihmenu) {
                case 1: {
                    System.out.println("===========================================");
                    System.out.println("||         KALKULATOR STANDAR            ||");
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
                            standar.Penjumlahan();
                            System.out.println("\n");
                            System.out.print("Apakah Anda Mau Edit Data?tekan y jika iya, tekan t jika tidak : ");
                            update = scan.next().charAt(0);
                            if ((update=='y') || (update=='Y') ){
                             enkap.sethasil();
                             System.out.println("Hasil Update Data adalah " + enkap.gethasil());
                            }

                            break;
                        case 2:

                            standar.Pengurangan();

                            break;
                        case 3:

                            standar.Perkalian();

                            break;
                        case 4:

                            standar.Pembagian();

                            break;
                        default:
                            System.out.println("Invalid");
                            break;

                    }
                    break;
                }
                case 2: {
                    System.out.println("===========================================");
                    System.out.println("||         KALKULATOR MATRIKS            ||");
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
                            matriks.Penjumlahan();

                            break;
                        case 2:

                            matriks.Pengurangan();

                            break;
                        case 3:

                            matriks.Perkalian();

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

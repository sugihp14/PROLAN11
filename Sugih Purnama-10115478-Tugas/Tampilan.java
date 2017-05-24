

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
        trigonometriInterface trig=new konversiSudut();
        trigonometriInterface trigTam=new penjumlahanTrigonometri();
        trigonometriInterface trigKur=new penguranganTrigonometri();

        do {
            System.out.println("===========================================");
            System.out.println("||         PROGRAM KALKULATOR            ||");
            System.out.println("===========================================");
            System.out.println("|| 1. Kalkulator Standar                 ||");
            System.out.println("|| 2. Kalkulator Matriks(2x2)            ||");
            System.out.println("|| 3. Kalkulator Scientific              ||");
            System.out.println("===========================================");
            System.out.print("PILIH 1-3 : ");
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
                
                case 3 : {
                    System.out.println("===========================================");
                    System.out.println("||         KALKULATOR SCIENTIFIC        ||");
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    System.out.println("|| 1. KONVERSI TRIGONOMETRI              ||");
                    System.out.println("|| 2. PENJUMLAHAN TRIGONOMETRI           ||");
                    System.out.println("|| 3. PENGURANGAN TRIGONOMETRI           ||");
                    System.out.println("||                                       ||");
                    System.out.println("===========================================");
                    System.out.print("PILIH 1 : ");
                    int pilih = scan.nextInt();
                    switch (pilih) {
                        case 1 : {
                                System.out.println("===========================================");
                                System.out.println("||         KALKULATOR TRIGONOMETRI        ||");
                                System.out.println("===========================================");
                                System.out.println("===========================================");
                                System.out.println("|| 1.KONVERSI SUDUT ke SIN               ||");
                                System.out.println("|| 2.KONVERSI SUDUT ke COS               ||");
                                System.out.println("|| 3.KONVERSI SUDUT ke TAN               ||");
                                System.out.println("||                                       ||");
                                System.out.println("===========================================");
                                System.out.print("PILIH 1-3 : ");
                                    int pilihkonversi = scan.nextInt();
                                    switch (pilihkonversi) {
                                        case 1 : 
                                            trig.sin();
                                        break;
                                        case 2: 
                                            trig.cosinus();
                                        break;
                                        case 3: 
                                            trig.tan();
                                        break;
                                        
                                         default:
                                        System.out.println("Invalid");
                                        break;
                                    }
                        }break;
                        case 2: {
                                System.out.println("===========================================");
                                System.out.println("||         KALKULATOR TRIGONOMETRI        ||");
                                System.out.println("===========================================");
                                System.out.println("===========================================");
                                System.out.println("|| 1.TAMBAH SIN                          ||");
                                System.out.println("|| 2.TAMBAH COS                          ||");
                                System.out.println("|| 3.TAMBAH TAN                          ||");
                                System.out.println("||                                       ||");
                                System.out.println("===========================================");
                                System.out.print("PILIH 1-3 : ");
                                    int pilihkonversi = scan.nextInt();
                                    switch (pilihkonversi) {
                                        case 1 : 
                                            trigTam.sin();
                                        break;
                                        case 2: 
                                            trigTam.cosinus();
                                        break;
                                        case 3: 
                                            trigTam.tan();
                                        break;
                                        
                                         default:
                                        System.out.println("Invalid");
                                        break;
                                    }
                        
                        
                        
                        }break;
                        case 3 : {
                                System.out.println("===========================================");
                                System.out.println("||         KALKULATOR TRIGONOMETRI        ||");
                                System.out.println("===========================================");
                                System.out.println("===========================================");
                                System.out.println("|| 1.KURANG SIN                          ||");
                                System.out.println("|| 2.KURANG COS                          ||");
                                System.out.println("|| 3.KURANG TAN                          ||");
                                System.out.println("||                                       ||");
                                System.out.println("===========================================");
                                System.out.print("PILIH 1-3 : ");
                                    int pilihkonversi = scan.nextInt();
                                    switch (pilihkonversi) {
                                        case 1 : 
                                            trigKur.sin();
                                        break;
                                        case 2: 
                                            trigKur.cosinus();
                                        break;
                                        case 3: 
                                            trigKur.tan();
                                        break;
                                        
                                         default:
                                        System.out.println("Invalid");
                                        break;
                                    }
                        
                        
                        }break;
                
                        default:
                        System.out.println("Invalid");
                        break;
                    }
                    
                }break;
                default:
                    System.out.println("Anda Salah Menginputkan Data");
                    System.out.println("Silahkan Pilih 1 - 3");
                    break;
            }
            System.out.print(" y untuk lanjut, input t untuk keluar y/t :");
            pilihkeluar = scan.next().charAt(0);
        } while ((pilihkeluar == 'y') || (pilihkeluar == 'Y'));
    }

}


import java.util.Scanner;

public class penguranganTrigonometri implements trigonometriInterface {
   double sudut1, sudut2,  sudutRadian1,sudutRadian2, hasil1, hasil2, hasil;
   
   Scanner scan = new Scanner(System.in);
   
     @Override
    public void cosinus() {
         System.out.print("Masukkan sudut 1 : ");
        sudut1 = scan.nextDouble();
        System.out.print("Masukkan sudut 2 :  ");
        sudut2 = scan.nextDouble();
        //mengkonversi sudut derjat menjadi radian
        sudutRadian1=Math.toRadians(sudut1);
        sudutRadian2=Math.toRadians(sudut2);
    
        //cos dari sudut
        hasil1=Math.cos(sudutRadian1);
        hasil2=Math.cos(sudutRadian2);
        
        //penjumlahan
        hasil = hasil1 - hasil2;
        System.out.println("Hasil Konversi sudut 1 : " +hasil1);
        System.out.println("Hasil Konversi sudut 2 : " +hasil2);
        System.out.println("======================================");
        System.out.println("Hasil Penjumlahan   : " +hasil);
    }

    @Override
    public void tan() {
       System.out.print("Masukkan sudut 1 : ");
        sudut1 = scan.nextDouble();
        System.out.print("Masukkan sudut 2 :  ");
        sudut2 = scan.nextDouble();
        //mengkonversi sudut derjat menjadi radian
        sudutRadian1=Math.toRadians(sudut1);
        sudutRadian2=Math.toRadians(sudut2);
    
        //cos dari sudut
        hasil1=Math.tan(sudutRadian1);
        hasil2=Math.tan(sudutRadian2);
        
        //penjumlahan
        hasil = hasil1 - hasil2;
        System.out.println("Hasil Konversi sudut 1 : " +hasil1);
        System.out.println("Hasil Konversi sudut 2 : " +hasil2);
        System.out.println("======================================");
        System.out.println("Hasil Penjumlahan   : " +hasil);
    }

    @Override
    public void sin() {
        System.out.print("Masukkan sudut 1 : ");
        sudut1 = scan.nextDouble();
        System.out.print("Masukkan sudut 2 :  ");
        sudut2 = scan.nextDouble();
        //mengkonversi sudut derjat menjadi radian
        sudutRadian1=Math.toRadians(sudut1);
        sudutRadian2=Math.toRadians(sudut2);
    
        //cos dari sudut
        hasil1=Math.sin(sudutRadian1);
        hasil2=Math.sin(sudutRadian2);
        
        //penjumlahan
        hasil = hasil1 - hasil2;
        System.out.println("Hasil Konversi sudut 1 : " +hasil1);
        System.out.println("Hasil Konversi sudut 2 : " +hasil2);
        System.out.println("======================================");
        System.out.println("Hasil Penjumlahan   : " +hasil);
    }

   
}

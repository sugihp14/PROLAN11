
import java.util.Scanner;

public class Kalkulator{
 private int a,b;
  public void Penjumlahan(){
	Scanner scan=new Scanner(System.in);
 	System.out.print("Masukan Sebuah Bilangan Pertama: ");
	 a=scan.nextInt();

	System.out.print("Masukan Sebuah Bilangan Kedua: ");
	 b=scan.nextInt();
	
	int Tambah=a + b;

	
	System.out.println("Hasil Penjumlahan: " +Tambah);

	}
public void Pengurangan(){
	Scanner scan=new Scanner(System.in);
 	System.out.print("Masukan Sebuah Bilangan Pertama: ");
	a=scan.nextInt();

	System.out.print("Masukan Sebuah Bilangan Kedua: ");
	b=scan.nextInt();
	
	int Kurang=a - b;

	
	System.out.println("Hasil Pengurangan: " +Kurang);

	}	

 public void Perkalian(){
	Scanner scan=new Scanner(System.in);
 	System.out.print("Masukan Sebuah Bilangan Pertama: ");
	 a=scan.nextInt();

	System.out.print("Masukan Sebuah Bilangan Kedua: ");
	b=scan.nextInt();
	
	int Kali=a * b;

	
	System.out.println("Hasil Perkalian: " +Kali);
        

	}	
 
 public void Pembagian(){
	Scanner scan=new Scanner(System.in);
 	System.out.print("Masukan Sebuah Bilangan Pertama: ");
	float a=scan.nextInt();

	System.out.print("Masukan Sebuah Bilangan Kedua: ");
	float b=scan.nextInt();
	
	float Bagi=a / b;

	
	System.out.println("Hasil Pembagian: " +Bagi);

	}	
 }

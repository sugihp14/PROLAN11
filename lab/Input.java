import java.util.Scanner;

public class Input{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	
	  String nama;
	  char jeniskelamin;
	  int tinggibadan;
	  boolean menikah;
	  
	  System.out.print("Masukan Nama : ");
	  nama=scan.nextLine();
	  System.out.print("Masukan Jenis Kelamin : ");
	  jeniskelamin = scan.next().charAt(0);
	  System.out.print("Masukan Tinggi Badan : ");
	  tinggibadan= scan.nextInt();
	  System.out.print("Masukan Status Menikah : ");
	  menikah=scan.nextBoolean();
	  
	  System.out.println("Selamat Datang " + nama);
	  System.out.println("Jenis Kelamin : " + jeniskelamin);
	  System.out.println("TInggi Anda :" + tinggibadan);
	  System.out.println("Status Menikah: " + menikah);
	}
}
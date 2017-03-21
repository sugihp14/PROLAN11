
import java.util.Scanner;

public class Tampilan {
   	
  public void Layar(){
	Kalkulator Layar= new Kalkulator();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("===========================================");

	System.out.println("||         PROGRAM KALKULATOR            ||");

	System.out.println("===========================================");

	System.out.println("|| 1. PENJUMLAHAN(+)                     ||");

	System.out.println("|| 2. PENGURANGAN(-)                     ||");

	System.out.println("|| 3. PERKALIAN (X)                      ||");

	System.out.println("|| 4. PEMBAGIAN (/)                      ||");
	System.out.println("===========================================");
	System.out.print("PILIH 1-4 : ");
	int pilih=scan.nextInt();
	
      switch (pilih) {
          case 1:
              Layar.Penjumlahan();
              break;
          case 2:
              Layar.Pengurangan();
              break;
          case 3:
              Layar.Perkalian();
              break;
          case 4:
              Layar.Pembagian();
              break;
          default:
              System.out.println("Invalid");
              break;
         }

	

	}
 
 
    
}

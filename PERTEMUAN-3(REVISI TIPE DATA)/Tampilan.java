
import java.util.Scanner;

public class Tampilan {
   	
  public void Layar(){
	Kalkulator Tampilan= new Kalkulator();
	
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
	char pilih=(char) scan.nextInt();
	
      switch (pilih) {
          case 1:
              Tampilan.Penjumlahan();
              break;
          case 2:
              Tampilan.Pengurangan();
              break;
          case 3:
              Tampilan.Perkalian();
              break;
          case 4:
              Tampilan.Pembagian();
              break;
          default:
              System.out.println("Invalid");
              break;
         }

	

	}
 
 
    
}

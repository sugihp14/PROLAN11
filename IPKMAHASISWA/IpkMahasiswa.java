

import java.util.Scanner ;



public class IpkMahasiswa {
    
    int   jumlah, lulus ;
    float nilai, ratarata, total;
    
   
    Scanner input = new Scanner(System.in) ;
        

    public static void main(String args[])
    {	
	System.out.println("=======================================");
        System.out.println("||         PROGRAM IPK MAHASISWA     ||");
	System.out.println("=======================================");
        System.out.println("Masukan -999 untuk keluar ");
        IpkMahasiswa IP = new IpkMahasiswa() ;
        while ((IP.nilai = IP.inputNilai(IP.jumlah)) != -999){
	   if ((IP.isWithinRange(IP.nilai, 0, 4) == 1) && (IP.nilai >= 2.75)) 
            {
             IP.jumlah++ ;
             IP.lulus++ ;
            }
           else if ((IP.isWithinRange(IP.nilai, 0, 4) == 1))
           {
             IP.jumlah++ ;  
           }
         
             
          IP.total += IP.nilai ; 
      
         }
        
        if (IP.jumlah > 0)
         IP.ratarata = IP.total / IP.jumlah ;
        else
         IP.ratarata = 0 ;

           System.out.println("\n\nJumlah Mahasiswa : "+IP.jumlah) ;
           System.out.println("Jumlah Mahasiswa yang lulus : "+IP.lulus) ;
           System.out.println("Rata-rata IPK Mahasiswa : "+IP.ratarata+"\n") ;
        
       
    }
  

    int isWithinRange(float X, float min, float max)
    {
     
     	int cek = (((X >= min) && (X <= max)) ? 1 : 0) ;
     	return cek ;

    }        
    

    float inputNilai(int i)
    { 
	i++ ;
        System.out.print("Silakan masukkan nilai mahasiswa ke-"+i+" : ");  
     	return input.nextFloat() ;
    }        
}

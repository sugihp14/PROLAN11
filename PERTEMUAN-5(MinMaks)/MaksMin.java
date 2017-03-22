import java.util.Scanner;

public class MaksMin {

    

private int min,maks,muncul,nilai,N;
public int[] larik= new int[100];

public Scanner scan = new Scanner(System.in);

 public void membacaInputan(){
      System.out.print("Masukan Banyak Data: ");
        N = scan.nextInt();
       System.out.print("Masukan A atau B: ");
       char MaksMin=scan.next().charAt(0);
       
       Bilangan();
       
       switch(MaksMin){
           case 'A' :
                 pilihanA();
                 System.out.println("Nilai Terkecil :"+min);
                 System.out.println("Kemunculan Nilai Terkecil:" +muncul); 
                 break;
            case 'B' :
                 pilihanB();
                 System.out.println("Nilai Terbesar :"+maks);
                 System.out.println("Kemunculan Nilai Terbesar:" +muncul); 
                 break;
           default: 
               System.out.println("Maaf Anda salah Memasukan Data");
           
       }
   }
  
  
//Memasukan Bilangan
void Bilangan(){
        for (int i = 0; i <N; i++) {
                System.out.print("Masukan Nilai  :");
                 larik[i]=scan.nextInt(); 
        }
   }

//mengecek Bilangan Minimal

void pilihanA(){
    min=larik[0];
    for (int i = 0; i < N; i++) {
        if(min>larik[i]){
        min=larik[i];
       }
       
    }
    
    
    //cek Kemungkinan muncul1
    
    for (int i = 0; i < N; i++) {
        
        if(larik[i]==min){
        muncul+=1; 
        }

    }
  
}



//Mengecek Bilangan Maksimal
void pilihanB(){
    maks=larik[0];
    for (int i = 0; i < N; i++) {
        if(maks<larik[i]){
        maks=larik[i];
       }  
    }
     
    //cek Kemungkinan muncul1

    for (int i = 0; i < N; i++) {
        
        if(larik[i]==maks){
        muncul+=1 ;
        }
    }
}

//program utama
   public static void main(String[] args){ 
        MaksMin Maksimalmin=new MaksMin();   
        Maksimalmin.membacaInputan();
   }
}
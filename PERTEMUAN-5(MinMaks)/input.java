import java.util.Scanner;

public class input {
    public int[] larik= new int[100];
    public int i,N,min,maks,muncul;
    public char pilih;
    
    Scanner scan= new Scanner(System.in);
   
    void banyakdata(){
        System.out.print("Masukan Banyak Data  : ");
        N=scan.nextInt();
    }
    public void inputlarik(){
     for(i=0; i<N;i++){
       int indeks=i+1;
       System.out.print("Masukan Data   " + indeks+ " :");
       larik[i]=scan.nextInt();
     }
    }
    
   
     void pilihanA(){
    min=larik[0];
    
        for(i=0;i<N;i++){
             if(min>larik[i]){
              min=larik[i];
            }
    
        }
        
        
        //memerikasa kemungkilan muncul terkecil
        
        for (i = 0; i < N; i++) {
            
            if(larik[i]==min){
             muncul+=1;
            }
            
        }
    
    }
    
    void pilihanB(){
        
        for(i=0;i<N;i++){
              if(maks<larik[i]){
                 maks=larik[i];
                }
            }
    //kemungkinan muncul 
    
        for (i = 0;  i< N; i++) {
            if(larik[i]==maks){
             muncul+=1;
            
            }
            
        }
 
        }
    
    void inputpilihan(){
    System.out.print("Masukan A atau B     : ");
    pilih=scan.next().charAt(0);
    inputlarik(); //Mengisikan Data dalam larik
        if((pilih=='A') || (pilih=='a')){
            pilihanA();
            System.out.println("Nilai Terkecil                  ="+min);
            System.out.println("Nilai Terkecil Muncul Sebanyak  ="+muncul);
        }
        else if((pilih=='B') ||(pilih=='b')){
            pilihanB();
            System.out.println("Nilai Terbesar                  ="+maks);
            System.out.println("Nilai Terbesar Muncul Sebanyak  ="+muncul);
        }
        else{
            System.out.println("Anda Salah Memasukan Data ");
        }
    }
    

    
   
}



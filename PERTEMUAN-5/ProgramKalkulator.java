

public class ProgramKalkulator extends Tampilan{
 public void Tampilan(){
    System.out.println("Terimakasih Atas Kunjungan Anda");
 }
 public void Pesan(){
   Tampilan();
   super.Tampilan(Nama, Nim);
 }
    public static void main(String[] args) {
        ProgramKalkulator KalkulatorProgram= new ProgramKalkulator();

        KalkulatorProgram.Layar();
        KalkulatorProgram.Pesan();

    }

}

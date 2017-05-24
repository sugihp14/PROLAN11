

public class ProgramKalkulator extends Tampilan {

    public ProgramKalkulator() {
        super();
        Nama = "SUGIH PURNAMA";
    }

    public void Tampilan() {
        System.out.println("Terimakasih Atas Kunjungan Anda");
    }


    public static void main(String[] args) {
        ProgramKalkulator KalkulatorProgram = new ProgramKalkulator();

        KalkulatorProgram.Layar();
        System.out.println("-----------------------------------");
        KalkulatorProgram.Tampilan();
        System.out.println("-----------------------------------");
        System.out.println(KalkulatorProgram.Nama);
        System.out.println("-----------------------------------");

    }

}

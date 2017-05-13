

public class ProgramUtama extends Tampilan {

    public ProgramUtama() {
        super();
        Nama = "SUGIH PURNAMA";
    }

    public void Tampilan() {
        System.out.println("Terimakasih Atas Kunjungan Anda");
    }


    public static void main(String[] args) {
        ProgramUtama KalkulatorProgram = new ProgramUtama();
        KalkulatorProgram.Layar();
        System.out.println("-----------------------------------");
        KalkulatorProgram.Tampilan();
        System.out.println("-----------------------------------");
        System.out.println(KalkulatorProgram.Nama);
        System.out.println("-----------------------------------");

    }

}

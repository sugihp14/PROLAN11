
import java.util.Scanner;

public class ProgramUtama {

    public static void main(String[] args) {
        double operan1, operan2;
        Scanner scan = new Scanner(System.in);
        Kalkulator operasi = new Kalkulator() {

            @Override
            protected double kalkulatorTambah(double x, double y) {
                return x + y;
            }

            @Override
            protected double kalkulatorKurang(double x, double y) {
                return x - y;
            }

            @Override
            protected double kalkulatorKali(double x, double y) {
                return x * y;
            }

            @Override
            protected double kalkulatorBagi(double x, double y) {
                return x / y;
            }

        };
        System.out.println("\t\t\t PROGRAM KALKULATOR");
        System.out.print("Nilai 1 : ");
        operan1 = scan.nextDouble();

        System.out.print("Nilai 2 : ");
        operan2 = scan.nextDouble();

        System.out.println("Hasil Dari Pertambahan adalah " + operasi.kalkulatorTambah(operan1, operan2));
        System.out.println("Hasil Dari Pengurangan adalah " + operasi.kalkulatorKurang(operan1, operan2));
        System.out.println("Hasil Dari Kali adalah " + operasi.kalkulatorKali(operan1, operan2));
        System.out.println("Hasil Dari Pembagian adalah " + operasi.kalkulatorBagi(operan1, operan2));
    }

}

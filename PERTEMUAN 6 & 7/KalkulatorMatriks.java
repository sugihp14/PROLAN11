

import java.util.Scanner;

public class KalkulatorMatriks extends Kalkulator {

    Scanner input = new Scanner(System.in);

    @Override
    public void Penjumlahan() {

        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Masukkan Matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan Matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print("[" + (k + 1) + "][" + (l + 1) + "]:");
                B[k][l] = input.nextInt();
            }
        }
        System.out.println("Matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+(A[i][j]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(+(B[k][l]) + " ");
            }
            System.out.println(" ");
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                C[x][y] = A[x][y] + B[x][y];
            }
        }
        System.out.println("Hasil penjumlahan Matriks A dan Matriks B");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(+(C[x][y]) + " ");
            }
            System.out.println(" ");
        }

    }

    @Override
    public void Pengurangan() {
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Masukkan Matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan Matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print("[" + (k + 1) + "][" + (l + 1) + "]:");
                B[k][l] = input.nextInt();
            }
        }
        System.out.println("Matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+(A[i][j]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(+(B[k][l]) + " ");
            }
            System.out.println(" ");
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                C[x][y] = A[x][y] - B[x][y];
            }
        }

        System.out.println("Hasil pengurangan Matriks A dan Matriks B");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(+(C[x][y]) + " ");
            }
            System.out.println(" ");
        }

    }

    @Override
    public void Perkalian() {

        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Masukkan matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Masukkan matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print("[" + (k + 1) + "][" + (l + 1) + "]:");
                B[k][l] = input.nextInt();
            }
        }

        System.out.println("Matriks A");
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriks B");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(B[k][l] + " ");
            }
            System.out.println("");
        }

        C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];

        System.out.println("Hasil perkalian Matriks A dan B");
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(C[x][y] + " ");
            }
            System.out.println(" ");
        }
    }

}

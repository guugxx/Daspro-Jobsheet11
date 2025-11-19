import java.util.Scanner;

public class Siakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.println("Siswa " + i);
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }
}
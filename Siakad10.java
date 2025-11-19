import java.util.Scanner;

public class Siakad10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input jumlah siswa dan jumlah mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();

        // bikin array nilai
        int[][] nilai = new int[jumlahSiswa][jumlahMK];

        // input nilai
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai untuk siswa ke-" + i);
            for (int j = 0; j < jumlahMK; j++) {
                System.out.print("Nilai MK ke-" + j + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // hitung rata-rata siswa
        System.out.println("\nRata-rata setiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMK; j++) {
                total = total + nilai[i][j];
            }
            double rataSiswa = total / (double) jumlahMK;
            System.out.println("Siswa " + i + ": " + rataSiswa);
        }

        // hitung rata-rata mata kuliah
        System.out.println("\nRata-rata setiap mata kuliah:");
        for (int j = 0; j < jumlahMK; j++) {
            int totalMK = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalMK = totalMK + nilai[i][j];
            }
            double rataMK = totalMK / (double) jumlahSiswa;
            System.out.println("MK " + j + ": " + rataMK);
        }
    }
}

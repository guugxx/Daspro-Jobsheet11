import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Menyimpan hasil survey
        int[][] survey = new int[10][6];  // 10 responden, 6 pertanyaan
        
        System.out.println("=== Input Nilai Survey (1 - 5) ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("  Nilai pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // b. Menampilkan nilai rata-rata setiap responden
        System.out.println("\n=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rataResponden = (double) total / 6;
            System.out.println("Responden ke-" + (i + 1) + " : " + rataResponden);
        }

        // c. Menampilkan nilai rata-rata setiap pertanyaan
        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rataPertanyaan = (double) total / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + rataPertanyaan);
        }

        // d. Menampilkan nilai rata-rata keseluruhan
        int totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua += survey[i][j];
            }
        }
        double rataKeseluruhan = (double) totalSemua / (10 * 6);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}

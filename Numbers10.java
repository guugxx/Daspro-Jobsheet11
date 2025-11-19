import java.util.Arrays;

public class Numbers10 {
    public static void main(String[] args) {

        // bikin array 2 dimensi dengan baris beda-beda
        int[][] angka = new int[3][];
        angka[0] = new int[5];   // baris 0 ada 5 kolom
        angka[1] = new int[3];   // baris 1 ada 3 kolom
        angka[2] = new int[1];   // baris 2 ada 1 kolom

        // tampilkan baris 0
        System.out.println("Isi baris 0: " + Arrays.toString(angka[0]));

        // tampilkan semua baris 1 per 1
        System.out.println("Semua baris:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Baris " + i + ": " + Arrays.toString(angka[i]));
        }

        // tampilkan semua elemen dengan nested loop
        System.out.println("Semua elemen:");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}

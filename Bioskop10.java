public class Bioskop10 {
    public static void main(String[] args) {

        // deklarasi array
        String[][] penonton = new String[4][2];

        // pengisian elemen (modifikasi langkah 3)
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gilang";
        penonton[3][1] = "Hana";

        // tampilkan semua elemen (modifikasi langkah 5)
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + " ");
            }
            System.out.println();
        }

        // pertanyaan 4: tampilkan panjang baris & kolom
        System.out.println("Jumlah baris = " + penonton.length);
        System.out.println("Panjang kolom baris 0 = " + penonton[0].length);

        // pertanyaan 5: panjang setiap baris (for)
        System.out.println("\nPanjang setiap baris (for loop):");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris " + i + " = " + penonton[i].length);
        }

        // pertanyaan 6: panjang setiap baris (foreach)
        System.out.println("\nPanjang setiap baris (foreach loop):");
        int index = 0;
        for (String[] baris : penonton) {
            System.out.println("Baris " + index + " = " + baris.length);
            index++;
        }

        // pertanyaan 7: tampilkan baris ke-3 (for)
        System.out.println("\nPenonton baris ke-3 (for loop):");
        for (int j = 0; j < penonton[2].length; j++) {
            System.out.println(penonton[2][j]);
        }

        // pertanyaan 8: tampilkan baris ke-3 (foreach)
        System.out.println("\nPenonton baris ke-3 (foreach):");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        // pertanyaan 9: tampilkan semua baris (foreach)
        System.out.println("\nDaftar Penonton lengkap (foreach):");
        for (String[] baris : penonton) {
            for (String nama : baris) {
                System.out.print(nama + " ");
            }
            System.out.println();
        }
    }
}

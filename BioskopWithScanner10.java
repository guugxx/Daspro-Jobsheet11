import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String[][] penonton= new String[4][2];
    while (true) { 
        System.out.println("Masukkan Nama: ");
        String nama =sc.nextLine();

        System.out.println("Masukkan Baris: ");
        int baris= sc.nextInt();

        System.out.println("Masukkan kolom: ");
        int kolom =sc.nextInt();

        penonton[baris-1][kolom-1]= nama ;

        System.out.println("Input Penonton Lainnya? (y/n)");
        String next= sc.nextLine();

        if (next.equalsIgnoreCase("n")){
            break;
        }
    }
    }
}
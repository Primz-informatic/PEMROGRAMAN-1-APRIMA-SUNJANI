package Soal;
import java.util.Scanner;

public class P8_SoalNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        int totalNilai = 0;

        do {
            System.out.print("Masukkan angka nilai: ");
            int nilai = input.nextInt();

            totalNilai += nilai;

            System.out.print("Tambah nilai lagi? (y/t): ");
            pilihan = input.next();
            System.out.println("========================");

        } while (!pilihan.equalsIgnoreCase("t"));

        System.out.println("Jumlah seluruh nilai yang dimasukkan: " + totalNilai);
        System.out.println("Program berhenti, terima kasih.");
        input.close();
    }
}

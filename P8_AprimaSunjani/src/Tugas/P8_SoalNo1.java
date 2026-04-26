package Tugas;
import java.util.Scanner;

    public class P8_SoalNo1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String pilihan;

            do {
                System.out.print("Input nilai mahasiswa: ");
                int nilai = input.nextInt();

                System.out.println("Nilai yang diinput: " + nilai);

                System.out.print("Mau input lagi? (y/t): ");
                pilihan = input.next();
                System.out.println("==================");

            } while (!pilihan.equalsIgnoreCase("t")); // Berhenti jika user memilih 't'

            System.out.println("Program selesai.");
            input.close();
        }
    }

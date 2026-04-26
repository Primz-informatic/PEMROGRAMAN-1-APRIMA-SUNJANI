package tugas;
import java.util.Scanner;

public class P4_tugas {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input
            System.out.print("Masukkan nama barang: ");
            String namaBarang = input.nextLine();

            System.out.print("Masukkan harga barang: ");
            int harga = input.nextInt();

            System.out.print("Masukkan jumlah beli: ");
            int jumlah = input.nextInt();

            // Proses
            int total = harga * jumlah;

            // Output
            System.out.println("\n=== OUTPUT ===");
            System.out.println("Barang : " + namaBarang);
            System.out.println("Harga  : " + harga);
            System.out.println("Jumlah : " + jumlah);
            System.out.println("Total  : " + total);
        }
    }
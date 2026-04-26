package tugas;

import java.util.Scanner;
public class P2_tugas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama;
        String kelas;
        String jurusan;

        // Input
        System.out.print("Input Nama    : ");
        nama = input.nextLine();

        System.out.print("Input Kelas   : ");
        kelas = input.nextLine();

        System.out.print("Input Jurusan : ");
        jurusan = input.nextLine();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Jurusan : " + jurusan);
    }
}